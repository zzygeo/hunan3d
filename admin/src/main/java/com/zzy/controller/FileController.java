package com.zzy.controller;

import com.zzy.result.Result;
import com.zzy.service.websocket.WebSocketServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * 文件上传Controller
 */

@RestController
@RequestMapping("/file")
@Slf4j
public class FileController {
    @Value("${user.uploadDir}")
    String uploadDir;
    @Value("${user.potreeConvert}")
    String PotreeConverterPath;
    @Value("${user.potreeDir}")
    String potreeDir;

    @PostMapping("/upload")
    public Result handleFileUpload(@RequestPart("file") MultipartFile file) throws IOException {
        InputStream inputStream = null;
        try {
            Path targetPath = Path.of(uploadDir + file.getOriginalFilename());
            inputStream = file.getInputStream();
            Files.copy(inputStream, targetPath, StandardCopyOption.REPLACE_EXISTING);
            String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                    .path("/download/")
                    .path(file.getOriginalFilename())
                    .toUriString();
            return Result.success("File uploaded successfully. Download URL: " + fileDownloadUri, null);
        } catch (IOException exception) {
            return Result.error("Failed to store file: " + exception.getMessage());
        } finally {
            inputStream.close();
        }
    }

    @GetMapping("/getFileList")
    public Result<List<String>> getFileList() {
        List<String> pathList = null;
        try {
            Path dir = Paths.get(uploadDir);
            Stream<Path> list = Files.list(dir);
            pathList = list.map(path -> path.toString()).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Result.success(pathList);
    }

    @DeleteMapping
    public Result deleteFile(@RequestParam("filePath") String filePath) throws IOException {
        Path path = Paths.get(filePath);
        Boolean loop = false;
        try {
            Files.delete(path);
            loop = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return loop ? Result.success("删除成功", null) : Result.error("删除失败", null);
    }

    @GetMapping("/convert")
    public Result convertLas(@RequestParam("filePath") String filePath) {
        Path path = Paths.get(filePath);
        if (path.toString().endsWith(".las")) {
            String outputFile = path.getFileName().toString().split("\\.")[0];
            Path outputPath = Path.of(potreeDir, outputFile);
            String[] args = {PotreeConverterPath, "-i", filePath, "-o", outputPath.toString()};
            Boolean loop = false;
            try {
                ProcessBuilder processBuilder = new ProcessBuilder();
                processBuilder.command(args);
                // 启动进程
                Process process = processBuilder.start();
                // 逐行读取并发送进度信息
                // 处理进程输出流
                InputStream inputStream = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    // 发送进度信息到WebSocket
                    WebSocketServer.sendInfo(line, "1");
                }
                // 等待exe执行完成
                int exitCode = process.waitFor();
                WebSocketServer.sendInfo("exitCode: " + exitCode, "1");
                if (exitCode == 0) {
                    loop = true;
                }
                // 发送进程完成信息到WebSocket
            } catch (IOException | InterruptedException e) {
                log.error(e.getMessage());
            }
            return loop ? Result.success(filePath + "转换成功", null) : Result.error("转换失败", null);
        } else {
            return Result.error("请输入正确的las文件目录", null);
        }
    }
}

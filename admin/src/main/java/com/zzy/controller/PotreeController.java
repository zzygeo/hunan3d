package com.zzy.controller;

import com.zzy.result.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/potree")
public class PotreeController {
    @Value("${user.potreeDir}")
    String potreeDir;

    @GetMapping
    public Result<List<String>> getPotreeList() {
        List<String> pathList = null;
        try {
            Path dir = Paths.get(potreeDir);
            Stream<Path> list = Files.list(dir);
            pathList = list.filter(item -> Files.exists(Path.of(item.toString(), "metadata.json")))
                    .map(item -> item.toString()).collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return Result.success(pathList);
    }
}

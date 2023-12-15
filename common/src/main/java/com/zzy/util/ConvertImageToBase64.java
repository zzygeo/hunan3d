package com.zzy.util;

import lombok.extern.slf4j.Slf4j;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Base64;

@Slf4j
public class ConvertImageToBase64 {
    public static String transform(BufferedImage image) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageIO.write(image, "png", byteArrayOutputStream);
            byte[] imageData = byteArrayOutputStream.toByteArray();
            return Base64.getEncoder().encodeToString(imageData);
        } catch (Exception e) {
            log.error(e.getMessage());
            return null;
        }
    }
}

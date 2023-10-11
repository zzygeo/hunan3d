package com.zzy;

import com.github.jeffreyning.mybatisplus.conf.EnableMPP;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMPP
public class ModelApplication {
    public static void main(String[] args) {
        SpringApplication.run(ModelApplication.class, args);
    }
}

package com.example.pachong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.pachong.mapper")
public class PachongApplication {

    public static void main(String[] args) {
        SpringApplication.run(PachongApplication.class, args);
    }

}

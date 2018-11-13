package com.fc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = "")
public class SpringbootSwagger2Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootSwagger2Application.class, args);
        System.out.println("=================================");
        System.out.println("=============启动成功===============");
        System.out.println("=================================");
    }
}

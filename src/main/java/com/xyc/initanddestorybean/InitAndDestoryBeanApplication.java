package com.xyc.initanddestorybean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitAndDestoryBeanApplication {
    public static void main(String[] args) {
        SpringApplication.exit(SpringApplication.run(InitAndDestoryBeanApplication.class, args));
    }
}

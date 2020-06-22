package com.hzt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.hzt"})
public class JspApplication {

    public static void main(String[] args) {
        SpringApplication.run(JspApplication.class, args);
    }

}

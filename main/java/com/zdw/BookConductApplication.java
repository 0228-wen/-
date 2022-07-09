package com.zdw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication(scanBasePackages = "com.zdw")
public class BookConductApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookConductApplication.class, args);
    }

}

package com.fsyume.yume;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fsyume.yume.mapper")
public class YumeJdk8Application {

    public static void main(String[] args) {
        SpringApplication.run(YumeJdk8Application.class, args);
    }

}

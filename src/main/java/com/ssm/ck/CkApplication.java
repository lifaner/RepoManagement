package com.ssm.ck;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ssm.ck.dao")
public class CkApplication {

    public static void main(String[] args) {
        SpringApplication.run(CkApplication.class, args);
    }
}

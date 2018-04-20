package com.manny.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: manny
 * @Description:
 * @Date: 2018/4/19 17:43
 */
@SpringBootApplication
@MapperScan("com.manny.shop.manage.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}

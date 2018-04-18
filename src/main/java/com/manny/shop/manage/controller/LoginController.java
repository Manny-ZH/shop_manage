package com.manny.shop.manage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("login")
    public String login(){
        logger.info("aaa");
        logger.error("bbb");
        logger.debug("ccc");
        System.out.println("ddd");
        return "hhh";
    }
}

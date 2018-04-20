package com.manny.shop.manage.controller;

import com.manny.shop.manage.entity.Size;
import com.manny.shop.manage.service.ISizeService;
import com.manny.shop.manage.service.impl.SizeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: manny
 * @Description:
 * @Date: 2018/4/19 16:32
 */
@RestController("Size")
public class SizeController {

    @Autowired
    private ISizeService sizeService;

    @RequestMapping("saveOne")
    public Size saveSize(Size size){
        size.setRemark("更改了信息");
        sizeService.saveOne(size);
        return size;
    }
}

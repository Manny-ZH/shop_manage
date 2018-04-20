package com.manny.shop.manage.service.impl;

import com.manny.shop.manage.dao.SizeMapper;
import com.manny.shop.manage.entity.Size;
import com.manny.shop.manage.service.ISizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: manny
 * @Description:
 * @Date: 2018/4/19 16:53
 */
@Service
public class SizeServiceImpl implements ISizeService {

    @Autowired
    private SizeMapper sizeMapper;

    @Override
    public void saveOne(Size size) {
        sizeMapper.saveOne(size);
    }
}

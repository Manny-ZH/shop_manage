package com.manny.shop.manage.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: manny
 * @Description: 商品规格信息表
 * @Date: 2018/4/19 14:16
 */
public class Size implements Serializable{

    private static final long serialVersionUID = -6412190280826243584L;

    //规格id
    private int sizeId;

    //规格名
    private String sizeName;

    //所属父规格
    private int parentId;

    //使用状态
    private int status;

    //备注
    private String remark;


    //子规格
    private List<Size> sizeList;


    public Size() {
    }

    public Size(String sizeName, int parentId, int status, String remark) {
        this.sizeName = sizeName;
        this.parentId = parentId;
        this.status = status;
        this.remark = remark;
    }

    public Size(String sizeName, int parentId, int status, String remark, List<Size> sizeList) {
        this.sizeName = sizeName;
        this.parentId = parentId;
        this.status = status;
        this.remark = remark;
        this.sizeList = sizeList;
    }

    public Size(int sizeId, String sizeName, int parentId, int status, String remark) {
        this.sizeId = sizeId;
        this.sizeName = sizeName;
        this.parentId = parentId;
        this.status = status;
        this.remark = remark;
    }

    public Size(int sizeId, String sizeName, int parentId, int status, String remark, List<Size> sizeList) {
        this.sizeId = sizeId;
        this.sizeName = sizeName;
        this.parentId = parentId;
        this.status = status;
        this.remark = remark;
        this.sizeList = sizeList;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<Size> getSizeList() {
        return sizeList;
    }

    public void setSizeList(List<Size> sizeList) {
        this.sizeList = sizeList;
    }

    @Override
    public String toString() {
        return "Size{" +
                "sizeId=" + sizeId +
                ", sizeName='" + sizeName + '\'' +
                ", parentId=" + parentId +
                ", status=" + status +
                ", remark='" + remark + '\'' +
                ", sizeList=" + sizeList +
                '}';
    }
}

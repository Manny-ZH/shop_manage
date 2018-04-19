package com.manny.shop.manage.dao;

import java.io.Serializable;


public class TblSize implements Serializable{

    private int sizeId;

    private String sizeName;

    private String sizeVale;

    private int parentId;

    private int status;

    private String remark;
    
    public TblSize() {
    }

    public TblSize(String sizeName, String sizeVale, int parentId, int status, String remark) {
        this.sizeName = sizeName;
        this.sizeVale = sizeVale;
        this.parentId = parentId;
        this.status = status;
        this.remark = remark;
    }

    public TblSize(int sizeId, String sizeName, String sizeVale, int parentId, int status, String remark) {
        this.sizeId = sizeId;
        this.sizeName = sizeName;
        this.sizeVale = sizeVale;
        this.parentId = parentId;
        this.status = status;
        this.remark = remark;
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

    public String getSizeVale() {
        return sizeVale;
    }

    public void setSizeVale(String sizeVale) {
        this.sizeVale = sizeVale;
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

    @Override
    public String toString() {
        return "TblSize{" +
                "sizeId=" + sizeId +
                ", sizeName='" + sizeName + '\'' +
                ", sizeVale='" + sizeVale + '\'' +
                ", parentId=" + parentId +
                ", status=" + status +
                ", remark='" + remark + '\'' +
                '}';
    }
}

package com.manny.shop.manage.Entity;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: manny
 * @Description: 商品类型表
 * @Date: 2018/4/19 14:24
 */
public class Type implements Serializable{

    private static final long serialVersionUID = -2196038191975151734L;

    //类型id
    private int typeId;

    //类型名
    private String typeName;

    //状态码
    private int status;

    //备注
    private String remark;

    //拥有规格
    private List<Size> sizeList;

    public Type() {
    }

    public Type(String typeName, int status, String remark) {

        this.typeName = typeName;
        this.status = status;
        this.remark = remark;
    }

    public Type(String typeName, int status, String remark, List<Size> sizeList) {
        this.typeName = typeName;
        this.status = status;
        this.remark = remark;
        this.sizeList = sizeList;
    }

    public Type(int typeId, String typeName, int status, String remark) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.status = status;
        this.remark = remark;
    }

    public Type(int typeId, String typeName, int status, String remark, List<Size> sizeList) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.status = status;
        this.remark = remark;
        this.sizeList = sizeList;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
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
        return "Type{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", status=" + status +
                ", remark='" + remark + '\'' +
                ", sizeList=" + sizeList +
                '}';
    }
}

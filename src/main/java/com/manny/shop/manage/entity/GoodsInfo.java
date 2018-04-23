package com.manny.shop.manage.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: manny
 * @Description: 商品信息表
 * @Date: 2018/4/19 14:56
 */
public class GoodsInfo implements Serializable {

    private static final long serialVersionUID = 8404134408566424023L;

    //商品id
    private int goodsId;

    //商品名
    private String goodsName;

    //供应商id
    private int supplierId;

    //商品类型
    private int typeId;

    //商品规格
    private String size;

    //市场进价
    private BigDecimal purchasePrice;

    //零售价
    private BigDecimal sellPrice;

    //图片
    private String picture;

    //剩余库存
    private int amount;

    //状态
    private int status;

    //备注
    private String remark;


    //供应商信息
    private String supplierName;

    //所属种类
    private String typeName;


    public GoodsInfo() {
    }

    public GoodsInfo(String goodsName, int supplierId, int typeId, String size, BigDecimal purchasePrice, BigDecimal sellPrice, String picture, int amount, int status, String remark) {
        this.goodsName = goodsName;
        this.supplierId = supplierId;
        this.typeId = typeId;
        this.size = size;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
        this.picture = picture;
        this.amount = amount;
        this.status = status;
        this.remark = remark;
    }

    public GoodsInfo(String goodsName, int supplierId, int typeId, String size, BigDecimal purchasePrice, BigDecimal sellPrice, String picture, int amount, int status, String remark, String supplierName, String typeName) {
        this.goodsName = goodsName;
        this.supplierId = supplierId;
        this.typeId = typeId;
        this.size = size;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
        this.picture = picture;
        this.amount = amount;
        this.status = status;
        this.remark = remark;
        this.supplierName = supplierName;
        this.typeName = typeName;
    }

    public GoodsInfo(int goodsId, String goodsName, int supplierId, int typeId, String size, BigDecimal purchasePrice, BigDecimal sellPrice, String picture, int amount, int status, String remark) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.supplierId = supplierId;
        this.typeId = typeId;
        this.size = size;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
        this.picture = picture;
        this.amount = amount;
        this.status = status;
        this.remark = remark;
    }

    public GoodsInfo(int goodsId, String goodsName, int supplierId, int typeId, String size, BigDecimal purchasePrice, BigDecimal sellPrice, String picture, int amount, int status, String remark, String supplierName, String typeName) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.supplierId = supplierId;
        this.typeId = typeId;
        this.size = size;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
        this.picture = picture;
        this.amount = amount;
        this.status = status;
        this.remark = remark;
        this.supplierName = supplierName;
        this.typeName = typeName;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getStringId() {
        return supplierId;
    }

    public void setStringId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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

    public String getString() {
        return supplierName;
    }

    public void setString(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getType() {
        return typeName;
    }

    public void setType(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "GoodsInfo{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", supplierId=" + supplierId +
                ", typeId=" + typeId +
                ", size='" + size + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", sellPrice=" + sellPrice +
                ", picture='" + picture + '\'' +
                ", amount=" + amount +
                ", status=" + status +
                ", remark='" + remark + '\'' +
                ", supplierName=" + supplierName +
                ", typeName=" + typeName +
                '}';
    }
}

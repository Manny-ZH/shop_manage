package com.manny.shop.manage.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: manny
 * @Description: 单件商品详细记录
 * @Date: 2018/4/19 15:15
 */
public class GoodsDetial implements Serializable{

    private static final long serialVersionUID = 6519274208788538851L;

    //某一件商品分配的id
    private int id;

    //所属购进订单号
    private int purchaseId;

    //所属商品id
    private int goodsId;

    //购买金额
    private BigDecimal purchasePrice;

    //购买日
    private Date purchaseDate;

    //售出金额
    private BigDecimal sellPrice;

    //购买人
    private String buyPeople;

    //售价
    private Date sellDate;

    //最终流向
    private int finallyStatus;

    //最终态时间
    private Date finallyDate;

    //备注
    private String remark;


    //订单信息
    private PurchaseList purchaseList;

    //商品名
    private String goodsName;


    public GoodsDetial() {
    }

    public GoodsDetial(int purchaseId, int goodsId, BigDecimal purchasePrice, Date purchaseDate, BigDecimal sellPrice, String buyPeople, Date sellDate, int finallyStatus, Date finallyDate, String remark) {
        this.purchaseId = purchaseId;
        this.goodsId = goodsId;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.sellPrice = sellPrice;
        this.buyPeople = buyPeople;
        this.sellDate = sellDate;
        this.finallyStatus = finallyStatus;
        this.finallyDate = finallyDate;
        this.remark = remark;
    }

    public GoodsDetial(int purchaseId, int goodsId, BigDecimal purchasePrice, Date purchaseDate, BigDecimal sellPrice, String buyPeople, Date sellDate, int finallyStatus, Date finallyDate, String remark, PurchaseList purchaseList, String goodsName) {
        this.purchaseId = purchaseId;
        this.goodsId = goodsId;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.sellPrice = sellPrice;
        this.buyPeople = buyPeople;
        this.sellDate = sellDate;
        this.finallyStatus = finallyStatus;
        this.finallyDate = finallyDate;
        this.remark = remark;
        this.purchaseList = purchaseList;
        this.goodsName = goodsName;
    }

    public GoodsDetial(int id, int purchaseId, int goodsId, BigDecimal purchasePrice, Date purchaseDate, BigDecimal sellPrice, String buyPeople, Date sellDate, int finallyStatus, Date finallyDate, String remark) {
        this.id = id;
        this.purchaseId = purchaseId;
        this.goodsId = goodsId;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.sellPrice = sellPrice;
        this.buyPeople = buyPeople;
        this.sellDate = sellDate;
        this.finallyStatus = finallyStatus;
        this.finallyDate = finallyDate;
        this.remark = remark;
    }

    public GoodsDetial(int id, int purchaseId, int goodsId, BigDecimal purchasePrice, Date purchaseDate, BigDecimal sellPrice, String buyPeople, Date sellDate, int finallyStatus, Date finallyDate, String remark, PurchaseList purchaseList, String goodsName) {
        this.id = id;
        this.purchaseId = purchaseId;
        this.goodsId = goodsId;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.sellPrice = sellPrice;
        this.buyPeople = buyPeople;
        this.sellDate = sellDate;
        this.finallyStatus = finallyStatus;
        this.finallyDate = finallyDate;
        this.remark = remark;
        this.purchaseList = purchaseList;
        this.goodsName = goodsName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getBuyPeople() {
        return buyPeople;
    }

    public void setBuyPeople(String buyPeople) {
        this.buyPeople = buyPeople;
    }

    public Date getSellDate() {
        return sellDate;
    }

    public void setSellDate(Date sellDate) {
        this.sellDate = sellDate;
    }

    public int getFinallyStatus() {
        return finallyStatus;
    }

    public void setFinallyStatus(int finallyStatus) {
        this.finallyStatus = finallyStatus;
    }

    public Date getFinallyDate() {
        return finallyDate;
    }

    public void setFinallyDate(Date finallyDate) {
        this.finallyDate = finallyDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public PurchaseList getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(PurchaseList purchaseList) {
        this.purchaseList = purchaseList;
    }

    public String getgoodsName() {
        return goodsName;
    }

    public void setgoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public String toString() {
        return "GoodsDetial{" +
                "id=" + id +
                ", purchaseId=" + purchaseId +
                ", goodsId=" + goodsId +
                ", purchasePrice=" + purchasePrice +
                ", purchaseDate=" + purchaseDate +
                ", sellPrice=" + sellPrice +
                ", buyPeople='" + buyPeople + '\'' +
                ", sellDate=" + sellDate +
                ", finallyStatus=" + finallyStatus +
                ", finallyDate=" + finallyDate +
                ", remark='" + remark + '\'' +
                ", purchaseList=" + purchaseList +
                ", goodsName=" + goodsName +
                '}';
    }
}

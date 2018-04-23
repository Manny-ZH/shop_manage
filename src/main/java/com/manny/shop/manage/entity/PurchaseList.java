package com.manny.shop.manage.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: manny
 * @Description: 进货单信息
 * @Date: 2018/4/19 15:25
 */
public class PurchaseList implements Serializable{

    private static final long serialVersionUID = 225913382116087578L;

    //进货订id
    private int purchaseId;

    //购进厂商
    private int supplierId;

    //进货订单号
    private String purchaseNumber;

    //进货时间
    private Date date;

    //进货金额
    private BigDecimal goodsMoney;

    //运费
    private BigDecimal carriage;

    //备注
    private String remark;


    //进货商信息
    private String supplierName;


    public PurchaseList() {
    }

    public PurchaseList(int supplierId, String purchaseNumber, Date date, BigDecimal goodsMoney, BigDecimal carriage, String remark) {
        this.supplierId = supplierId;
        this.purchaseNumber = purchaseNumber;
        this.date = date;
        this.goodsMoney = goodsMoney;
        this.carriage = carriage;
        this.remark = remark;
    }

    public PurchaseList(int supplierId, String purchaseNumber, Date date, BigDecimal goodsMoney, BigDecimal carriage, String remark, String supplierName) {
        this.supplierId = supplierId;
        this.purchaseNumber = purchaseNumber;
        this.date = date;
        this.goodsMoney = goodsMoney;
        this.carriage = carriage;
        this.remark = remark;
        this.supplierName = supplierName;
    }

    public PurchaseList(int purchaseId, int supplierId, String purchaseNumber, Date date, BigDecimal goodsMoney, BigDecimal carriage, String remark) {
        this.purchaseId = purchaseId;
        this.supplierId = supplierId;
        this.purchaseNumber = purchaseNumber;
        this.date = date;
        this.goodsMoney = goodsMoney;
        this.carriage = carriage;
        this.remark = remark;
    }

    public PurchaseList(int purchaseId, int supplierId, String purchaseNumber, Date date, BigDecimal goodsMoney, BigDecimal carriage, String remark, String supplierName) {
        this.purchaseId = purchaseId;
        this.supplierId = supplierId;
        this.purchaseNumber = purchaseNumber;
        this.date = date;
        this.goodsMoney = goodsMoney;
        this.carriage = carriage;
        this.remark = remark;
        this.supplierName = supplierName;
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(String purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getGoodsMoney() {
        return goodsMoney;
    }

    public void setGoodsMoney(BigDecimal goodsMoney) {
        this.goodsMoney = goodsMoney;
    }

    public BigDecimal getCarriage() {
        return carriage;
    }

    public void setCarriage(BigDecimal carriage) {
        this.carriage = carriage;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSupplier() {
        return supplierName;
    }

    public void setSupplier(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public String toString() {
        return "PurchaseList{" +
                "purchaseId=" + purchaseId +
                ", supplierId=" + supplierId +
                ", purchaseNumber='" + purchaseNumber + '\'' +
                ", date=" + date +
                ", goodsMoney=" + goodsMoney +
                ", carriage=" + carriage +
                ", remark='" + remark + '\'' +
                ", supplierName=" + supplierName +
                '}';
    }
}

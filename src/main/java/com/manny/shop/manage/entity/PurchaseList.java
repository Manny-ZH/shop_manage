package com.manny.shop.manage.entity;

import java.io.Serializable;
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
    private double goodsMoney;

    //运费
    private double carriage;

    //备注
    private String remark;

    //进货商信息
    private Supplier supplier;

    public PurchaseList() {
    }

    public PurchaseList(int supplierId, String purchaseNumber, Date date, double goodsMoney, double carriage, String remark) {
        this.supplierId = supplierId;
        this.purchaseNumber = purchaseNumber;
        this.date = date;
        this.goodsMoney = goodsMoney;
        this.carriage = carriage;
        this.remark = remark;
    }

    public PurchaseList(int supplierId, String purchaseNumber, Date date, double goodsMoney, double carriage, String remark, Supplier supplier) {
        this.supplierId = supplierId;
        this.purchaseNumber = purchaseNumber;
        this.date = date;
        this.goodsMoney = goodsMoney;
        this.carriage = carriage;
        this.remark = remark;
        this.supplier = supplier;
    }

    public PurchaseList(int purchaseId, int supplierId, String purchaseNumber, Date date, double goodsMoney, double carriage, String remark) {
        this.purchaseId = purchaseId;
        this.supplierId = supplierId;
        this.purchaseNumber = purchaseNumber;
        this.date = date;
        this.goodsMoney = goodsMoney;
        this.carriage = carriage;
        this.remark = remark;
    }

    public PurchaseList(int purchaseId, int supplierId, String purchaseNumber, Date date, double goodsMoney, double carriage, String remark, Supplier supplier) {
        this.purchaseId = purchaseId;
        this.supplierId = supplierId;
        this.purchaseNumber = purchaseNumber;
        this.date = date;
        this.goodsMoney = goodsMoney;
        this.carriage = carriage;
        this.remark = remark;
        this.supplier = supplier;
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

    public double getGoodsMoney() {
        return goodsMoney;
    }

    public void setGoodsMoney(double goodsMoney) {
        this.goodsMoney = goodsMoney;
    }

    public double getCarriage() {
        return carriage;
    }

    public void setCarriage(double carriage) {
        this.carriage = carriage;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
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
                ", supplier=" + supplier +
                '}';
    }
}

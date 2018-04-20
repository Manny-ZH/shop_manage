package com.manny.shop.manage.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: manny
 * @Description: 日经营状况
 * @Date: 2018/4/19 15:22
 */
public class ManageInfo implements Serializable {

    private static final long serialVersionUID = 3878993153739696622L;

    //id
    private int id;

    //时间
    private Date date;

    //进货总金额
    private double purchaseMoney;

    //售货总金额
    private double sellMoney;

    //总支出
    private double expendMoney;

    //总收入
    private double incomeMoney;

    public ManageInfo() {
    }

    public ManageInfo(Date date, double purchaseMoney, double sellMoney, double expendMoney, double incomeMoney) {
        this.date = date;
        this.purchaseMoney = purchaseMoney;
        this.sellMoney = sellMoney;
        this.expendMoney = expendMoney;
        this.incomeMoney = incomeMoney;
    }

    public ManageInfo(int id, Date date, double purchaseMoney, double sellMoney, double expendMoney, double incomeMoney) {
        this.id = id;
        this.date = date;
        this.purchaseMoney = purchaseMoney;
        this.sellMoney = sellMoney;
        this.expendMoney = expendMoney;
        this.incomeMoney = incomeMoney;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPurchaseMoney() {
        return purchaseMoney;
    }

    public void setPurchaseMoney(double purchaseMoney) {
        this.purchaseMoney = purchaseMoney;
    }

    public double getSellMoney() {
        return sellMoney;
    }

    public void setSellMoney(double sellMoney) {
        this.sellMoney = sellMoney;
    }

    public double getExpendMoney() {
        return expendMoney;
    }

    public void setExpendMoney(double expendMoney) {
        this.expendMoney = expendMoney;
    }

    public double getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(double incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    @Override
    public String toString() {
        return "ManageInfo{" +
                "id=" + id +
                ", date=" + date +
                ", purchaseMoney=" + purchaseMoney +
                ", sellMoney=" + sellMoney +
                ", expendMoney=" + expendMoney +
                ", incomeMoney=" + incomeMoney +
                '}';
    }
}

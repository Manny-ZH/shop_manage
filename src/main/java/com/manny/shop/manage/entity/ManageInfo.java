package com.manny.shop.manage.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
    private BigDecimal purchaseMoney;

    //售货总金额
    private BigDecimal sellMoney;

    //总支出
    private BigDecimal expendMoney;

    //总收入
    private BigDecimal incomeMoney;

    public ManageInfo() {
    }

    public ManageInfo(Date date, BigDecimal purchaseMoney, BigDecimal sellMoney, BigDecimal expendMoney, BigDecimal incomeMoney) {
        this.date = date;
        this.purchaseMoney = purchaseMoney;
        this.sellMoney = sellMoney;
        this.expendMoney = expendMoney;
        this.incomeMoney = incomeMoney;
    }

    public ManageInfo(int id, Date date, BigDecimal purchaseMoney, BigDecimal sellMoney, BigDecimal expendMoney, BigDecimal incomeMoney) {
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

    public BigDecimal getPurchaseMoney() {
        return purchaseMoney;
    }

    public void setPurchaseMoney(BigDecimal purchaseMoney) {
        this.purchaseMoney = purchaseMoney;
    }

    public BigDecimal getSellMoney() {
        return sellMoney;
    }

    public void setSellMoney(BigDecimal sellMoney) {
        this.sellMoney = sellMoney;
    }

    public BigDecimal getExpendMoney() {
        return expendMoney;
    }

    public void setExpendMoney(BigDecimal expendMoney) {
        this.expendMoney = expendMoney;
    }

    public BigDecimal getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(BigDecimal incomeMoney) {
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

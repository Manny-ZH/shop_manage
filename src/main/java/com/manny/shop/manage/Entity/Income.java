package com.manny.shop.manage.Entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: manny
 * @Description: 收入信息
 * @Date: 2018/4/19 15:21
 */
public class Income implements Serializable {

    private static final long serialVersionUID = 8431363539707917502L;

    //收入id
    private int incomeId;

    //收入时间
    private Date date;

    //收入金额
    private double amount;

    //备注
    private String remark;

    public Income() {
    }

    public Income(int incomeId, Date date, double amount, String remark) {
        this.incomeId = incomeId;
        this.date = date;
        this.amount = amount;
        this.remark = remark;
    }

    public int getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(int incomeId) {
        this.incomeId = incomeId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Income{" +
                "incomeId=" + incomeId +
                ", date=" + date +
                ", amount=" + amount +
                ", remark='" + remark + '\'' +
                '}';
    }
}

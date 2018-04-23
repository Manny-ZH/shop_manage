package com.manny.shop.manage.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: manny
 * @Description: 支出信息
 * @Date: 2018/4/19 14:52
 */
public class Expend implements Serializable {

    private static final long serialVersionUID = -6840957082210607277L;

    //支出自增主键id
    private int expendId;

    //支出时间
    private Date date;

    //支出金额
    private BigDecimal amount;

    //备注
    private String remark;

    public Expend() {
    }

    public Expend(Date date, BigDecimal amount, String remark) {
        this.date = date;
        this.amount = amount;
        this.remark = remark;
    }

    public Expend(int expendId, Date date, BigDecimal amount, String remark) {
        this.expendId = expendId;
        this.date = date;
        this.amount = amount;
        this.remark = remark;
    }

    public int getExpendId() {
        return expendId;
    }

    public void setExpendId(int expendId) {
        this.expendId = expendId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
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
        return "Expend{" +
                "expendId=" + expendId +
                ", date=" + date +
                ", amount=" + amount +
                ", remark='" + remark + '\'' +
                '}';
    }
}

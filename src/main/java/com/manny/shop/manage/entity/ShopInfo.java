package com.manny.shop.manage.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: manny
 * @Description: 店铺信息表
 * @Date: 2018/4/19 14:36
 */
public class ShopInfo implements Serializable {

    private static final long serialVersionUID = -1145596899229938482L;

    //商店信息
    private int shopId;

    //商店名
    private String shopName;

    //联系电话
    private String telephone;

    //店长
    private String shopKeeper;

    //经理
    private String manager;

    //手机号
    private String phone;

    //图片1
    private String shopPhoto1;

    //图片2
    private String shopPhoto2;

    //图片3
    private String shopPhoto3;

    //资产
    private BigDecimal property;

    //总收入
    private BigDecimal income;

    //总支出
    private BigDecimal expend;

    //预计盈利
    private BigDecimal preProfit;

    //
    private BigDecimal profit;

    public ShopInfo() {
    }

    public ShopInfo(String shopName, String telephone, String shopKeeper, String manager, String phone, String shopPhoto1, String shopPhoto2, String shopPhoto3, BigDecimal property, BigDecimal income, BigDecimal expend, BigDecimal preProfit, BigDecimal profit) {
        this.shopName = shopName;
        this.telephone = telephone;
        this.shopKeeper = shopKeeper;
        this.manager = manager;
        this.phone = phone;
        this.shopPhoto1 = shopPhoto1;
        this.shopPhoto2 = shopPhoto2;
        this.shopPhoto3 = shopPhoto3;
        this.property = property;
        this.income = income;
        this.expend = expend;
        this.preProfit = preProfit;
        this.profit = profit;
    }

    public ShopInfo(int shopId, String shopName, String telephone, String shopKeeper, String manager, String phone, String shopPhoto1, String shopPhoto2, String shopPhoto3, BigDecimal property, BigDecimal income, BigDecimal expend, BigDecimal preProfit, BigDecimal profit) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.telephone = telephone;
        this.shopKeeper = shopKeeper;
        this.manager = manager;
        this.phone = phone;
        this.shopPhoto1 = shopPhoto1;
        this.shopPhoto2 = shopPhoto2;
        this.shopPhoto3 = shopPhoto3;
        this.property = property;
        this.income = income;
        this.expend = expend;
        this.preProfit = preProfit;
        this.profit = profit;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getShopKeeper() {
        return shopKeeper;
    }

    public void setShopKeeper(String shopKeeper) {
        this.shopKeeper = shopKeeper;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getShopPhoto1() {
        return shopPhoto1;
    }

    public void setShopPhoto1(String shopPhoto1) {
        this.shopPhoto1 = shopPhoto1;
    }

    public String getShopPhoto2() {
        return shopPhoto2;
    }

    public void setShopPhoto2(String shopPhoto2) {
        this.shopPhoto2 = shopPhoto2;
    }

    public String getShopPhoto3() {
        return shopPhoto3;
    }

    public void setShopPhoto3(String shopPhoto3) {
        this.shopPhoto3 = shopPhoto3;
    }

    public BigDecimal getProperty() {
        return property;
    }

    public void setProperty(BigDecimal property) {
        this.property = property;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public BigDecimal getExpend() {
        return expend;
    }

    public void setExpend(BigDecimal expend) {
        this.expend = expend;
    }

    public BigDecimal getPreProfit() {
        return preProfit;
    }

    public void setPreProfit(BigDecimal preProfit) {
        this.preProfit = preProfit;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "ShopInfo{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", telephone='" + telephone + '\'' +
                ", shopKeeper='" + shopKeeper + '\'' +
                ", manager='" + manager + '\'' +
                ", phone='" + phone + '\'' +
                ", shopPhoto1='" + shopPhoto1 + '\'' +
                ", shopPhoto2='" + shopPhoto2 + '\'' +
                ", shopPhoto3='" + shopPhoto3 + '\'' +
                ", property=" + property +
                ", income=" + income +
                ", expend=" + expend +
                ", preProfit=" + preProfit +
                ", profit=" + profit +
                '}';
    }
}

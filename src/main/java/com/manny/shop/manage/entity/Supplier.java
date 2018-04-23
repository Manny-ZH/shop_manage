package com.manny.shop.manage.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: manny
 * @Description: 供应商信息表
 * @Date: 2018/4/19 14:27
 */
public class Supplier implements Serializable{

    private static final long serialVersionUID = -4882055697060509075L;

    //厂商id
    private int supplierId;

    //厂商名
    private String supplierName;

    //省
    private int province;

    //市
    private int city;

    //县
    private int county;

    //详细地址
    private String address;

    //供应人
    private String supplier;

    //联系方式1
    private String phone1;

    //联系方式2
    private String phone2;

    //厂商状态
    private int status;

    //备注
    private String remark;


    //售出商品种类
    private List<Type> typeList;


    public Supplier() {
    }

    public Supplier(String supplierName, int province, int city, int county, String address, String supplier, String phone1, String phone2, int status, String remark) {
        this.supplierName = supplierName;
        this.province = province;
        this.city = city;
        this.county = county;
        this.address = address;
        this.supplier = supplier;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.status = status;
        this.remark = remark;
    }

    public Supplier(String supplierName, int province, int city, int county, String address, String supplier, String phone1, String phone2, int status, String remark, List<Type> typeList) {
        this.supplierName = supplierName;
        this.province = province;
        this.city = city;
        this.county = county;
        this.address = address;
        this.supplier = supplier;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.status = status;
        this.remark = remark;
        this.typeList = typeList;
    }

    public Supplier(int supplierId, String supplierName, int province, int city, int county, String address, String supplier, String phone1, String phone2, int status, String remark) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.province = province;
        this.city = city;
        this.county = county;
        this.address = address;
        this.supplier = supplier;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.status = status;
        this.remark = remark;
    }

    public Supplier(int supplierId, String supplierName, int province, int city, int county, String address, String supplier, String phone1, String phone2, int status, String remark, List<Type> typeList) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.province = province;
        this.city = city;
        this.county = county;
        this.address = address;
        this.supplier = supplier;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.status = status;
        this.remark = remark;
        this.typeList = typeList;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public int getCounty() {
        return county;
    }

    public void setCounty(int county) {
        this.county = county;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
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

    public List<Type> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<Type> typeList) {
        this.typeList = typeList;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId=" + supplierId +
                ", supplierName='" + supplierName + '\'' +
                ", province=" + province +
                ", city=" + city +
                ", county=" + county +
                ", address='" + address + '\'' +
                ", supplier='" + supplier + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", status=" + status +
                ", remark='" + remark + '\'' +
                ", typeList=" + typeList +
                '}';
    }
}

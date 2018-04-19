package com.manny.shop.manage.Entity;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: manny
 * @Description: 中国省市县数据
 * @Date: 2018/4/19 14:46
 */
public class District implements Serializable{

    private static final long serialVersionUID = -613717690338943258L;

    //id
    private int id;

    //地点名
    private String name;

    //所属父地点
    private int parentId;

    //首字母
    private String initial;

    //首字母全
    private String initials;

    //拼音
    private String pinyin;

    //代码
    private String code;

    //排序
    private int order;

    private List<District> districtList;

    public District() {
    }

    public District(String name, int parentId, String initial, String initials, String pinyin, String code, int order) {
        this.name = name;
        this.parentId = parentId;
        this.initial = initial;
        this.initials = initials;
        this.pinyin = pinyin;
        this.code = code;
        this.order = order;
    }

    public District(String name, int parentId, String initial, String initials, String pinyin, String code, int order, List<District> districtList) {
        this.name = name;
        this.parentId = parentId;
        this.initial = initial;
        this.initials = initials;
        this.pinyin = pinyin;
        this.code = code;
        this.order = order;
        this.districtList = districtList;
    }

    public District(int id, String name, int parentId, String initial, String initials, String pinyin, String code, int order) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.initial = initial;
        this.initials = initials;
        this.pinyin = pinyin;
        this.code = code;
        this.order = order;
    }

    public District(int id, String name, int parentId, String initial, String initials, String pinyin, String code, int order, List<District> districtList) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.initial = initial;
        this.initials = initials;
        this.pinyin = pinyin;
        this.code = code;
        this.order = order;
        this.districtList = districtList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public List<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<District> districtList) {
        this.districtList = districtList;
    }

    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", initial='" + initial + '\'' +
                ", initials='" + initials + '\'' +
                ", pinyin='" + pinyin + '\'' +
                ", code='" + code + '\'' +
                ", order=" + order +
                ", districtList=" + districtList +
                '}';
    }
}

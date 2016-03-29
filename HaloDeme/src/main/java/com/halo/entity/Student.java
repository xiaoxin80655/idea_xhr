package com.halo.entity;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by n551 on 2016/3/29.
 */
public class Student {

    private String name;

    private Integer age;

    private String info;

    private BigDecimal price;

    private List<Student> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }
}

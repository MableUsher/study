package com.mable.domain;

import java.io.Serializable;

public class House implements Serializable {
   private int id;
   private String housename;
   private String district;
   private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHousename() {
        return housename;
    }

    public void setHousename(String housename) {
        this.housename = housename;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", housename='" + housename + '\'' +
                ", district='" + district + '\'' +
                ", price=" + price +
                '}';
    }
}

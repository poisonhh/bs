package com.qczl.model;

public class Car {
    private Integer id;

    private String color;

    private String brand;

    private String model;

    private Integer carnumber;

    private String buytime;

    private String cardetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(Integer carnumber) {
        this.carnumber = carnumber;
    }

    public String getBuytime() {
        return buytime;
    }

    public void setBuytime(String buytime) {
        this.buytime = buytime;
    }

    public String getCardetail() {
        return cardetail;
    }

    public void setCardetail(String cardetail) {
        this.cardetail = cardetail;
    }
}
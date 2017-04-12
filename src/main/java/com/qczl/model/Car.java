package com.qczl.model;

import java.util.Date;

public class Car {
    private Integer id;

    private String color;

    private String brand;

    private String model;

    private Double rentPrice;

    private Integer storeNumber;

    private Integer carNumber;

    private Date buyTime;

    private String carDetail;

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

    public Double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public Integer getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(Integer storeNumber) {
        this.storeNumber = storeNumber;
    }

    public Integer getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(Integer carNumber) {
        this.carNumber = carNumber;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public String getCarDetail() {
        return carDetail;
    }

    public void setCarDetail(String carDetail) {
        this.carDetail = carDetail;
    }

	@Override
	public String toString() {
		return "Car [id=" + id + ", color=" + color + ", brand=" + brand + ", model=" + model + ", rentPrice="
				+ rentPrice + ", storeNumber=" + storeNumber + ", carNumber=" + carNumber + ", buyTime=" + buyTime
				+ ", carDetail=" + carDetail + "]";
	}
    
}
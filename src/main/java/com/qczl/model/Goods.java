package com.qczl.model;

public class Goods {
    private Integer gid;

    private Integer cid;

    private String name;

    private Float price;

    private Integer num;

    private String picurl;

    private String content;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", cid=" + cid + ", name=" + name + ", price=" + price + ", num=" + num
				+ ", picurl=" + picurl + ", content=" + content + "]";
	}
    
}
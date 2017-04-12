package com.qczl.model;

public class Cart {
    private Integer cid;

    private Integer gid;

    private String username;

    private Integer buynum;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getBuynum() {
        return buynum;
    }

    public void setBuynum(Integer buynum) {
        this.buynum = buynum;
    }

	@Override
	public String toString() {
		return "Cart [cid=" + cid + ", gid=" + gid + ", username=" + username + ", buynum=" + buynum + "]";
	}
    
}
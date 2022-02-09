package com.dianchi.ruanjian.entity;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
	private Integer pid;
	private String pname;
	private Double marketPrice;
	private Double shopPrice;
	private String pimage;
	private Date pdate;
	private Integer isHot;
	private String pdesc;
	private Integer pflag;
	private Category c;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}

	public Double getShopPrice() {
		return shopPrice;
	}

	public void setShopPrice(Double shopPrice) {
		this.shopPrice = shopPrice;
	}

	public String getPimage() {
		return pimage;
	}

	public void setPimage(String pimage) {
		this.pimage = pimage;
	}

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	public Integer getIsHot() {
		return isHot;
	}

	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public Integer getPflag() {
		return pflag;
	}

	public void setPflag(Integer pflag) {
		this.pflag = pflag;
	}

	public Category getC() {
		return c;
	}

	public void setC(Category c) {
		this.c = c;
	}

	public Product(Integer pid, String pname, Double marketPrice, Double shopPrice, String pimage, Date pdate,
			Integer isHot, String pdesc, Integer pflag, Category c) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.marketPrice = marketPrice;
		this.shopPrice = shopPrice;
		this.pimage = pimage;
		this.pdate = pdate;
		this.isHot = isHot;
		this.pdesc = pdesc;
		this.pflag = pflag;
		this.c = c;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", marketPrice=" + marketPrice + ", shopPrice=" + shopPrice
				+ ", pimage=" + pimage + ", pdate=" + pdate + ", isHot=" + isHot + ", pdesc=" + pdesc + ", pflag="
				+ pflag + ", c=" + c + "]";
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
}

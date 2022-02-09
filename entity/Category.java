package com.dianchi.ruanjian.entity;

import java.io.Serializable;

public class Category implements Serializable {
	private Integer cid;
	private String cname;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Category(Integer cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
}

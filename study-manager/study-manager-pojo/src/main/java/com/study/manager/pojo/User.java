package com.study.manager.pojo;

import java.util.Date;

public class User {
	private int id;
	private String name;
	private String pwd;
	private Date created;
	private Date updated;
	private short admin;
	
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public short getAdmin() {
		return admin;
	}
	public void setAdmin(short admin) {
		this.admin = admin;
	}	
}

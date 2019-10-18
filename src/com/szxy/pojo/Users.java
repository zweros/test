package com.szxy.pojo;

import com.szxy.annotation.Column;
import com.szxy.annotation.Table;

@Table(value="tb_user")
public class Users {
	@Column(columnName="userid",length=10,type="int")
	private String userid;
	@Column(columnName="username",length=50,type="varchar")
	private String username;
	@Column(columnName="password",length=100,type="varchar")
	private String password;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

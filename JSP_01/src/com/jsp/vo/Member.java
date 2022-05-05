package com.jsp.vo;

public class Member {
	private String id;
	private String pwd;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public Member(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	
	public Member() {
		
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + "]";
	}
	
	
}
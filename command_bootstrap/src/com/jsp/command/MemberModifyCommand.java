package com.jsp.command;

import java.util.Date;

import com.jsp.dto.MemberVO;

public class MemberModifyCommand {
	private String id;
	private String pwd;
	private String name="---";
	private String phone;
	private String email;
	private String picture;
	private String authority;
	
	
	public MemberVO toMemberVO() {
		
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPwd(pwd);
		member.setPhone(phone);
		member.setEmail(email);
		member.setPicture(picture);
		member.setAuthority(authority);
		member.setName(name);
		member.setRegDate(new Date());
		
		return member;
	}
	
}

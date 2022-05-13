package com.jsp.service;

import java.util.List;

import com.jsp.command.Criteria;
import com.jsp.vo.MemberVO;

public interface MemberService {
	public List<MemberVO> getMemberList() throws Exception;
	public List<MemberVO> getMemberList(Criteria cri) throws Exception;
}

package com.jsp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jsp.command.Criteria;
import com.jsp.dto.MemberVO;

public interface MemberDAO {
	
	//회원 리스트 조회
	List<MemberVO> selectMemberList(SqlSession session) throws Exception;
	List<MemberVO> selectMemberList(SqlSession session,Criteria cri) throws Exception;
	
	int selectMemberListCount(SqlSession session) throws Exception;
	
	MemberVO selectMemberById(SqlSession session, String id) throws Exception;
	
	void insertMember(SqlSession session, MemberVO member) throws Exception; 
	
	void updateMember(SqlSession session, MemberVO member) throws Exception;

	void deleteMember(SqlSession session, String id) throws Exception;
	
	void enabledMember(SqlSession session, String id, int enabled) throws Exception;
}

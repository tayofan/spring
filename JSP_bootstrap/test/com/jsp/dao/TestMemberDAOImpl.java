package com.jsp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jsp.dataSource.OracleMybatisSqlSessionFactory;
import com.jsp.vo.MemberVO;
import com.jsp.vo.BoardVO;

public class TestMemberDAOImpl {
	
	private SqlSessionFactory factory = new OracleMybatisSqlSessionFactory();
	
	private SqlSession session;
	private MemberDAO memberDAO = new MemberDAOImpl();
	private BoardDAO boardDAO = new BoardDAOImpl();
	
	@Before
	public void init() throws Exception{
		session = factory.openSession();
	}
	@After
	public void close() throws Exception{
		if(session!=null) session.close();
	}
	
	@Test
	public void testSelectMemberList() throws Exception{
		List<MemberVO> memberList = memberDAO.selectMemberList(session);
		
		Assert.assertEquals(7, memberList.size());
	}
	
	@Test
	public void testSelectBoardList() throws Exception{
		List<BoardVO> boardList = boardDAO.selectBoardList(session);
		
		Assert.assertEquals(12263, boardList.size());
	}
	
	@Test
	public void testBoardDetail()throws Exception{
		BoardVO board = boardDAO.selectBoardDetail(session,17462);
		Assert.assertNotNull(board);
	}
	
	@Test
	public void testBoardCount()throws Exception{
		int boardCount = boardDAO.selectBoardListCount(session);
		Assert.assertEquals(12263, boardCount);
	}

}

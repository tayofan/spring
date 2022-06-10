package com.jsp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jsp.command.SearchCriteria;
import com.jsp.datasource.OracleMybatisSqlSessionFactory;
import com.jsp.dto.PdsVO;

public class TestMemberDAOImpl {
	
	private SqlSessionFactory factory = new OracleMybatisSqlSessionFactory();
	
	private SqlSession session;
	private MemberDAO memberDAO = new MemberDAOImpl();
	private SearchCriteria cri = new SearchCriteria();
	private NoticeDAO noticeDAO = new NoticeDAOImpl();
	private BoardDAO boardDAO = new BoardDAOImpl();
	private PdsDAO pdsDAO = new PdsDAOImpl();
	
	@Before
	public void init() throws Exception{
		session = factory.openSession();
	}
	@After
	public void close() throws Exception{
		if(session!=null) session.close();
	}
	
//	@Test
//	public void testSelectMemberList() throws Exception{
//		List<MemberVO> memberList = memberDAO.selectMemberList(session);
//		
//		Assert.assertEquals(7, memberList.size());
//	}
//	
//	@Test
//	public void testSelectSearchMemberList() throws Exception{
//		List<MemberVO> memberList = memberDAO.selectMemberList(session,cri);
//		
//		Assert.assertEquals(7, memberList.size());
//	}
//
//	@Test
//	public void testSelectBoardByBno() throws Exception{
//		BoardVO board = boardDAO.selectBoardByBno(session, 17446);
//		Assert.assertEquals("ㅎㅀㅀㅀㄹ", board.getTitle());
//	}
//	
//	@Test
//	public void testGetNotice()throws Exception{
//		int nno = 47;
//       	NoticeVO notice = noticeDAO.selectNoticeByNno(session, nno);
//	      
//       	Assert.assertEquals("gdgd",notice.getTitle());
//	} 
	
	
	

}

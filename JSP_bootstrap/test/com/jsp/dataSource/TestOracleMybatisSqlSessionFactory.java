package com.jsp.dataSource;

import java.util.Collection;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jsp.vo.BoardVO;
import com.jsp.vo.MemberVO;



public class TestOracleMybatisSqlSessionFactory {
	
	private OracleMybatisSqlSessionFactory sqlSessionFactory
		= new OracleMybatisSqlSessionFactory();
	
	private SqlSession session;
	
	@Before
	public void init()throws Exception{
		session = sqlSessionFactory.openSession();
		
	}
	
	@Test
	public void testSqlSessionFactory()throws Exception{
		Assert.assertNotNull(sqlSessionFactory);
	}
	
	@Test
	public void testSqlSession()throws Exception{
		Collection<String> mapNames = (Collection<String>)session.getConfiguration().getMappedStatementNames(); 
		Assert.assertNotNull(mapNames.contains("Member-Mapper.selectMemberList"));
	}
	
	@Test
	public void testMemberList()throws Exception{
		List<MemberVO> memberList = session.selectList("Member-Mapper.selectMemberList");
		Assert.assertEquals(7, memberList.size());
	}
	
	@Test
	public void testBoardList()throws Exception{
		List<BoardVO> boardList = session.selectList("Board-Mapper.selectBoardList");
		Assert.assertEquals(12263, boardList.size());
	}
	
	@Test
	public void testBoardDetail()throws Exception{
		BoardVO board = session.selectOne("Board-Mapper.selectBoardDetail",23243);
		Assert.assertNotNull(board);
	}
	
	@Test
	public void testBoardCount()throws Exception{
		int boardCount = session.selectOne("Board-Mapper.selectBoardListCount",23243);
		Assert.assertEquals(12263, boardCount);
	}
	
	@After
	public void close()throws Exception{
		if(session != null) session.close();
	}
}


package com.jsp.service;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.jsp.command.Criteria;
import com.jsp.vo.BoardVO;
import com.jsp.vo.MemberVO;

public class TestMemberServiceImpl {
   
   private MemberService service = new MemberServiceImpl();
   private BoardService boardService = new BoardServiceImpl();
   private Criteria cri = new Criteria();
   
   @Test
   public void testGetMemberList()throws Exception{
	   List<MemberVO> memberList = service.getMemberList();
      
	   Assert.assertEquals(7, memberList.size());
   }
   @Test
   public void testGetBoardList()throws Exception{
	   List<BoardVO> boardList = boardService.getBoardList();
	   
	   Assert.assertEquals(12263, boardList.size());
   }
   @Test
   public void testBoardDetail()throws Exception{
	   BoardVO board = boardService.getBoardDetail(17462);
	   Assert.assertNotNull(board);
   }
   @Test
   public void testBoardCount()throws Exception{
	   Map<String, Object> boardMap = boardService.getBoardListForPage(cri);
	   Assert.assertNotNull(boardMap);
   }
}

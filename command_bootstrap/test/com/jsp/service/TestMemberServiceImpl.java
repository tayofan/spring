package com.jsp.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.jsp.dto.MemberVO;
import com.jsp.dto.NoticeVO;

public class TestMemberServiceImpl {
   
   private MemberService service = new MemberServiceImpl();
   private NoticeService noticeService = new NoticeServiceImpl();
   
	/*
	 * @Test public void testGetMemberList()throws Exception{ List<MemberVO>
	 * memberList = service.getMemberList();
	 * 
	 * Assert.assertEquals(7, memberList.size()); }
	 */
   
   @Test
   public void testGetNotice()throws Exception{
	
       NoticeVO notice = noticeService.getNoticeForModify(40);
      
       Assert.assertEquals("gdgd",notice.getTitle());
   }
   
}

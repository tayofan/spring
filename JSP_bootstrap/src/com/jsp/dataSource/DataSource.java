package com.jsp.dataSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import com.jsp.vo.BoardVO;
import com.jsp.vo.MemberVO;


public class DataSource {
	private Map<String, MemberVO> memberList = new HashMap<String, MemberVO>();
	private Map<String, BoardVO> boardList = new HashMap<String, BoardVO>();
	
	private static DataSource instance = new DataSource();
	
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
	private DataSource() {
		try {
			for(int i=0;i<20;i++) {
				String temp = "mimi"+i;		
				
				memberList.put(temp, new MemberVO(temp,temp));
				boardList.put(""+i, new BoardVO(i,temp,temp,temp,formatter.parse("2022/04/"+i),0));
			}
			boardList.put("20", new BoardVO(20,"tjdtkd20","tjdtkd20","tjdtkd20",formatter.parse("2022/04/07"),0));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static DataSource getInstance (){
		return instance;
	}
	public Map<String, MemberVO> getMemberList() {
		return memberList;
	}
	public Map<String, BoardVO> getBoardList() {
		return boardList;
	}	
}

//public class DataSource {
//	private Map<String, Member> memberList = new HashMap<String, Member>();
//	
//	private static DataSource instance = new DataSource();
//	
//	private DataSource() {
//		for(int i=0;i<20;i++) {
//			String temp = "mimi"+i;
//			
//			memberList.put(temp, new Member(temp,temp));
//		} 
//		
//	}
//	public static DataSource getInstance (){
//		return instance;
//	}
//	public Map<String, Member> getMemberList() {
//		return memberList;
//	}
//	public void setMemberList(Map<String, Member> memberList) {
//		this.memberList = memberList;
//	}
//	public static void setInstance(DataSource instance) {
//		DataSource.instance = instance;
//	}
//
//}

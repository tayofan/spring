package com.jsp.dataSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.jsp.vo.Board;
import com.jsp.vo.Member;


public class DataSource {
	private Map<String, Member> memberList = new HashMap<String, Member>();
	private Map<String, Board> boardList = new HashMap<String, Board>();
	
	private static DataSource instance = new DataSource();
	
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
	private DataSource() {
		try {
			for(int i=0;i<20;i++) {
				String temp = "mimi"+i;		
				
				memberList.put(temp, new Member(temp,temp));
				boardList.put(""+i, new Board(i,temp,temp,temp,formatter.parse("2022/04/"+i),0));
			}
			boardList.put("20", new Board(20,"tjdtkd20","tjdtkd20","tjdtkd20",formatter.parse("2022/04/07"),0));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static DataSource getInstance (){
		return instance;
	}
	public Map<String, Member> getMemberList() {
		return memberList;
	}
	public Map<String, Board> getBoardList() {
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

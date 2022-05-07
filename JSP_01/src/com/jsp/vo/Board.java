package com.jsp.vo;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Board {
	private int bno;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private String dateYMD;
	private String dateHM;
	private int viewCnt;
	SimpleDateFormat formatYMD = new SimpleDateFormat("yyyy/MM/dd");
	SimpleDateFormat formatHM = new SimpleDateFormat("HH:mm");	
	
	public Board() {}
	
	public Board(int bno, String title, String writer, String content, Date regDate, int viewCnt) {
		super();
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = regDate;
		this.viewCnt = viewCnt;
		this.dateYMD = formatYMD.format(regDate); 
		this.dateHM = formatHM.format(regDate); 
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
		this.dateYMD = formatYMD.format(regDate);
		this.dateHM = formatHM.format(regDate);
	}
	
	public String getDateYMD() {
		return dateYMD;
	}
	
	public String getDateHM() {
		return dateHM;
	}
	
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
}

class BaordBnoComparator implements Comparator<Board> {
	@Override
	public int compare(Board board1, Board board2) {
		if(board1.getBno() > board2.getBno()) return -1;
		else if(board1.getBno() == board2.getBno()) return 0;
		else return 1;
	}
}

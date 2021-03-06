package com.jsp.vo;

import java.util.Comparator;
import java.util.Date;

public class BoardVO {
	private int bno;
	private String title;
	private String writer;
	private String content;
	private Date regdate;
	private int viewCnt;
	private Date updatedate;
	private String dist;
	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	
	public BoardVO() {}
	
	public BoardVO(int bno, String title, String writer, String content, Date regdate, int viewCnt) {
		super();
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regdate = regdate;
		this.viewCnt = viewCnt;
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
		return regdate;
	}
	
	public void setRegDate(Date regDate) {
		this.regdate = regDate;
	}

	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
}

class BaordBnoComparator implements Comparator<BoardVO> {
	@Override
	public int compare(BoardVO board1, BoardVO board2) {
		if(board1.getBno() > board2.getBno()) return -1;
		else if(board1.getBno() == board2.getBno()) return 0;
		else return 1;
	}
}

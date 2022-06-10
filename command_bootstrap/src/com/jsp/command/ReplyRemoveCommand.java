package com.jsp.command;

public class ReplyRemoveCommand {
	private String rno;
	private String page;
	private String bno;

	public int getRno() {
		return Integer.parseInt(rno);
	}
	public void setRno(String rno) {
		this.rno = rno;
	}
	public int getPage() {
		return Integer.parseInt(page);
	}
	public void setPage(String page) {
		this.page = page;
	}
	public int getBno() {
		return Integer.parseInt(bno);
	}
	public void setBno(String bno) {
		this.bno = bno;
	}
}

package com.jsp.command;

public class Criteria {
	private int page = 1; // 현재 페이지
	private int perPageNum = 10; // 한페이지당 보여주는 리스트 수
	
	private int startRowNum = 0; // 시작 리스트 번호???

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if(page < 1) {
			this.page=1;
		}else {
			this.page=page;
		}
		setStartRowNum();
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		if(perPageNum < 1) {
			this.perPageNum=10;
		}else {
			this.perPageNum=perPageNum;
		}
		setStartRowNum();
	}

	public int getStartRowNum() {
		return startRowNum;
	}

	public void setStartRowNum() {
		this.startRowNum = (this.page-1)*perPageNum;
	}

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + ", startRowNum=" + startRowNum + "]";
	}
	
	
}

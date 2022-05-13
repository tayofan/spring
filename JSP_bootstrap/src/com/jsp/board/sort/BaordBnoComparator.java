package com.jsp.board.sort;

import java.util.Comparator;

import com.jsp.vo.BoardVO;

public class BaordBnoComparator implements Comparator<BoardVO> {
	@Override
	public int compare(BoardVO board1, BoardVO board2) {
		if(board1.getBno() > board2.getBno()) return -1;
		else if(board1.getBno() == board2.getBno()) return 0;
		else return 1;
	}
}
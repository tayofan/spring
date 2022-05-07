package com.jsp.board.sort;

import java.util.Comparator;

import com.jsp.vo.Board;

public class BaordBnoComparator implements Comparator<Board> {
	@Override
	public int compare(Board board1, Board board2) {
		if(board1.getBno() > board2.getBno()) return -1;
		else if(board1.getBno() == board2.getBno()) return 0;
		else return 1;
	}
}
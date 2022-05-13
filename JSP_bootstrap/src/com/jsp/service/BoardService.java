package com.jsp.service;

import java.util.List;
import java.util.Map;

import com.jsp.command.Criteria;
import com.jsp.vo.BoardVO;

public interface BoardService {
	List<BoardVO> getBoardList() throws Exception;
	List<BoardVO> getBoardList(Criteria cri) throws Exception;
	BoardVO getBoardDetail(int bno) throws Exception;
	
	public Map<String, Object> getBoardListForPage(Criteria cri) throws Exception;
}

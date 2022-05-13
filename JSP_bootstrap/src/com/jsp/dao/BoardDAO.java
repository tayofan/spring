package com.jsp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jsp.command.Criteria;
import com.jsp.vo.BoardVO;

public interface BoardDAO {
	List<BoardVO> selectBoardList(SqlSession session) throws Exception;
	List<BoardVO> selectBoardList(SqlSession session,Criteria cri) throws Exception;
	BoardVO selectBoardDetail(SqlSession session,int bno) throws Exception;

	int selectBoardListCount(SqlSession session) throws Exception;
}

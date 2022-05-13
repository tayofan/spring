package com.jsp.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.jsp.command.Criteria;
import com.jsp.vo.BoardVO;

public class BoardDAOImpl implements BoardDAO {

	@Override
	public List<BoardVO> selectBoardList(SqlSession session) throws Exception {
		List<BoardVO> boardList = session.selectList("Board-Mapper.selectBoardList");
		return boardList;
	}

	@Override
	public List<BoardVO> selectBoardList(SqlSession session, Criteria cri) throws Exception {
		int offset = cri.getStartRowNum();
		int limit = cri.getPerPageNum();
		RowBounds rowBounds = new RowBounds(offset, limit);
		
		List<BoardVO> boardList = session.selectList("Board-Mapper.selectBoardList",null,rowBounds);
	
		return boardList;
	}

	@Override
	public BoardVO selectBoardDetail(SqlSession session,int bno) throws Exception {
		BoardVO baordDetail = session.selectOne("Board-Mapper.selectBoardDetail",bno);
		return baordDetail;
	}

	@Override
	public int selectBoardListCount(SqlSession session) throws Exception {
		int totalCount = session.selectOne("Board-Mapper.selectBoardListCount");
		return totalCount;
	}

}

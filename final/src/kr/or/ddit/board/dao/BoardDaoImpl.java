package kr.or.ddit.board.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.vo.BoardVO;

public class BoardDaoImpl implements IboardDao{
	private static BoardDaoImpl dao;
	private SqlMapClient client;


	private BoardDaoImpl(){
		client = SqlMapClientFactory.getSqlMapClinet();
	}

	public static IboardDao getInstance(){
		if(dao==null){
			dao=new BoardDaoImpl();
		}
		return dao;
	}




	@Override
	public String insertBoard(BoardVO boardVo) throws SQLException{
		// TODO Auto-generated method stub
		return (String) client.insert("boardvo.insertBoard");
	}

	@Override
	public BoardVO getBoard(int boardNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> getAllBoardList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> getSearchBoardList(String boardTitle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setCountIncrement(int boardNo) {
		// TODO Auto-generated method stub
		return 0;
	}

}

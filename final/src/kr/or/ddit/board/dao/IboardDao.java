package kr.or.ddit.board.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.vo.BoardVO;

public interface IboardDao {
	/**
	 * BoardVO 객체 boardVo에 담긴 자료를 DB에 삽입
	 * @param boardVo	(insert할 자료가 담긴 BoardVo객체)
	 * @return	성공하면1 실패는 0
	 */
	public String insertBoard(BoardVO boardVo) throws SQLException;

	/**
	 * 게시글 번호를 매개변수로 받아서 해당 게시글 내용을 가져와 반환하는 메서드
	 * @param boardNo 가져올 게시글 번호
	 * @return 게시글 번호에 맞는 자료가 있으면 해당 게시글 정보를 담고 있는
	 * 			JdbcBoardVO객체, 자료가 없으면 null
	 */
	public BoardVO getBoard(int boardNo) throws SQLException;

	/**
	 * DB의 jdbc_board 테이블의 전체 레코드를 가져와 List에 담아서 반환하는 메서드
	 * @return JdbcBoardVO객체를 담고 있는 List객체
	 */
	public List<BoardVO> getAllBoardList() throws SQLException;

	/**
	 * 매개변수로 주어진 게시글의 제목을 이용하여 게시글을 검색하는 메서드
	 * @param boardTitle 검색할 게시글의 제목
	 * @return 검색된 결과를 담은 List객체
	 */
	public List<BoardVO> getSearchBoardList(String boardTitle);

	/**
	 * 게시글 번호를 매개변수로 받아서 해당 게시글의 조회수를 증가시키는 메서드 
	 * @param boardNo 조회수를 증가할 게시글 번호
	 * @return 작업성공:1, 작업실패:0
	 */
	public int setCountIncrement(int boardNo);

}

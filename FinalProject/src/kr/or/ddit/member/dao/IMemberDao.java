package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.MemberVO;


public interface IMemberDao {
	/**
	 * key값 정보를 매개변수로 하여 멤버 정보 가져오는 메서드
	 * @param params
	 * @return
	 * @throws SQLException
	 */
	public MemberVO getMemberInfo(Map<String, String> params) throws SQLException;
	
	
	
	/**
	 * MemberVO리스트의 정보를 반환
	 * @return
	 * @throws SQLException
	 */
	public List<MemberVO> getMemberList() throws SQLException;

	
	/**
	 * 멤버 정보를 insert
	 * @param memberInfo
	 * @return
	 * @throws SQLException
	 */
	public String insertMemberInfo(MemberVO memberInfo) throws SQLException;
	
	
}













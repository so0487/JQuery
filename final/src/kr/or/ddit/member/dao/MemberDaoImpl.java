package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.vo.MemberVO;

import com.ibatis.sqlmap.client.SqlMapClient;

public class MemberDaoImpl implements IMemberDao {
	
	private static IMemberDao dao = new MemberDaoImpl();
	
	private SqlMapClient client;
	
	private MemberDaoImpl(){
		client = SqlMapClientFactory.getSqlMapClinet();
	}
	
	public static IMemberDao getInstance(){
		if(dao == null){
			dao = new MemberDaoImpl();
		}
		return dao;
	}

	@Override
	public MemberVO getMemberInfo(Map<String, String> params)
			throws SQLException {
		return (MemberVO) client.queryForObject("member.memberInfo", params);
	}

	@Override
	public List<MemberVO> getMemberList() throws SQLException {
		return client.queryForList("member.memberList");
	}

	@Override
	public String insertMemberInfo(MemberVO memberInfo) throws SQLException {
		System.out.println((String) client.insert("member.insertMember", memberInfo));
		return (String) client.insert("member.insertMember", memberInfo);
	}

	@Override
	public String getMemberPass(String mem_id) throws SQLException {
		return (String) client.queryForObject("member.memberPass", mem_id);
	}


	

}












package kr.or.ddit.member.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.MemberVO;

public interface IMemberService {

	public MemberVO getMemberInfo(Map<String, String> params);
	
	public List<MemberVO> getMemberList();

	public String insertMemberInfo(MemberVO memberInfo);
	
	public String getMemberPass(String mem_id);
	

	
}



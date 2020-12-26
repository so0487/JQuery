package kr.or.ddit.member.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.MemberVO;

public interface IMemberService {

	public MemberVO getMemberInfo(Map<String, String> params);
	public List<MemberVO> getMemberList();

	public String insertMemberInfo(MemberVO memberInfo);
	

	
}



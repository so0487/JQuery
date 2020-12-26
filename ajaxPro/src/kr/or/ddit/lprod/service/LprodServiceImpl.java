package kr.or.ddit.lprod.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.lprod.dao.ILprodDao;
import kr.or.ddit.lprod.dao.LprodDaoImpl;
import kr.or.ddit.vo.LprodVO;

public class LprodServiceImpl implements ILprodService{
	private static ILprodService service = new LprodServiceImpl();
	private ILprodDao dao;
	
	private LprodServiceImpl(){
		dao = LprodDaoImpl.getInstance();
	}
	
	public static ILprodService getInstance(){
		if(service == null){
			service = new LprodServiceImpl();
		}
		return service;
	}
	
	


	@Override
	public List<LprodVO> getLprodList() {
		List<LprodVO> lprodList = null;
		
		try {
			lprodList = dao.getLprodList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

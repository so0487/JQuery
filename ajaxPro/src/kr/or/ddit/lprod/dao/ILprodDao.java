package kr.or.ddit.lprod.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.vo.LprodVO;
import kr.or.ddit.vo.ProdVO;

public interface ILprodDao {
	
	/**
	 * LprodVO의 정보전체를 getLprodList로 받아오는 메서드 
	 * @return
	 * @throws SQLException
	 */
	public List<LprodVO> getLprodList();
	
	
	
	/**
	 * PordVO에 담긴 자료 중 prod_id를 매개변수로 하는 정보를 가져오는 메서드
	 * @param prod_id
	 * @return
	 */
	public List<ProdVO> getProdId(String prod_id);
	
	
	
	/**
	 * ProdVO에서 pord_lgu를 매개변수로 하여 해당 자료를 가져오는 메서드
	 * @param prod_lgu
	 * @return
	 */
	public List<ProdVO> getProdLgu(String prod_lgu);
}

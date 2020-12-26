package kr.or.ddit.prod.service;

import java.util.List;

import kr.or.ddit.vo.LprodVO;
import kr.or.ddit.vo.ProdVO;

public interface IProdService {
	
	
	/**
	 * lprod에서 상품분류코드와 분류명을 가져오는 메서드
	 * @return	
	 */
	public List<LprodVO> getLprod();
	
	
	
	/**
	 * ProdVO에 담긴 자료 중 prod_id를 매개변수로 하여 해당하는 상품정보를 가져오는 메서드
	 * @param prod_id
	 * @return
	 */
	public List<ProdVO> getProdId(String prod_id);
	
	
	
	
	/**
	 * ProdVO에 담긴 자료 중 prod_lgu를 매개변수로 하여 해당하는 상품정보를 가져오는 메서드
	 * @param prod_lgu
	 * @return
	 */
	
	public List<ProdVO> getProdLgu(String prod_lgu);

}

package kr.or.ddit.prod.service;

import java.util.List;

import kr.or.ddit.prod.dao.IProdDao;
import kr.or.ddit.prod.dao.ProdDaoImpl;
import kr.or.ddit.vo.LprodVO;
import kr.or.ddit.vo.ProdVO;

public class ProdServiceImpl implements IProdService{
	private static IProdService service = new ProdServiceImpl();
	
	private IProdDao dao;
	
	private ProdServiceImpl(){
		dao = ProdDaoImpl.getInstance();
	}
	
	public static IProdService getInstacne(){
		if(service==null){
			service = new ProdServiceImpl();
		}
		
		return service;
	}

	@Override
	public List<LprodVO> getLprod() {
		// TODO Auto-generated method stub
		return dao.getLprod();
	}

	@Override
	public List<ProdVO> getProdId(String prod_id) {
		// TODO Auto-generated method stub
		return dao.getProdId(prod_id);
	}

	@Override
	public List<ProdVO> getProdLgu(String prod_lgu) {
		// TODO Auto-generated method stub
		return dao.getProdLgu(prod_lgu);
	}
	

}

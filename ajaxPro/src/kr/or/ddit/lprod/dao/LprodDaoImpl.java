package kr.or.ddit.lprod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.vo.LprodVO;
import kr.or.ddit.vo.ProdVO;

public class LprodDaoImpl implements ILprodDao{
	private static ILprodDao dao = new LprodDaoImpl();
	private SqlMapClient client;
	
	
	private LprodDaoImpl(){
		client = SqlMapClientFactory.getSqlMapClinet();
	}
	
	public static ILprodDao getInstance(){
		if(dao==null){
			dao = new LprodDaoImpl();
		}
		return dao;
	}

	@Override
	public List<LprodVO> getLprodList() {
		List<LprodVO> lprodList = null;
		try {
			lprodList=client.queryForList("prod.getLProd");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lprodList;
	}

	@Override
	public List<ProdVO> getProdId(String prod_id) {
		List<ProdVO> prodList = null;
		
		try {
			prodList = client.queryForList("prod.getPordId",prod_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prodList;
	}

	@Override
	public List<ProdVO> getProdLgu(String prod_lgu) {
		List<ProdVO> prodList=null;
		
		try {
			prodList = client.queryForList("prod.getProdLgu",prod_lgu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prodList;
	}
	


}

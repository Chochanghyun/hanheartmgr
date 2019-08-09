package phis.nu.his.ts.hanheartmgr.maintinqrmgt.dao;

import phis.nuframe.dao.JdbcQueryDAO;
import phis.nuframe.dao.query.SqlQuery;
import phis.nuframe.dao.query.SqlQueryPage;
import phis.nuframe.vo.ValueObject;

public class MaintInqrDAOImpl extends JdbcQueryDAO implements MaintInqrDAO {

	private SqlQueryPage sqlPage = null;

	public void setSql(String path) {
		sqlPage = getQueryPage(path);
	} // ¡÷¿‘
	
	
	@Override
	public ValueObject getBscd(ValueObject pVO) {
		SqlQuery sql = sqlPage.getQuery("getBscd");
		return executeQuery(sql, pVO);
	}

	@Override
	public ValueObject getDeptTree(ValueObject pVO) {
		SqlQuery sql = sqlPage.getQuery("getDeptTree");
		return executeQuery(sql, pVO);
	}

}

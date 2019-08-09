package phis.nu.his.ts.hanheartmgr.maintinfomgt.dao;

import phis.nuframe.dao.JdbcQueryDAO;
import phis.nuframe.dao.query.SqlQuery;
import phis.nuframe.dao.query.SqlQueryPage;
import phis.nuframe.vo.ValueObject;

public class MaintInfoDAOImpl extends JdbcQueryDAO implements MaintInfoDAO {

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
	public ValueObject getMaintLint(ValueObject pVO) {
		SqlQuery sql = sqlPage.getQuery("getMaintList");
		return executeQuery(sql, pVO);
	}

	@Override
	public int insMaintInfo(ValueObject pVO) {
		SqlQuery sql = sqlPage.getQuery("insMaintList");
		return executeUpdate(sql, pVO);
	}

	@Override
	public int setMaintInfo(ValueObject pVO) {
		SqlQuery sql = sqlPage.getQuery("setMaintList");
		return executeUpdate(sql, pVO);
	}

	

}

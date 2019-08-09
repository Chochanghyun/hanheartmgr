package phis.nu.his.ts.hanheartmgr.userinqrmgt.dao;

import phis.nuframe.dao.JdbcQueryDAO;
import phis.nuframe.dao.query.SqlQuery;
import phis.nuframe.dao.query.SqlQueryPage;
import phis.nuframe.vo.ValueObject;

public class UserInqrDAOImpl extends JdbcQueryDAO implements UserInqrDAO {

	private SqlQueryPage sqlPage = null;
	
	public void setSql(String path) {
		sqlPage = getQueryPage(path);
	}
	

	@Override
	public ValueObject posUserList(ValueObject pVO) {
		// TODO Auto-generated method stub
		SqlQuery sql = sqlPage.getQuery("posUserList");
		return executeQuery(sql, pVO);
	}

	@Override
	public ValueObject getUserDutyHist(ValueObject pVO) {
		// TODO Auto-generated method stub
		SqlQuery sql = sqlPage.getQuery("getUserDutyHist");
		return executeQuery(sql, pVO);
	}

	@Override
	public ValueObject dutUserList(ValueObject pVO) {
		// TODO Auto-generated method stub
		SqlQuery sql = sqlPage.getQuery("dutUserList");
		return executeQuery(sql, pVO);
	}
	

}

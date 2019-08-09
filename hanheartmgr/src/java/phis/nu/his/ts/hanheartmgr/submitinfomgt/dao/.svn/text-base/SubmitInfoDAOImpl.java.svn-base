package phis.nu.his.ts.hanheartmgr.submitinfomgt.dao;

import phis.nuframe.dao.JdbcQueryDAO;
import phis.nuframe.dao.query.SqlQuery;
import phis.nuframe.dao.query.SqlQueryPage;
import phis.nuframe.vo.ValueObject;

public class SubmitInfoDAOImpl extends JdbcQueryDAO implements SubmitInfoDAO {
	
	private SqlQueryPage sqlPage = null;
    /**
     * 사용할 SQL 문이 정의된 SQL XML 파일 경로를 설정하는
     * Setter Method
     * @param path SQL XML 파일의 상대 경로
     */
    public void setSql(String path) {
        sqlPage = getQueryPage(path);
    }
    

	@Override
	public ValueObject getSubmitList(ValueObject pVO) {
		SqlQuery sql = sqlPage.getQuery("getSubmitList");
		return executeQuery(sql, pVO);
	}


	@Override
	public int insSubmitInfo(ValueObject pVO) {
		SqlQuery sql = sqlPage.getQuery("insSubmitInfo");
		return executeUpdate(sql, pVO);
	}


	@Override
	public int setSubmitInfo(ValueObject pVO) {
		SqlQuery sql = sqlPage.getQuery("setSubmitInfo");
		return executeUpdate(sql, pVO);
	}


	@Override
	public int delSubmitInfo(ValueObject pVO) {
		SqlQuery sql = sqlPage.getQuery("delSubmitInfo");
		return executeUpdate(sql, pVO);
	}

}

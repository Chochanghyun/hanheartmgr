package phis.nu.his.ts.hanheartmgr.screeninfomgt.dao;

import phis.nuframe.dao.JdbcQueryDAO;
import phis.nuframe.dao.query.SqlQuery;
import phis.nuframe.dao.query.SqlQueryPage;
import phis.nuframe.vo.ValueObject;

public class ScreenInfoDAOImpl extends JdbcQueryDAO implements ScreenInfoDAO {

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
	public ValueObject getScreenList(ValueObject pVO) {
		SqlQuery sql = sqlPage.getQuery("getScreenList");
		return executeQuery(sql, pVO);
	}


	@Override
	public int insScreenInfo(ValueObject pVO) {
		SqlQuery sql = sqlPage.getQuery("insScreenInfo");
		return executeUpdate(sql, pVO);
	}


	@Override
	public int setScreenInfo(ValueObject pVO) {
		SqlQuery sql = sqlPage.getQuery("setScreenInfo");
		return executeUpdate(sql, pVO);
	}


	@Override
	public int delScreenInfo(ValueObject pVO) {
		SqlQuery sql = sqlPage.getQuery("delScreenInfo");
		return executeUpdate(sql, pVO);
	}

}


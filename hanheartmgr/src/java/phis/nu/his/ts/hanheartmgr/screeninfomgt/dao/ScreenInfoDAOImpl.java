package phis.nu.his.ts.hanheartmgr.screeninfomgt.dao;

import phis.nuframe.dao.JdbcQueryDAO;
import phis.nuframe.dao.query.SqlQuery;
import phis.nuframe.dao.query.SqlQueryPage;
import phis.nuframe.vo.ValueObject;

public class ScreenInfoDAOImpl extends JdbcQueryDAO implements ScreenInfoDAO {

	private SqlQueryPage sqlPage = null;
    /**
     * ����� SQL ���� ���ǵ� SQL XML ���� ��θ� �����ϴ�
     * Setter Method
     * @param path SQL XML ������ ��� ���
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


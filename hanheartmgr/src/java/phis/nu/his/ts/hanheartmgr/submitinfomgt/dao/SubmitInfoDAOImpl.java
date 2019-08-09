package phis.nu.his.ts.hanheartmgr.submitinfomgt.dao;

import phis.nuframe.dao.JdbcQueryDAO;
import phis.nuframe.dao.query.SqlQuery;
import phis.nuframe.dao.query.SqlQueryPage;
import phis.nuframe.vo.ValueObject;

public class SubmitInfoDAOImpl extends JdbcQueryDAO implements SubmitInfoDAO {
	
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

package phis.nu.his.ts.hanheartmgr.misuinfomgt.dao;

import phis.nuframe.dao.JdbcQueryDAO;
import phis.nuframe.dao.query.SqlQuery;
import phis.nuframe.dao.query.SqlQueryPage;
import phis.nuframe.vo.ValueObject;

public class MisuInfoDAOImpl extends JdbcQueryDAO implements MisuInfoDAO {

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
	public ValueObject misuTypeList(ValueObject pVO) {
		
		SqlQuery sql = sqlPage.getQuery("misuTypeList");
		return executeQuery(sql, pVO);
		
	}

	@Override
	public ValueObject getMisuList(ValueObject pVO) {
		
		SqlQuery sql = sqlPage.getQuery("getMisuList");
		return executeQuery(sql, pVO);
		
	}

	@Override
	public ValueObject getDepList(ValueObject pVO) {
		SqlQuery sql = sqlPage.getQuery("getDepList");
		return executeQuery(sql, pVO);
	}

	@Override
	public int insMisuInfo(ValueObject pVO) {
		SqlQuery sql = sqlPage.getQuery("insMisuInfo");
		return executeUpdate(sql, pVO);
	}

	@Override
	public int delMisuInfo(ValueObject pVO) {
		SqlQuery sql = sqlPage.getQuery("delMisuInfo");
		return executeUpdate(sql, pVO);
	}

}

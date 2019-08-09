package phis.nu.his.ts.hanheartmgr.maintinqrmgt;

import phis.nu.his.ts.hanheartmgr.maintinqrmgt.dao.MaintInqrDAO;

import phis.nuframe.context.ContextAwareService;
import phis.nuframe.exception.UserException;
import phis.nuframe.vo.ValueObject;

public class MaintInqrMgtImpl extends ContextAwareService implements MaintInqrMgt {

	private MaintInqrDAO maintInqrDAO = null;

	public void setMaintInqrDAO(MaintInqrDAO dao) {
		this.maintInqrDAO = dao;
	}
	
	@Override
	public ValueObject getBscd(ValueObject pVO) {
		ValueObject getVO = maintInqrDAO.getBscd(pVO);
		return getVO;
	}

	@Override
	public ValueObject getDeptTree(ValueObject pVO) {
		
		ValueObject getVO = maintInqrDAO.getDeptTree(pVO);

		if (getVO.size() == 0) {
			throw new UserException("데이터가 없습니다ㅎㅎㅈㅅ;");
		}
		return getVO;
	}

}

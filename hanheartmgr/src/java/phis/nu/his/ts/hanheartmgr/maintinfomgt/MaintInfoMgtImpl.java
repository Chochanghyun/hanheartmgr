package phis.nu.his.ts.hanheartmgr.maintinfomgt;

import phis.nu.his.ts.hanheartmgr.maintinfomgt.dao.MaintInfoDAO;

import phis.nuframe.context.ContextAwareService;
import phis.nuframe.exception.UserException;
import phis.nuframe.vo.ValueObject;

public class MaintInfoMgtImpl extends ContextAwareService implements MaintInfoMgt {

	private MaintInfoDAO maintInfoDAO = null;

	public void setMaintInfoDAO(MaintInfoDAO dao) {
		this.maintInfoDAO = dao;
	}

	@Override
	public ValueObject getBscd(ValueObject pVO) {
		
		ValueObject getVO = maintInfoDAO.getBscd(pVO);
		return getVO;
		
	}

	@Override
	public ValueObject getMaintList(ValueObject pVO) {
		
		ValueObject getVO = maintInfoDAO.getMaintLint(pVO);

		if (getVO.size() == 0) {
			throw new UserException("데이터가 없습니다ㅎㅎㅈㅅ;");
		}
		return getVO;
		
	}

	@Override
	public int insMaintInfo(ValueObject pVO) {
		int cnt = maintInfoDAO.insMaintInfo(pVO);
		return cnt;
	}

	@Override
	public int setMaintInfo(ValueObject pVO) {
		int cnt = maintInfoDAO.setMaintInfo(pVO);
		return cnt;
	}

	
}

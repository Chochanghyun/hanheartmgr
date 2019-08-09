package phis.nu.his.ts.hanheartmgr.screeninfomgt;

import phis.nu.his.ts.hanheartmgr.screeninfomgt.dao.ScreenInfoDAO;

import phis.nuframe.context.ContextAwareService;
import phis.nuframe.exception.UserException;
import phis.nuframe.vo.ValueObject;

public class ScreenInfoMgtImpl extends ContextAwareService implements ScreenInfoMgt {

	private ScreenInfoDAO screenDAO = null;
	
	public void setScreenInfoDAO(ScreenInfoDAO dao){
		this.screenDAO = dao;
	}

	@Override
	public ValueObject getScreenList(ValueObject pVO) {
		ValueObject getVO = screenDAO.getScreenList(pVO);

		if(getVO.size() == 0){
			throw new UserException("데이터가 없습니다");
		}
		
		return getVO;
	}

	@Override
	public int insScreenInfo(ValueObject pVO) {
		int cnt = screenDAO.insScreenInfo(pVO);

		return cnt;
	}

	@Override
	public int setScreenInfo(ValueObject pVO) {
		int cnt = screenDAO.setScreenInfo(pVO);

		return cnt;

	}

	@Override
	public int delScreenInfo(ValueObject pVO) {
		int cnt = screenDAO.delScreenInfo(pVO);

		return cnt;
	}

}

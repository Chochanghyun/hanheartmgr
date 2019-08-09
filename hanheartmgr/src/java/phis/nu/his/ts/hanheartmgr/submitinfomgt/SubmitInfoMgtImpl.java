package phis.nu.his.ts.hanheartmgr.submitinfomgt;

import phis.nu.his.ts.hanheartmgr.submitinfomgt.dao.SubmitInfoDAO;

import phis.nuframe.context.ContextAwareService;
import phis.nuframe.exception.UserException;
import phis.nuframe.vo.ValueObject;

public class SubmitInfoMgtImpl extends ContextAwareService implements SubmitInfoMgt {

	private SubmitInfoDAO submitDAO = null;
	
	public void setSubmitInfoDAO(SubmitInfoDAO dao){
		this.submitDAO = dao;
	}
	
	@Override
	public ValueObject getSubmitList(ValueObject pVO) {
		ValueObject getVO = submitDAO.getSubmitList(pVO);

		if(getVO.size() == 0){
			throw new UserException("�����Ͱ� �����ϴ�");
		}
		
		return getVO;
	}

	@Override
	public int insSubmitInfo(ValueObject pVO) {
		int cnt = submitDAO.insSubmitInfo(pVO);

		return cnt;
	}

	@Override
	public int setSubmitInfo(ValueObject pVO) {
		int cnt = submitDAO.setSubmitInfo(pVO);

		return cnt;
	}

	@Override
	public int delSubmitInfo(ValueObject pVO) {
		int cnt = submitDAO.delSubmitInfo(pVO);

		return cnt;
	}

}

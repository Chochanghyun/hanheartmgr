package phis.nu.his.ts.hanheartmgr.misuinfomgt;

import phis.nu.his.ts.hanheartmgr.misuinfomgt.dao.MisuInfoDAO;
import phis.nuframe.context.ContextAwareService;
import phis.nuframe.exception.UserException;
import phis.nuframe.vo.ValueObject;

public class MisuInfoMgtImpl extends ContextAwareService implements MisuInfoMgt {

	private MisuInfoDAO misuDAO = null;
	
	public void setMisuInfoDAO(MisuInfoDAO dao){
		this.misuDAO = dao;
	}
	
	
	@Override
	public ValueObject misuTypeList(ValueObject pVO) {
		
		ValueObject getVO = misuDAO.misuTypeList(pVO);
		return getVO;
		
	}
	


	@Override
	public ValueObject getMisuList(ValueObject pVO) {
		
		ValueObject getVO = misuDAO.getMisuList(pVO);
		if(getVO.size() == 0){
			throw new UserException("데이터가 없습니다");
		}		
		return getVO;
		
	}


	@Override
	public ValueObject getDepList(ValueObject pVO) {

		ValueObject getVO = misuDAO.getDepList(pVO);
		return getVO;
		
	}


	@Override
	public int insMisuInfo(ValueObject pVO) {
		int cnt = misuDAO.insMisuInfo(pVO);
		return cnt;
	}


	@Override
	public int delMisuInfo(ValueObject pVO) {
		int cnt = misuDAO.delMisuInfo(pVO);
		return cnt;
	}
	
}

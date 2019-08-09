package phis.nu.his.ts.hanheartmgr.userinqrmgt;

import phis.nu.his.ts.hanheartmgr.userinqrmgt.dao.UserInqrDAO;

import phis.nuframe.context.ContextAwareService;
import phis.nuframe.exception.UserException;
import phis.nuframe.vo.ValueObject;

public class UserInqrMgtImpl extends ContextAwareService implements UserInqrMgt {
	
	
	private UserInqrDAO userInqrDAO = null;
	
	public void setUserInqrDAO(UserInqrDAO dao){
		this.userInqrDAO = dao;
	}
	
	
	@Override
	public ValueObject posUserList(ValueObject pVO) {
		// TODO Auto-generated method stub
		ValueObject getVO = userInqrDAO.posUserList(pVO);
		
		if(getVO.size() == 0){
			throw new UserException("데이터가 없습니다");
		}
		return getVO;
	}

	@Override
	public ValueObject getUserDutyHist(ValueObject pVO) {
		ValueObject getVO = userInqrDAO.getUserDutyHist(pVO);
		
		if(getVO.size() == 0){
			throw new UserException("데이터가 없습니다");
		}
		
		return getVO;
	}

	@Override
	public ValueObject dutUserList(ValueObject pVO) {
		ValueObject getVO = userInqrDAO.dutUserList(pVO);
		
		if(getVO.size() == 0){
			throw new UserException("데이터가 없습니다");
		}
		
		return getVO;
	}

}

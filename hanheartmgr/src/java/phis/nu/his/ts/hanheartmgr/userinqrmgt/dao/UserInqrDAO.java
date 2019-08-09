package phis.nu.his.ts.hanheartmgr.userinqrmgt.dao;

import phis.nuframe.vo.ValueObject;

public interface UserInqrDAO {
	
	ValueObject posUserList(ValueObject pVO);
	ValueObject getUserDutyHist(ValueObject pVO);
	ValueObject dutUserList(ValueObject pVO);
}

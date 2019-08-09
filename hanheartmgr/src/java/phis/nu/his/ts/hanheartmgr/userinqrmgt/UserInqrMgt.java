package phis.nu.his.ts.hanheartmgr.userinqrmgt;

import phis.nuframe.vo.ValueObject;

public interface UserInqrMgt {
	
	ValueObject posUserList(ValueObject pVO);
	ValueObject dutUserList(ValueObject pVO);
	ValueObject getUserDutyHist(ValueObject pVO);
	
}

package phis.nu.his.ts.hanheartmgr.maintinfomgt.dao;

import phis.nuframe.vo.ValueObject;

public interface MaintInfoDAO {
	
	ValueObject getBscd(ValueObject pVO);
	ValueObject getMaintLint(ValueObject pVO);
	int insMaintInfo(ValueObject pVO);
	int setMaintInfo(ValueObject pVO);
	
}

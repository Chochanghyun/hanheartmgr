package phis.nu.his.ts.hanheartmgr.maintinfomgt;

import phis.nuframe.vo.ValueObject;

public interface MaintInfoMgt {

	ValueObject getBscd(ValueObject pVO);
	ValueObject getMaintList(ValueObject pVO);
	int insMaintInfo(ValueObject pVO);
	int setMaintInfo(ValueObject pVO);
	
}

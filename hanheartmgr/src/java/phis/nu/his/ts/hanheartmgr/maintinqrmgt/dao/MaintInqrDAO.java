package phis.nu.his.ts.hanheartmgr.maintinqrmgt.dao;

import phis.nuframe.vo.ValueObject;

public interface MaintInqrDAO {
	
	ValueObject getBscd(ValueObject pVO);
	ValueObject getDeptTree(ValueObject pVO);
	
}

package phis.nu.his.ts.hanheartmgr.misuinfomgt.dao;

import phis.nuframe.vo.ValueObject;

public interface MisuInfoDAO {
	
	ValueObject misuTypeList(ValueObject pVO);
	ValueObject getMisuList(ValueObject pVO);
	ValueObject getDepList(ValueObject pVO);
	int insMisuInfo(ValueObject pVO);
	int delMisuInfo(ValueObject pVO);
}

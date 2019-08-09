package phis.nu.his.ts.hanheartmgr.misuinfomgt;

import phis.nuframe.vo.ValueObject;

public interface MisuInfoMgt {

	ValueObject misuTypeList(ValueObject pVO);
	ValueObject getMisuList(ValueObject pVO);
	ValueObject getDepList(ValueObject pVO);
	int insMisuInfo(ValueObject pVO);
	int delMisuInfo(ValueObject pVO);
	
}

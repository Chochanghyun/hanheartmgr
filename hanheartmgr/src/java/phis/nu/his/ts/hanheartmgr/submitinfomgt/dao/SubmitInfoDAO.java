package phis.nu.his.ts.hanheartmgr.submitinfomgt.dao;

import phis.nuframe.vo.ValueObject;

public interface SubmitInfoDAO {

	ValueObject getSubmitList(ValueObject pVO);

	int insSubmitInfo(ValueObject pVO);
	
	int setSubmitInfo(ValueObject pVO);
	
	int delSubmitInfo(ValueObject pVO);
	
}


package phis.nu.his.ts.hanheartmgr.screeninfomgt.dao;

import phis.nuframe.vo.ValueObject;

public interface ScreenInfoDAO {

	ValueObject getScreenList(ValueObject pVO);

	int insScreenInfo(ValueObject pVO);

	int setScreenInfo(ValueObject pVO);

	int delScreenInfo(ValueObject pVO);

}

package phis.nu.his.ts.hanheartmgr.screeninfomgt;

import phis.nuframe.vo.ValueObject;

public interface ScreenInfoMgt {
	ValueObject getScreenList(ValueObject pVO);

	int insScreenInfo(ValueObject pVO);

	int setScreenInfo(ValueObject pVO);

	int delScreenInfo(ValueObject pVO);

}

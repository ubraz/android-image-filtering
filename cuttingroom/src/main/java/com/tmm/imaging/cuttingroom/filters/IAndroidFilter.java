package com.tmm.imaging.cuttingroom.filters;

import com.tmm.imaging.cuttingroom.core.AndroidImage;


public interface IAndroidFilter {

	public AndroidImage process(AndroidImage imageIn);
}

package com.leonwang.app.androidcommondemo;


import com.android.commonlibray.constant.BaseApplication;
import com.android.commonlibray.util.LogUtils;

/**
 * APPLICATION
 */
public class AppApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化logger
        LogUtils.logInit(true);
    }
}

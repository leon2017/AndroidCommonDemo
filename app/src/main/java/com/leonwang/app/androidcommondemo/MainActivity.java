package com.leonwang.app.androidcommondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.commonlibray.util.LogUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtils.logd("----oncreate------");
    }
}

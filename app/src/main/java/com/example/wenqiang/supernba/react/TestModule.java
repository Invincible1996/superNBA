package com.example.wenqiang.supernba.react;

import android.app.Activity;
import android.content.Context;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by wenqiang on 2017/12/15.
 */

public class TestModule extends ReactContextBaseJavaModule {

    private Context mContext;

    public TestModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }


    @Override
    public String getName() {
        return "test";
    }

    @ReactMethod
    public void goBack() {
        Activity activity = getCurrentActivity();
        activity.finish();
    }
}

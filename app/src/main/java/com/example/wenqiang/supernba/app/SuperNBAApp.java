package com.example.wenqiang.supernba.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/12/7 0007.
 */

public class SuperNBAApp extends Application {
    public static Context sContext;

    @Override
    public void onCreate() {
        sContext = getApplicationContext();
    }
}

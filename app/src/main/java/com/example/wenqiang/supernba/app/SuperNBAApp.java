package com.example.wenqiang.supernba.app;

import android.app.Application;
import android.content.Context;

import com.example.wenqiang.supernba.BuildConfig;
import com.example.wenqiang.supernba.react.TestReactPackage;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/12/7 0007.
 */

public class SuperNBAApp extends Application implements ReactApplication {
    public static Context sContext;
    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
        @Override
        public boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }

        @Override
        protected List<ReactPackage> getPackages() {
            return Arrays.<ReactPackage>asList(
                    new MainReactPackage(),
                    new TestReactPackage()
            );
        }
    };

    @Override
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
    }

}

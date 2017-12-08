package com.example.wenqiang.supernba.net;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/12/7 0007.
 */

public class HttpManager {
    private static HttpManager sHttpManager;
    private HashMap<String, Object> params;
    OkHttpClient mOkHttpClient;

    private HttpManager() {
        params = new HashMap<>();
        mOkHttpClient=new OkHttpClient();
        mOkHttpClient.newBuilder().connectTimeout(10, TimeUnit.SECONDS).build();
        mOkHttpClient.newBuilder().readTimeout(10, TimeUnit.SECONDS).build();
        mOkHttpClient.newBuilder().writeTimeout(30, TimeUnit.SECONDS).build();
    }

    public static HttpManager getInstance() {
        if (sHttpManager == null) {
            synchronized (HttpManager.class) {
                if (sHttpManager == null) {
                    sHttpManager = new HttpManager();
                }
            }
        }
        return sHttpManager;
    }

    public HttpManager addParams(String key, Object value) {
        params.put(key, value);
        return this;
    }

    public <T> List<T> add(T t) {
        ArrayList<T> list = new ArrayList<>();
        list.add(t);
        return list;
    }

    public void doGet(String url, Callback callback) {
        Request request = new Request.Builder().url(url).build();
        Call call = mOkHttpClient.newCall(request);
        call.enqueue(callback);
    }


}

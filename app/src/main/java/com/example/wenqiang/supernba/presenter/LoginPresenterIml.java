package com.example.wenqiang.supernba.presenter;

import android.app.ProgressDialog;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.example.wenqiang.supernba.net.HttpManager;
import com.example.wenqiang.supernba.ui.LoginActivity;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by wenqiang on 2017/12/7.
 */

public class LoginPresenterIml implements LoginPresenter {

    private LoginActivity mLoginActivity;

    public LoginPresenterIml(LoginActivity loginActivity) {
        this.mLoginActivity = loginActivity;
    }

    @Override
    public void login(final String name, final String passWord) {

        String url = "http://dev.zt.bnq.com.cn/bnq_owner/content/product/getProductDetail.do?prodId=10";
        HttpManager.getInstance().doGet(url, new Callback() {

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response != null) {

                    String json = response.body().string();
                    Log.d("json", json);

                }
            }

            @Override
            public void onFailure(Call call, IOException e) {

            }

        });
    }
}

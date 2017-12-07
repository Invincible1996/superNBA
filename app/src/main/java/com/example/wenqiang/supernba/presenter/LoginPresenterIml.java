package com.example.wenqiang.supernba.presenter;

import android.app.ProgressDialog;
import android.text.TextUtils;
import android.widget.Toast;

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

        String url = "https://japi.juhe.cn/joke/img/text.from?key=8aad35fd1e3384b259293e9f491cab5e&page=2&pagesize=20";

        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();

        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                String json = response.body().string();

                mLoginActivity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mLoginActivity.loginSuccess(name, passWord);
                    }
                });

            }

            @Override
            public void onFailure(Call call, IOException e) {
                mLoginActivity.loginError("登录失败");
            }
        });

    }
}

package com.example.wenqiang.supernba.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.Image;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.wenqiang.supernba.R;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mIv_avtar;
    private EditText mUsername;
    private EditText mPassWord;
    private Button mBt_login;
    private ProgressDialog mProgressDialog;
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            mProgressDialog.dismiss();
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        mIv_avtar = (ImageView) findViewById(R.id.iv_avtar);
        mUsername = (EditText) findViewById(R.id.et_username);
        mPassWord = (EditText) findViewById(R.id.et_pwd);
        mBt_login = (Button) findViewById(R.id.btn_login);

        mIv_avtar.setOnClickListener(this);
        mBt_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_avtar:
                Toast.makeText(this, "点击我更换头像", Toast.LENGTH_SHORT).show();


                break;
            case R.id.btn_login:
                //TODO:跳转至首页

                String userName = mUsername.getText().toString().trim();
                String passWord = mPassWord.getText().toString().trim();

                if (TextUtils.isEmpty(userName) || TextUtils.isEmpty(passWord)) {
                    Toast.makeText(this, "请输入用户名或密码.", Toast.LENGTH_SHORT).show();
                    return;
                }

                String url = "https://japi.juhe.cn/joke/img/text.from?key=8aad35fd1e3384b259293e9f491cab5e&page=2&pagesize=20";
                mProgressDialog = ProgressDialog.show(this, null, "正在登录中...");

                OkHttpClient okHttpClient = new OkHttpClient();
                Request request = new Request.Builder().url(url).build();

                Call call = okHttpClient.newCall(request);
                call.enqueue(new Callback() {

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {

                        String json = response.body().string();

                        mHandler.sendEmptyMessage(0x110);
                    }

                    @Override
                    public void onFailure(Call call, IOException e) {

                    }
                });
                break;
        }
    }
}

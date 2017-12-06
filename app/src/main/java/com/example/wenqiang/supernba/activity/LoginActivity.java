package com.example.wenqiang.supernba.activity;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.wenqiang.supernba.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mIv_avtar;
    private EditText mUsername;
    private EditText mPassWord;
    private Button mBt_login;

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
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
                break;
        }
    }
}

package com.example.wenqiang.supernba.ui;

/**
 * Created by wenqiang on 2017/12/7.
 */

public interface LoginActivityView {

    void loginSuccess(String name,String passWord);
    void loginError(String errorMsg);
}

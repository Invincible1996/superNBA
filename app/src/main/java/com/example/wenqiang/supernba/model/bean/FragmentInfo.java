package com.example.wenqiang.supernba.model.bean;

import android.support.v4.app.Fragment;

/**
 * Created by wenqiang on 2017/12/14.
 */

public class FragmentInfo {

    private String  title ;
    private Fragment mFragment;

    public FragmentInfo(String title, Fragment fragment) {
        this.title = title;
        mFragment = fragment;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFragment(Fragment fragment) {
        mFragment = fragment;
    }

    public String getTitle() {
        return title;
    }

    public Fragment getFragment() {
        return mFragment;
    }

    @Override
    public String toString() {
        return "FragmentInfo{" +
                "title='" + title + '\'' +
                ", mFragment=" + mFragment +
                '}';
    }
}

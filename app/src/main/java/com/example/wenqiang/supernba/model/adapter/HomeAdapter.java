package com.example.wenqiang.supernba.model.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.example.wenqiang.supernba.model.bean.FragmentInfo;

import java.util.List;

/**
 * Created by wenqiang on 2017/12/14.
 */

public class HomeAdapter extends FragmentPagerAdapter {


    private List<FragmentInfo> mInfoList;

    public HomeAdapter(FragmentManager fm, List<FragmentInfo> list) {
        super(fm);
        this.mInfoList = list;
    }

    @Override
    public Fragment getItem(int position) {
        return mInfoList.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return mInfoList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mInfoList.get(position).getTitle();
    }
}

package com.example.wenqiang.supernba.ui.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

import com.example.wenqiang.supernba.R;
import com.example.wenqiang.supernba.model.adapter.HomeAdapter;
import com.example.wenqiang.supernba.model.bean.FragmentInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenqiang on 2017/12/13.
 */

public class HomeFragment extends BaseFragment {


    private TabLayout mTabLayout;
    private ViewPager mViewPager_home;
    private List<FragmentInfo> mInfoList = new ArrayList<>();

    @Override
    public View createView(LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.fragment_home, null);
        mTabLayout = (TabLayout) view.findViewById(R.id.tablayout);
        mViewPager_home = (ViewPager) view.findViewById(R.id.viewpager_home);

        HomeAdapter adapter = new HomeAdapter(getChildFragmentManager(),mInfoList);
        mViewPager_home.setAdapter(adapter);
        return view;
    }

    @Override
    public void getNetData() {
        for (int i = 0; i < 10; i++) {
                mInfoList.add(.....);
        }
    }
}

package com.example.wenqiang.supernba.ui.fragment;

import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.wenqiang.supernba.R;
import com.example.wenqiang.supernba.model.adapter.MyPagerAdapter;

import java.util.ArrayList;

/**
 * Created by wenqiang on 2017/12/13.
 */

public class BookFragment extends BaseFragment {

    private ViewPager mViewPager;
    private LinearLayout mPointContainer;
    ArrayList<Integer> mData = new ArrayList<>();
    private MyPagerAdapter mAdapter;

    @Override
    public View createView(LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.fragment_book, null);
        initView(view);
        if (mData.size() > 0)
            mData.clear();
        mAdapter = new MyPagerAdapter(getContext(), mData);
        mViewPager.setAdapter(mAdapter);
        return view;
    }

    private void initView(View view) {
        mViewPager = view.findViewById(R.id.viewPager);
        mPointContainer = view.findViewById(R.id.pointContainer);

    }

    @Override
    public void getNetData() {
        initImg();
        for (int i = 0; i < mData.size(); i++) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.point_img_selected);
            mPointContainer.addView(imageView);
        }
        mAdapter.notifyDataSetChanged();
    }

    void initImg() {
        mData.add(R.mipmap.screen);
        mData.add(R.mipmap.screen2);
        mData.add(R.mipmap.screen3);
        mData.add(R.mipmap.screen4);
        mData.add(R.mipmap.screen5);
    }

}

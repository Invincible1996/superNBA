package com.example.wenqiang.supernba.model.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by wenqiang on 2017/12/15.
 */

public class MyPagerAdapter extends PagerAdapter {
    private Context mContext;
    private ArrayList<Integer> imgs;

    public MyPagerAdapter(Context context, ArrayList<Integer> data) {
        mContext = context;
        imgs = data;
    }

    @Override
    public int getCount() {
        return imgs == null ? 0 : imgs.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
//        imageView.setImageResource(imgs.get(position));
        Glide.with(mContext).load(imgs.get(position)).into(imageView);
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
        container.removeView((View) object);
    }
}

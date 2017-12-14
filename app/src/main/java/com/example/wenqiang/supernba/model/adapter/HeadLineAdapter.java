package com.example.wenqiang.supernba.model.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wenqiang.supernba.R;

/**
 * Created by wenqiang on 2017/12/14.
 */

public class HeadLineAdapter extends RecyclerView.Adapter<HeadLineAdapter.HeadLineViewHolder> {


    @Override
    public HeadLineViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.headline_item, null);
        HeadLineViewHolder holder = new HeadLineViewHolder(view);
        return holder;
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    @Override
    public void onBindViewHolder(HeadLineViewHolder holder, int position) {

    }

    class HeadLineViewHolder extends RecyclerView.ViewHolder {

        public HeadLineViewHolder(View itemView) {
            super(itemView);
        }
    }
}

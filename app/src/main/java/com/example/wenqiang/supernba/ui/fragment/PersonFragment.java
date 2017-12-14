package com.example.wenqiang.supernba.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wenqiang.supernba.R;

/**
 * Created by wenqiang on 2017/12/13.
 */

public class PersonFragment extends BaseFragment {

    @Override
    public View createView(LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.fragment_person, null);
        return view;
    }

    @Override
    public void getNetData() {

    }
}

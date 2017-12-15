package com.example.wenqiang.supernba.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.wenqiang.supernba.R;
import com.example.wenqiang.supernba.ui.MyReactActivity;

/**
 * Created by wenqiang on 2017/12/13.
 */

public class PersonFragment extends BaseFragment {

    private Button mBtn_react;

    @Override
    public View createView(final LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.fragment_person, null);
        mBtn_react =(Button) view.findViewById(R.id.btn_react);
        mBtn_react.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),MyReactActivity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getActivity().startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void getNetData() {

    }
}

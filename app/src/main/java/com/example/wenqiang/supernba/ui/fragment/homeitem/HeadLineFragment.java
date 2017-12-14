package com.example.wenqiang.supernba.ui.fragment.homeitem;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import com.example.wenqiang.supernba.R;
import com.example.wenqiang.supernba.model.adapter.HeadLineAdapter;
import com.example.wenqiang.supernba.ui.fragment.BaseFragment;

/**
 * Created by wenqiang on 2017/12/14.
 */

public class HeadLineFragment extends BaseFragment {

    private RecyclerView mRl_headline;

    @Override
    public View createView(LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.fragment_headline, null);
        mRl_headline = (RecyclerView) view.findViewById(R.id.rl_headline);
        mRl_headline.setLayoutManager(new LinearLayoutManager(getActivity()));
        HeadLineAdapter adapter = new HeadLineAdapter();
        mRl_headline.setAdapter(adapter);
        mRl_headline.addItemDecoration(new SpaceItemDecoration(30));
        return view;
    }

    @Override
    public void getNetData() {

    }

    class SpaceItemDecoration extends RecyclerView.ItemDecoration {
        int mSpace;
        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.left = mSpace;
            outRect.right = mSpace;
            outRect.bottom = mSpace;
            if (parent.getChildAdapterPosition(view) == 0) {
                outRect.top = mSpace;
            }

        }

        public SpaceItemDecoration(int space) {
            this.mSpace = space;
        }
    }
}

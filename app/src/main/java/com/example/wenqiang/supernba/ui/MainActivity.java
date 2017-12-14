package com.example.wenqiang.supernba.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;


import com.example.wenqiang.supernba.R;
import com.example.wenqiang.supernba.ui.fragment.BookFragment;
import com.example.wenqiang.supernba.ui.fragment.HomeFragment;
import com.example.wenqiang.supernba.ui.fragment.PersonFragment;
import com.example.wenqiang.supernba.ui.fragment.VideoFragment;
import com.example.wenqiang.supernba.utils.ToastUtil;

public class MainActivity extends AppCompatActivity {

    private long mExitTime;
    private FragmentTabHost mFrgment_tab;
    private LayoutInflater layoutInflater;
    //定义数组来存放Fragment界面
    private Class fragmentArray[] = {HomeFragment.class, BookFragment.class, VideoFragment.class, PersonFragment.class};

    //Tab选项卡的文字
    private String mTextviewArray[] = {"首页", "书籍", "影视", "我的"};

    //定义数组来存放按钮图片
    private int mImageViewArray[] = {R.drawable.selector_home, R.drawable.selector_book, R.drawable.selector_video,
            R.drawable.selector_person};
    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mFrgment_tab = (FragmentTabHost) findViewById(R.id.fragment);
        mToolbar = (Toolbar) findViewById(R.id.toobar);
        mToolbar.setTitle("首页");
        mToolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(mToolbar);
//        mToolbar.setNavigationIcon();


        mFrgment_tab.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

        layoutInflater = LayoutInflater.from(this);

        //得到fragment的个数
        int count = fragmentArray.length;

        for (int i = 0; i < count; i++) {
            //为每一个Tab按钮设置图标、文字和内容
            TabHost.TabSpec tabSpec = mFrgment_tab.newTabSpec(mTextviewArray[i]).setIndicator(getTabItemView(i));
            //将Tab按钮添加进Tab选项卡中
            mFrgment_tab.addTab(tabSpec, fragmentArray[i], null);
            //设置Tab按钮的背景
//            mFrgment_tab.getTabWidget().getChildAt(i).setBackgroundResource(mImageViewArray[i]);
        }
        mFrgment_tab.getTabWidget().setDividerDrawable(android.R.color.transparent);
    }

    private View getTabItemView(int index) {
        View view = layoutInflater.inflate(R.layout.tab_item_view, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageview);
        imageView.setImageResource(mImageViewArray[index]);

        TextView textView = (TextView) view.findViewById(R.id.textview);
        textView.setText(mTextviewArray[index]);

        return view;
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                ToastUtil.showToast("再按一次退出程序");
                mExitTime = System.currentTimeMillis();
            } else {
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}

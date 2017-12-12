package com.example.wenqiang.supernba.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.wenqiang.supernba.R;
import com.example.wenqiang.supernba.utils.ToastUtil;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private long mExitTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.iv_image);

        Glide.with(this).load("http://07.imgmini.eastday.com/mobile/20170908/20170908171436_d41d8cd98f00b204e9800998ecf8427e_5.jpeg").into(imageView);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //判断用户是否点击了“返回键”
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            //与上次点击返回键时刻作差
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                //大于2000ms则认为是误操作，使用Toast进行提示
                ToastUtil.showToast("再按一次退出程序");
                //并记录下本次点击“返回键”的时刻，以便下次进行判断
                mExitTime = System.currentTimeMillis();
            } else {
                //小于2000ms则认为是用户确实希望退出程序-调用System.exit()方法进行退出
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}

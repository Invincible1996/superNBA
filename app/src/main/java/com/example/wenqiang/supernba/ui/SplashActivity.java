package com.example.wenqiang.supernba.ui;

import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.wenqiang.supernba.R;

public class SplashActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private String[] imageUrl ={"http://pic18.photophoto.cn/20110108/0036036383540742_b.jpg",
            "http://s9.rr.itc.cn/r/wapChange/201610_17_20/a04awj7908101245855.jpeg",
            "http://photocdn.sohu.com/20080415/Img256308509.jpg"
    };
    private Button mBtn_tohome;
    private boolean isLogin = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mViewPager = (ViewPager) findViewById(R.id.viewpage_splash);
        mBtn_tohome = (Button) findViewById(R.id.btn_tohome);

        mViewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return imageUrl.length;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                ImageView imageView = new ImageView(SplashActivity.this);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                Glide.with(SplashActivity.this).load(imageUrl[position]).into(imageView);
                container.addView(imageView);
//                imageView.setImageResource(R.mipmap.ic_launcher_round);
                return imageView;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView((View) object);
            }
        });
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position ==2){
                    mBtn_tohome.setVisibility(View.VISIBLE);
                }else{
                    mBtn_tohome.setVisibility(View.GONE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        mBtn_tohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isLogin){
                    startActivity(new Intent(SplashActivity.this,MainActivity.class));
                    finish();
                }else {
                    startActivity(new Intent(SplashActivity.this,LoginActivity.class));
                    finish();
                }
            }
        });
    }
}

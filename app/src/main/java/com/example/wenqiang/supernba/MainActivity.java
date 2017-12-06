package com.example.wenqiang.supernba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.iv_image);

        Glide.with(this).load("http://07.imgmini.eastday.com/mobile/20170908/20170908171436_d41d8cd98f00b204e9800998ecf8427e_5.jpeg").into(imageView);
    }
}

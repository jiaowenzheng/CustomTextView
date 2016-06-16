package com.textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.library.CustomTextView;

public class MainActivity extends AppCompatActivity {

    private CustomTextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mTextView1 = (CustomTextView) findViewById(R.id.tv_1);
//
//        int radius = getResources().getDimensionPixelSize(R.dimen.radius_45);
//
//        mTextView1.setSolidColor(R.color.color_ff0000);
//        mTextView1.setRadius(radius,radius,radius,radius);
//        mTextView1.setSelectedTextColor(R.color.color_00ff00,R.color.color_ff0000);
//        mTextView1.setStrokeColorAndWidth(2,R.color.color_3f51b5);
    }
}

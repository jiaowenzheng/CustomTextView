package com.textview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.library.CustomTextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CustomTextView mTextView1;

    private CustomTextView mSmallTextView;
    private CustomTextView mNormalTextView;
    private CustomTextView mBigTextView;
    private CustomTextView mLargeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSmallTextView = (CustomTextView) findViewById(R.id.bt_font_size_small);
        mNormalTextView = (CustomTextView) findViewById(R.id.bt_font_size_normal);
        mBigTextView = (CustomTextView) findViewById(R.id.bt_font_size_big);
        mLargeTextView = (CustomTextView) findViewById(R.id.bt_font_size_large);

        mSmallTextView.setOnClickListener(this);
        mNormalTextView.setOnClickListener(this);
        mBigTextView.setOnClickListener(this);
        mLargeTextView.setOnClickListener(this);

//        mTextView1 = (CustomTextView) findViewById(R.id.tv_1);
//
//        int radius = getResources().getDimensionPixelSize(R.dimen.radius_45);
//
//        mTextView1.setSolidColor(R.color.color_ff0000);
//        mTextView1.setRadius(radius,radius,radius,radius);
//        mTextView1.setSelectedTextColor(R.color.color_00ff00,R.color.color_ff0000);
//        mTextView1.setStrokeColorAndWidth(2,R.color.color_3f51b5);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_font_size_small:
                mSmallTextView.setSelected(true);
                mNormalTextView.setSelected(false);
                mBigTextView.setSelected(false);
                mLargeTextView.setSelected(false);
                break;
            case R.id.bt_font_size_normal:
                mSmallTextView.setSelected(false);
                mNormalTextView.setSelected(true);
                mBigTextView.setSelected(false);
                mLargeTextView.setSelected(false);
                break;
            case R.id.bt_font_size_big:
                mSmallTextView.setSelected(false);
                mNormalTextView.setSelected(false);
                mBigTextView.setSelected(true);
                mLargeTextView.setSelected(false);
                break;
            case R.id.bt_font_size_large:
                mSmallTextView.setSelected(false);
                mNormalTextView.setSelected(false);
                mBigTextView.setSelected(false);
                mLargeTextView.setSelected(true);
                break;
        }
    }
}

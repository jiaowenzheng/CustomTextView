package com.library;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * Button(圆角Button带点击效果,正常Button带点击效果)
 *
 * @author gqiu
 */
public class CustomTextView extends TextView {

    private GradientDrawable drawable;

    public CustomTextView(Context context) {
        super(context);

    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setAttributeSet(context, attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setAttributeSet(context, attrs);
    }


    private void setAttributeSet(Context context, AttributeSet attrs) {

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.customTextView);
        int solid = a.getColor(R.styleable.customTextView_textSolid, Color.TRANSPARENT);
        int strokeColor = a.getColor(R.styleable.customTextView_textStroke, Color.TRANSPARENT);
        int radius = a.getDimensionPixelSize(R.styleable.customTextView_textRadius, 0);
        int leftTopRadius = a.getDimensionPixelSize(R.styleable.customTextView_textLeftTopRadius, 0);
        int leftBottomRadius = a.getDimensionPixelSize(R.styleable.customTextView_textLeftBottomRadius, 0);
        int rightTopRadius = a.getDimensionPixelSize(R.styleable.customTextView_textRightTopRadius, 0);
        int rightBottomRadius = a.getDimensionPixelSize(R.styleable.customTextView_textRightBottomRadius, 0);
        int strokeWidth = a.getDimensionPixelSize(R.styleable.customTextView_textStrokeWidth, 0);
        Drawable textDrawable = a.getDrawable(R.styleable.customTextView_textDrawable);
        int normalTextColor = a.getColor(R.styleable.customTextView_textNormalTextColor, Color.TRANSPARENT);
        int selectedTextColor = a.getColor(R.styleable.customTextView_textSelectedTextColor, Color.TRANSPARENT);


        a.recycle();

        drawable = new GradientDrawable();
        drawable.setStroke(strokeWidth, strokeColor);
        drawable.setColor(solid);

        if (radius > 0) {
            drawable.setCornerRadius(radius);
        } else if (leftTopRadius > 0 || leftBottomRadius > 0 || rightTopRadius > 0 || rightBottomRadius > 0) {
            drawable.setCornerRadii(new float[]{leftTopRadius, leftTopRadius, rightTopRadius, rightTopRadius, rightBottomRadius, rightBottomRadius, leftBottomRadius, leftBottomRadius});
        }

        setBackgroundDrawable(drawable);


        if (textDrawable != null) {
            BitmapDrawable bd = (BitmapDrawable) textDrawable;
            ImageSpan imageSpan = new ImageSpan(getContext(), bd.getBitmap());

            String text = "[icon]";
            SpannableString ss = new SpannableString("[icon]");

            ss.setSpan(imageSpan, 0, text.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            setText(ss);
        }


        if (normalTextColor != 0 && selectedTextColor != 0) {
            //设置state_selected状态时，和正常状态时文字的颜色
            setClickable(true);
            int[][] states = new int[3][1];
            states[0] = new int[]{android.R.attr.state_selected};
            states[1] = new int[]{android.R.attr.state_pressed};
            states[2] = new int[]{};
            ColorStateList textColorSelect = new ColorStateList(states, new int[]{selectedTextColor, selectedTextColor, normalTextColor});
            setTextColor(textColorSelect);
        }else{
            setClickable(false);
        }
    }


    public void setTextDrawable(int drawableId) {
        if (drawableId != 0) {
            Drawable textdrwable = getResources().getDrawable(drawableId);
            BitmapDrawable bd = (BitmapDrawable) textdrwable;
            ImageSpan imageSpan = new ImageSpan(getContext(), bd.getBitmap());

            String text = "[icon]";
            SpannableString ss = new SpannableString("[icon]");

            ss.setSpan(imageSpan, 0, text.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            setText(ss);
        }
    }


    public void setSolid(int colorId) {
        drawable.setColor(colorId);
        setBackgroundDrawable(drawable);
    }


    public void setRadius(int leftTopRadius, int leftBottomRadius, int rightTopRadius, int rightBottomRadius) {
        drawable.setCornerRadii(new float[]{leftTopRadius, leftTopRadius, rightTopRadius, rightTopRadius, rightBottomRadius, rightBottomRadius, leftBottomRadius, leftBottomRadius});
        setBackgroundDrawable(drawable);
    }

}

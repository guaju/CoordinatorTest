package com.guaju.coordinatortest;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by guaju on 2017/11/8.
 */

public class MyImageView extends ImageView {
    int  lastx,lasty;
    public MyImageView(Context context) {
        super(context);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getRawX();
        int y = (int) event.getRawY();
        if (event.getAction()==MotionEvent.ACTION_MOVE){
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) getLayoutParams();
            int leftMargin= layoutParams.leftMargin +(x-lastx);
            int topMargin=layoutParams.topMargin+(y-lasty);
            layoutParams.leftMargin=leftMargin;
            layoutParams.topMargin=topMargin;
            //重新摆放
            requestLayout();

            lastx=x;
            lasty=y;
        }
        return true;
    }
}

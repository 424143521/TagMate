package com.nuoye.selfdiscipline;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class ScrollableConstraintLayout extends ConstraintLayout {
    private HorizontalScrollView scrollView;

    public ScrollableConstraintLayout(Context context) {
        super(context);

    }

    public ScrollableConstraintLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ScrollableConstraintLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
//        init(context);
    }

    private void init(Context context) {
        scrollView = new HorizontalScrollView(context);

        LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        scrollView.setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.image1);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        scrollView.addView(imageView);
        addView(scrollView);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        // 请求父控件及祖宗控件不要拦截事件
        requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(ev);

    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return scrollView.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return scrollView.onTouchEvent(event);
    }


}
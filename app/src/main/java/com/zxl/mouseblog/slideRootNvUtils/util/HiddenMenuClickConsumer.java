package com.zxl.mouseblog.slideRootNvUtils.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

import com.zxl.mouseblog.slideRootNvUtils.SlidingRootNavLayout;

/**
 * Created by yarolegovich on 26.03.2017.
 */

public class HiddenMenuClickConsumer extends View {

    private SlidingRootNavLayout menuHost;

    public HiddenMenuClickConsumer(Context context) {
        super(context);
    }

    @Override
    @SuppressLint("ClickableViewAccessibility")
    public boolean onTouchEvent(MotionEvent event) {
        return menuHost.isMenuClosed();
    }

    public void setMenuHost(SlidingRootNavLayout layout) {
        this.menuHost = layout;
    }
}

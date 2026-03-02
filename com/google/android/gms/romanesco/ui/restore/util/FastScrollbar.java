package com.google.android.gms.romanesco.ui.restore.util;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import bboe;

public class FastScrollbar extends RelativeLayout {
    View a;
    private final int b;
    private bboe c;
    private LinearLayoutManager d;
    private boolean e;

    public FastScrollbar(Context context0) {
        super(context0);
        this.b = context0.getResources().getDimensionPixelSize(0x7F07064A);  // dimen:fast_scroller_touch_target_width
    }

    public FastScrollbar(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b = context0.getResources().getDimensionPixelSize(0x7F07064A);  // dimen:fast_scroller_touch_target_width
    }

    public final void a(bboe bboe0, LinearLayoutManager linearLayoutManager0) {
        this.c = bboe0;
        this.d = linearLayoutManager0;
    }

    public final void b(RecyclerView recyclerView0) {
        if(!this.a.isSelected()) {
            int v = recyclerView0.computeVerticalScrollOffset();
            float f = (float)recyclerView0.computeVerticalScrollRange();
            float f1 = (float)this.getHeight();
            this.c(((float)this.getHeight()) * (((float)v) / (f - f1)));
        }
    }

    private final void c(float f) {
        int v = this.a.getHeight();
        this.a.setY(((float)FastScrollbar.d(this.getHeight() - v, (((int)f) - v) / 2)));
    }

    private static final int d(int v, int v1) {
        return Math.min(Math.max(0, v1), v);
    }

    @Override  // android.view.View
    public final void onConfigurationChanged(Configuration configuration0) {
        if(configuration0.orientation == 2) {
            this.setVisibility(4);
            this.setVisibility(0);
        }
    }

    @Override  // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = this.findViewById(0x7F0B1387);  // id:fast_scrollbar_scroll_bar
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        float f = 0.0f;
        if(!this.e) {
            int v = this.getWidth();
            float f1 = motionEvent0.getX();
            if(((float)(v - this.b)) - f1 <= 0.0f) {
                goto label_7;
            }
            return super.onTouchEvent(motionEvent0);
        }
    label_7:
        switch(motionEvent0.getAction()) {
            case 0: {
                this.e = true;
                this.a.setSelected(true);
                break;
            }
            case 2: {
                break;
            }
            case 1: 
            case 3: {
                this.e = false;
                this.a.setSelected(false);
                return true;
            }
            default: {
                return super.onTouchEvent(motionEvent0);
            }
        }
        this.c(motionEvent0.getY());
        float f2 = motionEvent0.getY();
        int v1 = this.c == null ? 0 : ((int)(((Integer)this.c.a(null))));
        if(this.a.getY() != 0.0f) {
            f = this.a.getY() + ((float)this.a.getHeight()) >= ((float)this.getHeight()) ? 1.0f : f2 / ((float)this.getHeight());
        }
        this.d.aa(FastScrollbar.d(v1 - 1, ((int)(f * ((float)v1)))), 0);
        return true;
    }
}


package com.google.android.gms.romanesco.ui.restore.promo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class FastScroller extends RelativeLayout {
    View a;
    private final int b;
    private boolean c;

    public FastScroller(Context context0) {
        super(context0);
        this.b = context0.getResources().getDimensionPixelSize(0x7F07064A);  // dimen:fast_scroller_touch_target_width
    }

    public FastScroller(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b = context0.getResources().getDimensionPixelSize(0x7F07064A);  // dimen:fast_scroller_touch_target_width
    }

    @Override  // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = this.findViewById(0x7F0B1389);  // id:fast_scroller_scroll_bar
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        if(!this.c) {
            int v = this.getWidth();
            float f = motionEvent0.getX();
            if(((float)(v - this.b)) - f <= 0.0f) {
                goto label_6;
            }
            return super.onTouchEvent(motionEvent0);
        }
    label_6:
        int v1 = motionEvent0.getAction();
        switch(v1) {
            case 0: {
                this.c = true;
                this.a.setSelected(true);
                break;
            }
            case 1: {
                this.c = false;
                this.a.setSelected(false);
                return true;
            }
            case 2: {
                break;
            }
            default: {
                if(v1 != 3) {
                    return super.onTouchEvent(motionEvent0);
                }
                this.c = false;
                this.a.setSelected(false);
                return true;
            }
        }
        float f1 = motionEvent0.getY();
        int v2 = this.a.getHeight();
        this.a.setY(((float)Math.min(Math.max(0, ((int)(f1 - ((float)(v2 / 2))))), this.getHeight() - v2)));
        motionEvent0.getY();
        throw null;
    }
}


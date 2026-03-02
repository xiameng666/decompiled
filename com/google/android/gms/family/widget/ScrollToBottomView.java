package com.google.android.gms.family.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ScrollView;
import bkqq;

public final class ScrollToBottomView extends ScrollView {
    public bkqq a;

    public ScrollToBottomView(Context context0) {
        this(context0, null, 0);
    }

    public ScrollToBottomView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ScrollToBottomView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    private final void a() {
        if((((float)(this.getChildAt(this.getChildCount() - 1).getBottom() - (this.getHeight() + this.getScrollY()))) < this.getResources().getDimension(0x7F070686))) {  // dimen:fm_create_bottom_margin
            bkqq bkqq0 = this.a;
            if(bkqq0 != null) {
                bkqq0.z();
            }
        }
    }

    @Override  // android.view.View
    protected final void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        this.a();
    }

    @Override  // android.view.View
    protected final void onScrollChanged(int v, int v1, int v2, int v3) {
        super.onScrollChanged(v, v1, v2, v3);
        this.a();
    }
}


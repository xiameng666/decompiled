package com.google.android.gms.common.widget.phone;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ScrollView;

public final class ScrollViewWithEvents extends ScrollView implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean a;

    public ScrollViewWithEvents(Context context0) {
        super(context0);
    }

    public ScrollViewWithEvents(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public ScrollViewWithEvents(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    public final boolean a(int v) {
        return this.getChildAt(this.getChildCount() - 1).getBottom() - (v + this.getHeight()) <= 0;
    }

    private final void b(int v) {
        boolean z = this.a(v);
        if(z != this.a) {
            this.a = z;
        }
    }

    @Override  // android.view.ViewGroup
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override  // android.widget.ScrollView
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b(this.getScrollY());
    }

    @Override  // android.view.View
    protected final void onScrollChanged(int v, int v1, int v2, int v3) {
        super.onScrollChanged(v, v1, v2, v3);
        if(v1 == v3 || !this.a && v1 <= v3) {
            return;
        }
        this.b(v1);
    }
}


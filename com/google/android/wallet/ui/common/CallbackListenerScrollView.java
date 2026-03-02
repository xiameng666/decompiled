package com.google.android.wallet.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import gcyi;
import gcyj;
import hzmu;

public class CallbackListenerScrollView extends ScrollView {
    private final gcyi a;
    protected boolean o;
    public gcyj p;

    public CallbackListenerScrollView(Context context0) {
        super(context0);
        this.a = new gcyi(this);
    }

    public CallbackListenerScrollView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new gcyi(this);
    }

    public CallbackListenerScrollView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new gcyi(this);
    }

    public CallbackListenerScrollView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.a = new gcyi(this);
    }

    public final void i() {
        boolean z = false;
        if(this.isInLayout() && hzmu.c()) {
            return;
        }
        if(this.getChildCount() != 0 && this.getScrollY() >= this.getChildAt(0).getHeight() - this.getHeight()) {
            z = true;
        }
        gcyj gcyj0 = this.p;
        if(gcyj0 != null && z) {
            gcyj0.bU();
        }
        this.removeCallbacks(this.a);
    }

    final void j() {
        if(this.p != null && this.getChildCount() != 0) {
            this.i();
            this.p.bY(this.getScrollY());
        }
    }

    @Override  // android.widget.ScrollView
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(hzmu.c()) {
            this.post(this.a);
        }
        boolean z1 = this.getChildCount() != 0 && this.getHeight() - this.getChildAt(0).getHeight() - this.getPaddingTop() - this.getPaddingBottom() < 0;
        if(z1 != this.o) {
            this.o = z1;
            gcyj gcyj0 = this.p;
            if(gcyj0 != null) {
                gcyj0.bX(z1);
            }
        }
    }

    @Override  // android.view.View
    protected void onScrollChanged(int v, int v1, int v2, int v3) {
        super.onScrollChanged(v, v1, v2, v3);
        this.j();
    }
}


package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import fydq;
import fydr;
import java.util.List;
import jtl;
import jto;
import kfe;
import kgq;

public class AppBarLayout.ScrollingViewBehavior extends fydq {
    public AppBarLayout.ScrollingViewBehavior() {
    }

    public AppBarLayout.ScrollingViewBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, fydr.f);
        this.d = typedArray0.getDimensionPixelSize(0, 0);
        typedArray0.recycle();
    }

    @Override  // fyds
    public boolean g(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        super.g(coordinatorLayout0, view0, v);
        return true;
    }

    @Override  // jtl
    public final boolean h(CoordinatorLayout coordinatorLayout0, View view0, Rect rect0, boolean z) {
        AppBarLayout appBarLayout0 = AppBarLayout.ScrollingViewBehavior.v(coordinatorLayout0.a(view0));
        if(appBarLayout0 != null) {
            Rect rect1 = new Rect(rect0);
            rect1.offset(view0.getLeft(), view0.getTop());
            Rect rect2 = this.a;
            rect2.set(0, 0, coordinatorLayout0.getWidth(), coordinatorLayout0.getHeight());
            if(!rect2.contains(rect1)) {
                appBarLayout0.m(false, ((boolean)(((int)z) ^ 1)));
                return true;
            }
        }
        return false;
    }

    @Override  // jtl
    public final boolean k(View view0, View view1) {
        return view1 instanceof AppBarLayout;
    }

    @Override  // jtl
    public void l(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
        jtl jtl0 = ((jto)view1.getLayoutParams()).a;
        if((jtl0 instanceof AppBarLayout.BaseBehavior)) {
            view0.offsetTopAndBottom(view1.getBottom() - view0.getTop() + ((AppBarLayout.BaseBehavior)jtl0).c + this.c - this.w(view1));
        }
        if((view1 instanceof AppBarLayout) && ((AppBarLayout)view1).g) {
            ((AppBarLayout)view1).o(((AppBarLayout)view1).q(view0));
        }
    }

    @Override  // jtl
    public final void m(CoordinatorLayout coordinatorLayout0, View view0) {
        if((view0 instanceof AppBarLayout)) {
            kfe.j(coordinatorLayout0, null);
        }
    }

    @Override  // jtl
    public final boolean n(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2) {
        int v3 = view0.getLayoutParams().height;
        switch(v3) {
            case -2: {
                v3 = -2;
                break;
            }
            case -1: {
                break;
            }
            default: {
                return false;
            }
        }
        View view1 = this.u(coordinatorLayout0.a(view0));
        if(view1 != null) {
            int v4 = View.MeasureSpec.getSize(v2);
            if(v4 <= 0) {
                v4 = coordinatorLayout0.getHeight();
            }
            else if(view1.getFitsSystemWindows()) {
                kgq kgq0 = coordinatorLayout0.e;
                if(kgq0 != null) {
                    v4 += kgq0.d() + kgq0.a();
                }
            }
            int v5 = v4 + this.t(view1);
            int v6 = view1.getMeasuredHeight();
            if(this.y()) {
                view0.setTranslationY(((float)(-v6)));
            }
            else {
                view0.setTranslationY(0.0f);
                v5 -= v6;
            }
            coordinatorLayout0.n(view0, v, v1, View.MeasureSpec.makeMeasureSpec(v5, (v3 == -1 ? 0x40000000 : 0x80000000)));
            return true;
        }
        return false;
    }

    @Override  // fydq
    public final float s(View view0) {
        if((view0 instanceof AppBarLayout)) {
            int v = ((AppBarLayout)view0).f();
            int v1 = ((AppBarLayout)view0).b();
            jtl jtl0 = ((jto)((AppBarLayout)view0).getLayoutParams()).a;
            int v2 = (jtl0 instanceof AppBarLayout.BaseBehavior) ? ((AppBarLayout.BaseBehavior)jtl0).y() : 0;
            if(v1 == 0 || v + v2 > v1) {
                int v3 = v - v1;
                return v3 == 0 ? 0.0f : ((float)v2) / ((float)v3) + 1.0f;
            }
        }
        return 0.0f;
    }

    @Override  // fydq
    public final int t(View view0) {
        return ((AppBarLayout)view0).f();
    }

    @Override  // fydq
    public final View u(List list0) {
        return AppBarLayout.ScrollingViewBehavior.v(list0);
    }

    static final AppBarLayout v(List list0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = (View)list0.get(v1);
            if((view0 instanceof AppBarLayout)) {
                return (AppBarLayout)view0;
            }
        }
        return null;
    }
}


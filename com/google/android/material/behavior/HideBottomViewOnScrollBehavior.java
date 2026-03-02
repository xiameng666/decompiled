package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import fycp;
import fyea;
import fyeb;
import fyec;
import fyed;
import fyoy;
import fyse;
import java.util.LinkedHashSet;
import jtl;

@Deprecated
public class HideBottomViewOnScrollBehavior extends jtl {
    public int a;
    public AccessibilityManager b;
    public AccessibilityManager.TouchExplorationStateChangeListener c;
    public int d;
    public int e;
    public ViewPropertyAnimator f;
    private final LinkedHashSet g;
    private int h;
    private int i;
    private TimeInterpolator j;
    private TimeInterpolator k;

    public HideBottomViewOnScrollBehavior() {
        this.g = new LinkedHashSet();
        this.a = 0;
        this.d = 2;
        this.e = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.g = new LinkedHashSet();
        this.a = 0;
        this.d = 2;
        this.e = 0;
    }

    @Override  // jtl
    public final void c(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
        if(v1 > 0) {
            if(!this.t() && (this.b == null || !this.b.isTouchExplorationEnabled())) {
                ViewPropertyAnimator viewPropertyAnimator0 = this.f;
                if(viewPropertyAnimator0 != null) {
                    viewPropertyAnimator0.cancel();
                    view0.clearAnimation();
                }
                this.v(1);
                this.u(view0, this.a + this.e, ((long)this.i), this.k);
            }
        }
        else if(v1 < 0) {
            this.s(view0);
        }
    }

    @Override  // jtl
    public boolean g(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        this.a = view0.getMeasuredHeight() + viewGroup$MarginLayoutParams0.bottomMargin;
        this.h = fyse.a(view0.getContext(), 0x7F0408CD, 0xE1);  // attr:motionDurationLong2
        this.i = fyse.a(view0.getContext(), 0x7F0408D3, 0xAF);  // attr:motionDurationMedium4
        this.j = fyoy.a(view0.getContext(), 0x7F0408DD, fycp.d);  // attr:motionEasingEmphasizedInterpolator
        this.k = fyoy.a(view0.getContext(), 0x7F0408DD, fycp.c);  // attr:motionEasingEmphasizedInterpolator
        if(this.b == null) {
            this.b = (AccessibilityManager)view0.getContext().getSystemService(AccessibilityManager.class);
        }
        if(this.b != null && this.c == null) {
            fyea fyea0 = new fyea(this, view0);
            this.c = fyea0;
            this.b.addTouchExplorationStateChangeListener(fyea0);
            view0.addOnAttachStateChangeListener(new fyeb(this));
        }
        return false;
    }

    @Override  // jtl
    public boolean i(CoordinatorLayout coordinatorLayout0, View view0, View view1, View view2, int v, int v1) {
        return v == 2;
    }

    public final void s(View view0) {
        if(this.d == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator0 = this.f;
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
            view0.clearAnimation();
        }
        this.v(2);
        this.u(view0, 0, ((long)this.h), this.j);
    }

    public final boolean t() {
        return this.d == 1;
    }

    private final void u(View view0, int v, long v1, TimeInterpolator timeInterpolator0) {
        this.f = view0.animate().translationY(((float)v)).setInterpolator(timeInterpolator0).setDuration(v1).setListener(new fyec(this));
    }

    private final void v(int v) {
        this.d = v;
        for(Object object0: this.g) {
            ((fyed)object0).a();
        }
    }
}


package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import androidx.customview.view.AbsSavedState;
import fycp;
import fycw;
import fycx;
import fycy;
import fydd;
import fydg;
import fydh;
import fydr;
import fydu;
import fyho;
import fyjz;
import fynk;
import fyoy;
import fyse;
import fysf;
import fyuj;
import fyuk;
import fzaq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import jtk;
import jtl;
import jyq;
import kex;
import kgq;

public class AppBarLayout extends LinearLayout implements jtk {
    private AppBarLayout.Behavior A;
    public boolean a;
    public int b;
    public kgq c;
    public List d;
    public boolean e;
    public boolean f;
    public boolean g;
    public ColorStateList h;
    public int i;
    public final List j;
    public final LinkedHashSet k;
    public int l;
    public Drawable m;
    public Integer n;
    public final float o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private WeakReference u;
    private ValueAnimator v;
    private ValueAnimator.AnimatorUpdateListener w;
    private final long x;
    private final TimeInterpolator y;
    private int[] z;

    public AppBarLayout(Context context0) {
        this(context0, null);
    }

    public AppBarLayout(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F04010A);  // attr:appBarLayoutStyle
    }

    public AppBarLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(fzaq.a(context0, attributeSet0, v, 0x7F16116E), attributeSet0, v);  // style:Widget.Design.AppBarLayout
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.b = 0;
        this.j = new ArrayList();
        this.k = new LinkedHashSet();
        Context context1 = this.getContext();
        boolean z = true;
        this.setOrientation(1);
        if(this.getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            this.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context2 = this.getContext();
        TypedArray typedArray0 = fynk.a(context2, attributeSet0, fydu.a, v, 0x7F16116E, new int[0]);  // style:Widget.Design.AppBarLayout
        try {
            if(typedArray0.hasValue(0)) {
                this.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, typedArray0.getResourceId(0, 0)));
            }
        }
        finally {
            typedArray0.recycle();
        }
        TypedArray typedArray1 = fynk.a(context1, attributeSet0, fydr.a, v, 0x7F16116E, new int[0]);  // style:Widget.Design.AppBarLayout
        this.h = fysf.d(context1, typedArray1, 6);
        this.x = (long)fyse.a(context1, 0x7F0408D1, this.getResources().getInteger(0x7F0C0007));  // attr:motionDurationMedium2
        this.y = fyoy.a(context1, 0x7F0408E3, fycp.a);  // attr:motionEasingStandardInterpolator
        if(typedArray1.hasValue(4)) {
            this.v(typedArray1.getBoolean(4, false), false, false);
        }
        if(typedArray1.hasValue(3)) {
            fydu.a(this, ((float)typedArray1.getDimensionPixelSize(3, 0)));
        }
        this.setBackground(typedArray1.getDrawable(0));
        if(typedArray1.hasValue(2)) {
            this.setKeyboardNavigationCluster(typedArray1.getBoolean(2, false));
        }
        if(typedArray1.hasValue(1)) {
            this.setTouchscreenBlocksFocus(typedArray1.getBoolean(1, false));
        }
        Integer integer0 = null;
        this.o = this.getResources().getDimension(0x7F0704EB);  // dimen:design_appbar_elevation
        this.g = typedArray1.getBoolean(5, false);
        this.i = typedArray1.getResourceId(7, -1);
        Drawable drawable0 = typedArray1.getDrawable(8);
        Drawable drawable1 = this.m;
        if(drawable1 != drawable0) {
            if(drawable1 != null) {
                drawable1.setCallback(null);
            }
            Drawable drawable2 = drawable0 == null ? null : drawable0.mutate();
            this.m = drawable2;
            if((drawable2 instanceof fyuj)) {
                integer0 = (int)((fyuj)drawable2).J;
            }
            else {
                ColorStateList colorStateList0 = fyjz.a(drawable2);
                if(colorStateList0 != null) {
                    integer0 = colorStateList0.getDefaultColor();
                }
            }
            this.n = integer0;
            Drawable drawable3 = this.m;
            if(drawable3 != null) {
                if(drawable3.isStateful()) {
                    this.m.setState(this.getDrawableState());
                }
                this.m.setLayoutDirection(this.getLayoutDirection());
                Drawable drawable4 = this.m;
                if(this.getVisibility() != 0) {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.m.setCallback(this);
            }
            this.n();
            this.postInvalidateOnAnimation();
        }
        typedArray1.recycle();
        kex.b(this, new fycy(this));
    }

    @Override  // jtk
    public final jtl a() {
        AppBarLayout.Behavior appBarLayout$Behavior0 = new AppBarLayout.Behavior();
        this.A = appBarLayout$Behavior0;
        return appBarLayout$Behavior0;
    }

    public final int b() {
        int v6;
        int v = this.r;
        if(v != -1) {
            return v;
        }
        int v1 = this.getChildCount() - 1;
        int v2 = 0;
        while(v1 >= 0) {
            View view0 = this.getChildAt(v1);
            if(view0.getVisibility() == 8) {
                --v1;
                continue;
            }
            else {
                fydg fydg0 = (fydg)view0.getLayoutParams();
                int v3 = view0.getMeasuredHeight();
                int v4 = fydg0.a;
                if((v4 & 5) == 5) {
                    int v5 = fydg0.topMargin + fydg0.bottomMargin;
                    if((v4 & 8) == 0) {
                        v6 = (v4 & 2) == 0 ? v5 + v3 : v5 + (v3 - view0.getMinimumHeight());
                    }
                    else {
                        v6 = v5 + view0.getMinimumHeight();
                    }
                    if(v1 == 0 && view0.getFitsSystemWindows()) {
                        v6 = Math.min(v6, v3 - this.e());
                    }
                    v2 += v6;
                    --v1;
                    continue;
                }
                else if(v2 <= 0) {
                    --v1;
                    continue;
                }
            }
            break;
        }
        int v7 = Math.max(0, v2);
        this.r = v7;
        return v7;
    }

    final int c() {
        int v = this.s;
        if(v != -1) {
            return v;
        }
        int v1 = this.getChildCount();
        int v2 = 0;
        int v3 = 0;
        while(v2 < v1) {
            View view0 = this.getChildAt(v2);
            if(view0.getVisibility() == 8) {
                ++v2;
                continue;
            }
            else {
                fydg fydg0 = (fydg)view0.getLayoutParams();
                int v4 = view0.getMeasuredHeight() + (fydg0.topMargin + fydg0.bottomMargin);
                int v5 = fydg0.a;
                if((v5 & 1) != 0) {
                    v3 += v4;
                    if((v5 & 2) == 0) {
                        ++v2;
                        continue;
                    }
                    else {
                        v3 -= view0.getMinimumHeight();
                    }
                }
            }
            break;
        }
        int v6 = Math.max(0, v3);
        this.s = v6;
        return v6;
    }

    @Override  // android.widget.LinearLayout
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof fydg;
    }

    public final int d() {
        int v = this.e();
        int v1 = this.getMinimumHeight();
        if(v1 != 0) {
            int v2 = v1 + v1 + v;
            return v2 >= this.getHeight() ? v1 + v : v2;
        }
        int v3 = this.getChildCount();
        int v4 = v3 <= 0 ? 0 : this.getChildAt(v3 - 1).getMinimumHeight();
        if(v4 != 0) {
            int v5 = v4 + v4 + v;
            return v5 >= this.getHeight() ? v4 + v : v5;
        }
        return this.getHeight() / 3;
    }

    @Override  // android.view.View
    public final void draw(Canvas canvas0) {
        super.draw(canvas0);
        if(this.x()) {
            int v = canvas0.save();
            canvas0.translate(0.0f, ((float)(-this.p)));
            this.m.draw(canvas0);
            canvas0.restoreToCount(v);
        }
    }

    @Override  // android.view.ViewGroup
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        Drawable drawable0 = this.m;
        if(drawable0 != null && drawable0.isStateful() && drawable0.setState(arr_v)) {
            this.invalidateDrawable(drawable0);
        }
    }

    final int e() {
        return this.c == null ? 0 : this.c.d();
    }

    public final int f() {
        int v = this.q;
        if(v != -1) {
            return v;
        }
        int v1 = this.getChildCount();
        int v2 = 0;
        int v3 = 0;
        while(v2 < v1) {
            View view0 = this.getChildAt(v2);
            if(view0.getVisibility() == 8) {
                ++v2;
                continue;
            }
            else {
                fydg fydg0 = (fydg)view0.getLayoutParams();
                int v4 = view0.getMeasuredHeight();
                int v5 = fydg0.a;
                if((v5 & 1) != 0) {
                    v3 += v4 + fydg0.topMargin + fydg0.bottomMargin;
                    if(v2 == 0) {
                        if(view0.getFitsSystemWindows()) {
                            v3 -= this.e();
                        }
                        v2 = 0;
                    }
                    if((v5 & 2) == 0) {
                        ++v2;
                        continue;
                    }
                    else {
                        v3 -= view0.getMinimumHeight();
                    }
                }
            }
            break;
        }
        int v6 = Math.max(0, v3);
        this.q = v6;
        return v6;
    }

    public final fydg g(AttributeSet attributeSet0) {
        return new fydg(this.getContext(), attributeSet0);
    }

    @Override  // android.widget.LinearLayout
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new fydg();
    }

    @Override  // android.widget.LinearLayout
    protected final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new fydg();
    }

    @Override  // android.widget.LinearLayout
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.g(attributeSet0);
    }

    @Override  // android.widget.LinearLayout
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return AppBarLayout.r(viewGroup$LayoutParams0);
    }

    @Override  // android.widget.LinearLayout
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.g(attributeSet0);
    }

    @Override  // android.widget.LinearLayout
    protected final LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return AppBarLayout.r(viewGroup$LayoutParams0);
    }

    @Deprecated
    public final void h(fydh fydh0) {
        this.j.add(fydh0);
    }

    public final void i(fydd fydd0) {
        if(this.d == null) {
            this.d = new ArrayList();
        }
        if(fydd0 != null && !this.d.contains(fydd0)) {
            this.d.add(fydd0);
        }
    }

    public final void j() {
        WeakReference weakReference0 = this.u;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.u = null;
    }

    final void k(int v) {
        this.p = v;
        if(!this.willNotDraw()) {
            this.postInvalidateOnAnimation();
        }
        List list0 = this.d;
        if(list0 != null) {
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                fydd fydd0 = (fydd)this.d.get(v2);
                if(fydd0 != null) {
                    fydd0.a(this, v);
                }
            }
        }
    }

    public final void l(boolean z) {
        this.m(z, this.isLaidOut());
    }

    public final void m(boolean z, boolean z1) {
        this.v(z, z1, true);
    }

    public final void n() {
        this.setWillNotDraw(((boolean)(this.x() ^ 1)));
    }

    final boolean o(boolean z) {
        return this.p(z, ((boolean)(this.e ^ 1)));
    }

    @Override  // android.view.ViewGroup
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fyuk.c(this);
    }

    @Override  // android.view.ViewGroup
    protected final int[] onCreateDrawableState(int v) {
        boolean z1;
        if(this.z == null) {
            this.z = new int[4];
        }
        int[] arr_v = this.z;
        int[] arr_v1 = super.onCreateDrawableState(v + 4);
        boolean z = this.t;
        int v1 = 0;
        arr_v[0] = z ? 0x7F040B43 : 0x80FBF4BD;  // attr:state_liftable
        int v2 = 0x80FBF4BC;
        if(z) {
            if(this.f) {
                v2 = 0x7F040B44;  // attr:state_lifted
            }
            z1 = true;
        }
        else {
            z1 = false;
            v1 = 1;
        }
        arr_v[1] = v2;
        arr_v[2] = 1 == v1 ? 0x80FBF4C1 : 0x7F040B3F;  // attr:state_collapsible
        arr_v[3] = !z1 || !this.f ? 0x80FBF4C2 : 0x7F040B3E;  // attr:state_collapsed
        return AppBarLayout.mergeDrawableStates(arr_v1, arr_v);
    }

    @Override  // android.view.ViewGroup
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j();
    }

    @Override  // android.widget.LinearLayout
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v7;
        boolean z1;
        super.onLayout(z, v, v1, v2, v3);
        if(this.getFitsSystemWindows() && this.y()) {
            int v4 = this.e();
            int v5 = this.getChildCount();
            while(true) {
                --v5;
                if(v5 < 0) {
                    goto label_8;
                }
                this.getChildAt(v5).offsetTopAndBottom(v4);
            }
        }
        else {
        label_8:
            this.u();
            z1 = false;
            this.a = false;
            int v6 = this.getChildCount();
            v7 = 0;
        }
        while(v7 < v6) {
            if(((fydg)this.getChildAt(v7).getLayoutParams()).c == null) {
                ++v7;
                continue;
            }
            else {
                this.a = true;
            }
            break;
        }
        Drawable drawable0 = this.m;
        if(drawable0 != null) {
            drawable0.setBounds(0, 0, this.getWidth(), this.e());
        }
        if(!this.e) {
            if(this.g) {
            label_32:
                z1 = true;
            }
            else {
                int v8 = this.getChildCount();
                int v9 = 0;
                while(v9 < v8) {
                    int v10 = ((fydg)this.getChildAt(v9).getLayoutParams()).a;
                    if((v10 & 1) == 1 && (v10 & 10) != 0) {
                        goto label_32;
                    }
                    ++v9;
                }
            }
            this.z(z1);
        }
    }

    @Override  // android.widget.LinearLayout
    protected final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = View.MeasureSpec.getMode(v1);
        if(v2 != 0x40000000 && this.getFitsSystemWindows() && this.y()) {
            int v3 = this.getMeasuredHeight();
            switch(v2) {
                case 0x80000000: {
                    v3 = jyq.b(this.getMeasuredHeight() + this.e(), 0, View.MeasureSpec.getSize(v1));
                    break;
                }
                case 0: {
                    v3 += this.e();
                }
            }
            this.setMeasuredDimension(this.getMeasuredWidth(), v3);
        }
        this.u();
    }

    final boolean p(boolean z, boolean z1) {
        if(z1 && this.f != z) {
            float f = 0.0f;
            this.f = z;
            this.refreshDrawableState();
            if((this.getBackground() instanceof fyuj)) {
                if(this.h != null) {
                    if(z) {
                        f = 1.0f;
                    }
                    this.w((z ? 0.0f : 1.0f), f);
                    return true;
                }
                if(this.g) {
                    float f1 = z ? 0.0f : this.o;
                    if(z) {
                        f = this.o;
                    }
                    this.w(f1, f);
                }
            }
            return true;
        }
        return false;
    }

    final boolean q(View view0) {
        View view1 = null;
        if(this.u == null) {
            int v = this.i;
            if(v != -1) {
                View view2 = view0 == null ? null : view0.findViewById(v);
                if(view2 == null && (this.getParent() instanceof ViewGroup)) {
                    view2 = ((ViewGroup)this.getParent()).findViewById(this.i);
                }
                if(view2 != null) {
                    this.u = new WeakReference(view2);
                }
            }
        }
        WeakReference weakReference0 = this.u;
        if(weakReference0 != null) {
            view1 = (View)weakReference0.get();
        }
        if(view1 != null) {
            view0 = view1;
        }
        return view0 == null ? false : view0.canScrollVertically(-1) || view0.getScrollY() > 0;
    }

    protected static final fydg r(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if((viewGroup$LayoutParams0 instanceof LinearLayout.LayoutParams)) {
            return new fydg(((LinearLayout.LayoutParams)viewGroup$LayoutParams0));
        }
        return (viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) ? new fydg(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new fydg(viewGroup$LayoutParams0);
    }

    public final void s() {
        this.e = true;
        this.z(true);
    }

    @Override  // android.view.View
    public final void setBackground(Drawable drawable0) {
        fyuj fyuj0;
        Context context0 = this.getContext();
        if((drawable0 instanceof fyuj)) {
            fyuj0 = (fyuj)drawable0;
        }
        else {
            ColorStateList colorStateList0 = fyjz.a(drawable0);
            if(colorStateList0 == null) {
                fyuj0 = null;
            }
            else {
                fyuj fyuj1 = new fyuj();
                fyuj1.aa(colorStateList0);
                fyuj0 = fyuj1;
            }
        }
        if(fyuj0 != null && fyuj0.N() != null) {
            this.l = fyuj0.N().getDefaultColor();
            ColorStateList colorStateList1 = this.h;
            if(colorStateList1 == null) {
                fyuj0.W(context0);
                this.w = new fycx(this, fyuj0);
            }
            else {
                this.w = new fycw(this, colorStateList1, fyuj0, fyho.h(this.getContext(), 0x7F040332));  // attr:colorSurface
            }
            drawable0 = fyuj0;
        }
        super.setBackground(drawable0);
    }

    @Override  // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        fyuk.b(this, f);
    }

    @Override  // android.widget.LinearLayout
    public final void setOrientation(int v) {
        if(v != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    @Override  // android.view.View
    public final void setVisibility(int v) {
        super.setVisibility(v);
        Drawable drawable0 = this.m;
        if(drawable0 != null) {
            drawable0.setVisible(v == 0, false);
        }
    }

    public final void t(boolean z) {
        this.p(z, true);
    }

    private final void u() {
        AppBarLayout.BaseBehavior.SavedState appBarLayout$BaseBehavior$SavedState0 = this.A == null || this.q == -1 || this.b != 0 ? null : this.A.A(AbsSavedState.c, this);
        this.q = -1;
        this.r = -1;
        this.s = -1;
        if(appBarLayout$BaseBehavior$SavedState0 != null) {
            this.A.C(appBarLayout$BaseBehavior$SavedState0, false);
        }
    }

    private final void v(boolean z, boolean z1, boolean z2) {
        this.b = (z ? 1 : 2) | (z1 ? 4 : 0) | (z2 ? 8 : 0);
        this.requestLayout();
    }

    @Override  // android.view.View
    protected final boolean verifyDrawable(Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.m;
    }

    private final void w(float f, float f1) {
        ValueAnimator valueAnimator0 = this.v;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
        }
        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{f, f1});
        this.v = valueAnimator1;
        valueAnimator1.setDuration(this.x);
        this.v.setInterpolator(this.y);
        ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0 = this.w;
        if(valueAnimator$AnimatorUpdateListener0 != null) {
            this.v.addUpdateListener(valueAnimator$AnimatorUpdateListener0);
        }
        this.v.start();
    }

    private final boolean x() {
        return this.m != null && this.e() > 0;
    }

    private final boolean y() {
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            return view0.getVisibility() != 8 && !view0.getFitsSystemWindows();
        }
        return false;
    }

    private final void z(boolean z) {
        if(this.t != z) {
            this.t = z;
            this.refreshDrawableState();
        }
    }
}


package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import fycp;
import fyjz;
import fymi;
import fymm;
import fymr;
import fymt;
import fyna;
import fynk;
import fyok;
import fyop;
import fyox;
import fypb;
import fypc;
import fypy;
import fypz;
import fyqa;
import fyqb;
import fyqd;
import fysf;
import fysn;
import fyuj;
import fyuk;
import fyus;
import fyut;
import fyvf;
import fyvh;
import fyvj;
import fzaq;
import jwe;
import kfe;
import kgq;
import ljm;
import ljo;
import mg;
import nd;
import wi;
import zu;

public class NavigationView extends fyna implements fyok {
    private static final int[] a;
    private static final int[] b;
    private final int c;
    private MenuInflater d;
    private ViewTreeObserver.OnGlobalLayoutListener e;
    private int f;
    public final fymi m;
    public final fymt n;
    public fyqb o;
    public final int[] p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final fyop u;
    private final boolean v;
    private final int w;
    private final fyvf x;
    private final fyox y;
    private final ljo z;

    static {
        NavigationView.a = new int[]{0x10100A0};
        NavigationView.b = new int[]{0xFEFEFF62};
    }

    public NavigationView(Context context0) {
        this(context0, null);
    }

    public NavigationView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F040915);  // attr:navigationViewStyle
    }

    public NavigationView(Context context0, AttributeSet attributeSet0, int v) {
        super(fzaq.a(context0, attributeSet0, v, 0x7F161173), attributeSet0, v);  // style:Widget.Design.NavigationView
        fymt fymt0 = new fymt();
        this.n = fymt0;
        this.p = new int[2];
        this.q = true;
        this.r = true;
        this.s = true;
        this.t = true;
        this.f = 0;
        fyvj fyvj0 = Build.VERSION.SDK_INT >= 33 ? new fyvj(this) : new fyvh(this);
        this.x = fyvj0;
        this.y = new fyox(this);
        this.u = new fyop(this);
        this.z = new fypy(this);
        Context context1 = this.getContext();
        fymi fymi0 = new fymi(context1);
        this.m = fymi0;
        wi wi0 = fynk.b(context1, attributeSet0, fyqd.c, v, 0x7F161173, new int[0]);  // style:Widget.Design.NavigationView
        if(wi0.q(1)) {
            this.setBackground(wi0.h(1));
        }
        int v1 = wi0.b(7, 0);
        this.f = v1;
        this.v = v1 == 0;
        this.w = this.getResources().getDimensionPixelSize(0x7F070B07);  // dimen:m3_navigation_drawer_layout_corner_size
        Drawable drawable0 = this.getBackground();
        ColorStateList colorStateList0 = fyjz.a(drawable0);
        if(drawable0 == null || colorStateList0 != null) {
            fyuj fyuj0 = new fyuj(new fyut(fyut.i(context1, attributeSet0, v, 0x7F161173)));  // style:Widget.Design.NavigationView
            if(colorStateList0 != null) {
                fyuj0.aa(colorStateList0);
            }
            fyuj0.W(context1);
            this.setBackground(fyuj0);
        }
        if(wi0.q(8)) {
            this.setElevation(((float)wi0.b(8, 0)));
        }
        this.setFitsSystemWindows(wi0.p(2, false));
        this.c = wi0.b(3, 0);
        ColorStateList colorStateList1 = wi0.q(33) ? wi0.g(33) : null;
        int v2 = wi0.q(36) ? wi0.f(36, 0) : 0;
        if(v2 == 0) {
            if(colorStateList1 == null) {
                colorStateList1 = this.a(0x1010038);
            }
            v2 = 0;
        }
        ColorStateList colorStateList2 = wi0.q(15) ? wi0.g(15) : this.a(0x1010038);
        int v3 = wi0.q(25) ? wi0.f(25, 0) : 0;
        boolean z = wi0.p(26, true);
        if(wi0.q(14)) {
            int v4 = wi0.b(14, 0);
            if(fymt0.r != v4) {
                fymt0.r = v4;
                fymt0.w = true;
                fymt0.p();
            }
        }
        ColorStateList colorStateList3 = wi0.q(27) ? wi0.g(27) : null;
        if(v3 == 0) {
            if(colorStateList3 == null) {
                colorStateList3 = this.a(0x1010036);
            }
            v3 = 0;
        }
        Drawable drawable1 = wi0.h(11);
        if(drawable1 == null && (wi0.q(18) || wi0.q(19))) {
            drawable1 = this.b(wi0, fysf.e(this.getContext(), wi0, 20));
            ColorStateList colorStateList4 = fysf.e(context1, wi0, 17);
            if(colorStateList4 != null) {
                Drawable drawable2 = this.b(wi0, null);
                fymt0.n = new RippleDrawable(fysn.b(colorStateList4), null, drawable2);
                fymt0.p();
            }
        }
        if(wi0.q(12)) {
            fymt0.o = wi0.b(12, 0);
            fymt0.p();
        }
        if(wi0.q(28)) {
            fymt0.p = wi0.b(28, 0);
            fymt0.p();
        }
        fymt0.s = wi0.b(6, 0);
        fymt0.m();
        fymt0.t = wi0.b(5, 0);
        fymt0.m();
        fymt0.u = wi0.b(35, 0);
        fymt0.o();
        fymt0.v = wi0.b(34, 0);
        fymt0.o();
        this.q = wi0.p(37, this.q);
        this.r = wi0.p(4, this.r);
        this.s = wi0.p(0x20, this.s);
        this.t = wi0.p(9, this.t);
        int v5 = wi0.b(13, 0);
        fymt0.y = wi0.c(16, 1);
        fymt0.p();
        fymi0.b = new fypz(this);
        fymt0.d = 1;
        fymt0.c(context1, fymi0);
        if(v2 != 0) {
            fymt0.g = v2;
            fymt0.o();
        }
        fymt0.h = colorStateList1;
        fymt0.o();
        fymt0.l = colorStateList2;
        fymt0.p();
        fymt0.k(this.getOverScrollMode());
        if(v3 != 0) {
            fymt0.i = v3;
            fymt0.p();
        }
        fymt0.j = z;
        fymt0.p();
        fymt0.k = colorStateList3;
        fymt0.p();
        fymt0.m = drawable1;
        fymt0.p();
        fymt0.q = v5;
        fymt0.p();
        fymi0.g(fymt0);
        if(fymt0.a == null) {
            fymt0.a = (NavigationMenuView)fymt0.f.inflate(0x7F0E02CF, this, false);  // layout:design_navigation_menu
            fymt0.a.am(new fymr(fymt0, fymt0.a));
            if(fymt0.e == null) {
                fymt0.e = new fymm(fymt0);
                fymt0.e.B(true);
            }
            int v6 = fymt0.B;
            if(v6 != -1) {
                fymt0.a.setOverScrollMode(v6);
            }
            fymt0.b = (LinearLayout)fymt0.f.inflate(0x7F0E02CC, fymt0.a, false);  // layout:design_navigation_item_header
            fymt0.b.setImportantForAccessibility(2);
            fymt0.a.an(fymt0.e);
        }
        this.addView(fymt0.a);
        if(wi0.q(29)) {
            int v7 = wi0.f(29, 0);
            fymt0.l(true);
            if(this.d == null) {
                this.d = new mg(this.getContext());
            }
            this.d.inflate(v7, fymi0);
            fymt0.l(false);
            fymt0.f(false);
        }
        if(wi0.q(10)) {
            int v8 = wi0.f(10, 0);
            View view0 = fymt0.f.inflate(v8, fymt0.b, false);
            fymt0.b.addView(view0);
            fymt0.a.setPadding(0, 0, 0, fymt0.a.getPaddingBottom());
        }
        wi0.o();
        this.e = new fyqa(this);
        this.getViewTreeObserver().addOnGlobalLayoutListener(this.e);
    }

    @Override  // fyok
    public final void M(zu zu0) {
        this.c();
        this.y.e = zu0;
    }

    @Override  // fyok
    public final void O(zu zu0) {
        int v = ((ljm)this.c().second).a;
        fyox fyox0 = this.y;
        fyox0.g(zu0, v);
        if(this.v) {
            float f = fyox0.a(zu0.b);
            this.f = fycp.b(0, this.w, f);
            this.d(this.getWidth(), this.getHeight());
        }
    }

    private final ColorStateList a(int v) {
        TypedValue typedValue0 = new TypedValue();
        if(this.getContext().getTheme().resolveAttribute(v, typedValue0, true)) {
            ColorStateList colorStateList0 = jwe.d(this.getContext(), typedValue0.resourceId);
            if(this.getContext().getTheme().resolveAttribute(0x7F04030C, typedValue0, true)) {  // attr:colorPrimary
                int v1 = typedValue0.data;
                int v2 = colorStateList0.getDefaultColor();
                return new ColorStateList(new int[][]{NavigationView.b, NavigationView.a, NavigationView.EMPTY_STATE_SET}, new int[]{colorStateList0.getColorForState(NavigationView.b, v2), v1, v2});
            }
        }
        return null;
    }

    private final Drawable b(wi wi0, ColorStateList colorStateList0) {
        int v = wi0.f(18, 0);
        int v1 = wi0.f(19, 0);
        fyuj fyuj0 = new fyuj(new fyut(fyut.h(this.getContext(), v, v1)));
        fyuj0.aa(colorStateList0);
        return new InsetDrawable(fyuj0, wi0.b(23, 0), wi0.b(24, 0), wi0.b(22, 0), wi0.b(21, 0));
    }

    private final Pair c() {
        ViewParent viewParent0 = this.getParent();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if((viewParent0 instanceof DrawerLayout) && (viewGroup$LayoutParams0 instanceof ljm)) {
            return new Pair(((DrawerLayout)viewParent0), ((ljm)viewGroup$LayoutParams0));
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    private final void d(int v, int v1) {
        if((this.getParent() instanceof DrawerLayout) && (this.getLayoutParams() instanceof ljm) && (this.f > 0 || this.v) && (this.getBackground() instanceof fyuj)) {
            int v2 = Gravity.getAbsoluteGravity(((ljm)this.getLayoutParams()).a, this.getLayoutDirection());
            fyuj fyuj0 = (fyuj)this.getBackground();
            fyus fyus0 = new fyus(fyuj0.S());
            fyus0.i(((float)this.f));
            if(v2 == 3) {
                fyus0.f(0.0f);
                fyus0.b(0.0f);
            }
            else {
                fyus0.h(0.0f);
                fyus0.d(0.0f);
            }
            fyut fyut0 = new fyut(fyus0);
            fyuj0.mu(fyut0);
            this.x.b = fyut0;
            this.x.b();
            this.x.a(this);
            this.x.c = new RectF(0.0f, 0.0f, ((float)v), ((float)v1));
            this.x.b();
            this.x.a(this);
            this.x.a = true;
            this.x.a(this);
        }
    }

    @Override  // android.view.ViewGroup
    protected final void dispatchDraw(Canvas canvas0) {
        fyvf fyvf0 = this.x;
        if(fyvf0.c()) {
            Path path0 = fyvf0.d;
            if(!path0.isEmpty()) {
                canvas0.save();
                canvas0.clipPath(path0);
                super.dispatchDraw(canvas0);
                canvas0.restore();
                return;
            }
        }
        super.dispatchDraw(canvas0);
    }

    @Override  // fyna
    protected final void g(kgq kgq0) {
        fymt fymt0 = this.n;
        int v = kgq0.d();
        if(fymt0.z != v) {
            fymt0.z = v;
            fymt0.q();
        }
        fymt0.a.setPadding(0, fymt0.a.getPaddingTop(), 0, kgq0.a());
        kfe.d(fymt0.b, kgq0);
    }

    public final void h() {
        if(this.v && this.f != 0) {
            this.f = 0;
            this.d(this.getWidth(), this.getHeight());
        }
    }

    public final void i(int v) {
        MenuItem menuItem0 = this.m.findItem(v);
        if(menuItem0 != null) {
            this.n.e.n(((nd)menuItem0));
        }
    }

    @Override  // fyna
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fyuk.c(this);
        ViewParent viewParent0 = this.getParent();
        if((viewParent0 instanceof DrawerLayout)) {
            fyop fyop0 = this.u;
            if(fyop0.a != null) {
                ((DrawerLayout)viewParent0).w(this.z);
                ((DrawerLayout)viewParent0).v(this.z);
                if(((DrawerLayout)viewParent0).q(this)) {
                    fyop0.b();
                }
            }
        }
    }

    @Override  // fyna
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getViewTreeObserver().removeOnGlobalLayoutListener(this.e);
        ViewParent viewParent0 = this.getParent();
        if((viewParent0 instanceof DrawerLayout)) {
            ((DrawerLayout)viewParent0).w(this.z);
        }
        this.u.c();
    }

    @Override  // android.widget.FrameLayout
    protected final void onMeasure(int v, int v1) {
        switch(View.MeasureSpec.getMode(v)) {
            case 0x80000000: {
                v = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(v), this.c), 0x40000000);
                break;
            }
            case 0: {
                v = View.MeasureSpec.makeMeasureSpec(this.c, 0x40000000);
            }
        }
        super.onMeasure(v, v1);
    }

    @Override  // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof NavigationView.SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((NavigationView.SavedState)parcelable0).d);
        this.m.j(((NavigationView.SavedState)parcelable0).a);
    }

    @Override  // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new NavigationView.SavedState(super.onSaveInstanceState());
        parcelable0.a = new Bundle();
        this.m.k(parcelable0.a);
        return parcelable0;
    }

    @Override  // android.view.View
    protected final void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.d(v, v1);
    }

    @Override  // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        fyuk.b(this, f);
    }

    @Override  // android.view.View
    public final void setOverScrollMode(int v) {
        super.setOverScrollMode(v);
        fymt fymt0 = this.n;
        if(fymt0 != null) {
            fymt0.k(v);
        }
    }

    @Override  // fyok
    public final void x() {
        this.c();
        this.y.e();
        this.h();
    }

    @Override  // fyok
    public final void z() {
        Pair pair0 = this.c();
        DrawerLayout drawerLayout0 = (DrawerLayout)pair0.first;
        fyox fyox0 = this.y;
        zu zu0 = fyox0.c();
        if(zu0 != null && Build.VERSION.SDK_INT >= 34) {
            fyox0.f(zu0, ((ljm)pair0.second).a, new fypc(drawerLayout0, this), new fypb(drawerLayout0));
            return;
        }
        drawerLayout0.g(this);
    }
}


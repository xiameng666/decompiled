package com.google.android.material.navigationrail;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ScrollView;
import fycp;
import fynk;
import fynt;
import fype;
import fypk;
import fypn;
import fypp;
import fypw;
import fyqf;
import fyqg;
import fyqi;
import fyqj;
import fyqk;
import fysf;
import oyw;
import ozd;
import pao;
import pat;
import wi;

public class NavigationRailView extends fypw {
    public Boolean e;
    public Boolean f;
    public Boolean g;
    private static final TimeInterpolator h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;
    private boolean n;
    private View o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private fyqg y;

    static {
        NavigationRailView.h = new PathInterpolator(0.38f, 1.21f, 0.22f, 1.0f);
    }

    public NavigationRailView(Context context0) {
        this(context0, null);
    }

    public NavigationRailView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F040913);  // attr:navigationRailStyle
    }

    public NavigationRailView(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0x7F1614C0);  // style:Widget.MaterialComponents.NavigationRailView
    }

    public NavigationRailView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.e = null;
        this.f = null;
        this.g = null;
        this.p = false;
        this.r = -1;
        this.s = 0;
        this.t = 49;
        Context context1 = this.getContext();
        this.x = this.getContext().getResources().getDimensionPixelSize(0x7F070B17);  // dimen:m3_navigation_rail_expanded_item_spacing
        this.w = 0x800013;
        this.v = 1;
        wi wi0 = fynk.b(context1, attributeSet0, fyqk.a, v, v1, new int[0]);
        this.i = wi0.b(1, this.getResources().getDimensionPixelSize(0x7F070CAE));  // dimen:mtrl_navigation_rail_margin
        this.j = wi0.b(7, this.getResources().getDimensionPixelSize(0x7F070CAE));  // dimen:mtrl_navigation_rail_margin
        this.m = wi0.p(14, false);
        boolean z = wi0.p(17, false);
        if(this.n != z) {
            this.n = z;
            fyqi fyqi0 = this.k();
            if(fyqi0.N != z) {
                fyqi0.N = z;
                fypn[] arr_fypn = fyqi0.e;
                if(arr_fypn != null) {
                    for(int v3 = 0; v3 < arr_fypn.length; ++v3) {
                        fypn fypn0 = arr_fypn[v3];
                        if((fypn0 instanceof fype)) {
                            ((fype)fypn0).b(z);
                        }
                    }
                }
            }
        }
        fyqg fyqg0 = new fyqg(this.getContext());
        this.y = fyqg0;
        fyqg0.a = this.i;
        fyqg0.b = this.m;
        fyqg0.setClipChildren(false);
        this.y.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        this.b.setLayoutParams(frameLayout$LayoutParams0);
        this.y.addView(this.b);
        if(this.m) {
            ScrollView scrollView0 = new ScrollView(this.getContext());
            scrollView0.setVerticalScrollBarEnabled(false);
            scrollView0.addView(this.y);
            scrollView0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.addView(scrollView0);
        }
        else {
            this.addView(this.y);
        }
        int v4 = wi0.f(6, 0);
        if(v4 != 0) {
            View view0 = LayoutInflater.from(this.getContext()).inflate(v4, this, false);
            View view1 = this.o;
            if(view1 != null) {
                this.y.removeView(view1);
            }
            this.o = view0;
            FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-2, -2);
            frameLayout$LayoutParams1.gravity = 49;
            frameLayout$LayoutParams1.bottomMargin = this.j;
            this.y.addView(view0, 0, frameLayout$LayoutParams1);
        }
        int v5 = wi0.c(10, 49);
        fyqi fyqi1 = this.k();
        if(fyqi1.a.gravity != v5) {
            fyqi1.a.gravity = v5;
            fyqi1.setLayoutParams(fyqi1.a);
        }
        int v6 = wi0.b(8, -1);
        int v7 = wi0.b(8, -1);
        if(wi0.q(0)) {
            v6 = wi0.b(0, -1);
        }
        if(wi0.q(3)) {
            v7 = wi0.b(3, -1);
        }
        this.r = v6;
        if(!this.p) {
            ((fyqi)this.b).k(v6);
        }
        this.u = v7;
        if(this.p) {
            ((fyqi)this.b).k(v7);
        }
        this.k = wi0.b(5, context1.getResources().getDimensionPixelSize(0x7F070B26));  // dimen:m3_navigation_rail_min_expanded_width
        this.l = wi0.b(4, context1.getResources().getDimensionPixelSize(0x7F070B25));  // dimen:m3_navigation_rail_max_expanded_width
        if(wi0.q(13)) {
            this.e = Boolean.valueOf(wi0.p(13, false));
        }
        if(wi0.q(11)) {
            this.f = Boolean.valueOf(wi0.p(11, false));
        }
        if(wi0.q(12)) {
            this.g = Boolean.valueOf(wi0.p(12, false));
        }
        int v8 = this.getResources().getDimensionPixelOffset(0x7F070B23);  // dimen:m3_navigation_rail_item_padding_top_with_large_font
        int v9 = this.getResources().getDimensionPixelOffset(0x7F070B21);  // dimen:m3_navigation_rail_item_padding_bottom_with_large_font
        float f = fycp.a(0.0f, 1.0f, 0.3f, 1.0f, fysf.a(context1) - 1.0f);
        float f1 = (float)fycp.b(this.b.s, v9, f);
        this.g(Math.round(fycp.b(this.b.r, v8, f)));
        this.f(Math.round(f1));
        int v10 = wi0.b(9, 0);
        this.q = v10;
        if(!this.p) {
            this.k().l(v10);
        }
        boolean z1 = wi0.p(2, false);
        if(this.p != z1) {
            if(this.isLaidOut()) {
                oyw oyw0 = new oyw();
                oyw0.b = 500L;
                oyw0.c = NavigationRailView.h;
                ozd ozd0 = new ozd();
                ozd0.b = 100L;
                ozd ozd1 = new ozd();
                ozd1.b = 100L;
                fyqf fyqf0 = new fyqf();
                ozd ozd2 = new ozd();
                ozd2.b = 100L;
                int v11 = this.k().getChildCount();
                for(int v12 = 0; v12 < v11; ++v12) {
                    View view2 = this.k().getChildAt(v12);
                    if((view2 instanceof fypk)) {
                        oyw0.L(((fypk)view2).f);
                        oyw0.L(((fypk)view2).g);
                        if(this.p) {
                            ozd1.K(((fypk)view2).g);
                            ozd0.K(((fypk)view2).f);
                        }
                        else {
                            ozd1.K(((fypk)view2).f);
                            ozd0.K(((fypk)view2).g);
                        }
                        fyqf0.K(((fypk)view2).g);
                    }
                    ozd2.K(view2);
                }
                pat pat0 = new pat();
                pat0.U(0);
                pat0.h(oyw0);
                pat0.h(ozd0);
                pat0.h(fyqf0);
                if(!this.p) {
                    pat0.h(ozd2);
                }
                pat pat1 = new pat();
                pat1.U(0);
                pat1.h(ozd1);
                if(this.p) {
                    pat1.h(ozd2);
                }
                pat pat2 = new pat();
                pat2.U(1);
                pat2.h(pat1);
                pat2.h(pat0);
                pao.b(((ViewGroup)this.getParent()), pat2);
            }
            this.p = z1;
            int v13 = 0;
            int v14 = this.q;
            int v15 = this.r;
            int v16 = 49;
            if(z1) {
                v13 = 1;
                v14 = this.x;
                v15 = this.u;
                v16 = 0x800013;
            }
            this.k().h(v16);
            super.e(v13);
            this.k().l(v14);
            this.k().k(v15);
            fyqi fyqi2 = this.k();
            fyqi2.L = z1;
            fypn[] arr_fypn1 = fyqi2.e;
            if(arr_fypn1 != null) {
                for(int v2 = 0; v2 < arr_fypn1.length; ++v2) {
                    arr_fypn1[v2].mY(z1);
                }
            }
        }
        wi0.o();
        fynt.i(this, new fyqj(this));
    }

    @Override  // fypw
    public final int a() {
        return 0x7FFFFFFF;
    }

    @Override  // fypw
    protected final fypp b(Context context0) {
        return new fyqi(context0);
    }

    @Override  // fypw
    public final int c() {
        return 7;
    }

    @Override  // fypw
    public final void d(int v) {
        this.t = v;
        this.w = v;
        super.d(v);
    }

    @Override  // fypw
    public final void e(int v) {
        this.s = v;
        this.v = v;
        super.e(v);
    }

    @Override  // fypw
    protected final boolean h() {
        return true;
    }

    @Override  // fypw
    public final boolean i() {
        return true;
    }

    public final boolean j(Boolean boolean0) {
        return boolean0 == null ? this.getFitsSystemWindows() : boolean0.booleanValue();
    }

    private final fyqi k() {
        return (fyqi)this.b;
    }

    @Override  // android.widget.FrameLayout
    protected final void onMeasure(int v, int v1) {
        int v4;
        int v2 = this.getSuggestedMinimumWidth();
        if(View.MeasureSpec.getMode(v) != 0x40000000 && v2 > 0) {
            int v3 = this.getPaddingLeft() + this.getPaddingRight();
            v4 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(v), v2 + v3), 0x40000000);
        }
        else {
            v4 = v;
        }
        if(this.p) {
            this.measureChild(this.k(), v, v1);
            View view0 = this.o;
            if(view0 != null) {
                this.measureChild(view0, v, v1);
            }
            int v5 = this.k().getChildCount();
            int v8 = 0;
            for(int v7 = 0; v7 < v5; ++v7) {
                View view1 = this.k().getChildAt(v7);
                if(view1.getVisibility() != 8 && !(view1 instanceof fype)) {
                    v8 = Math.max(v8, view1.getMeasuredWidth());
                }
            }
            int v9 = View.MeasureSpec.getSize(v);
            int v10 = Math.min(this.k, v9);
            if(View.MeasureSpec.getMode(v) != 0x40000000) {
                int v11 = Math.max(v8, v10);
                View view2 = this.o;
                if(view2 != null) {
                    v11 = Math.max(v11, view2.getMeasuredWidth());
                }
                v = View.MeasureSpec.makeMeasureSpec(Math.max(this.getSuggestedMinimumWidth(), Math.min(v11, this.l)), 0x40000000);
            }
            if(this.b.y == -1) {
                fyqi fyqi0 = this.k();
                int v12 = View.MeasureSpec.getSize(v);
                fypn[] arr_fypn = fyqi0.e;
                if(arr_fypn != null) {
                    for(int v6 = 0; v6 < arr_fypn.length; ++v6) {
                        fypn fypn0 = arr_fypn[v6];
                        if((fypn0 instanceof fypk)) {
                            ((fypk)fypn0).N(v12);
                        }
                    }
                }
            }
            v4 = v;
        }
        super.onMeasure(v4, v1);
        if(this.y.getMeasuredHeight() < this.getMeasuredHeight()) {
            this.measureChild(this.y, v4, View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0x40000000));
        }
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        super.onTouchEvent(motionEvent0);
        return true;
    }
}


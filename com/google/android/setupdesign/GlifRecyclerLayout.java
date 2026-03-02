package com.google.android.setupdesign;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ScrollView;
import gaec;
import gafq;
import gagr;
import gags;
import gaih;
import gaik;
import gaiw;
import gajt;
import tk;
import uc;

public class GlifRecyclerLayout extends GlifLayout {
    public gaih a;
    private uc b;
    private ViewTreeObserver.OnScrollChangedListener c;

    public GlifRecyclerLayout(Context context0) {
        this(context0, 0, 0);
    }

    public GlifRecyclerLayout(Context context0, int v) {
        this(context0, v, 0);
    }

    public GlifRecyclerLayout(Context context0, int v, int v1) {
        super(context0, v, v1);
        this.h(null, 0);
    }

    public GlifRecyclerLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.h(attributeSet0, 0);
    }

    public GlifRecyclerLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.h(attributeSet0, v);
    }

    @Override  // com.google.android.setupdesign.GlifLayout
    protected final void G() {
        RecyclerView recyclerView0 = this.d();
        if(recyclerView0 != null) {
            gagr gagr0 = new gagr(this);
            this.b = gagr0;
            recyclerView0.D(gagr0);
        }
        ScrollView scrollView0 = this.A();
        if(scrollView0 != null) {
            this.c = new gags(this);
            scrollView0.getViewTreeObserver().addOnScrollChangedListener(this.c);
        }
    }

    public final tk c() {
        tk tk0 = this.a.a.m;
        return (tk0 instanceof gajt) ? ((gajt)tk0).a : tk0;
    }

    public final RecyclerView d() {
        return this.a.a;
    }

    public final void e(tk tk0) {
        this.a.c(tk0);
    }

    public static final boolean g(ScrollView scrollView0, RecyclerView recyclerView0) {
        return scrollView0 != null || recyclerView0 != null ? GlifRecyclerLayout.U(scrollView0) || recyclerView0.canScrollVertically(1) : false;
    }

    private final void h(AttributeSet attributeSet0, int v) {
        if(this.isInEditMode()) {
            return;
        }
        this.a.b(attributeSet0, v);
        this.v(gaih.class, this.a);
        gaiw gaiw0 = (gaiw)this.t(gaiw.class);
        gaiw0.c = new gaik(gaiw0, this.d());
        View view0 = this.r(0x7F0B2163);  // id:sud_landscape_content_area
        if(view0 != null) {
            this.P(view0);
        }
        this.Q();
        if(gaec.t(this.getContext())) {
            this.G();
        }
        this.F();
    }

    @Override  // com.google.android.setupdesign.GlifLayout
    protected View l(LayoutInflater layoutInflater0, int v) {
        if(v == 0) {
            if(GlifRecyclerLayout.V(this.getContext())) {
                return this.R() ? super.l(layoutInflater0, 0x7F0E0A4C) : super.l(layoutInflater0, 0x7F0E0A88);  // layout:sud_glif_expressive_recycler_embedded_template
            }
            if(this.R()) {
                return super.l(layoutInflater0, 0x7F0E0A4D);  // layout:sud_glif_expressive_recycler_template
            }
            if(gafq.a(this.getContext())) {
                return super.l(layoutInflater0, 0x7F0E0A92);  // layout:sud_glif_recycler_template_two_pane
            }
            v = 0x7F0E0A8C;  // layout:sud_glif_recycler_template
        }
        return super.l(layoutInflater0, v);
    }

    @Override  // com.google.android.setupdesign.GlifLayout
    protected ViewGroup m(int v) {
        if(v == 0) {
            v = 0x7F0B2184;  // id:sud_recycler_view
        }
        return super.m(v);
    }

    @Override  // com.google.android.setupdesign.GlifLayout
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ScrollView scrollView0 = this.A();
        if(scrollView0 != null && scrollView0.getViewTreeObserver() != null) {
            scrollView0.getViewTreeObserver().removeOnScrollChangedListener(this.c);
        }
        RecyclerView recyclerView0 = this.d();
        if(recyclerView0 != null) {
            uc uc0 = this.b;
            if(uc0 != null) {
                recyclerView0.aj(uc0);
            }
        }
    }

    @Override  // android.widget.FrameLayout
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        if(gaec.t(this.getContext())) {
            this.H(((boolean)(GlifRecyclerLayout.g(this.A(), this.d()) ^ 1)));
        }
        super.onLayout(z, v, v1, v2, v3);
        this.a.a();
    }

    @Override  // com.google.android.setupcompat.internal.TemplateLayout
    public final View r(int v) {
        View view0 = this.a.b;
        if(view0 != null) {
            View view1 = view0.findViewById(v);
            return view1 == null ? super.findViewById(v) : view1;
        }
        return super.findViewById(v);
    }

    @Override  // com.google.android.setupcompat.internal.TemplateLayout
    protected void u() {
        View view0 = this.findViewById(0x7F0B2184);  // id:sud_recycler_view
        if(!(view0 instanceof RecyclerView)) {
            throw new IllegalStateException("GlifRecyclerLayout should use a template with recycler view");
        }
        this.a = new gaih(this, ((RecyclerView)view0));
    }
}


package com.google.android.setupdesign;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import gaec;
import gafq;
import gagi;
import gagj;
import gaic;
import gaid;
import gaiw;

public class GlifListLayout extends GlifLayout {
    public gaic a;
    private ViewTreeObserver.OnScrollChangedListener b;
    private AbsListView.OnScrollListener c;

    public GlifListLayout(Context context0) {
        this(context0, 0, 0);
    }

    public GlifListLayout(Context context0, int v) {
        this(context0, v, 0);
    }

    public GlifListLayout(Context context0, int v, int v1) {
        super(context0, v, v1);
        this.g(null, 0);
    }

    public GlifListLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.g(attributeSet0, 0);
    }

    public GlifListLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.g(attributeSet0, v);
    }

    @Override  // com.google.android.setupdesign.GlifLayout
    protected final void G() {
        gaic gaic0 = this.a;
        if(gaic0 != null) {
            ListView listView0 = gaic0.a();
            gagi gagi0 = new gagi(this);
            this.c = gagi0;
            listView0.setOnScrollListener(gagi0);
        }
        ScrollView scrollView0 = this.A();
        if(scrollView0 != null) {
            this.b = new gagj(this);
            scrollView0.getViewTreeObserver().addOnScrollChangedListener(this.b);
        }
    }

    public final ListView c() {
        return this.a.a();
    }

    public final void d(ListAdapter listAdapter0) {
        this.a.c(listAdapter0);
    }

    public static final boolean e(ScrollView scrollView0, ListView listView0) {
        return scrollView0 != null || listView0 != null ? GlifListLayout.U(scrollView0) || listView0.canScrollVertically(1) : false;
    }

    private final void g(AttributeSet attributeSet0, int v) {
        if(this.isInEditMode()) {
            return;
        }
        gaic gaic0 = new gaic(this, attributeSet0, v);
        this.a = gaic0;
        this.v(gaic.class, gaic0);
        gaiw gaiw0 = (gaiw)this.t(gaiw.class);
        gaiw0.c = new gaid(gaiw0, this.c());
        View view0 = this.r(0x7F0B2163);  // id:sud_landscape_content_area
        if(view0 != null) {
            this.P(view0);
        }
        this.Q();
        this.F();
    }

    @Override  // com.google.android.setupdesign.GlifLayout
    protected final View l(LayoutInflater layoutInflater0, int v) {
        if(v == 0) {
            if(GlifListLayout.V(this.getContext())) {
                return this.R() ? super.l(layoutInflater0, 0x7F0E0A36) : super.l(layoutInflater0, 0x7F0E0A65);  // layout:sud_glif_expressive_list_embedded_template
            }
            if(this.R()) {
                return super.l(layoutInflater0, 0x7F0E0A37);  // layout:sud_glif_expressive_list_template
            }
            if(gafq.a(this.getContext())) {
                return super.l(layoutInflater0, 0x7F0E0A6F);  // layout:sud_glif_list_template_two_pane
            }
            v = 0x7F0E0A69;  // layout:sud_glif_list_template
        }
        return super.l(layoutInflater0, v);
    }

    @Override  // com.google.android.setupdesign.GlifLayout
    protected final ViewGroup m(int v) {
        if(v == 0) {
            v = 0x102000A;
        }
        return super.m(v);
    }

    @Override  // com.google.android.setupdesign.GlifLayout
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ScrollView scrollView0 = this.A();
        if(scrollView0 != null && scrollView0.getViewTreeObserver() != null) {
            scrollView0.getViewTreeObserver().removeOnScrollChangedListener(this.b);
        }
        ListView listView0 = this.a.a();
        if(listView0 != null) {
            listView0.setOnScrollListener(null);
        }
    }

    @Override  // android.widget.FrameLayout
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.a.b();
        if(gaec.t(this.getContext())) {
            this.G();
        }
    }
}


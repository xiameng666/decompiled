package com.google.android.gms.wallet.ui.component.lineitem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import fbzf;
import fbzg;
import fcca;
import gfcf;
import gfcg;
import java.util.ArrayList;

public class LineItemContainerView extends FrameLayout implements fbzf {
    public ArrayList a;
    public boolean b;
    public gfcg c;
    public fcca d;
    private LinearLayout e;

    public LineItemContainerView(Context context0) {
        super(context0);
        this.c(context0);
    }

    public LineItemContainerView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.c(context0);
    }

    public LineItemContainerView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.c(context0);
    }

    public LineItemContainerView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.c(context0);
    }

    @Override  // fbzf
    public final void a(Object object0) {
        this.d(((gfcg)object0));
    }

    @Override  // fbzf
    public final boolean b(Object object0) {
        return ((gfcg)object0) != null;
    }

    protected final void c(Context context0) {
        this.e = (LinearLayout)LayoutInflater.from(context0).inflate(0x7F0E0E49, this, true).findViewById(0x7F0B17FD);  // layout:wallet_view_line_item_container
    }

    public final void d(gfcg gfcg0) {
        this.c = gfcg0;
        this.f(gfcg0, this.b);
    }

    public final void e() {
        if(this.a != null) {
            for(int v = 0; v < this.a.size(); ++v) {
                LineItemBundleView lineItemBundleView0 = (LineItemBundleView)this.a.get(v);
                lineItemBundleView0.l = this.d;
                lineItemBundleView0.j();
            }
        }
    }

    public final void f(gfcg gfcg0, boolean z) {
        ArrayList arrayList0 = fbzg.a(this.getContext(), this.e, gfcg0.c, LineItemBundleView.class);
        this.a = arrayList0;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                LineItemBundleView lineItemBundleView0 = (LineItemBundleView)this.a.get(v1);
                lineItemBundleView0.h = z;
                gfcf gfcf0 = lineItemBundleView0.g;
                if(gfcf0 != null) {
                    lineItemBundleView0.g(gfcf0, z);
                }
            }
        }
        this.e();
    }
}


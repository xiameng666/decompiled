package com.google.android.gms.growth.uiflow.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bwbh;
import bwcd;
import bwdm;
import com.google.android.gms.growth.ui.widget.pageindicator.PageIndicator;
import fhvw;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PagerControls extends RelativeLayout implements bwcd {
    public PageIndicator a;
    public View b;
    public View c;
    public boolean d;
    public fhvw e;
    public TextView f;
    public String g;
    public String h;

    public PagerControls(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public PagerControls(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public PagerControls(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
    }

    public PagerControls(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // bwcd
    public final void g(bwdm bwdm0) {
        boolean z = bwdm0.g();
        this.d = z;
        if(z) {
            RelativeLayout.inflate(this.getContext(), 0x7F0E064A, this);  // layout:pager_controls_bc25
        }
        else {
            RelativeLayout.inflate(this.getContext(), 0x7F0E0649, this);  // layout:pager_controls
            this.a = (PageIndicator)this.findViewById(0x7F0B1BAF);  // id:pager_controls_indicator
            this.f = (TextView)this.findViewById(0x7F0B1BB1);  // id:pager_controls_next_text
        }
        View view0 = this.findViewById(0x7F0B1BB0);  // id:pager_controls_next
        this.b = view0;
        View view1 = null;
        if(view0 == null) {
            ibuq.j("nextButton");
            view0 = null;
        }
        bwbh.a(view0);
        View view2 = this.findViewById(0x7F0B1BB2);  // id:pager_controls_prev
        this.c = view2;
        if(view2 == null) {
            ibuq.j("prevButton");
        }
        else {
            view1 = view2;
        }
        bwbh.a(view1);
    }
}


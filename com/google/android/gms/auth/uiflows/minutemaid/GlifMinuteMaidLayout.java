package com.google.android.gms.auth.uiflows.minutemaid;

import ajce;
import amgk;
import amgl;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import bbnp;
import bbqs;
import com.google.android.setupdesign.GlifLayout;
import gaec;
import gaff;
import gafg;
import gafh;
import gahw;
import hpcm;
import hpet;

public class GlifMinuteMaidLayout extends GlifLayout {
    public Context a;
    public gahw b;
    public gaff c;
    public gafh d;
    public gafh e;
    public static final int f;

    public GlifMinuteMaidLayout(Context context0) {
        this(context0, null);
    }

    public GlifMinuteMaidLayout(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public GlifMinuteMaidLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = context0;
        if(hpet.c()) {
            amgl amgl0 = new amgl(this, attributeSet0, v);
            this.v(gaff.class, amgl0);
        }
        this.b = (gahw)this.t(gahw.class);
        this.c = (gaff)this.t(gaff.class);
        if(hpet.a.b().c() && bbqs.a(context0) && (!hpet.a.b().b() || !gaec.t(context0))) {
            this.c.v(false);
        }
        else {
            this.c.v(true);
        }
        this.N(false);
        if(this.gU() && (bbnp.n(this.a) || bbnp.k(this.a))) {
            GlifMinuteMaidLayout.d(this.r(0x7F0B2167));  // id:sud_layout_content
        }
        if(hpcm.a.c().d()) {
            View view0 = this.r(0x7F0B2163);  // id:sud_landscape_content_area
            if(view0 != null) {
                view0.setPadding(0, 0, 0, 0);
            }
        }
        else {
            GlifMinuteMaidLayout.d(this.r(0x7F0B2163));  // id:sud_landscape_content_area
        }
        if(this.gU()) {
            View view1 = this.r(0x7F0B2167);  // id:sud_layout_content
            if(view1 != null && (view1.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view1.getLayoutParams();
                viewGroup$MarginLayoutParams0.setMargins(0, viewGroup$MarginLayoutParams0.topMargin, 0, viewGroup$MarginLayoutParams0.bottomMargin);
            }
        }
    }

    public final void a(boolean z) {
        gafh gafh0 = this.d;
        if(gafh0 != null) {
            gafh0.c(z);
        }
    }

    public final void c(String s, int v, ajce ajce0) {
        if(TextUtils.isEmpty(s)) {
            gafh gafh0 = this.d;
            if(gafh0 != null) {
                gafh0.f(8);
            }
            return;
        }
        gafg gafg0 = new gafg(this.a);
        gafg0.c = v;
        gafg0.d = 0x7F1608FE;  // style:SudGlifButton.Primary
        gafg0.a = s;
        gafh gafh1 = gafg0.a();
        this.d = gafh1;
        gafh1.f(0);
        this.c.c(this.d);
        gafh gafh2 = this.d;
        gafh2.f = new amgk(ajce0);
    }

    private static final void d(View view0) {
        if(view0 != null) {
            view0.setPadding(view0.getPaddingLeft(), 0, view0.getPaddingRight(), view0.getPaddingBottom());
        }
    }
}


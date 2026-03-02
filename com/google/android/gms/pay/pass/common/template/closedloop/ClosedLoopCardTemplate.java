package com.google.android.gms.pay.pass.common.template.closedloop;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import bbcu;
import bboh;
import dskk;
import dskr;
import dsme;
import dsmx;
import dsmz;
import dsno;
import dsok;
import fshg;
import gfqx;
import gfsx;
import guag;
import gubi;
import guck;
import gucl;
import guez;
import gumv;
import guod;
import guoe;
import hfuo;

public final class ClosedLoopCardTemplate extends dskr {
    public static final bboh a;
    public CardHeaderTemplate b;

    static {
        ClosedLoopCardTemplate.a = bboh.b("Pay", bbcu.cZ);
    }

    public ClosedLoopCardTemplate(Context context0) {
        this(context0, null);
    }

    public ClosedLoopCardTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ClosedLoopCardTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.b = (CardHeaderTemplate)this.findViewById(0x7F0B01E0);  // id:ClosedLoopCardHeaderTemplate
    }

    @Override  // dskr
    protected final int a() {
        return 0x7F0E0682;  // layout:pay_closed_loop_card_template
    }

    @Override  // dskr
    protected final View b() {
        return this.findViewById(0x7F0B0279);  // id:DetailCardContents
    }

    @Override  // dskr
    protected final ImageView c() {
        return (ImageView)this.findViewById(0x7F0B01D8);  // id:ClosedLoopBackGroundImageView
    }

    @Override  // dskr
    protected final LinearLayout d() {
        return (LinearLayout)this.findViewById(0x7F0B01F7);  // id:ClosedLoopRowTemplatesContainer
    }

    @Override  // dskr
    public final CardView e() {
        return (CardView)this.findViewById(0x7F0B01DA);  // id:ClosedLoopCard
    }

    @Override  // dskr
    protected final dsme f() {
        return (dsme)this.findViewById(0x7F0B01E0);  // id:ClosedLoopCardHeaderTemplate
    }

    @Override  // dskr
    protected final dsmx g(Context context0) {
        return new dsno(context0);
    }

    @Override  // dskr
    protected final dsmz h(Context context0) {
        return null;
    }

    @Override  // dskr
    public final void o(gumv gumv0, gubi gubi0, fshg fshg0, dskk dskk0) {
        if((gumv0.b & 1) == 0) {
            this.y();
        }
        this.q(gumv0, gubi0, fshg0, dskk0);
        this.j();
    }

    @Override  // dskr
    public final void p(gucl gucl0, gubi gubi0, fshg fshg0, dskk dskk0) {
        if((gucl0.b & 1) == 0) {
            this.y();
        }
        super.p(gucl0, gubi0, fshg0, dskk0);
    }

    public final ImageView u() {
        return (ImageView)this.findViewById(0x7F0B01DB);  // id:ClosedLoopCardHeaderLogo
    }

    public final void v(int v) {
        this.b.n(v, false);
    }

    public final void w(guoe guoe0, gubi gubi0, fshg fshg0, dskk dskk0) {
        gfsx gfsx1;
        if((guoe0.b & 1) == 0) {
            this.y();
        }
        gfsx gfsx0 = (guoe0.b & 1) == 0 ? gfqx.a : gfsx.m((guoe0.c == null ? guag.a : guoe0.c));
        hfuo hfuo0 = guoe0.d;
        if((guoe0.b & 2) == 0) {
            gfsx1 = gfqx.a;
        }
        else {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)guck.a).v_newBuilder();
            String s = (guoe0.e == null ? guod.a : guoe0.e).c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            guck guck0 = (guck)hftp0.b_message;
            s.getClass();
            guck0.c = s;
            guod guod0 = guoe0.e == null ? guod.a : guoe0.e;
            guez guez0 = guod0.d == null ? guez.a : guod0.d;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            guck guck1 = (guck)hftp0.b_message;
            guez0.getClass();
            guck1.d = guez0;
            guck1.b |= 1;
            gfsx1 = gfsx.m(((guck)hftp0.N_build()));
        }
        this.s(gfsx0, hfuo0, gfsx1, gfqx.a, gubi0, fshg0, dskk0, false, gfqx.a);
    }

    public final void x(gucl gucl0, gubi gubi0, fshg fshg0, dskk dskk0, gfsx gfsx0, boolean z) {
        if((gucl0.b & 1) == 0) {
            this.y();
        }
        gfsx gfsx1 = (gucl0.b & 1) == 0 ? gfqx.a : gfsx.m((gucl0.c == null ? guag.a : gucl0.c));
        hfuo hfuo0 = gucl0.d;
        gfsx gfsx2 = (gucl0.b & 2) == 0 ? gfqx.a : gfsx.m((gucl0.e == null ? guck.a : gucl0.e));
        gfsx gfsx3 = z ? gfsx.m(Long.valueOf(dsok.a())) : gfqx.a;
        this.s(gfsx1, hfuo0, gfsx2, gfsx0, gubi0, fshg0, dskk0, z, gfsx3);
    }

    private final void y() {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, 0, 0.0f);
        this.findViewById(0x7F0B01F3).setLayoutParams(linearLayout$LayoutParams0);  // id:ClosedLoopHeaderFrameLayout
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, 0, 1.0f);
        this.g.setLayoutParams(linearLayout$LayoutParams1);
    }
}


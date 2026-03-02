package com.google.android.gms.pay.pass.common.template.closedloop;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
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
import gged_interceptors;
import ggna;
import ggtj;
import guag;
import gubi;
import guck;
import gucl;
import gucn;
import gucv;
import guez;
import gumv;

public final class HotelCardTemplate extends dskr {
    private static final bboh a;

    static {
        HotelCardTemplate.a = bboh.b("Pay", bbcu.cZ);
    }

    public HotelCardTemplate(Context context0) {
        this(context0, null);
    }

    public HotelCardTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public HotelCardTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // dskr
    protected final int a() {
        return 0x7F0E0D61;  // layout:wallet_hotel_card_template
    }

    @Override  // dskr
    protected final View b() {
        return this.findViewById(0x7F0B0279);  // id:DetailCardContents
    }

    @Override  // dskr
    protected final ImageView c() {
        return (ImageView)this.findViewById(0x7F0B048A);  // id:HotelBackGroundImageView
    }

    @Override  // dskr
    protected final LinearLayout d() {
        return (LinearLayout)this.findViewById(0x7F0B0491);  // id:HotelRowTemplatesContainer
    }

    @Override  // dskr
    public final CardView e() {
        return (CardView)this.findViewById(0x7F0B048B);  // id:HotelCard
    }

    @Override  // dskr
    protected final dsme f() {
        return (dsme)this.findViewById(0x7F0B048C);  // id:HotelCardHeaderTemplate
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
        gfsx gfsx0;
        gfqx gfqx0 = gfqx.a;
        gged_interceptors gged0 = ggna.a;
        if((gumv0.b & 2) == 0) {
            gfsx0 = gfqx0;
        }
        else {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)guck.a).v_newBuilder();
            guez guez0 = gumv0.e == null ? guez.a : gumv0.e;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            guck guck0 = (guck)hftp0.b_message;
            guez0.getClass();
            guck0.d = guez0;
            guck0.b |= 1;
            gfsx0 = gfsx.m(((guck)hftp0.N_build()));
        }
        this.s(gfqx0, gged0, gfsx0, gfqx0, gubi0, fshg0, dskk0, false, gfqx0);
        this.j();
    }

    public final void u(gucv gucv0, gubi gubi0, fshg fshg0, dskk dskk0, gfsx gfsx0, boolean z) {
        if(gucv0.c.size() != 0) {
            gucn gucn0 = (gucn)gucv0.c.get(0);
            gucl gucl0 = gucn0.b == 1 ? ((gucl)gucn0.c) : gucl.a;
            gfsx gfsx1 = gfsx.m((gucl0.c == null ? guag.a : gucl0.c));
            gged_interceptors gged0 = ggna.a;
            gfsx gfsx2 = (gucl0.b & 2) == 0 ? gfqx.a : gfsx.m((gucl0.e == null ? guck.a : gucl0.e));
            gfsx gfsx3 = z ? gfsx.m(Long.valueOf(dsok.a())) : gfqx.a;
            this.s(gfsx1, gged0, gfsx2, gfsx0, gubi0, fshg0, dskk0, z, gfsx3);
            return;
        }
        ((ggtj)HotelCardTemplate.a.j()).x("PassDetailTemplateInfo doesn\'t have detailItemInfo.");
    }
}


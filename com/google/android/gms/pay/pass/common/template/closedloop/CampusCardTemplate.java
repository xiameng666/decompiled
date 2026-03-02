package com.google.android.gms.pay.pass.common.template.closedloop;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import bbcu;
import bboh;
import dskk;
import dskr;
import dsme;
import dsmx;
import dsmz;
import dsno;
import dsoj;
import dsok;
import efky;
import fsbm;
import fshg;
import gfqx;
import gfsx;
import ggtj;
import guag;
import gubi;
import guck;
import gucl;
import gucn;
import gucv;
import guez;
import hjie;

public final class CampusCardTemplate extends dskr {
    public static final bboh a;
    private String b;

    static {
        CampusCardTemplate.a = bboh.b("Pay", bbcu.cZ);
    }

    public CampusCardTemplate(Context context0) {
        this(context0, null);
    }

    public CampusCardTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public CampusCardTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        CardHeaderTemplate cardHeaderTemplate0 = (CardHeaderTemplate)this.findViewById(0x7F0B0131);  // id:CampusCardHeaderTemplate
        this.b = "Campus ID";
    }

    @Override  // dskr
    protected final int a() {
        return 0x7F0E0CA9;  // layout:wallet_campus_card_template
    }

    @Override  // dskr
    protected final View b() {
        return this.findViewById(0x7F0B0279);  // id:DetailCardContents
    }

    @Override  // dskr
    protected final ImageView c() {
        return null;
    }

    @Override  // dskr
    protected final LinearLayout d() {
        return (LinearLayout)this.findViewById(0x7F0B0137);  // id:CampusRowTemplatesContainer
    }

    @Override  // dskr
    public final CardView e() {
        return (CardView)this.findViewById(0x7F0B0130);  // id:CampusCard
    }

    @Override  // dskr
    protected final dsme f() {
        return (dsme)this.findViewById(0x7F0B0131);  // id:CampusCardHeaderTemplate
    }

    @Override  // dskr
    protected final dsmx g(Context context0) {
        return new dsno(context0);
    }

    @Override  // dskr
    protected final dsmz h(Context context0) {
        return null;
    }

    public final ImageView u() {
        return (ImageView)this.findViewById(0x7F0B01DB);  // id:ClosedLoopCardHeaderLogo
    }

    public final gubi v(gubi gubi0) {
        Context context0 = this.getContext();
        if(context0 == null) {
            ((ggtj)CampusCardTemplate.a.j()).x("Context is null. Not able to update card label text color");
            return gubi0;
        }
        hjie hjie0 = efky.h(efky.e((gubi0.d == null ? hjie.a : gubi0.d)).intValue()) ? efky.c(context0, 0x7F060814) : efky.c(context0, 0x7F0606BF);  // color:google_white
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gubi0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gubi0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gubi gubi1 = (gubi)hftp0.b_message;
        hjie0.getClass();
        gubi1.f = hjie0;
        gubi1.b |= 8;
        return (gubi)hftp0.N_build();
    }

    public final void w(gucv gucv0, gubi gubi0, fshg fshg0, dskk dskk0, gfsx gfsx0, boolean z) {
        if(gucv0.c.size() != 0) {
            gucn gucn0 = (gucn)gucv0.c.get(0);
            gucl gucl0 = gucn0.b == 1 ? ((gucl)gucn0.c) : gucl.a;
            gfsx gfsx1 = z ? gfsx.m(Long.valueOf(dsok.a())) : gfqx.a;
            gubi gubi1 = this.v(gubi0);
            gfsx gfsx2 = (gucl0.b & 1) == 0 ? gfqx.a : gfsx.m((gucl0.c == null ? guag.a : gucl0.c));
            gfsx gfsx3 = gfqx.a;
            this.s(gfsx2, gucl0.d, gfsx3, gfsx0, gubi1, fshg0, dskk0, z, gfsx1);
            CardView cardView0 = (CardView)this.findViewById(0x7F0B0130);  // id:CampusCard
            if(cardView0 == null) {
                ((ggtj)CampusCardTemplate.a.j()).x("Could not set content description because could not find the card view.");
            }
            else {
                if(((gucl0.e == null ? guck.a : gucl0.e).b & 1) != 0) {
                    guck guck0 = gucl0.e == null ? guck.a : gucl0.e;
                    String s = (guck0.d == null ? guez.a : guck0.d).e;
                    if(!s.isEmpty()) {
                        this.b = s;
                    }
                }
                cardView0.setContentDescription(this.b);
            }
            if((gucl0.b & 1) != 0) {
                gfsx3 = gfsx.m((gucl0.c == null ? guag.a : gucl0.c));
            }
            this.x(gfsx3, gubi1, z, gfsx1);
            ImageView imageView0 = this.u();
            if(imageView0 != null && imageView0.getVisibility() == 0) {
                if(CampusCardTemplate.y(gubi1)) {
                    ((ggtj)CampusCardTemplate.a.h()).x("Do not show the logo circle since there is a secondary card color present. This is by UX design.");
                    return;
                }
                View view0 = this.findViewById(0x7F0B01DC);  // id:ClosedLoopCardHeaderLogoCircleOutline
                if(view0 == null) {
                    ((ggtj)CampusCardTemplate.a.j()).x("Not able to adjust the color because Logo circle outline is not found");
                    return;
                }
                view0.setVisibility(0);
                fsbm.b(view0.getBackground(), fsbm.a((gubi1.d == null ? hjie.a : gubi1.d)).intValue());
                return;
            }
            ((ggtj)CampusCardTemplate.a.h()).x("No photo logo image displayed. Do not display the circle outline");
            return;
        }
        ((ggtj)CampusCardTemplate.a.j()).x("PassDetailTemplateInfo doesn\'t have detailItemInfo.");
    }

    public final void x(gfsx gfsx0, gubi gubi0, boolean z, gfsx gfsx1) {
        if(CampusCardTemplate.y(gubi0)) {
            bboh bboh0 = CampusCardTemplate.a;
            ((ggtj)bboh0.h()).x("Secondary card color is present, set it as the background color for Campus WordMark layout.");
            RelativeLayout relativeLayout0 = (RelativeLayout)this.findViewById(0x7F0B013A);  // id:CampusWordMarkLayout
            if(relativeLayout0 == null) {
                ((ggtj)bboh0.j()).x("Not able to find the Campus WordMark layout");
                return;
            }
            relativeLayout0.setBackgroundColor(fsbm.a((gubi0.r == null ? hjie.a : gubi0.r)).intValue());
        }
        if(!gfsx0.i()) {
            ((ggtj)CampusCardTemplate.a.j()).x("Not able to render the word mark because PassCardHeaderTemplateInfo is missing.");
            return;
        }
        if((((guag)gfsx0.d()).b & 0x100) != 0) {
            guez guez0 = ((guag)gfsx0.d()).l;
            if(guez0 == null) {
                guez0 = guez.a;
            }
            ImageView imageView0 = (ImageView)this.findViewById(0x7F0B0139);  // id:CampusWordMark
            if(imageView0 == null) {
                ((ggtj)CampusCardTemplate.a.j()).x("Not able to find the CampusWordMark image view");
                return;
            }
            dsoj dsoj0 = new dsoj(imageView0, guez0);
            dsoj0.i = z;
            if(gfsx1.i()) {
                dsoj0.b(((Long)gfsx1.d()).longValue());
            }
            this.i.d(dsoj0);
            return;
        }
        ((ggtj)CampusCardTemplate.a.j()).x("Not able to render the word mark because asset is missing");
    }

    private static final boolean y(gubi gubi0) {
        return (gubi0.b & 0x8000) == 0 ? false : !((ProtoLiteMessage)(gubi0.d == null ? hjie.a : gubi0.d)).equals((gubi0.r == null ? hjie.a : gubi0.r));
    }
}


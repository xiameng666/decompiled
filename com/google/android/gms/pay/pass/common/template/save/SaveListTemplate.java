package com.google.android.gms.pay.pass.common.template.save;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bbcu;
import bboh;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import dagger.internal.Preconditions;
import dokz;
import dolg;
import dolz;
import domu;
import domv;
import done;
import dskk;
import dskn;
import dsnx;
import dsoz;
import dspp;
import dspu;
import dspv;
import dspx;
import dtcd;
import dtcn;
import dtdn;
import dtei;
import dtlk;
import dtlm;
import dtln;
import dtlo;
import dtlp;
import dtlq;
import dtlr;
import dtls;
import dtlt;
import fshe;
import fshg;
import fshk;
import gfqx;
import gfsx;
import gftb;
import ggtj;
import gubi;
import guce;
import gufo;
import gufs;
import gugz;
import guhg;
import guhl;
import guhm;
import guia;
import guig;
import guiz;
import guof;
import guog;
import guoi;
import hfuo;
import hwev;

public final class SaveListTemplate extends FrameLayout {
    public final LinearLayout a;
    public gfsx b;
    public dspv c;
    public dspx d;
    public dspu e;
    public fshk f;
    public dsnx g;
    public dsoz h;
    private static final bboh i;
    private Boolean j;
    private dspp k;
    private dokz l;
    private dskk m;
    private dskn n;
    private fshe o;

    static {
        SaveListTemplate.i = bboh.b("Pay", bbcu.cZ);
    }

    public SaveListTemplate(Context context0) {
        this(context0, null);
    }

    public SaveListTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public SaveListTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.b = gfqx.a;
        this.j = Boolean.valueOf(false);
        SaveListTemplate.inflate(context0, 0x7F0E0DAB, this);  // layout:wallet_save_list_template
        this.a = (LinearLayout)this.findViewById(0x7F0B0787);  // id:SaveListItemTemplatesContainer
    }

    public final gfsx a() {
        return gfsx.l(this.a.findViewWithTag("HEADER_ITEM_TAG"));
    }

    public final void b(dspp dspp0, dokz dokz0) {
        this.e(dspp0, dokz0, null, null);
    }

    public final void c(guoi guoi0, gubi gubi0, fshg fshg0) {
        this.d(guoi0, gubi0, fshg0, "", 0L);
    }

    public final void d(guoi guoi0, gubi gubi0, fshg fshg0, String s, long v) {
        dtlp dtlp0;
        guof guof0;
        gftb.b(this.j.booleanValue(), "init() method must be called before setting template info.");
        hfuo hfuo0 = guoi0.b;
        if(hfuo0.isEmpty()) {
            this.a.setVisibility(8);
            return;
        }
        Context context0 = this.getContext();
        LinearLayout linearLayout0 = this.a;
        linearLayout0.removeAllViews();
        for(Object object0: hfuo0) {
            guog guog0 = (guog)object0;
            dtlo dtlo0 = null;
            if(this.k.a((guog0.g == null ? guce.b : guog0.g), null, fshg0)) {
                gufs gufs0 = guog0.e == null ? gufs.a : guog0.e;
                gufo gufo0 = gufo.b(guog0.h) == null ? gufo.g : gufo.b(guog0.h);
                switch(guog0.c) {
                    case 0: {
                        guof0 = guof.j;
                        break;
                    }
                    case 3: {
                        guof0 = guof.b;
                        break;
                    }
                    case 5: {
                        guof0 = guof.c;
                        break;
                    }
                    case 6: {
                        guof0 = guof.d;
                        break;
                    }
                    case 8: {
                        guof0 = guof.e;
                        break;
                    }
                    case 11: {
                        guof0 = guof.f;
                        break;
                    }
                    case 12: {
                        guof0 = guof.a;
                        break;
                    }
                    case 13: {
                        guof0 = guof.g;
                        break;
                    }
                    case 14: {
                        guof0 = guof.h;
                        break;
                    }
                    case 15: {
                        guof0 = guof.i;
                        break;
                    }
                    default: {
                        guof0 = null;
                    }
                }
                switch(guof0.ordinal()) {
                    case 0: {
                    label_52:
                        guhl guhl0 = guog0.c == 12 ? ((guhl)guog0.d) : guhl.a;
                        dtlo0 = new dtln(context0);
                        dtlo0.k(guhl0, gufs0, gufo0);
                        dtlo0.setTag("TITLE_ITEM_TAG");
                        break;
                    }
                    case 1: {
                        guhl guhl1 = guog0.c == 3 ? ((guhl)guog0.d) : guhl.a;
                        dtlo0 = new dtlq(context0);
                        dtlo0.k(guhl1, gufs0, gufo0);
                        break;
                    }
                    case 2: {
                        guhg guhg0 = guog0.c == 5 ? ((guhg)guog0.d) : guhg.a;
                        dtlo0 = new dtlr(context0);
                        ((dtei)dtlo0).f(this.l);
                        ((dtei)dtlo0).g(guhg0, gufs0, gubi0);
                        break;
                    }
                    case 3: {
                        guhl guhl2 = guog0.c == 6 ? ((guhl)guog0.d) : guhl.a;
                        dtlo0 = new dtlm(context0);
                        dtlo0.k(guhl2, gufs0, gufo0);
                        break;
                    }
                    case 4: {
                        dtlo0 = new dtlo(context0);
                        dtlo0.m((guog0.c == 8 ? ((guhm)guog0.d) : guhm.a), gufs0, gufo0);
                        break;
                    }
                    case 5: {
                        dtlp0 = new dtlp(context0);
                        dtlp0.g(this.l);
                        dtlp0.f((guog0.c == 11 ? ((gugz)guog0.d) : gugz.a), null, gufs0, gufo0, gubi0);
                        dtlo0 = dtlp0;
                        break;
                    }
                    case 6: {
                        dtdn dtdn0 = hwev.c() ? new dtdn(context0) : new dtlt(context0);
                        dtdn0.jY(this.l);
                        if(hwev.c()) {
                            dtdn0.d((guog0.c == 13 ? ((guiz)guog0.d) : guiz.a), this.g, this.m, this.n);
                        }
                        else {
                            dtdn0.c((guog0.c == 13 ? ((guiz)guog0.d) : guiz.a), gufs0, this.g, this.m, this.n, this.h);
                        }
                        dtlo0 = dtdn0;
                        break;
                    }
                    case 7: {
                        dtcn dtcn0 = new dtcn(context0);
                        dtcn0.a(this.l);
                        dtcn0.b((guog0.c == 14 ? ((guig)guog0.d) : guig.a), this.m, this.n, this.o, this.g, s, v);
                        dtlo0 = dtcn0;
                        break;
                    }
                    case 8: {
                        if(hwev.c()) {
                            dtlp0 = new dtcd(context0);
                            ((dtcd)dtlp0).e(this.l);
                            ((dtcd)dtlp0).l((guog0.c == 15 ? ((guia)guog0.d) : guia.a), this.m, this.n, this.o, this.e);
                            dtlo0 = dtlp0;
                        }
                        break;
                    }
                    default: {
                        if((guog0.b & 2) == 0) {
                            if(guof0 == guof.j) {
                                ((ggtj)SaveListTemplate.i.j()).x("Ignoring missing list item with no list message fallback.");
                            }
                            else {
                                ((ggtj)SaveListTemplate.i.h()).B("Ignoring unrecognized list item with no list message fallback: %s", guof0);
                            }
                            continue;
                        }
                        else {
                            if(guof0 != guof.j) {
                                ((ggtj)SaveListTemplate.i.h()).B("Falling back to list message for unrecognized list item: %s", guof0);
                            }
                            dtlo0 = new dtls(context0);
                            dtlo0.k((guog0.f == null ? guhl.a : guog0.f), gufs0, gufo0);
                            break;
                        }
                        goto label_52;
                    }
                }
                if(dtlo0 == null) {
                    continue;
                }
                if(linearLayout0.getChildCount() == 0) {
                    dtlo0.setTag("HEADER_ITEM_TAG");
                }
                linearLayout0.addView(dtlo0);
                dtlo0.setClickable(false);
                dtlo0.setLongClickable(false);
                dtlo0.setFocusable(true);
            }
            else {
                ((ggtj)SaveListTemplate.i.h()).x("Ignoring PassSaveListItemInfo since view constraints are not met.");
            }
        }
        if(linearLayout0.getChildCount() > 0) {
            linearLayout0.setVisibility(0);
            return;
        }
        linearLayout0.setVisibility(8);
    }

    public final void e(dspp dspp0, dokz dokz0, dskk dskk0, dskn dskn0) {
        if(this.j.booleanValue()) {
            ((ggtj)SaveListTemplate.i.j()).x("init() called after already being initialized.");
            return;
        }
        this.k = dspp0;
        this.l = dokz0;
        dolg dolg0 = dokz0.ap();
        Preconditions.b(dolg0);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        dtlk dtlk0 = new dtlk(dolg0, new done(), dolz.a(dokz0), domv0);
        this.b.f(dtlk0);
        dtlk0.inject(this);
        if(dskk0 == null) {
            dskk0 = this.c;
        }
        this.m = dskk0;
        if(dskn0 == null) {
            dskn0 = this.d;
        }
        this.n = dskn0;
        this.o = this.f;
        this.j = Boolean.valueOf(true);
    }
}


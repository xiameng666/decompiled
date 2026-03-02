package com.google.android.gms.pay.pass.common.template.program;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bbcu;
import bboh;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.pass.common.template.defaults.DefaultPassInfoCallback;
import dagger.internal.Preconditions;
import dokz;
import dolg;
import doly;
import dolz;
import domu;
import domv;
import douf;
import dskn;
import dsnx;
import dspp;
import dspv;
import dtku;
import dtkv;
import dtkw;
import edlf;
import edop;
import fhvo;
import fhwk;
import gfqx;
import gfsx;
import gftb;
import gged_interceptors;
import ggtj;
import gjdw;
import gtzc;
import guce;
import gufo;
import gufs;
import guhl;
import gunf;
import gung;
import gupq;
import java.util.Iterator;

public final class ProgramNoticeTemplate extends FrameLayout {
    public dspp a;
    public dsnx b;
    public fhwk c;
    public dspv d;
    public DefaultPassInfoCallback e;
    gfsx f;
    private static final bboh g;
    private final LinearLayout h;
    private Boolean i;
    private dokz j;

    static {
        ProgramNoticeTemplate.g = bboh.b("Pay", bbcu.cZ);
    }

    public ProgramNoticeTemplate(Context context0) {
        this(context0, null);
    }

    public ProgramNoticeTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ProgramNoticeTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.i = Boolean.valueOf(false);
        this.f = gfqx.a;
        ProgramNoticeTemplate.inflate(context0, 0x7F0E071F, this);  // layout:pay_program_notice_template
        this.h = (LinearLayout)this.findViewById(0x7F0B06D5);  // id:ProgramNoticeTemplateContainer
    }

    public final void a(dokz dokz0) {
        synchronized(this) {
            if(this.i.booleanValue()) {
                ((ggtj)ProgramNoticeTemplate.g.j()).x("init() called after already being initialized.");
                return;
            }
            dolg dolg0 = dokz0.ap();
            Preconditions.b(dolg0);
            edlf edlf0 = new edlf();
            doly doly0 = dolz.a(dokz0);
            edop edop0 = new edop();
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            dtku dtku0 = new dtku(dolg0, edlf0, doly0, edop0, domv0);
            this.j = dokz0;
            this.f.f(dtku0);
            dtku0.inject(this);
            this.i = Boolean.valueOf(true);
        }
    }

    // This method was un-flattened
    public final void b(gung gung0, dskn dskn0) {
        synchronized(this) {
            gftb.r(this.i.booleanValue(), "init() method must be called before setting template info.");
            gftb.z(this.j, "accountAwareFragment must be set in init() method before setting template info");
            Context context0 = this.getContext();
            LinearLayout linearLayout0 = this.h;
            linearLayout0.removeAllViews();
            gged_interceptors gged0 = gged_interceptors.i(gung0.c);
            if(!gged0.isEmpty()) {
                Iterator iterator0 = gged0.iterator();
            label_10:
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    gunf gunf0 = (gunf)object0;
                    gtzc gtzc0 = gunf0.g == null ? gtzc.a : gunf0.g;
                    for(Object object1: gunf0.h) {
                        if(!this.a.a(((guce)object1), gtzc0, this.e)) {
                            continue label_10;
                        }
                    }
                    int v1 = gunf0.c;
                    switch(v1) {
                        case 0: {
                            break;
                        }
                        case 5: {
                            int v2 = 1;
                            break;
                        }
                        default: {
                            throw null;
                        }
                    }
                    if(v2 - 1 != 0) {
                        ((ggtj)ProgramNoticeTemplate.g.j()).x("Ignoring unrecognized add list item");
                        return;
                    }
                    guhl guhl0 = v1 == 5 ? ((guhl)gunf0.d) : guhl.a;
                    dtkv dtkv0 = new dtkv(context0);
                    dtkv0.k(guhl0, (gunf0.e == null ? gufs.a : gunf0.e), (gufo.b(gunf0.f) == null ? gufo.g : gufo.b(gunf0.f)));
                    if((gunf0.b & 4) != 0) {
                        fhvo fhvo0 = this.c.a.a((gunf0.i == null ? gupq.a : gunf0.i).c);
                        gupq gupq0 = gunf0.i;
                        if((1 & (gupq0 == null ? gupq.a : gupq0).b) != 0) {
                            if(gupq0 == null) {
                                gupq0 = gupq.a;
                            }
                            fhvo0.d(douf.b((gupq0.d == null ? gjdw.a : gupq0.d)));
                        }
                        this.c.f(dtkv0, fhvo0);
                    }
                    if(this.b.b((gunf0.g == null ? gtzc.a : gunf0.g))) {
                        dtkv0.setOnClickListener(new dtkw(this, gunf0, dskn0));
                    }
                    else {
                        dtkv0.setClickable(false);
                    }
                    linearLayout0.addView(dtkv0);
                }
                return;
            }
            ((ggtj)ProgramNoticeTemplate.g.i()).x("Received empty add items list in ProgramNoticeTemplate");
            linearLayout0.setVisibility(8);
        }
    }
}


package com.google.android.gms.pay.pass.common.template.program;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bbcu;
import bboh;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.pass.common.template.defaults.DefaultPassInfoCallback;
import com.google.android.libraries.tapandpay.ui.rowprimary.RowPrimary;
import dagger.internal.Preconditions;
import dokz;
import dolg;
import doly;
import dolz;
import domu;
import domv;
import done;
import douf;
import dskn;
import dsnx;
import dsop;
import dsor;
import dspl;
import dspp;
import dspr;
import dspv;
import dswm;
import dtbu;
import dtkb;
import dtkc;
import dtkk;
import edlf;
import edop;
import fhvo;
import fhwk;
import fryu;
import fryv;
import ftzv;
import fuaz;
import fuba;
import fubv;
import fule;
import gfqx;
import gfsx;
import gftb;
import ggtj;
import gjdw;
import gtzc;
import guag;
import gubi;
import guce;
import guez;
import gufs;
import guft;
import gugq;
import guhx;
import guna;
import gunb;
import gunc;
import gund;
import gunw;
import guot;
import guou;
import gupq;
import hwon;
import ibnq;
import ibuq;
import java.util.List;

public final class AddProgramTemplate extends FrameLayout {
    public dspp a;
    public dsnx b;
    public fhwk c;
    public dspv d;
    public DefaultPassInfoCallback e;
    gfsx f;
    private static final bboh g;
    private final LinearLayout h;
    private final LinearLayout i;
    private final LinearLayout j;
    private Boolean k;
    private dokz l;

    static {
        AddProgramTemplate.g = bboh.b("Pay", bbcu.cZ);
    }

    public AddProgramTemplate(Context context0) {
        this(context0, null);
    }

    public AddProgramTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public AddProgramTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.k = Boolean.valueOf(false);
        this.f = gfqx.a;
        AddProgramTemplate.inflate(context0, 0x7F0E071D, this);  // layout:pay_program_add_template
        this.h = (LinearLayout)this.findViewById(0x7F0B005A);  // id:AddProgramTemplateContainer
        this.i = (LinearLayout)this.findViewById(0x7F0B06C8);  // id:ProgramCardContainer
        this.j = (LinearLayout)this.findViewById(0x7F0B0536);  // id:ListItemContainer
    }

    public final void a(dokz dokz0) {
        synchronized(this) {
            if(this.k.booleanValue()) {
                ((ggtj)AddProgramTemplate.g.j()).x("init() called after already being initialized.");
                return;
            }
            dolg dolg0 = dokz0.ap();
            Preconditions.b(dolg0);
            edlf edlf0 = new edlf();
            doly doly0 = dolz.a(dokz0);
            edop edop0 = new edop();
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            dtkk dtkk0 = new dtkk(dolg0, edlf0, doly0, edop0, domv0);
            this.l = dokz0;
            this.f.f(dtkk0);
            dtkk0.inject(this);
            this.k = Boolean.valueOf(true);
        }
    }

    // This method was un-flattened
    public final void b(gubi gubi0, List list0, dskn dskn0) {
        fule fule0;
        fubv fubv0;
        fuaz fuaz0;
        int v5;
        dtkb dtkb0;
        int v4;
        int v2;
        synchronized(this) {
            gftb.r(this.k.booleanValue(), "init() method must be called before setting template info.");
            gftb.z(this.l, "accountAwareFragment must be set in init() method before setting template info");
            Context context0 = this.getContext();
            LinearLayout linearLayout0 = this.i;
            if(linearLayout0 == null) {
                this.h.removeAllViews();
            }
            else {
                LinearLayout linearLayout1 = this.j;
                if(linearLayout1 == null) {
                    this.h.removeAllViews();
                }
                else {
                    linearLayout0.removeAllViews();
                    linearLayout1.removeAllViews();
                }
            }
            if(list0.isEmpty()) {
                ((ggtj)AddProgramTemplate.g.i()).x("Received empty add items list in AddProgramTemplate");
                if(linearLayout0 != null) {
                    LinearLayout linearLayout2 = this.j;
                    if(linearLayout2 != null) {
                        linearLayout0.setVisibility(8);
                        linearLayout2.setVisibility(8);
                        return;
                    }
                }
                this.h.setVisibility(8);
                return;
            }
            for(Object object0: list0) {
                gunb gunb0 = (gunb)object0;
                int v1 = gunb0.b;
                switch(v1) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        v2 = 1;
                        break;
                    }
                    case 2: {
                        v2 = 2;
                        break;
                    }
                    default: {
                        throw null;
                    }
                }
                switch(v2 - 1) {
                    case 0: {
                        ProgramCardTemplate programCardTemplate0 = new ProgramCardTemplate(context0);
                        programCardTemplate0.k(this.l);
                        guna guna0 = gunb0.b == 1 ? ((guna)gunb0.c) : guna.a;
                        programCardTemplate0.u((guna0.b == null ? guag.a : guna0.b), gubi0);
                        if(linearLayout0 == null) {
                            this.h.addView(programCardTemplate0);
                            break;
                        }
                        else {
                            linearLayout0.addView(programCardTemplate0);
                            continue;
                        }
                        goto label_51;
                    }
                    case 1: {
                    label_51:
                        for(Object object1: (v1 == 2 ? ((gund)gunb0.c) : gund.a).b) {
                            gunc gunc0 = (gunc)object1;
                            gtzc gtzc0 = gunc0.f == null ? gtzc.a : gunc0.f;
                            if(this.a.a(((guce)gunc0.g.get(0)), gtzc0, this.e)) {
                                int v3 = gunc0.c;
                                switch(v3) {
                                    case 0: {
                                        break;
                                    }
                                    case 5: {
                                        v4 = 1;
                                        break;
                                    }
                                    case 7: {
                                        v4 = 2;
                                        break;
                                    }
                                    default: {
                                        throw null;
                                    }
                                }
                                switch(v4 - 1) {
                                    case 0: {
                                        gugq gugq0 = v3 == 5 ? ((gugq)gunc0.d) : gugq.a;
                                        dtkb0 = new dtkb(context0);
                                        dtkb0.f(this.l);
                                        dtkb0.e(gugq0, (gunc0.e == null ? gufs.a : gunc0.e), gubi0);
                                        goto label_157;
                                    }
                                    case 1: {
                                        if(hwon.d()) {
                                            guhx guhx0 = gunc0.c == 7 ? ((guhx)gunc0.d) : guhx.a;
                                            dtkb0 = new dtbu(context0);
                                            dokz dokz0 = this.l;
                                            ibuq.f(dokz0, "fragment");
                                            dolg dolg0 = dokz0.ap();
                                            Preconditions.b(dolg0);
                                            new dswm(dolg0, new done()).inject(dtkb0);
                                            gufs gufs0 = gunc0.e == null ? gufs.a : gunc0.e;
                                            ibuq.f(guhx0, "templateInfo");
                                            ibuq.f(gufs0, "rowHeight");
                                            View view0 = ((dtbu)dtkb0).findViewById(0x7F0B0737);  // id:RowPrimary
                                            ibuq.e(view0, "findViewById(...)");
                                            fryv fryv0 = dspl.b((guhx0.g == null ? gunw.a : guhx0.g));
                                            fryv fryv1 = (guhx0.b & 2) == 0 ? null : dspl.b((guhx0.h == null ? gunw.a : guhx0.h));
                                            fryv fryv2 = (guhx0.b & 4) == 0 ? null : dspl.b((guhx0.i == null ? gunw.a : guhx0.i));
                                            switch(guhx0.c) {
                                                case 0: {
                                                    break;
                                                }
                                                case 4: {
                                                    v5 = 1;
                                                    break;
                                                }
                                                case 6: {
                                                    v5 = 2;
                                                    break;
                                                }
                                                default: {
                                                    throw null;
                                                }
                                            }
                                            switch(v5 - 1) {
                                                case 0: {
                                                    dsor dsor0 = ((dtbu)dtkb0).a();
                                                    guot guot0 = guhx0.c == 4 ? ((guot)guhx0.d) : guot.a;
                                                    guez guez0 = guot0.c == null ? guez.a : guot0.c;
                                                    ibuq.e(guez0, "getIcon(...)");
                                                    Context context1 = ((dtbu)dtkb0).getContext();
                                                    ibuq.e(context1, "getContext(...)");
                                                    dsop dsop0 = dsor.c(dsor0, guez0, context1);
                                                    guot guot1 = guhx0.c == 4 ? ((guot)guhx0.d) : guot.a;
                                                    String s = (guot1.c == null ? guez.a : guot1.c).e;
                                                    ibuq.e(s, "getImageContentDescription(...)");
                                                    fryu fryu0 = new fryu(s);
                                                    guot guot2 = guhx0.c == 4 ? ((guot)guhx0.d) : guot.a;
                                                    ibuq.e(guot2, "getLeadingIcon(...)");
                                                    fuaz0 = new fuaz(dsop0.a, dsop0.b, fryu0, dspr.c(guot2), 16);
                                                    break;
                                                }
                                                case 1: {
                                                    dsor dsor1 = ((dtbu)dtkb0).a();
                                                    guou guou0 = guhx0.c == 6 ? ((guou)guhx0.d) : guou.a;
                                                    guez guez1 = guou0.b == null ? guez.a : guou0.b;
                                                    ibuq.e(guez1, "getIcon(...)");
                                                    Context context2 = ((dtbu)dtkb0).getContext();
                                                    ibuq.e(context2, "getContext(...)");
                                                    dsop dsop1 = dsor.c(dsor1, guez1, context2);
                                                    guou guou1 = guhx0.c == 6 ? ((guou)guhx0.d) : guou.a;
                                                    String s1 = (guou1.b == null ? guez.a : guou1.b).e;
                                                    ibuq.e(s1, "getImageContentDescription(...)");
                                                    fuaz0 = new fuba(dsop1.a, dsop1.b, new fryu(s1), (guhx0.c == 6 ? ((guou)guhx0.d) : guou.a).c, 4);
                                                    break;
                                                }
                                                case 2: {
                                                    fuaz0 = null;
                                                    break;
                                                }
                                                default: {
                                                    throw new ibnq();
                                                }
                                            }
                                            switch(guhx0.e) {
                                                case 0: {
                                                    break;
                                                }
                                                case 5: {
                                                    int v6 = 1;
                                                    break;
                                                }
                                                default: {
                                                    throw null;
                                                }
                                            }
                                            switch(v6 - 1) {
                                                case 0: {
                                                    dsor dsor2 = ((dtbu)dtkb0).a();
                                                    guot guot3 = guhx0.e == 5 ? ((guot)guhx0.f) : guot.a;
                                                    guez guez2 = guot3.c == null ? guez.a : guot3.c;
                                                    ibuq.e(guez2, "getIcon(...)");
                                                    Context context3 = ((dtbu)dtkb0).getContext();
                                                    ibuq.e(context3, "getContext(...)");
                                                    dsop dsop2 = dsor.c(dsor2, guez2, context3);
                                                    guot guot4 = guhx0.e == 5 ? ((guot)guhx0.f) : guot.a;
                                                    String s2 = (guot4.c == null ? guez.a : guot4.c).e;
                                                    ibuq.e(s2, "getImageContentDescription(...)");
                                                    fryu fryu1 = new fryu(s2);
                                                    guot guot5 = guhx0.e == 5 ? ((guot)guhx0.f) : guot.a;
                                                    ibuq.e(guot5, "getTrailingIcon(...)");
                                                    fubv0 = new fubv(dsop2.a, null, dsop2.b, fryu1, dspr.c(guot5), 70);
                                                    break;
                                                }
                                                case 1: {
                                                    fubv0 = null;
                                                    break;
                                                }
                                                default: {
                                                    throw new ibnq();
                                                }
                                            }
                                            switch((guft.b(guhx0.j) == null ? guft.f : guft.b(guhx0.j)).ordinal()) {
                                                case 2: {
                                                    fule0 = fule.b;
                                                    break;
                                                }
                                                case 3: {
                                                    fule0 = fule.c;
                                                    break;
                                                }
                                                case 4: {
                                                    fule0 = fule.d;
                                                    break;
                                                }
                                                default: {
                                                    fule0 = fule.a;
                                                }
                                            }
                                            ((RowPrimary)view0).g(new ftzv(fryv0, fryv1, fryv2, fuaz0, fubv0, null, fule0, guhx0.k, null, 0, null, 0xE60));
                                            int v7 = ((dtbu)dtkb0).getContext().getResources().getDimensionPixelSize(0x7F070FCC);  // dimen:row_primary_horizontal_padding
                                            int v8 = guhx0.k ? ((dtbu)dtkb0).getContext().getResources().getDimensionPixelSize(0x7F070FD2) : 0;  // dimen:row_primary_vertical_padding
                                            ((RowPrimary)view0).setPadding(v7, v8, v7, v8);
                                            dtkb0.jZ(gufs0);
                                        label_157:
                                            if((gunc0.b & 8) != 0) {
                                                fhvo fhvo0 = this.c.a.a((gunc0.h == null ? gupq.a : gunc0.h).c);
                                                gupq gupq0 = gunc0.h;
                                                if(((gupq0 == null ? gupq.a : gupq0).b & 1) != 0) {
                                                    if(gupq0 == null) {
                                                        gupq0 = gupq.a;
                                                    }
                                                    fhvo0.d(douf.b((gupq0.d == null ? gjdw.a : gupq0.d)));
                                                }
                                                this.c.f(dtkb0, fhvo0);
                                            }
                                            if(this.b.b((gunc0.f == null ? gtzc.a : gunc0.f))) {
                                                dtkb0.setOnClickListener(new dtkc(this, gunc0, dskn0));
                                            }
                                            else {
                                                dtkb0.setClickable(false);
                                            }
                                            LinearLayout linearLayout3 = this.j;
                                            if(linearLayout3 == null) {
                                                this.h.addView(dtkb0);
                                            }
                                            else {
                                                linearLayout3.addView(dtkb0);
                                            }
                                            continue;
                                        }
                                    }
                                }
                                ((ggtj)AddProgramTemplate.g.j()).x("Ignoring unrecognized add list item");
                                break;
                            }
                            ((ggtj)AddProgramTemplate.g.h()).x("Ignoring PassProgramAddListItemInfo since view constraints are not met.");
                        }
                        break;
                    }
                    default: {
                        ((ggtj)AddProgramTemplate.g.j()).x("Ignoring unrecognized add item info");
                    }
                }
            }
        }
    }
}


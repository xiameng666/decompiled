package com.google.android.gms.pay.pass.common.template.toolbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import dagger.internal.Preconditions;
import dlmk;
import dokz;
import dolg;
import domu;
import domv;
import dskk;
import dskn;
import dsnx;
import dsob;
import dsoc;
import dspl;
import dtmh;
import dtmi;
import dtmj;
import dtmk;
import edkx;
import fshe;
import gfqx;
import gfsx;
import gfta;
import gtzc;
import guez;
import gunw;
import gupg;
import guph;
import gupi;
import gupj;
import hwev;
import im;
import kdy;
import xni;

public class ToolbarTemplate extends Toolbar {
    final gfsx A;
    public dtmi B;
    public dsoc y;
    public dsnx z;

    public ToolbarTemplate(Context context0) {
        super(context0);
        this.A = gfqx.a;
    }

    public ToolbarTemplate(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.A = gfqx.a;
    }

    public ToolbarTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.A = gfqx.a;
    }

    public final void O() {
        dtmi dtmi0 = this.B;
        ToolbarTemplate toolbarTemplate0 = dtmi0.a;
        toolbarTemplate0.q(0x7F10003E);  // menu:toolbar_menu
        int v = 0;
        for(Object object0: dtmi0.b.b) {
            gupg gupg0 = (gupg)object0;
            MenuItem menuItem0 = toolbarTemplate0.g().add(0, v, v, dspl.d((gupg0.c == null ? gunw.a : gupg0.c)));
            if((gupg0.b & 4) != 0) {
                dsoc dsoc0 = dtmi0.f;
                guez guez0 = gupg0.e == null ? guez.a : gupg0.e;
                dsob dsob0 = dsoc0.b(guez0);
                if(dsob0 != null) {
                    if(dsob0.a.b == 1) {
                        Drawable drawable0 = dsoc0.a.getDrawable(dsob0.b);
                        if(drawable0 != null) {
                            drawable0.setTintList(dsoc.a(dsob0));
                            menuItem0.setIcon(drawable0);
                        }
                    }
                    else {
                        menuItem0.setIcon(dsob0.b);
                    }
                    kdy.a(menuItem0, guez0.e);
                    menuItem0.setShowAsActionFlags(1);
                }
            }
            ++v;
        }
    }

    public final void P(dokz dokz0, gupj gupj0, dskk dskk0, dskn dskn0, fshe fshe0) {
        xni xni0 = (xni)dokz0.getContext();
        if(xni0 == null) {
            return;
        }
        dlmk dlmk0 = new dlmk(((xni)dokz0.requireContext()));
        dolg dolg0 = dokz0.ap();
        Preconditions.b(dolg0);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        dtmh dtmh0 = new dtmh(dlmk0, dolg0, domv0);
        if(this.z == null) {
            this.A.f(dtmh0);
            dtmh0.inject(this);
        }
        xni0.hG(this);
        im im0 = xni0.hL();
        boolean z = false;
        if(im0 != null) {
            gunw gunw0 = gupj0.d == null ? gunw.a : gupj0.d;
            String s = dspl.e((gupj0.c == null ? gunw.a : gupj0.c), fshe0);
            String s1 = dspl.e(gunw0, fshe0);
            if(gfta.c(s)) {
                im0.s(false);
            }
            else {
                im0.s(true);
                im0.B(s);
                if(!gfta.c(s1)) {
                    im0.z(s1);
                }
            }
            gupi gupi0 = gupj0.f == null ? gupi.a : gupj0.f;
            guez guez0 = gupi0.d == null ? guez.a : gupi0.d;
            dsob dsob0 = this.y.b(guez0);
            if(dsob0 == null) {
                im0.o(false);
            }
            else {
                im0.o(true);
                im0.w(dsob0.b);
                im0.v(guez0.e);
            }
        }
        if((gupj0.b & 4) != 0) {
            z = true;
        }
        dokz0.setHasOptionsMenu(z);
        this.B = new dtmi(this, (gupj0.e == null ? guph.a : gupj0.e), this.z, dskk0, dskn0, this.y);
        if(!hwev.c() && (gupj0.b & 2) != 0) {
            this.E(this.getContext(), 0x7F1605CF);  // style:Pay_Text_Toolbar_Title
            this.B(this.getContext(), 0x7F1605CE);  // style:Pay_Text_Toolbar_Subtitle
            this.m = edkx.b(this.getContext(), 0x7F070E27);  // dimen:pay_toolbar_title_margin_bottom
            this.requestLayout();
            this.l = edkx.b(this.getContext(), 0x7F070DD3);  // dimen:pay_default_spacing
            this.requestLayout();
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
            if(viewGroup$LayoutParams0 != null) {
                viewGroup$LayoutParams0.height = edkx.b(this.getContext(), 0x7F070E29);  // dimen:pay_toolbar_with_subtitle_height
            }
        }
        if(((gupj0.f == null ? gupi.a : gupj0.f).b & 1) != 0) {
            gupi gupi1 = gupj0.f == null ? gupi.a : gupj0.f;
            this.x(new dtmj(this, (gupi1.c == null ? gtzc.a : gupi1.c), dskk0, dskn0, dokz0));
            return;
        }
        this.x(new dtmk(dokz0));
    }

    public final boolean Q(MenuItem menuItem0) {
        return this.B.a(menuItem0);
    }
}


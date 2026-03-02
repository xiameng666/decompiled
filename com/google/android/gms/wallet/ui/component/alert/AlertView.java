package com.google.android.gms.wallet.ui.component.alert;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import androidx.cardview.widget.CardView;
import com.google.android.chimera.android.Activity;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.InfoMessageView;
import fcaj;
import gcjk;
import gcjn;
import gcqy;
import gczo;
import gdcb;
import gfgo;
import gfgr;
import hcdw;
import hcdx;
import hcej;
import hcem;
import hcen;
import hceo;
import java.util.ArrayList;
import java.util.Locale;
import ozo;
import pao;

public class AlertView extends CardView implements View.OnClickListener, gcjk {
    ViewGroup g;
    ViewGroup h;
    ViewGroup i;
    final ArrayList j;
    boolean k;
    boolean l;
    pao m;
    TransitionDrawable n;
    boolean o;
    gcqy p;
    public gcjn q;
    private hcej r;
    private boolean s;
    private ozo t;
    private Drawable u;
    private Drawable v;
    private Activity w;
    private gczo x;
    private int y;

    public AlertView(Context context0) {
        super(context0);
        this.j = new ArrayList();
        this.y = 1;
        this.o = false;
    }

    public AlertView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.j = new ArrayList();
        this.y = 1;
        this.o = false;
    }

    public AlertView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.j = new ArrayList();
        this.y = 1;
        this.o = false;
    }

    public final void h() {
        this.k ^= 1;
        this.l = true;
        this.q();
    }

    public final void i(hcej hcej0, Activity activity0, gcqy gcqy0, gczo gczo0) {
        this.r = hcej0;
        this.w = activity0;
        this.p = gcqy0;
        this.x = gczo0;
        this.p();
        this.o(false);
    }

    public final void j(hcdx hcdx0, hcej hcej0) {
        int v = hcdw.a(hcdx0.c);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        if(v - 1 != 1) {
            Locale locale0 = Locale.US;
            int v2 = hcdw.a(hcdx0.c);
            if(v2 != 0) {
                v1 = v2;
            }
            throw new IllegalArgumentException(String.format(locale0, "AlertView does not support partial page update type: %s", Integer.toString(v1 - 1)));
        }
        this.lr();
        this.r = hcej0;
        this.p();
        this.o(true);
    }

    private final Drawable k() {
        if(this.u == null) {
            this.u = new CardView(this.getContext()).getBackground().mutate();
            int v = gdcb.b(this.getContext(), 0x7F040E49);  // attr:walletCardViewPageErrorColor
            this.u.setTintList(gdcb.j(v));
        }
        return this.u;
    }

    private final Drawable l() {
        if(this.v == null) {
            this.v = new CardView(this.getContext()).getBackground().mutate();
        }
        return this.v;
    }

    @Override  // gcjk
    public final void lr() {
        ArrayList arrayList0 = this.j;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((AlertMessageView)arrayList0.get(v1)).lr();
        }
    }

    private final TransitionDrawable m() {
        if(this.n == null) {
            TransitionDrawable transitionDrawable0 = new TransitionDrawable(new Drawable[]{this.l(), this.k()});
            this.n = transitionDrawable0;
            this.setBackground(transitionDrawable0);
        }
        return this.n;
    }

    private final pao n() {
        if(this.m == null) {
            View view0 = this.w.findViewById(0x1020002);
            if(view0 != null) {
                this.m = new pao();
                ozo ozo0 = new ozo(((ViewGroup)view0));
                this.t = ozo0;
                ozo0.b = new fcaj(this);
                this.m.f(this.t, gdcb.s());
            }
        }
        return this.m;
    }

    private final void o(boolean z) {
        Drawable drawable0;
        boolean z1 = true;
        boolean z2 = this.y != 2 && (this.s || !this.k);
        if(z2 != this.o) {
            if(this.r()) {
                int v = z ? 400 : 0;
                if(z2) {
                    this.m().startTransition(v);
                }
                else {
                    this.m().reverseTransition(v);
                    z1 = false;
                }
            }
            else {
                if(z2) {
                    drawable0 = this.k();
                }
                else {
                    drawable0 = this.l();
                    z1 = false;
                }
                this.setBackground(drawable0);
            }
            this.o = z1;
        }
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(this.r()) {
            this.n().g(this.t);
        }
        else {
            this.h();
        }
        this.o(true);
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if((parcelable0 instanceof Bundle)) {
            super.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("parentState"));
            if(!this.s) {
                this.k = ((Bundle)parcelable0).getBoolean("viewIsExpanded");
                this.l = ((Bundle)parcelable0).getBoolean("expandedStateSetByUser");
                if(this.k != this.r.e) {
                    this.q();
                    this.o(false);
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putParcelable("parentState", super.onSaveInstanceState());
        ((Bundle)parcelable0).putBoolean("viewIsExpanded", this.k);
        ((Bundle)parcelable0).putBoolean("expandedStateSetByUser", this.l);
        return parcelable0;
    }

    private final void p() {
        gfgo gfgo0;
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.getContext());
        this.setVisibility(0);
        this.removeAllViews();
        this.p.f();
        ArrayList arrayList0 = this.j;
        arrayList0.clear();
        gfgr gfgr0 = null;
        this.g = null;
        this.h = null;
        this.i = null;
        int v = this.r.c.size();
        int v1 = 1;
        if(v == 1) {
            this.s = true;
            hcej hcej0 = this.r;
            gczo gczo0 = this.x;
            AlertMessageView alertMessageView0 = (AlertMessageView)layoutInflater0.inflate(0x7F0E0E07, this, false);  // layout:wallet_view_alert_message
            alertMessageView0.h = this.q;
            alertMessageView0.a(((hceo)hcej0.c.get(0)), this.p, gczo0, true);
            alertMessageView0.setId(this.p.a());
            arrayList0.add(alertMessageView0);
            this.g = alertMessageView0;
            this.addView(alertMessageView0);
            int v2 = hcem.a(((hceo)this.r.c.get(0)).h);
            if(v2 != 0) {
                v1 = v2;
            }
            this.y = v1;
            return;
        }
        if(v > 1) {
            hcej hcej1 = this.r;
            AlertHeaderView alertHeaderView0 = (AlertHeaderView)layoutInflater0.inflate(0x7F0E0E06, this, false);  // layout:wallet_view_alert_header
            hcen hcen0 = hcej1.d == null ? hcen.a : hcej1.d;
            gcqy gcqy0 = this.p;
            ImageWithCaptionView imageWithCaptionView0 = alertHeaderView0.a;
            if((hcen0.b & 4) == 0) {
                gfgo0 = null;
            }
            else {
                gfgo0 = hcen0.e;
                if(gfgo0 == null) {
                    gfgo0 = gfgo.a;
                }
            }
            imageWithCaptionView0.m(gfgo0);
            InfoMessageView infoMessageView0 = alertHeaderView0.b;
            if((hcen0.b & 1) != 0) {
                gfgr0 = hcen0.c;
                if(gfgr0 == null) {
                    gfgr0 = gfgr.a;
                }
            }
            infoMessageView0.n(gfgr0);
            alertHeaderView0.b.setId(gcqy0.a());
            alertHeaderView0.c.setVisibility(0);
            alertHeaderView0.d.setVisibility(8);
            int v3 = hcem.a(hcen0.f) == 0 ? 1 : hcem.a(hcen0.f);
            if(v3 - 1 != 2 && v3 - 1 != 3) {
                ImageWithCaptionView imageWithCaptionView1 = alertHeaderView0.a;
                imageWithCaptionView1.g = gdcb.j(gdcb.b(alertHeaderView0.getContext(), 0x7F040296));  // attr:colorAccent
                gdcb.M(alertHeaderView0.c, gdcb.h(alertHeaderView0.getContext(), 0x1010038));
            }
            else {
                ColorStateList colorStateList0 = gdcb.m(alertHeaderView0.getContext());
                alertHeaderView0.a.g = colorStateList0;
                alertHeaderView0.b.s(alertHeaderView0.getResources().getColor(0x106000B));
                gdcb.M(alertHeaderView0.c, colorStateList0);
            }
            alertHeaderView0.setId(this.p.a());
            alertHeaderView0.setOnClickListener(this);
            alertHeaderView0.setTag(0x7F0B218C, "summaryField");  // id:summary_expander_transition_name
            this.h = alertHeaderView0;
            hcej hcej2 = this.r;
            gczo gczo1 = this.x;
            LinearLayout linearLayout0 = new LinearLayout(this.getContext());
            linearLayout0.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            linearLayout0.setOrientation(1);
            linearLayout0.setId(this.p.a());
            AlertHeaderView alertHeaderView1 = (AlertHeaderView)layoutInflater0.inflate(0x7F0E0E06, linearLayout0, false);  // layout:wallet_view_alert_header
            hcen hcen1 = hcej2.d == null ? hcen.a : hcej2.d;
            gcqy gcqy1 = this.p;
            if((2 & hcen1.b) == 0) {
                alertHeaderView1.b.setVisibility(8);
            }
            else {
                alertHeaderView1.b.n((hcen1.d == null ? gfgr.a : hcen1.d));
            }
            alertHeaderView1.b.setId(gcqy1.a());
            alertHeaderView1.c.setVisibility(8);
            alertHeaderView1.d.setVisibility(0);
            alertHeaderView1.setId(this.p.a());
            alertHeaderView1.setOnClickListener(this);
            alertHeaderView1.setTag(0x7F0B218C, "expandedField");  // id:summary_expander_transition_name
            linearLayout0.addView(alertHeaderView1);
            for(Object object0: hcej2.c) {
                AlertMessageView alertMessageView1 = (AlertMessageView)layoutInflater0.inflate(0x7F0E0E07, linearLayout0, false);  // layout:wallet_view_alert_message
                alertMessageView1.h = this.q;
                alertMessageView1.a(((hceo)object0), this.p, gczo1, false);
                alertMessageView1.setId(this.p.a());
                alertMessageView1.setTag(0x7F0B218C, "expandedField");  // id:summary_expander_transition_name
                arrayList0.add(alertMessageView1);
                linearLayout0.addView(alertMessageView1);
            }
            this.i = linearLayout0;
            this.addView(this.h);
            this.addView(this.i);
            if(!this.l) {
                this.k = this.r.e;
            }
            this.q();
            int v4 = hcem.a((this.r.d == null ? hcen.a : this.r.d).f);
            if(v4 != 0) {
                v1 = v4;
            }
            this.y = v1;
            return;
        }
        this.setVisibility(8);
    }

    private final void q() {
        if(this.k) {
            this.h.setVisibility(8);
            this.i.setVisibility(0);
            gdcb.K(this.i, 0);
            return;
        }
        this.h.setVisibility(0);
        this.i.setVisibility(8);
        gdcb.K(this.i, 8);
    }

    private final boolean r() {
        return gdcb.S(this.w) && this.n() != null;
    }

    @Override  // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        ViewGroup viewGroup0 = this.g;
        if(viewGroup0 != null) {
            viewGroup0.setEnabled(z);
        }
        ViewGroup viewGroup1 = this.h;
        if(viewGroup1 != null) {
            viewGroup1.setEnabled(z);
            this.i.setEnabled(z);
            gdcb.J(this.i, z);
        }
    }
}


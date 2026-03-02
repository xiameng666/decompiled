package com.google.android.wallet.ui.common;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.clientlog.Session;
import com.google.android.wallet.clientlog.TimedEvent;
import gcfz;
import gcjk;
import gcjn;
import gczn;
import gczo;
import gczt;
import gdaj;
import gdbk;
import gdbn;
import gdbo;
import gdbp;
import gdcb;
import gdep;
import gdeq;
import gdew;
import gdex;
import hcbx;
import hcck;
import kfe;

public class SelectorView extends LinearLayout implements View.OnClickListener, gcjk, gczt, gdep, gdeq, gdex {
    public final gdew a;
    public View b;
    public gczn c;
    public boolean d;
    public gdbp e;
    public gczo f;
    public long g;
    public LogContext h;
    public gcjn i;
    private boolean j;
    private boolean k;
    private TimedEvent l;

    public SelectorView(Context context0) {
        super(context0);
        this.a = new gdew();
        this.d = false;
        this.p();
    }

    public SelectorView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new gdew();
        this.d = false;
        this.p();
    }

    public SelectorView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new gdew();
        this.d = false;
        this.p();
    }

    public SelectorView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.a = new gdew();
        this.d = false;
        this.p();
    }

    @Override  // gdep
    public final void aB() {
        this.n();
    }

    @Override  // gdep
    public final void aC() {
    }

    @Override  // gdaj
    public final gdaj aV() {
        return null;
    }

    @Override  // gdaj
    public final String aX(String s) {
        return this.b == null ? "" : ((gdbk)this.b).a().toString();
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(!(view0 instanceof gdbk)) {
            throw new IllegalArgumentException("SelectorView may only have children that implement SelectorOption.");
        }
        boolean z = true;
        super.addView(view0, v, viewGroup$LayoutParams0);
        ((gdbk)view0).o(this);
        this.o(view0);
        int v1 = this.getChildCount();
        if(v1 <= 2) {
            this.n();
            return;
        }
        if(v != -1 && v != v1 - 1) {
            z = false;
        }
        this.q(view0, z, false, null);
        if(z) {
            this.q(this.d(v1 - 2), false, false, null);
        }
    }

    @Override  // gdep
    public final void az() {
    }

    @Override  // gdeq
    public final void b() {
        TimedEvent timedEvent0;
        gdcb.B(this.b != null || this.a.c, "SelectorView must have a selected option when collapsed.");
        LogContext logContext0 = this.h;
        if(logContext0 != null) {
            long v = this.g;
            if(v > 0L) {
                if(!this.a.c) {
                    TimedEvent timedEvent1 = this.l;
                    if(timedEvent1 != null) {
                        LogContext logContext2 = logContext0.b;
                        if(gcfz.l(logContext2)) {
                            ProtoLiteBuilder hftp1 = gcfz.v(logContext2);
                            hcck hcck2 = timedEvent1.a;
                            int v1 = hcck2.i;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp1.b_message;
                            ((hcck)hftv0).b |= 16;
                            ((hcck)hftv0).j = v1;
                            hcbx hcbx1 = hcbx.j;
                            if(!hftv0.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv1 = hftp1.b_message;
                            ((hcck)hftv1).h = hcbx1.P;
                            ((hcck)hftv1).b |= 4;
                            long v2 = hcck2.k;
                            if(!hftv1.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            hcck hcck3 = (hcck)hftp1.b_message;
                            hcck3.b |= 0x20;
                            hcck3.k = v2;
                            gcfz.e(logContext2.a(), ((hcck)hftp1.N_build()));
                        }
                        else {
                            Log.e("ClientLog", "Tried to log endExpanded() in an invalid session.");
                        }
                        this.l = null;
                    }
                }
                else if(this.l == null) {
                    LogContext logContext1 = logContext0.b;
                    if(gcfz.l(logContext1)) {
                        Session session0 = logContext1.a();
                        ProtoLiteBuilder hftp0 = gcfz.v(logContext1);
                        hcbx hcbx0 = hcbx.i;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((hcck)hftp0.b_message).h = hcbx0.P;
                        ((hcck)hftp0.b_message).b |= 4;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hcck hcck0 = (hcck)hftp0.b_message;
                        hcck0.b |= 0x20;
                        hcck0.k = v;
                        hcck hcck1 = (hcck)hftp0.N_build();
                        gcfz.e(session0, hcck1);
                        timedEvent0 = new TimedEvent(hcck1);
                    }
                    else {
                        Log.e("ClientLog", "Tried to log startExpanded() in an invalid session.");
                        timedEvent0 = null;
                    }
                    this.l = timedEvent0;
                }
            }
        }
        int v3 = this.getChildCount();
        for(int v4 = 0; v4 < v3; ++v4) {
            View view0 = this.d(v4);
            if(view0 == this.b) {
                this.q(view0, v4 == v3 - 1, this.k, "optionViewComponents");
                this.k = false;
            }
            else {
                this.q(view0, v4 == v3 - 1, false, null);
            }
        }
        gdbp gdbp0 = this.e;
        if(gdbp0 != null) {
            if(this.a.c) {
                gdbp0.as(this);
            }
            else {
                gdbp0.ar(this);
            }
        }
        gdbp gdbp1 = this.e;
        if(gdbp1 != null && !this.j) {
            if(this.a.c) {
                gdbp1.aw();
                return;
            }
            gdbp1.av();
            return;
        }
        this.j = false;
    }

    @Override  // gdeq
    public final void c() {
        if(this.getParent() != null && this.getChildCount() > 0 && this.isLaidOut()) {
            this.getParent().requestChildFocus(this, this.getChildAt(0));
        }
    }

    public final View d(int v) {
        View view0 = this.getChildAt(v);
        return (view0 instanceof gdbk) ? view0 : null;
    }

    public final View f(long v) {
        int v1 = this.getChildCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            View view0 = this.getChildAt(v2);
            if(((gdbk)view0).j() == v) {
                return view0;
            }
        }
        return null;
    }

    public final void g() {
        View view0 = this.b != null && ((gdbk)this.b).n() ? this.b : null;
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = this.getChildAt(v1);
            this.o(view1);
            gdbk gdbk0 = (gdbk)view1;
            if(gdbk0.n() && view0 == null && gdbk0.d()) {
                view0 = view1;
            }
        }
        this.h((view0 == null ? 0L : ((gdbk)view0).j()));
    }

    @Override  // gczt
    public final CharSequence getError() {
        gczn gczn0 = this.c;
        return gczn0 == null ? "" : gczn0.U();
    }

    public final void h(long v) {
        if(Long.compare(v, 0L) == 0) {
            View view0 = this.b;
            if(view0 != null) {
                ((gdbk)view0).l(false, false);
                this.b = null;
            }
        }
        else {
            int v1 = this.getChildCount();
            int v2;
            for(v2 = 0; true; ++v2) {
                if(v2 >= v1) {
                    v2 = -1;
                    break;
                }
                if(((gdbk)this.d(v2)).j() == v) {
                    break;
                }
            }
            if(v2 != -1) {
                View view1 = this.d(v2);
                if(((gdbk)view1).d()) {
                    Object object0 = this.b == null ? null : ((gdbk)this.b).k();
                    this.b = view1;
                    this.n();
                    if(this.getChildCount() == 1) {
                        this.b.setClickable(false);
                    }
                    gdbp gdbp0 = this.e;
                    if(gdbp0 != null) {
                        gdbp0.aF(((gdbk)this.b).k(), object0);
                    }
                    this.nT(null, false);
                }
            }
        }
    }

    public final void i(int v) {
        gdbn gdbn0 = this.a.c ? new gdbn(this, v) : new gdbo(this);
        kfe.j(this, gdbn0);
    }

    @Override  // gcjk
    public final void lr() {
        if(this.i != null) {
            int v = this.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = this.getChildAt(v1);
                this.i.a(((gdbk)view0).j());
            }
        }
    }

    @Override  // gdex
    public final gdew mb() {
        return this.a;
    }

    public final void n() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.d(v1);
            this.q(view0, v1 == v - 1, false, null);
            view0.setTranslationY(0.0f);
        }
    }

    @Override  // gczt
    public final void nT(CharSequence charSequence0, boolean z) {
        gczn gczn0 = this.c;
        if(gczn0 != null) {
            gczn0.at(charSequence0);
        }
    }

    @Override  // gczt
    public final boolean nW() {
        return this.b != null;
    }

    @Override  // gczt
    public final boolean nX() {
        if(this.hasFocus() || !this.requestFocus()) {
            gdcb.G(this);
            CharSequence charSequence0 = this.getError();
            if(!TextUtils.isEmpty(charSequence0)) {
                gdcb.z(this, charSequence0);
            }
        }
        return this.hasFocus();
    }

    @Override  // gczt
    public final boolean nY() {
        if(this.nW()) {
            this.nT(null, false);
            return this.nW();
        }
        this.nT("Please select an option", false);
        return this.nW();
    }

    @Override  // gczt
    public final boolean nZ(Object object0) {
        return false;
    }

    private final void o(View view0) {
        View view1;
        view0.setTag(0x7F0B218C, "expandedField");  // id:summary_expander_transition_name
        int v = this.getChildCount();
        int v3 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            if(((gdbk)this.getChildAt(v2)).n()) {
                ++v3;
            }
        }
        switch(v3) {
            case 1: {
                ((gdbk)view0).m(false);
                view0.setOnClickListener(this);
                return;
            }
            case 2: {
                int v4 = this.getChildCount();
                for(int v1 = 0; true; ++v1) {
                    view1 = null;
                    if(v1 >= v4) {
                        break;
                    }
                    View view2 = this.getChildAt(v1);
                    if(((gdbk)view2).n()) {
                        view1 = view2;
                        break;
                    }
                }
                ((gdbk)view1).m(true);
                view1.setOnClickListener(this);
            }
        }
        view0.setOnClickListener(this);
        ((gdbk)view0).m(true);
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        gdcb.B(this.f != null, "SelectorView must have a EventListener.");
        gdew gdew0 = this.a;
        if(gdew0.m) {
            return;
        }
        if((view0 instanceof gdbk)) {
            this.h(((gdbk)view0).j());
            this.j = true;
            if(gdew0.c) {
                gcfz.b(this.h, ((gdbk)view0).j());
                if(!gdew0.f) {
                    gdbp gdbp0 = this.e;
                    if(gdbp0 != null) {
                        gdbp0.av();
                    }
                    gdcb.ai(this.getContext(), view0);
                }
                this.k = true;
                gdew0.v(2);
                this.f.T(9, Bundle.EMPTY);
            }
            else {
                LogContext logContext0 = this.h;
                if(logContext0 != null) {
                    gcfz.b(logContext0.b, this.g);
                }
                if(this.e == null || this.e.aw()) {
                    gdcb.ai(this.getContext(), view0);
                    gdew0.v(1);
                    this.f.T(9, Bundle.EMPTY);
                }
            }
        }
        this.d = true;
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("superInstanceState"));
        Parcelable parcelable1 = ((Bundle)parcelable0).getParcelable("expandableInstanceState");
        this.a.q(parcelable1);
        this.d = ((Bundle)parcelable0).getBoolean("userInteractedWith");
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putParcelable("superInstanceState", super.onSaveInstanceState());
        ((Bundle)parcelable0).putParcelable("expandableInstanceState", this.a.b());
        ((Bundle)parcelable0).putBoolean("userInteractedWith", this.d);
        return parcelable0;
    }

    private final void p() {
        this.a.n = this;
        this.a.e(this);
    }

    private final void q(View view0, boolean z, boolean z1, String s) {
        boolean z2 = this.a.c;
        boolean z3 = true;
        boolean z4 = view0 == this.b;
        view0.setVisibility((z2 || z4 ? 0 : 8));
        view0.setEnabled(this.isEnabled());
        if(z2 || !z1) {
            z3 = false;
        }
        ((gdbk)view0).l(z4, z3);
        ((gdbk)view0).c(z2, z);
        ((gdbk)view0).b(s);
    }

    @Override  // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        this.b = null;
    }

    @Override  // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            this.getChildAt(v1).setEnabled(z);
        }
    }
}


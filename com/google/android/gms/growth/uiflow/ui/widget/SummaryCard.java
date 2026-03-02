package com.google.android.gms.growth.uiflow.ui.widget;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bvzy;
import bvzz;
import bwaa;
import bwab;
import bwac;
import bwad;
import bwae;
import bwaf;
import bwag;
import bwai;
import bwaj;
import bwak;
import bwal;
import bwam;
import bwan;
import bwao;
import bwap;
import bwaq;
import bwcd;
import bwdm;
import bwdz;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import ibnn;
import ibnz;
import ibuq;
import jtc;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SummaryCard extends MaterialCardView implements bwcd {
    private final ibnn A;
    private final ibnn B;
    private final ibnn C;
    public ConstraintLayout g;
    public jtc h;
    public int i;
    public bwdm j;
    public boolean k;
    public final ibnn l;
    public static final int m;
    private final Context n;
    private final ibnn o;
    private final ibnn p;
    private final ibnn q;
    private final ibnn r;
    private final ibnn s;
    private final ibnn v;
    private final ibnn w;
    private final ibnn x;
    private final ibnn y;
    private final ibnn z;

    public SummaryCard(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public SummaryCard(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public SummaryCard(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        this.n = context0;
        this.k = true;
        this.o = new ibnz(new bwaa(this));
        this.p = new ibnz(new bwaf(this));
        this.q = new ibnz(new bwag(this));
        this.r = new ibnz(new bwai(this));
        this.s = new ibnz(new bwaj(this));
        this.v = new ibnz(new bwak(this));
        this.l = new ibnz(new bwal(this));
        this.w = new ibnz(new bwam(this));
        this.x = new ibnz(new bwan(this));
        this.y = new ibnz(new bwao(this));
        this.z = new ibnz(new bwab(this));
        this.A = new ibnz(new bwac(this));
        this.B = new ibnz(new bwad(this));
        this.C = new ibnz(new bwae(this));
    }

    public SummaryCard(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // bwcd
    public final void g(bwdm bwdm0) {
        this.j = bwdm0;
        LayoutInflater.from(this.n).inflate((bwdm0.h() ? 0x7F0E0C05 : 0x7F0E0C04), this, true);  // layout:uiflow_summary_card_expandable_contents_bc25
        bwdz.g(this, new bwap(this));
        this.setOnClickListener(new bwaq(this));
    }

    public final int h() {
        return ((Number)this.C.a()).intValue();
    }

    public final int i() {
        return ((Number)this.r.a()).intValue();
    }

    public final int j() {
        return ((Number)this.s.a()).intValue();
    }

    public final View k() {
        return (View)this.y.a();
    }

    public final ScrollView l() {
        return (ScrollView)this.v.a();
    }

    public final TextView m() {
        return (TextView)this.A.a();
    }

    public final TextView n() {
        return (TextView)this.w.a();
    }

    public final MaterialButton o() {
        return (MaterialButton)this.B.a();
    }

    public final MaterialButton p() {
        return (MaterialButton)this.x.a();
    }

    public final void q(boolean z) {
        TextUtils.TruncateAt textUtils$TruncateAt0 = null;
        if(z) {
            ScrollView scrollView0 = this.l();
            long v = this.k ? 400L : 300L;
            bwdm bwdm0 = this.j;
            if(bwdm0 == null) {
                ibuq.j("uiFlowFlags");
                bwdm0 = null;
            }
            bwdz.h(scrollView0, v, bwdm0.e());
        }
        this.k ^= 1;
        ConstraintLayout constraintLayout0 = this.g;
        if(constraintLayout0 == null) {
            ibuq.j("constraintLayout");
            constraintLayout0 = null;
        }
        bvzy bvzy0 = new bvzy(this);
        ibuq.f(constraintLayout0, "<this>");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = constraintLayout0.getLayoutParams();
        ibuq.c(viewGroup$LayoutParams0);
        bvzy0.a(viewGroup$LayoutParams0);
        constraintLayout0.setLayoutParams(viewGroup$LayoutParams0);
        if(this.k) {
            jtc jtc0 = this.h;
            if(jtc0 == null) {
                ibuq.j("collapsedConstraints");
                jtc0 = null;
            }
            ConstraintLayout constraintLayout1 = this.g;
            if(constraintLayout1 == null) {
                ibuq.j("constraintLayout");
                constraintLayout1 = null;
            }
            jtc0.c(constraintLayout1);
            this.p().setContentDescription("Expand");
            this.p().v(0x7F080B6E);  // drawable:quantum_gm_ic_expand_more_vd_theme_24
            TextView textView0 = this.n();
            bwdm bwdm1 = this.j;
            if(bwdm1 == null) {
                ibuq.j("uiFlowFlags");
                bwdm1 = null;
            }
            if(!bwdm1.h()) {
                textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
            }
            textView0.setEllipsize(textUtils$TruncateAt0);
        }
        else {
            jtc jtc1 = bwdz.k(this) ? ((jtc)this.o.a()) : ((jtc)this.p.a());
            ConstraintLayout constraintLayout2 = this.g;
            if(constraintLayout2 == null) {
                ibuq.j("constraintLayout");
                constraintLayout2 = null;
            }
            jtc1.c(constraintLayout2);
            this.p().setContentDescription("Collapse");
            this.p().v(0x7F080B6D);  // drawable:quantum_gm_ic_expand_less_vd_theme_24
            this.n().setEllipsize(null);
            if(bwdz.j(this)) {
                bwdz.g(this, new bvzz(this));
            }
        }
        int v1 = this.k ? 8 : 0;
        this.k().setVisibility(v1);
        ((View)this.z.a()).setVisibility(v1);
        this.m().setVisibility(v1);
        if(!this.k && this.r()) {
            this.o().setVisibility(0);
        }
    }

    public final boolean r() {
        return ((Boolean)this.q.a()).booleanValue();
    }
}


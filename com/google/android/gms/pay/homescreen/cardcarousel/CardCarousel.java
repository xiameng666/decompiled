package com.google.android.gms.pay.homescreen.cardcarousel;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.cardview.widget.CardView;
import bbcu;
import bboh;
import doaw;
import dobd;
import dobe;
import dobf;
import dobg;
import dobh;
import dobt;
import dobw;
import doco;
import dodl;
import dodo;
import ednr;
import edns;
import edpa;
import gfqx;
import gfsx;
import gftb;
import gged_interceptors;
import ggtj;
import ibwt;
import tk;
import tx;
import ty;

public class CardCarousel extends RecyclerView implements dobt {
    public int ac;
    public float ad;
    public final float ae;
    public dobg af;
    public int ag;
    public float ah;
    public float ai;
    float aj;
    public View ak;
    public ednr al;
    public ednr am;
    private static final bboh an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private final Rect as;
    private dodl at;

    static {
        CardCarousel.an = bboh.b("Pay", bbcu.cZ);
    }

    public CardCarousel(Context context0) {
        this(context0, null);
    }

    public CardCarousel(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.as = new Rect();
        this.ag = -1;
        this.ah = 3.402823E+38f;
        this.ai = 3.402823E+38f;
        this.ae = this.getResources().getDimension(0x7F070581);  // dimen:edit_card_order_view_margin
    }

    public final float a() {
        if(this.ak != null && this.ak.isShown()) {
            return this.al == null ? 0.0f : ibwt.e(ibwt.d(((edns)this.al).a(this.ak.getX()), 0.0f), 1.0f);
        }
        return 0.0f;
    }

    public final float aK() {
        if(this.ak != null && this.ak.isShown()) {
            return this.al == null ? 0.0f : this.al.a(this.ak.getX());
        }
        return 0.0f;
    }

    @Override  // dobt
    public final int aL() {
        return this.ag;
    }

    public final tk aM() {
        tk tk0 = this.m;
        gftb.check(tk0);
        return tk0;
    }

    public final void aN() {
        tx tx0 = this.h();
        if(tx0 != null && tx0.ad()) {
            this.getContext();
            this.ap(new dobe(this));
        }
    }

    public final void aO() {
        tx tx0 = this.h();
        if(tx0 != null && !tx0.ad()) {
            this.getContext();
            this.ap(new LinearLayoutManager(0, false));
        }
    }

    public final void aP(View view0) {
        this.aQ(view0, gfqx.a);
    }

    public final void aQ(View view0, gfsx gfsx0) {
        View view1 = this.ak;
        if(view1 != null) {
            view1.setAlpha(this.a());
        }
        Object object0 = view0.getTag();
        gftb.check(object0);
        float f = (float)this.getWidth();
        int v = view0.getRight() + view0.getLeft();
        if(!(((doco)object0) instanceof dodo) && !(((doco)object0) instanceof doaw)) {
            CardView cardView0 = ((doco)object0).F();
            gftb.check(cardView0);
            float f1 = (float)view0.getWidth();
            float f2 = Math.max(this.aj, 1.0f - Math.abs((((float)v) / 2.0f - f / 2.0f) / f1));
            if(gfsx0.i() && (f2 > this.aj)) {
                f2 = (float)(((Float)gfsx0.d()));
            }
            cardView0.setScaleX(f2);
            cardView0.setScaleY(f2);
            float f3 = f2 - this.aj;
            float f4 = 1.0f - this.aj;
            float f5 = this.getResources().getDisplayMetrics().density;
            cardView0.f((((float)((doco)object0).E()) + ((float)(((doco)object0).D() - ((doco)object0).E())) * (f3 / f4)) * f5);
        }
        int v1 = ((float)v) / 2.0f < f / 2.0f ? view0.getRight() + this.ap : view0.getLeft() - this.ap;
        if(((((doco)object0) instanceof dodo) && ((double)this.aK()) > 0.5) || (Math.abs(((float)v) / 2.0f - f / 2.0f) < this.ai)) {
            int v2 = this.c(view0);
            if(v2 == -1) {
                ((ggtj)CardCarousel.an.j()).x("Recycler view and adapter out of sync");
                return;
            }
            this.ag = v2;
            this.ah = ((float)v1) - f / 2.0f;
            this.ai = Math.abs(((float)v) / 2.0f - f / 2.0f);
        }
    }

    @Override  // android.support.v7.widget.RecyclerView
    public final void al(int v) {
        super.al(v);
        this.ag = v;
        this.af.c(v);
        ((ggtj)CardCarousel.an.h()).z("Scrolled to position %s", v);
    }

    @Override  // android.support.v7.widget.RecyclerView
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getContext();
        this.ap(new LinearLayoutManager(0, false));
        this.aj = 0.82f;
        this.aN();
        this.ao(new dobw());
        this.setClipToPadding(false);
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        int v = Math.min(displayMetrics0.widthPixels, displayMetrics0.heightPixels);
        this.ac = v;
        this.ad = 0.88f;
        this.ar = Math.round(((float)v) * 0.88f);
        this.ap = Math.round(((float)this.ac) * -0.065f);
        float f = this.getResources().getDimension(0x7F07030C);  // dimen:card_carousel_card_margin_horizontal
        int v1 = Math.round(f + f);
        this.ao = v1;
        int v2 = (this.ac - (this.ar + v1)) / 2 - this.ap;
        this.aq = v2;
        this.setPadding(v2, this.getPaddingTop(), this.aq, this.getPaddingBottom());
        this.D(new dobf(this));
        new dobh(this).e(this);
        dodl dodl0 = new dodl(this.getContext());
        this.at = dodl0;
        this.A(dodl0);
        this.C(new edpa(this));
    }

    @Override  // android.support.v7.widget.RecyclerView
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = null;
    }

    @Override  // android.support.v7.widget.RecyclerView
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        int v4 = this.getWidth();
        int v5 = this.getHeight();
        this.as.set(0, 0, v4, v5);
        this.setSystemGestureExclusionRects(gged_interceptors.l(this.as));
    }

    @Override  // android.view.ViewGroup
    public final void onViewAdded(View view0) {
        super.onViewAdded(view0);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        gftb.check(viewGroup$LayoutParams0);
        if((view0 instanceof EditCardOrderView)) {
            this.ak = view0;
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.findViewById(0x7F0B0120).getLayoutParams();  // id:Button
            if(viewGroup$MarginLayoutParams0 != null) {
                viewGroup$MarginLayoutParams0.leftMargin = 0;
                viewGroup$MarginLayoutParams0.rightMargin = 0;
            }
            int v = Math.round(this.ae - ((float)this.ap) - (((float)this.ar) - this.aj * ((float)this.ar) + ((float)this.ao)) / 2.0f);
            float f = (float)this.aq;
            int v1 = this.getLayoutDirection();
            int v2 = (int)(this.ae - f);
            ((ty)viewGroup$LayoutParams0).leftMargin = v1 == 1 ? v2 : v;
            if(v1 != 1) {
                v = v2;
            }
            ((ty)viewGroup$LayoutParams0).rightMargin = v;
        }
        else {
            ((ty)viewGroup$LayoutParams0).leftMargin = this.ap;
            ((ty)viewGroup$LayoutParams0).rightMargin = this.ap;
        }
        view0.addOnLayoutChangeListener(new dobd(this, view0));
    }
}


package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import du;
import frqp;
import frsk;
import frst;
import frtf;
import frwl;
import frwm;
import frws;
import frwt;
import frwu;
import frwv;
import hhnj;
import hhnk;
import hhog;
import hhou;
import iajk;

public class SurveyViewPager extends ViewPager {
    public frwl h;

    public SurveyViewPager(Context context0) {
        super(context0);
        this.D();
    }

    public SurveyViewPager(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.D();
    }

    public final boolean A() {
        frwv frwv0 = (frwv)this.b;
        if(frwv0 == null) {
            Log.e("SurveyViewPager", "Error, survey view pager adapter is null!");
            return false;
        }
        if(frst.a() && this.u() != null && frwv0.q(this.c) != null && (frwv0.q(this.c).b & 1) != 0) {
            hhou hhou0 = ((frwv)this.b).q(this.c).k;
            if(hhou0 == null) {
                hhou0 = hhou.a;
            }
            return hhnj.a((hhou0.d == null ? hhnk.a : hhou0.d).b) == 5;
        }
        return frst.c(iajk.c(frst.b)) ? this.c == frwv0.j() - (frwv0.b == frqp.a ? 2 : 1) : this.c == frwv0.j() - 2;
    }

    public final boolean B() {
        if(frst.c(iajk.c(frst.b))) {
            frwv frwv0 = (frwv)this.b;
            if(frwv0 == null) {
                Log.e("SurveyViewPager", "Error, survey view pager adapter is null!");
                return false;
            }
            return ((frwm)frwv0.a.get(this.c)).b == 5;
        }
        return this.c == this.b.j() - 1;
    }

    private final View C() {
        if(this.b != null) {
            frtf frtf0 = this.u();
            return frtf0 == null ? null : frtf0.getView();
        }
        return null;
    }

    private final void D() {
        frwu frwu0 = new frwu(this);
        this.d(frwu0);
        this.post(new frwt(this, frwu0));
    }

    @Override  // androidx.viewpager.widget.ViewPager
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        int v = keyEvent0.getKeyCode();
        return v == 19 || v == 20 || v == 21 || v == 22 || (v == 0x10C || v == 0x10D || v == 270 || v == 0x10F) ? false : super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // androidx.viewpager.widget.ViewPager
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        return false;
    }

    @Override  // androidx.viewpager.widget.ViewPager
    protected final void onMeasure(int v, int v1) {
        if(!frst.c(iajk.a.b().a(frst.b))) {
            if(this.getChildCount() == 0) {
                super.onMeasure(v, v1);
            }
            View view0 = this.C();
            if(view0 == null) {
                super.onMeasure(v, v1);
                return;
            }
            view0.measure(v, 0);
            int v2 = view0.getMeasuredHeight();
            Rect rect0 = new Rect();
            view0.getWindowVisibleDisplayFrame(rect0);
            int v3 = rect0.height() - view0.findViewById(0x7F0B21BF).getHeight();  // id:survey_question_header_logo_text
            int v4 = this.getResources().getDimensionPixelSize(0x7F0712C7);  // dimen:survey_card_vertical_margin
            super.onMeasure(v, View.MeasureSpec.makeMeasureSpec(Math.min(v2, v3 - (v4 + v4)), 0x40000000));
            return;
        }
        View view1 = this.C();
        if(view1 == null) {
            super.onMeasure(v, v1);
            return;
        }
        View view2 = this.h == null ? null : this.h.y().findViewById(0x7F0B21A3);  // id:survey_controls_container
        boolean z = this.h == null || this.h.E();
        super.onMeasure(v, frsk.b(this, view1, v, v1, view1.findViewById(0x7F0B21BF), view2, z));  // id:survey_question_header_logo_text
    }

    @Override  // androidx.viewpager.widget.ViewPager
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        return false;
    }

    public final frtf u() {
        frwl frwl0 = this.h;
        if(frwl0 != null) {
            int v = this.c;
            for(Object object0: frwl0.getSupportFragmentManager().o()) {
                du du0 = (du)object0;
                if(frwv.o(du0) == v && (du0 instanceof frtf)) {
                    return (frtf)du0;
                }
            }
        }
        return null;
    }

    public final hhog v() {
        frtf frtf0 = this.u();
        return frtf0 == null ? null : frtf0.A();
    }

    public final void w() {
        this.j(this.b.j() - 1, true);
        this.u().B();
    }

    public final void x(int v) {
        this.j(v, true);
        this.u().B();
    }

    public final void y(String s) {
        frtf frtf0 = this.u();
        if(frtf0 != null) {
            frtf0.D(s);
            return;
        }
        this.post(new frws(this, s));
    }

    public final boolean z() {
        return this.c == 0;
    }
}


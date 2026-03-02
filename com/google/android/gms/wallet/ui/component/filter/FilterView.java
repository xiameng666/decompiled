package com.google.android.gms.wallet.ui.component.filter;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.flexbox.FlexboxLayout;
import fcav;
import fcaw;
import fcay;
import fcaz;
import gcjk;
import gcjp;
import gdan;
import gdcl;
import gfev;
import gffq;
import hcer;
import hceu;
import java.util.List;
import java.util.Locale;
import ozo;
import pao;

public class FilterView extends FlexboxLayout implements View.OnClickListener, gcjk, gcjp, gdan {
    public ManageFiltersChipButton b;
    public hcer c;
    public fcaw d;
    public gdcl e;
    public fcay f;
    public boolean g;
    public pao h;
    public ozo i;

    public FilterView(Context context0) {
        super(context0);
    }

    public FilterView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public FilterView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // gcjp
    public final void K(gffq gffq0, List list0) {
        int v = gfev.a(gffq0.e);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        if(v - 1 != 27) {
            Locale locale0 = Locale.US;
            int v2 = gfev.a(gffq0.e);
            if(v2 != 0) {
                v1 = v2;
            }
            throw new IllegalArgumentException(String.format(locale0, "FilterView does not handle resulting action type %s", ((int)(v1 - 1))));
        }
        if(this.g) {
            ozo ozo0 = this.i;
            ozo0.b = new fcaz(this);
            this.h.g(this.i);
            return;
        }
        this.z();
    }

    @Override  // gdan
    public final boolean lb(List list0) {
        return this.d.lb(list0);
    }

    @Override  // gdan
    public final boolean ld(List list0) {
        return this.d.ld(list0);
    }

    @Override  // gdan
    public final boolean le() {
        return this.d.le();
    }

    @Override  // gcjk
    public final void lr() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if((view0 instanceof gcjk)) {
                ((gcjk)view0).lr();
            }
        }
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(view0 == this.b) {
            fcay fcay0 = this.f;
            if(fcay0 != null) {
                fcay0.bW(this.c);
            }
        }
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if((parcelable0 instanceof Bundle)) {
            super.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("parentState"));
            this.setVisibility(((Bundle)parcelable0).getInt("viewVisibility"));
            return;
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putParcelable("parentState", super.onSaveInstanceState());
        ((Bundle)parcelable0).putInt("viewVisibility", this.getVisibility());
        return parcelable0;
    }

    @Override  // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            this.getChildAt(v1).setEnabled(z);
        }
        fcaw fcaw0 = this.d;
        fcaw0.a = (fcav)fcaw0.b.b.h("FilterCategoryDialogFragment");
        fcav fcav0 = fcaw0.a;
        if(fcav0 != null) {
            fcav0.ll(z);
        }
    }

    public final hceu x() {
        return this.d.a();
    }

    public final void z() {
        if(this.getVisibility() == 0) {
            this.setVisibility(8);
            return;
        }
        this.setVisibility(0);
    }
}


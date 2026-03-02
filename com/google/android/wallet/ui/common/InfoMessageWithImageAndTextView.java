package com.google.android.wallet.ui.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import gamj;
import gdaj;
import gdao;
import gfev;
import gffq;
import gfgo;
import gfgr;
import java.util.List;
import java.util.Locale;

public class InfoMessageWithImageAndTextView extends LinearLayout implements gdao {
    public gfgr a;
    public InfoMessageView b;
    public ImageWithCaptionView c;
    public gdaj d;

    public InfoMessageWithImageAndTextView(Context context0) {
        super(context0);
    }

    public InfoMessageWithImageAndTextView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public InfoMessageWithImageAndTextView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // gami
    public final gamj B() {
        throw null;
    }

    @Override  // gcjp
    public final void K(gffq gffq0, List list0) {
        int v = gfev.a(gffq0.e);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        switch(v - 1) {
            case 1: {
                this.setVisibility(0);
                return;
            }
            case 11: {
                this.setVisibility(8);
                return;
            }
            default: {
                Locale locale0 = Locale.US;
                int v2 = gfev.a(gffq0.e);
                if(v2 != 0) {
                    v1 = v2;
                }
                throw new IllegalArgumentException(String.format(locale0, "Unsupported resulting action type: %s", ((int)(v1 - 1))));
            }
        }
    }

    @Override  // gdaj
    public final gdaj aV() {
        return this.d;
    }

    @Override  // gdaj
    public final String aX(String s) {
        return "";
    }

    @Override  // gdao
    public final View b() {
        return this;
    }

    @Override  // gdao
    public final gfgr c() {
        return this.a;
    }

    @Override  // gczt
    public final CharSequence getError() {
        return "";
    }

    @Override  // gami
    public final List li() {
        return null;
    }

    @Override  // gami
    public final void lu() {
    }

    @Override  // gczt
    public final void nT(CharSequence charSequence0, boolean z) {
    }

    @Override  // gczt
    public final boolean nW() {
        return true;
    }

    @Override  // gczt
    public final boolean nX() {
        return this.b.nX();
    }

    @Override  // gczt
    public final boolean nY() {
        return true;
    }

    @Override  // gczt
    public final boolean nZ(Object object0) {
        return (object0 instanceof gfgr) && TextUtils.equals(((gfgr)object0).f, this.a.f) && TextUtils.equals(((gfgr)object0).g, this.a.g) && ((gfgr)object0).d.size() == 1 && ((gfgo)((gfgr)object0).d.get(0)).d.equals(((gfgo)this.a.d.get(0)).d);
    }

    @Override  // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.c.setEnabled(z);
        this.b.setEnabled(z);
    }
}


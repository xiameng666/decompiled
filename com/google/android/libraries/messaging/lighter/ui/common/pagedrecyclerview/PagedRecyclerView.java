package com.google.android.libraries.messaging.lighter.ui.common.pagedrecyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import fmrl;
import fmry;
import fmrz;
import fmsa;
import fmsb;
import fmxp;
import ggch;
import kv;

public class PagedRecyclerView extends RecyclerView {
    public final LinearLayoutManager ac;
    public Drawable ad;
    public fmxp ae;
    private fmsb af;

    public PagedRecyclerView(Context context0) {
        this(context0, null);
    }

    public PagedRecyclerView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public PagedRecyclerView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        Drawable drawable0;
        this.ae = null;
        this.getContext();
        fmry fmry0 = new fmry(this);
        this.ac = fmry0;
        this.ap(fmry0);
        this.an(new fmrz());
        boolean z = false;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, fmrl.b, v, 0);
        int v1 = typedArray0.getInteger(1, fmsb.a.c);
        this.af = (fmsb)ggch.k(fmsb.values()).c(new fmsa(v1)).f(fmsb.a);
        if(typedArray0.hasValue(0)) {
            int v2 = typedArray0.getResourceId(0, 0);
            if(v2 == 0) {
                drawable0 = typedArray0.getDrawable(0);
            }
            else {
                drawable0 = kv.a(context0, v2);
                if(drawable0 == null) {
                    drawable0 = typedArray0.getDrawable(0);
                }
            }
        }
        else {
            drawable0 = typedArray0.getDrawable(0);
        }
        this.ad = drawable0;
        typedArray0.recycle();
        if(this.af == fmsb.b) {
            z = true;
        }
        fmry0.ac(z);
    }
}


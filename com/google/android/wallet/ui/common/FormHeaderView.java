package com.google.android.wallet.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import gcqu;
import gcqy;
import gczt;
import gdaj;
import gdcb;
import gewg;
import gfgr;
import java.util.List;

public class FormHeaderView extends LinearLayout implements gczt {
    private int a;
    private gewg b;
    private gcqy c;

    public FormHeaderView(Context context0) {
        super(context0);
        this.setVisibility(this.getVisibility());
    }

    public FormHeaderView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.setVisibility(this.getVisibility());
    }

    public FormHeaderView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.setVisibility(this.getVisibility());
    }

    public FormHeaderView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.setVisibility(this.getVisibility());
    }

    public final void a(gewg gewg0, LayoutInflater layoutInflater0, gcqu gcqu0, List list0) {
        if(!gewg0.f.isEmpty()) {
            TextView textView0 = (TextView)this.findViewById(0x7F0B165E);  // id:header_title
            textView0.setText(gewg0.f);
            textView0.setVisibility(0);
        }
        TypedArray typedArray0 = layoutInflater0.getContext().obtainStyledAttributes(new int[]{0x7F0406D0});  // attr:internalUicInfoMessageLayout
        int v = typedArray0.getResourceId(0, 0x7F0E0C49);  // layout:view_info_message_text
        typedArray0.recycle();
        boolean z = this.isEnabled();
        for(Object object0: gewg0.g) {
            InfoMessageView infoMessageView0 = (InfoMessageView)layoutInflater0.inflate(v, this, false);
            if(this.c == null) {
                this.c = gcqy.c();
            }
            infoMessageView0.setId(this.c.a());
            infoMessageView0.p(((gfgr)object0));
            infoMessageView0.h = gcqu0;
            this.addView(infoMessageView0);
            list0.add(infoMessageView0);
            infoMessageView0.setEnabled(z);
        }
        this.b = gewg0;
        this.setVisibility(this.a);
    }

    @Override  // gdaj
    public final gdaj aV() {
        return null;
    }

    @Override  // gdaj
    public final String aX(String s) {
        return "";
    }

    @Override  // gczt
    public final CharSequence getError() {
        return null;
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
        if(this.hasFocus() || !this.requestFocus()) {
            gdcb.G(this);
        }
        return this.hasFocus();
    }

    @Override  // gczt
    public final boolean nY() {
        return true;
    }

    @Override  // gczt
    public final boolean nZ(Object object0) {
        return false;
    }

    @Override  // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("superSavedState"));
        this.c = gcqy.e(((Bundle)parcelable0));
    }

    @Override  // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putParcelable("superSavedState", super.onSaveInstanceState());
        gcqy gcqy0 = this.c;
        if(gcqy0 != null) {
            gcqy0.h(((Bundle)parcelable0));
        }
        return parcelable0;
    }

    @Override  // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            this.getChildAt(v1).setEnabled(z);
        }
    }

    @Override  // android.view.View
    public final void setVisibility(int v) {
        this.a = v;
        if(this.b != null && (!this.b.f.isEmpty() || this.b.g.size() != 0)) {
            super.setVisibility(v);
            return;
        }
        super.setVisibility(8);
    }
}


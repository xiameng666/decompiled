package com.google.android.gms.multidevice.ui.bannermessage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import cucf;
import cucg;
import ibnn;
import ibnz;
import ibuq;

public final class InlineBannerMessage extends LinearLayout {
    private final ibnn a;
    private final ibnn b;

    public InlineBannerMessage(Context context0) {
        ibuq.f(context0, "context");
        super(context0);
        this.a = new ibnz(new cucf(this));
        this.b = new ibnz(new cucg(this));
        LayoutInflater.from(this.getContext()).inflate(0x7F0E04F4, this);  // layout:inline_banner_message
    }

    public InlineBannerMessage(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0);
        this.a = new ibnz(new cucf(this));
        this.b = new ibnz(new cucg(this));
        LayoutInflater.from(this.getContext()).inflate(0x7F0E04F4, this);  // layout:inline_banner_message
    }

    public InlineBannerMessage(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        this.a = new ibnz(new cucf(this));
        this.b = new ibnz(new cucg(this));
        LayoutInflater.from(this.getContext()).inflate(0x7F0E04F4, this);  // layout:inline_banner_message
    }

    public InlineBannerMessage(Context context0, AttributeSet attributeSet0, int v, int v1) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v, v1);
        this.a = new ibnz(new cucf(this));
        this.b = new ibnz(new cucg(this));
        LayoutInflater.from(this.getContext()).inflate(0x7F0E04F4, this);  // layout:inline_banner_message
    }

    public final TextView a() {
        Object object0 = this.b.a();
        ibuq.e(object0, "getValue(...)");
        return (TextView)object0;
    }

    public final TextView b() {
        Object object0 = this.a.a();
        ibuq.e(object0, "getValue(...)");
        return (TextView)object0;
    }
}


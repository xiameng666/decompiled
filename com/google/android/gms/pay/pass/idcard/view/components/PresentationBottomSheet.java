package com.google.android.gms.pay.pass.idcard.view.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import cvq;
import dukc;
import dukd;
import dukf;
import dukt;
import duld;
import fryu;
import fyx;
import gra;
import gui;
import gul;
import gze;
import ibuq;
import icbb;
import icck;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PresentationBottomSheet extends FrameLayout {
    public icck a;
    public cvq b;
    public fyx c;
    public gui d;
    private final gra e;
    private ComposeView f;

    public PresentationBottomSheet(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public PresentationBottomSheet(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public PresentationBottomSheet(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0);
        this.e = new ParcelableSnapshotMutableState(new dukt(new fryu(""), null, null, new duld(new fryu(""), null, 14), null, null, null, null, 0x3F6, null), gul.a);
        ComposeView composeView0 = new ComposeView(context0, null, 0, 6, null);
        this.f = composeView0;
        composeView0.j();
        this.addView(this.f);
        this.f.a(new gze(0x48E33D1, true, new dukc(this)));
    }

    public PresentationBottomSheet(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final dukt a() {
        return (dukt)this.e.a();
    }

    public final void b() {
        icck icck0 = this.a;
        if(icck0 != null) {
            icbb.b(icck0, null, null, new dukd(this, null), 3);
        }
    }

    public final void c(dukt dukt0) {
        this.e.b(dukt0);
    }

    public final void d() {
        icck icck0 = this.a;
        if(icck0 != null) {
            icbb.b(icck0, null, null, new dukf(this, null), 3);
        }
    }

    @Override  // android.view.View
    public final void setVisibility(int v) {
        super.setVisibility(v);
        boolean z = this.d != null && ((Boolean)this.d.a()).booleanValue();
        switch(v) {
            case 0: {
                if(!z) {
                    this.d();
                }
                break;
            }
            case 4: 
            case 8: {
                if(z) {
                    this.b();
                }
            }
        }
        this.f.setVisibility(v);
    }
}


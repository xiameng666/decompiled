package com.google.android.gms.pay.pass.idcard.view.components;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import dujo;
import dujy;
import edmp;
import gra;
import gtyc;
import gul;
import gze;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class MsoDropDown extends FrameLayout {
    public static final edmp a;
    private final gra b;
    private ComposeView c;

    static {
        MsoDropDown.a = edmp.f();
    }

    public MsoDropDown(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public MsoDropDown(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public MsoDropDown(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtyc.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        this.b = new ParcelableSnapshotMutableState(new dujy(false, ((gtyc)hftv0), null), gul.a);
        ComposeView composeView0 = new ComposeView(context0, null, 0, 6, null);
        this.c = composeView0;
        this.addView(composeView0);
        this.c.a(new gze(1144601233, true, new dujo(this)));
    }

    public MsoDropDown(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final dujy a() {
        return (dujy)this.b.a();
    }

    public final void b(dujy dujy0) {
        this.b.b(dujy0);
    }

    @Override  // android.view.View
    public final void setVisibility(int v) {
        super.setVisibility(v);
        this.c.setVisibility(v);
    }
}


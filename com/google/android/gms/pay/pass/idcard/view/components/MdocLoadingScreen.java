package com.google.android.gms.pay.pass.idcard.view.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import dujd;
import dujf;
import fryu;
import gra;
import gul;
import gze;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class MdocLoadingScreen extends FrameLayout {
    public final gra a;
    private ComposeView b;

    public MdocLoadingScreen(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public MdocLoadingScreen(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public MdocLoadingScreen(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0);
        this.a = new ParcelableSnapshotMutableState(new dujd(new fryu("")), gul.a);
        ComposeView composeView0 = new ComposeView(context0, null, 0, 6, null);
        this.b = composeView0;
        composeView0.j();
        this.addView(this.b);
        this.b.a(new gze(-2075913269, true, new dujf(this)));
    }

    public MdocLoadingScreen(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final void a(dujd dujd0) {
        this.a.b(dujd0);
    }

    @Override  // android.view.View
    public final void setVisibility(int v) {
        super.setVisibility(v);
        this.b.setVisibility(v);
    }
}


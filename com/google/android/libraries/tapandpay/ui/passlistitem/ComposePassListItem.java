package com.google.android.libraries.tapandpay.ui.passlistitem;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import fryh;
import fryu;
import ftxs;
import ftyi;
import ftym;
import fuaz;
import fulu;
import ggna;
import gra;
import gul;
import gze;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ComposePassListItem extends FrameLayout {
    public final gra a;
    private final gra b;
    private final ComposeView c;

    public ComposePassListItem(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 2, null);
    }

    public ComposePassListItem(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0);
        this.b = new ParcelableSnapshotMutableState(new ftyi(new fuaz(new fryh(0), null, null, null, 30), new ftym(new fryu("")), null, null, ftxs.a, null, null, false, ggna.a, null), gul.a);
        this.a = new ParcelableSnapshotMutableState(null, gul.a);
        ComposeView composeView0 = new ComposeView(context0, attributeSet0, 0, 4, null);
        this.c = composeView0;
        this.addView(composeView0);
        composeView0.a(new gze(790850983, true, new fulu(this)));
    }

    public ComposePassListItem(Context context0, AttributeSet attributeSet0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    public final ftyi a() {
        return (ftyi)this.b.a();
    }

    public final void b(ftyi ftyi0) {
        this.b.b(ftyi0);
    }

    @Override  // android.view.View
    public final void setVisibility(int v) {
        super.setVisibility(v);
        this.c.setVisibility(v);
    }
}


package com.google.android.libraries.tapandpay.ui.foprow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import fryh;
import fryu;
import ftxi;
import fujl;
import fulk;
import fulm;
import gra;
import gul;
import gze;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FopRow extends FrameLayout {
    private final gra a;
    private ComposeView b;

    public FopRow(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 2, null);
    }

    public FopRow(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0);
        this.a = new ParcelableSnapshotMutableState(new ftxi(new fujl(new fryh(0), null, null, null, false, null, false, 0xFE), new fryu(""), null, null, null, null, null, false, false, null, null, 0, null, false, 0x7FFC), gul.a);
        if(this.getLayoutParams() == null && attributeSet0 == null) {
            this.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        }
        ComposeView composeView0 = new ComposeView(context0, null, 0, 6, null);
        this.b = composeView0;
        this.addView(composeView0);
        composeView0.a(new gze(-771440018, true, new fulm(this)));
    }

    public FopRow(Context context0, AttributeSet attributeSet0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    public final ftxi a() {
        return (ftxi)this.a.a();
    }

    public final void b(ftxi ftxi0) {
        ibuq.f(ftxi0, "<set-?>");
        this.a.b(ftxi0);
    }

    @Override  // android.view.View
    public final void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        if(view$OnClickListener0 == null) {
            this.b(ftxi.c(this.a(), null, null, null, false, 0x7DFF));
            return;
        }
        this.b(ftxi.c(this.a(), null, new fulk(view$OnClickListener0, this), null, false, 0x7DFF));
    }

    @Override  // android.view.View
    public final void setVisibility(int v) {
        super.setVisibility(v);
        this.b.setVisibility(v);
    }
}


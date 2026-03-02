package com.google.android.libraries.tapandpay.ui.bulletin;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import fryu;
import ftsv;
import ftsw;
import ftsx;
import ftvp;
import ftvr;
import fyx;
import gra;
import gul;
import gze;
import ibuq;
import icbb;
import icck;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Bulletin extends FrameLayout {
    public final gra a;
    public fyx b;
    public icck c;
    private final gra d;
    private ComposeView e;

    public Bulletin(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public Bulletin(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public Bulletin(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0);
        this.a = new ParcelableSnapshotMutableState(new ftvr(new fryu(""), null, null, new ftvp()), gul.a);
        this.d = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
        ComposeView composeView0 = new ComposeView(context0, null, 0, 6, null);
        this.e = composeView0;
        this.addView(composeView0);
        composeView0.a(new gze(-1634043846, true, new ftsv(this)));
    }

    public Bulletin(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final void a(boolean z) {
        this.d.b(Boolean.valueOf(z));
    }

    public final void b(ftvr ftvr0) {
        this.a.b(ftvr0);
    }

    public final boolean c() {
        return ((Boolean)this.d.a()).booleanValue();
    }

    @Override  // android.view.View
    public final void setVisibility(int v) {
        super.setVisibility(v);
        switch(v) {
            case 0: {
                if(!this.c()) {
                    icck icck0 = this.c;
                    if(icck0 != null) {
                        icbb.b(icck0, null, null, new ftsx(this, null), 3);
                    }
                }
                break;
            }
            case 4: 
            case 8: {
                if(this.c()) {
                    icck icck1 = this.c;
                    if(icck1 != null) {
                        icbb.b(icck1, null, null, new ftsw(this, null), 3);
                    }
                }
            }
        }
        this.e.setVisibility(v);
    }
}


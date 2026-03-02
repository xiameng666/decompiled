package com.google.android.libraries.tapandpay.ui.actionbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import fryu;
import ftsc;
import ftsd;
import ftse;
import ftsh;
import ftsk;
import ftts;
import ftuw;
import ftvb;
import ftvc;
import fufz;
import gra;
import gul;
import gze;
import ibni;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ComposeActionBar extends FrameLayout {
    public final gra a;
    private final gra b;
    private int c;

    public ComposeActionBar(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public ComposeActionBar(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public ComposeActionBar(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        ftvb ftvb0;
        super(context0, attributeSet0, v);
        this.a = new ParcelableSnapshotMutableState(null, gul.a);
        this.b = new ParcelableSnapshotMutableState(new ftuw(new ftts(new fryu(""), null, false, null, null, null, 0, null, null, new ftsc(), 510), null, false, null, null, null, null, false, 0xFE), gul.a);
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, ftsk.a, 0, 0);
        this.c = typedArray0.getResourceId(4, -1);
        int v1 = typedArray0.getInteger(3, -1);
        ftts ftts0 = v1 == -1 ? null : new ftts(new fryu(""), null, false, ComposeActionBar.h(v1), null, null, 0, null, null, new ftsd(), 502);
        int v2 = typedArray0.getInteger(3, -1);
        ftts ftts1 = v2 == -1 ? null : new ftts(new fryu(""), null, false, ComposeActionBar.h(v2), null, null, 0, null, null, new ftse(), 502);
        int v3 = typedArray0.getInteger(1, -1);
        switch(v3) {
            case 0: {
                ftvb0 = ftvb.a;
                break;
            }
            case 1: {
                ftvb0 = ftvb.b;
                break;
            }
            default: {
                ftvb0 = v3 == 2 ? ftvb.d : ftvb.c;
            }
        }
        this.d(new ftuw(ftts0, ftts1, false, null, null, ftvb0, null, typedArray0.getBoolean(0, false), 92));
        ComposeView composeView0 = new ComposeView(context0, null, 0, 6, null);
        this.addView(composeView0);
        composeView0.a(new gze(-1161050698, true, new ftsh(this)));
    }

    public ComposeActionBar(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final View a(View view0) {
        if(this.c != -1 && view0 != null) {
            return view0.getId() == this.c ? view0 : view0.findViewById(this.c);
        }
        return null;
    }

    public final ftuw b() {
        return (ftuw)this.b.a();
    }

    @ibni
    public final void c(boolean z) {
        ftuw ftuw0 = this.b();
        ftts ftts0 = this.b().a;
        this.d(ftuw.a(ftuw0, (ftts0 == null ? null : ftts.b(ftts0, null, z, null, 0x3FB)), null, false, null, null, false, 0xFE));
    }

    public final void d(ftuw ftuw0) {
        this.b.b(ftuw0);
    }

    public final void e(fufz fufz0) {
        this.a.b(fufz0);
    }

    @ibni
    public final void f() {
        this.d(ftuw.a(this.b(), null, null, true, null, null, false, 0xFB));
    }

    @ibni
    public final void g() {
        this.d(ftuw.a(this.b(), null, null, false, null, null, false, 0xFB));
    }

    private static final ftvc h(int v) {
        switch(v) {
            case 0: {
                return ftvc.a;
            }
            case 1: {
                return ftvc.b;
            }
            default: {
                return ftvc.c;
            }
        }
    }
}


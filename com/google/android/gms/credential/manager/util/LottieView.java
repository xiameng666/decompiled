package com.google.android.gms.credential.manager.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.PowerManager;
import android.util.AttributeSet;
import bbll;
import bblp;
import bdvu;
import bdwb;
import bdwc;
import bgmq;
import bgmx;
import com.google.android.gms.chimera.modules.credential.manager.AppContextProvider;
import hsas;
import zdd;

public class LottieView extends bgmx {
    public bdwc f;

    public LottieView(Context context0) {
        super(context0);
    }

    public LottieView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.C(attributeSet0);
    }

    public LottieView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.C(attributeSet0);
    }

    private final void C(AttributeSet attributeSet0) {
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, zdd.i);
        String s = typedArray0.hasValue(0) ? typedArray0.getString(0) : typedArray0.getString(1);
        boolean z = ((PowerManager)AppContextProvider.b().getSystemService("power")).isPowerSaveMode();
        int v = AppContextProvider.b().getResources().getConfiguration().uiMode & 0x30;
        hsas.e();
        if(v != 0x20 && !z) {
            s = typedArray0.getString(1);
        }
        if(s != null) {
            bbll bbll0 = new bbll(1, 9);
            this.f.a.a(bbll0, new bblp(0x7FFFFFFF, 10), bdvu.a(s), new bdwb()).b(new bgmq(this));
        }
        typedArray0.recycle();
    }
}


package com.google.android.location.fused;

import android.content.Context;
import com.google.android.gms.libs.punchclock.tracing.TracingGnssStatusCallback;
import fvxl;
import fvxn_FusionEngine;
import j..util.Objects;
import jyf;

public class FusionEngine.3 extends TracingGnssStatusCallback {
    public final fvxn_FusionEngine a;

    public FusionEngine.3(fvxn_FusionEngine fvxn0, Context context0) {
        Objects.requireNonNull(fvxn0);
        this.a = fvxn0;
        super(context0);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingGnssStatusCallback
    protected final void f(jyf jyf0) {
        fvxl fvxl0 = new fvxl(this, jyf0);
        this.a.c.a(fvxl0);
    }
}


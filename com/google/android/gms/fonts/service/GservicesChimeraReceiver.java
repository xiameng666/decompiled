package com.google.android.gms.fonts.service;

import brur;
import brvf;

public class GservicesChimeraReceiver extends brur {
    @Override  // brur
    protected final void a(brvf brvf0) {
        synchronized(brvf0.b) {
            brvf0.d = null;
            brvf0.e = null;
        }
        brvf0.h(this.a);
    }
}


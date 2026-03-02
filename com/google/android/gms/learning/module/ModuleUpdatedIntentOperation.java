package com.google.android.gms.learning.module;

import android.content.Intent;
import avzf;
import cbyw;
import cbzh;
import ccex;
import ccfl;
import ccfm;
import com.google.android.chimera.config.ModuleManager;
import fmzu;
import fmzy;
import gmap;
import gmbu;
import java.util.concurrent.TimeUnit;

public class ModuleUpdatedIntentOperation extends avzf {
    @Override  // avzf
    protected final void d(Intent intent0, boolean z) {
        ccfl.a();
        try(fmzu fmzu0 = fmzu.b(this)) {
            cbyw cbyw0 = (cbyw)fmzu0.c(cbyw.class);
            cbzh cbzh0 = (cbzh)fmzu0.c(cbzh.class);
            long v = ((fmzy)fmzu0.c(fmzy.class)).a() - TimeUnit.DAYS.toMillis(cbyw0.z());
            ccex ccex0 = (ccex)fmzu0.c(ccex.class);
            ModuleManager moduleManager0 = ModuleManager.get(this);
            fmzu0.d();
            gmbu.t(ccex0.a(), new ccfm(this, moduleManager0, v, cbyw0, cbzh0, fmzu0), gmap.a);
        }
    }
}


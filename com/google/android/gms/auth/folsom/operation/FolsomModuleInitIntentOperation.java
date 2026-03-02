package com.google.android.gms.auth.folsom.operation;

import ajvt;
import akea;
import android.content.Intent;
import android.text.TextUtils;
import avzf;
import azqk;
import baun;
import bbdg;
import bbmq;
import ccmq;
import hpuq;

public class FolsomModuleInitIntentOperation extends avzf {
    private static final baun a;

    static {
        FolsomModuleInitIntentOperation.a = akea.a("RecoverableKeyStoreGmsModuleInitIntentOperation");
    }

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        FolsomModuleInitIntentOperation.a.d("onInitRuntimeState. intent: %s, flags: %s", new Object[]{intent0, v});
        if(hpuq.c()) {
            ajvt.e(this.getApplicationContext(), 4);
            return;
        }
        int v1 = azqk.a(this);
        String[] arr_s = ajvt.b;
        for(int v2 = 0; v2 < 2; ++v2) {
            String s = arr_s[v2];
            if(TextUtils.equals(s, "com.google.android.gms.auth.folsom.service.GcmReceiverService") && v1 < 12656023) {
                ajvt.a.h(s + " is not supported. Ignore.", new Object[0]);
            }
            else {
                try {
                    if(ajvt.d(this, s)) {
                        ajvt.a.d("Disabling " + s + ".", new Object[0]);
                        bbmq.G(this, s, false);
                    }
                    else {
                        ajvt.a.d(s + " is already disabled. Ignore.", new Object[0]);
                    }
                }
                catch(IllegalArgumentException unused_ex) {
                    ajvt.a.d("Component " + s + " is not included in the container", new Object[0]);
                }
            }
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ccmq.a().a(bbdg.mM);
    }
}


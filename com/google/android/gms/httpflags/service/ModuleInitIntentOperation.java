package com.google.android.gms.httpflags.service;

import android.content.Intent;
import avzf;
import bbdg;
import bwjs;
import bwjv;
import ccmq;
import htyo;
import ibuq;

public final class ModuleInitIntentOperation extends avzf {
    @Override  // avzf
    protected final void a(Intent intent0, boolean z) {
        ibuq.f(intent0, "intent");
        try {
            if(htyo.a.b().e()) {
                bwjs.a(this);
            }
        }
        finally {
            bwjv.a(this);
        }
    }

    @Override  // avzf
    protected final void j(Intent intent0) {
        ibuq.f(intent0, "intent");
        try {
            if(htyo.a.b().d()) {
                bwjs.a(this);
            }
        }
        finally {
            bwjv.a(this);
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ccmq.a().a(bbdg.wm);
    }
}


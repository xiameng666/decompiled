package com.google.android.gms.play.integrity.api.service;

import android.content.Intent;
import avzf;
import bbcu;
import bbdg;
import bboh;
import ccmq;
import eiwt;

public class IntegrityApiInitIntentOperation extends avzf {
    static {
        bboh.b("PlayIntegrityApiModuleInit", bbcu.gf);
    }

    @Override  // avzf
    protected final void a(Intent intent0, boolean z) {
    }

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        eiwt.a(this.getApplicationContext());
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ccmq.a().a(bbdg.tf);
    }
}


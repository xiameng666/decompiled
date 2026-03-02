package com.google.android.gms.cast.devicesuggestions.service;

import android.content.Context;
import android.content.Intent;
import auej;
import auez;
import aufa;
import aufb;
import aufd;
import avzf;
import bbcu;
import bboh;
import com.google.android.chimera.config.ModuleManager;
import ggtj;
import ibuq;
import java.util.concurrent.Executor;

public final class SuggestionsInitIntentOperation extends avzf {
    private static final bboh a;

    static {
        SuggestionsInitIntentOperation.a = bboh.b("device_suggestions", bbcu.gU);
    }

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        Context context0 = this.getApplicationContext();
        Intent intent1 = new Intent().setClassName(this, "com.google.android.gms.cast.devicesuggestions.SuggestionsProviderChimeraService");
        ibuq.e(intent1, "setClassName(...)");
        ibuq.c(context0);
        if(!aufd.c(context0)) {
            ((ggtj)SuggestionsInitIntentOperation.a.h()).x("Device suggestions feature is unavailable.");
            this.stopService(intent1);
            return;
        }
        if(aufd.e(ModuleManager.get(context0))) {
            ibuq.e("com.google.android.gms", "getPackageName(...)");
            auez auez0 = auej.a("com.google.android.gms");
            Executor executor0 = context0.getMainExecutor();
            ibuq.e(executor0, "getMainExecutor(...)");
            auez0.b(executor0, new aufa(this, intent1), new aufb(this, intent1));
            return;
        }
        this.startService(intent1);
    }
}


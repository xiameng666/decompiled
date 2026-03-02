package com.google.android.gms.play.integrity.autoprotect.service;

import android.content.Context;
import android.content.Intent;
import babh;
import bbcu;
import bbdg;
import bboh;
import ccmq;
import chmt;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.play.integrity.autoprotect.AppContextProvider;
import eixe;
import eixf;
import eixg;
import hxpe;
import j..util.Objects;
import j..util.Optional;

public class AipTelemetryIntentOperation extends IntentOperation {
    public static final bboh a;
    public final eixg b;

    static {
        AipTelemetryIntentOperation.a = bboh.b("AipTelemetryIntentOperation", bbcu.gg);
    }

    public AipTelemetryIntentOperation() {
        AppContextProvider appContextProvider0 = AppContextProvider.c;
        Context context0 = appContextProvider0 == null ? babh.a() : appContextProvider0.a;
        this.b = new eixg(context0);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.wN);
        if(Objects.equals(intent0.getAction(), "com.google.android.gms.play.integrity.autoprotect.LOG_TELEMETRY") && hxpe.a.b().a()) {
            chmt chmt0 = chmt.v();
            Optional optional0 = Optional.ofNullable(intent0.getExtras()).flatMap(new eixe(this));
            Objects.requireNonNull(chmt0);
            optional0.ifPresent(new eixf(chmt0));
        }
    }
}


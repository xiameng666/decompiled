package com.google.android.gms.mobiledataplan.event;

import android.content.Intent;
import bbcu;
import bbdg;
import bboh;
import ccmq;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;
import crxn;
import cryq;
import csli;
import cslm;
import giyy;
import hhct;
import hvje;
import hvko;
import hvks;
import hvkx;

public class SimChangeIntentOperation extends IntentOperation {
    private static final bboh a;

    static {
        SimChangeIntentOperation.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.pY);
        bboh bboh0 = SimChangeIntentOperation.a;
        bboh0.g(cslm.h()).B("SIM state changed, continue %s", Boolean.valueOf(hvko.H()));
        if(hvko.H() && "LOADED".equals(intent0.getStringExtra("ss"))) {
            crxn.c().K(3, hhct.ce);
            if(hvks.i() && hvks.g()) {
                ChimeraPeriodicUpdaterService.k(AppContextProvider.a(), 27, crxn.a());
            }
            if(!hvkx.i() || csli.B(AppContextProvider.a())) {
                ChimeraPeriodicUpdaterService.e(AppContextProvider.a(), hvko.o(), hvko.m(), giyy.f);
                bboh0.g(cslm.h()).W("SIM state changed. Periodic service enabled? %b Periodic fetch on? %b", hvko.J(), hvko.P());
                if(hvje.l() && hvje.a.e().o()) {
                    cryq.a().b();
                }
            }
        }
    }
}


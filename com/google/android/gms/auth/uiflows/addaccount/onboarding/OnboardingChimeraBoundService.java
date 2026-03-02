package com.google.android.gms.auth.uiflows.addaccount.onboarding;

import amal;
import ambo;
import android.content.Intent;
import android.os.IBinder;
import bbcu;
import bbdg;
import bboh;
import cclw;
import ccmg;
import ccmp;
import ccmq;
import com.google.android.chimera.BoundService;
import fncf;
import ggtj;
import ibuq;
import icck;
import iccl;
import rxl;

public final class OnboardingChimeraBoundService extends BoundService {
    private static final bboh a;

    static {
        OnboardingChimeraBoundService.a = bboh.c("Auth", bbcu.fF, "OnboardingChimeraService");
    }

    @Override  // com.google.android.chimera.BoundService
    public final IBinder onBind(Intent intent0) {
        ibuq.f(intent0, "intent");
        ccmg ccmg0 = ccmq.a();
        bbdg bbdg0 = bbdg.lW;
        ccmg0.a(bbdg0);
        if(!ibuq.m("com.android.onboarding.task.RUN_ONBOARDING_TASK", intent0.getAction())) {
            ((ggtj)OnboardingChimeraBoundService.a.i()).B("incompatible service action: %s", intent0.getAction());
            return null;
        }
        if(!intent0.getCategories().contains("auth")) {
            ((ggtj)OnboardingChimeraBoundService.a.h()).x("intent doesn\'t contain \'auth\' category");
            return null;
        }
        ambo ambo0 = new ambo(this);
        icck icck0 = iccl.b(cclw.a);
        IBinder iBinder0 = new rxl(fncf.a, ambo0, amal.g, icck0);
        new ccmp().a(bbdg0);
        return iBinder0;
    }

    @Override  // com.google.android.chimera.BoundService
    public final boolean onUnbind(Intent intent0) {
        ibuq.f(intent0, "intent");
        ((ggtj)OnboardingChimeraBoundService.a.h()).B("Unbind to intent %s", intent0);
        return false;
    }
}


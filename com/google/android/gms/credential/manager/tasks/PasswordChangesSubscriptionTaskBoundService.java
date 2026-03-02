package com.google.android.gms.credential.manager.tasks;

import bbcu;
import bbdg;
import bboh;
import bevy;
import bgka;
import ccmq;
import cllr;
import ibrt;
import ibuq;
import icbb;
import iccl;

public final class PasswordChangesSubscriptionTaskBoundService extends Pommel_PasswordChangesSubscriptionTaskBoundService {
    public static final bboh a;
    public bevy b;
    public ibrt c;

    static {
        PasswordChangesSubscriptionTaskBoundService.a = bboh.b("PasswordChangesSubscriptionTaskBoundService", bbcu.cX);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        ccmq.a().a(bbdg.ah);
        ibrt ibrt0 = this.c;
        if(ibrt0 == null) {
            ibuq.j("lowPowerContext");
            ibrt0 = null;
        }
        icbb.b(iccl.b(ibrt0), null, null, new bgka(this, null), 3);
        return 0;
    }
}


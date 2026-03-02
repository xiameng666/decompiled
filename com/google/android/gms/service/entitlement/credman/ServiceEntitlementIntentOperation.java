package com.google.android.gms.service.entitlement.credman;

import android.content.Intent;
import bbcu;
import bboh;
import com.google.android.chimera.IntentOperation;
import eoll;
import eolo;
import ggtj;
import hybw;
import j..util.Objects;

public class ServiceEntitlementIntentOperation extends IntentOperation {
    private static final bboh a;
    private eolo b;

    static {
        ServiceEntitlementIntentOperation.a = bboh.b("Ts.43-ServiceEntitlementIntentOperation", bbcu.fU);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ((ggtj)ServiceEntitlementIntentOperation.a.h()).B("[%s] onCreate", "Ts.43-ServiceEntitlementIntentOperation");
        this.b = eolo.b;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onDestroy() {
        ((ggtj)ServiceEntitlementIntentOperation.a.h()).B("[%s] onDestroy", "Ts.43-ServiceEntitlementIntentOperation");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(!hybw.d()) {
            ((ggtj)ServiceEntitlementIntentOperation.a.j()).B("[%s] Unavailable Open Gateway Interfaces (OGI) for 3P", "Ts.43-ServiceEntitlementIntentOperation");
            return;
        }
        String s = intent0.getAction();
        bboh bboh0 = ServiceEntitlementIntentOperation.a;
        ((ggtj)bboh0.h()).B("[Ts.43-IntentOperation] Action : %s", s);
        ((ggtj)bboh0.h()).R("[%s] Action : %s", "Ts.43-ServiceEntitlementIntentOperation", s);
        if(!Objects.equals(s, "android.intent.action.SIM_STATE_CHANGED") && !Objects.equals(s, "com.google.android.gms.phenotype.UPDATE") && !Objects.equals(s, "android.intent.action.LOCALE_CHANGED")) {
            ((ggtj)bboh0.j()).R("[%s] Ignore action :%s", "Ts.43-ServiceEntitlementIntentOperation", s);
            return;
        }
        eolo eolo0 = this.b;
        eoll eoll0 = new eoll(this.getApplicationContext());
        eolo0.c.post(eoll0);
    }
}


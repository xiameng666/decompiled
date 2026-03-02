package com.google.android.gms.kids.settings.download;

import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.os.UserManager;
import bbcu;
import bboh;
import bbqa;
import bbqs;
import cbom;
import cbon;
import cboo;
import cbop;
import cbpf;
import cbpg;
import cbpi;
import cclw;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.kids.settings.AppContextProvider;
import ggtj;
import ibnx;
import ibom;
import ibpo;
import ibrl;
import ibrx;
import ibuq;
import icbb;
import iccl;
import iccs;
import java.util.concurrent.atomic.AtomicBoolean;

public final class AccountSeedingPrefetchInitIntentOperation extends IntentOperation {
    public static final bboh a;
    public final AtomicBoolean b;
    private final AtomicBoolean c;

    static {
        AccountSeedingPrefetchInitIntentOperation.a = bboh.b("AccountSeedingPrefetchInitIntentOperation", bbcu.ac);
    }

    public AccountSeedingPrefetchInitIntentOperation() {
        this.c = new AtomicBoolean(false);
        this.b = new AtomicBoolean(false);
    }

    public final Object a(ibrl ibrl0) {
        cbop cbop0;
        if((ibrl0 instanceof cbop)) {
            cbop0 = (cbop)ibrl0;
            int v = cbop0.c;
            if((v & 0x80000000) == 0) {
                cbop0 = new cbop(this, ibrl0);
            }
            else {
                cbop0.c = v - 0x80000000;
            }
        }
        else {
            cbop0 = new cbop(this, ibrl0);
        }
        Object object0 = cbop0.a;
        Object object1 = ibrx.a;
        switch(cbop0.c) {
            case 0: {
                ibnx.b(object0);
                if(this.c.getAndSet(true)) {
                    return ibom.a;
                }
                ((ggtj)AccountSeedingPrefetchInitIntentOperation.a.h()).x("Supervision app prefetch started.");
                cbpi cbpi0 = cbpf.b(cbpi.f, this);
                Context context0 = AppContextProvider.a();
                ibuq.e(context0, "getApplicationContext(...)");
                cbop0.c = 1;
                object0 = cbpi0.b(context0, "prefetch", cbop0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        cbpg cbpg0 = (cbpg)object0;
        return ibom.a;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        if(bbqa.c()) {
            ((ggtj)AccountSeedingPrefetchInitIntentOperation.a.h()).x("AccountSeedingPrefetchInit intent operation started.");
            if(ibuq.m("com.google.android.checkin.CHECKIN_COMPLETE", intent0.getAction())) {
                Object object0 = this.getSystemService(UserManager.class);
                ibuq.c(object0);
                PersistableBundle persistableBundle0 = ((UserManager)object0).getSeedAccountOptions();
                if(persistableBundle0 == null) {
                    persistableBundle0 = PersistableBundle.EMPTY;
                }
                if(persistableBundle0.getBoolean("prefetchRequiredModules", false) && bbqs.a(this)) {
                    UserManager userManager0 = (UserManager)this.getSystemService(UserManager.class);
                    if((userManager0 == null ? null : userManager0.getSeedAccountOptions()) != null) {
                        icbb.c(new cbom(ibpo.g(new iccs[]{icbb.a(iccl.b(cclw.b), null, null, new cbon(this, null), 3), icbb.a(iccl.b(cclw.b), null, null, new cboo(this, null), 3)}), null));
                    }
                }
            }
        }
    }
}


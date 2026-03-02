package com.google.android.gms.common.nativesandbox.isolation;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import bbcu;
import bboh;
import com.google.android.chimera.BoundService;
import ggtj;
import ibuq;

public final class IsolatedBoundService extends BoundService {
    private static final bboh a;

    static {
        IsolatedBoundService.a = bboh.b("IsolatedBoundService", bbcu.gM);
    }

    @Override  // com.google.android.chimera.BoundService
    public final IBinder onBind(Intent intent0) {
        ibuq.f(intent0, "intent");
        if(!ibuq.m(intent0.getAction(), "com.google.android.gms.common.nativesandbox.isolation.BIND") && !ibuq.m(intent0.getAction(), "com.google.android.gms.common.nativesandbox.isolation.BIND_ISOLATED")) {
            ((ggtj)IsolatedBoundService.a.i()).B("unknown intent action %s", intent0.getAction());
            return null;
        }
        Context context0 = this.getApplicationContext();
        ibuq.e(context0, "getApplicationContext(...)");
        return new RemoteLibManager(context0);
    }
}


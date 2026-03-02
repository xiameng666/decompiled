package com.google.android.gms.nearby.connection.service.framework;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import cvau;
import cvbt;
import j..util.Objects;
import java.util.concurrent.CountDownLatch;

public class ClientProxy.PresenceServiceStartedReceiver extends TracingBroadcastReceiver {
    final cvbt a;

    public ClientProxy.PresenceServiceStartedReceiver(cvbt cvbt0) {
        Objects.requireNonNull(cvbt0);
        this.a = cvbt0;
        super("presenceService");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        String s = intent0.getAction();
        if(s != null && s.equals("com.google.android.nearby.presence.internal.PRESENCE_REGISTER_DEVICE_PROVIDER_STARTED")) {
            cvau.a.b().h("PresenceServiceStartedReceiver receives %s action intent", s);
            CountDownLatch countDownLatch0 = this.a.D;
            if(countDownLatch0 != null) {
                countDownLatch0.countDown();
            }
        }
    }
}


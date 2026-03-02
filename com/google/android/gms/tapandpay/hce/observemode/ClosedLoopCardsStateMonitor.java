package com.google.android.gms.tapandpay.hce.observemode;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import azts;
import bbcu;
import bboh;
import cclw;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import eswe;
import eswf;
import eswj;
import ggtj;
import ibrt;
import ibuq;
import icbb;
import iccl;
import jwe;

public final class ClosedLoopCardsStateMonitor extends TracingBroadcastReceiver {
    public static final eswe a;
    public static volatile ClosedLoopCardsStateMonitor b;
    public final eswj c;
    public final azts d;
    private static final bboh e;
    private final Context f;
    private final ibrt g;
    private boolean h;

    static {
        ClosedLoopCardsStateMonitor.a = new eswe();
        ClosedLoopCardsStateMonitor.e = bboh.b("TapAndPay", bbcu.aM);
    }

    public ClosedLoopCardsStateMonitor() {
        this(null);
    }

    public ClosedLoopCardsStateMonitor(byte[] arr_b) {
        Context context0 = AppContextProvider.a();
        azts azts0 = new azts(context0, null);
        eswj eswj0 = new eswj(context0);
        ibuq.f(context0, "applicationContext");
        ibuq.f(cclw.a, "coroutineContext");
        super("tapandpay");
        this.f = context0;
        this.g = cclw.a;
        this.d = azts0;
        this.c = eswj0;
    }

    public final void b() {
        synchronized(this) {
            if(!this.h) {
                return;
            }
            this.f.unregisterReceiver(this);
            this.h = false;
        }
    }

    public final void c() {
        synchronized(this) {
            if(this.h) {
                return;
            }
            IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.pay.ACTION_CLOSED_LOOP_CARD_CHANGED");
            jwe.b(this.f, this, intentFilter0, 4);
            this.h = true;
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ibuq.f(context0, "context");
        ibuq.f(intent0, "intent");
        ((ggtj)ClosedLoopCardsStateMonitor.e.h()).x("Closed loop data change detected, re-calculating observe mode config and setting");
        icbb.b(iccl.b(this.g), null, null, new eswf(this, context0, null), 3);
    }
}


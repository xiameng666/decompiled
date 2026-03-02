package com.google.android.gms.tapandpay.diagnostics.data;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import esjb;
import j..util.Objects;
import lqd;

public class NfcStatusItemLiveData.1 extends TracingBroadcastReceiver {
    final lqd a;

    public NfcStatusItemLiveData.1(lqd lqd0) {
        Objects.requireNonNull(lqd0);
        this.a = lqd0;
        super("tapandpay");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        switch(intent0.getIntExtra("android.nfc.extra.ADAPTER_STATE", 1)) {
            case 2: {
                this.a.l(esjb.a);
                return;
            }
            case 3: {
                this.a.l(esjb.b);
                return;
            }
            default: {
                this.a.l(esjb.c);
            }
        }
    }
}


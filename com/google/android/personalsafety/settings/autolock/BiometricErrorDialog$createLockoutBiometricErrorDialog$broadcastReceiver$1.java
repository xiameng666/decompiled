package com.google.android.personalsafety.settings.autolock;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ibuq;
import iw;

public final class BiometricErrorDialog.createLockoutBiometricErrorDialog.broadcastReceiver.1 extends TracingBroadcastReceiver {
    final iw a;

    public BiometricErrorDialog.createLockoutBiometricErrorDialog.broadcastReceiver.1(Context context0, iw iw0) {
        this.a = iw0;
        super(context0);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ibuq.f(context0, "context");
        ibuq.f(intent0, "intent");
        if(ibuq.m(intent0.getAction(), "android.intent.action.USER_PRESENT")) {
            iw iw0 = this.a;
            if(iw0.isShowing()) {
                iw0.dismiss();
            }
        }
    }
}


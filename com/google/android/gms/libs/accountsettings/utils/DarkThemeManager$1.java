package com.google.android.gms.libs.accountsettings.utils;

import android.content.Context;
import android.content.Intent;
import cchl;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

public class DarkThemeManager.1 extends TracingBroadcastReceiver {
    final cchl a;

    public DarkThemeManager.1(cchl cchl0) {
        Objects.requireNonNull(cchl0);
        this.a = cchl0;
        super("accountsettings/lib");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        boolean z = cchl.c();
        if(z != (cchl.a == null ? false : cchl.a.booleanValue())) {
            cchl cchl0 = this.a;
            if(cchl.e(z, cchl.b()) != cchl0.d) {
                cchl.a = null;
                cchl0.c.recreate();
            }
        }
    }
}


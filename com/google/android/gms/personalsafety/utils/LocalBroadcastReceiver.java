package com.google.android.gms.personalsafety.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import jwe;

public class LocalBroadcastReceiver extends TracingBroadcastReceiver {
    public LocalBroadcastReceiver() {
        super("personalsafety");
    }

    public final void b(Context context0, IntentFilter intentFilter0) {
        jwe.c(context0, this, intentFilter0, "com.google.android.gms.permission.INTERNAL_BROADCAST", null, 4);
    }

    public static void c(Context context0, Intent intent0) {
        context0.sendBroadcast(intent0.setPackage("com.google.android.gms"), "com.google.android.gms.permission.INTERNAL_BROADCAST");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public void kA(Context context0, Intent intent0) {
    }
}


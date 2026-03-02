package com.google.android.gms.auth.managed.play;

import akkq;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ggtj;
import ibuq;
import icha;
import ichm;

public final class PackageInstaller.apkInstallEvents.1.receiver.1 extends TracingBroadcastReceiver {
    final ichm a;

    public PackageInstaller.apkInstallEvents.1.receiver.1(ichm ichm0) {
        this.a = ichm0;
        super("auth_managed");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ibuq.f(context0, "context");
        ibuq.f(intent0, "intent");
        if(ibuq.m(intent0.getStringExtra("package_name"), "com.google.android.apps.work.clouddpc")) {
            int v = intent0.getIntExtra("package_event", -1);
            if(!icha.c(this.a.b(Integer.valueOf(v)))) {
                ((ggtj)akkq.b.j()).z("[PackageInstaller] Sending install event %s to caller failed", v);
            }
        }
    }
}


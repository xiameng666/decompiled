package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import cumz;
import cwfa;
import cwgb;
import cwgv;
import cwjd;
import cwje;
import cxjs;
import j..util.Objects;

public class PackageMonitor.1 extends TracingBroadcastReceiver {
    final String a;
    final cwjd b;
    final cwjd c;

    public PackageMonitor.1(cwje cwje0, String s, cwjd cwjd0, cwjd cwjd1) {
        this.a = s;
        this.b = cwjd0;
        this.c = cwjd1;
        Objects.requireNonNull(cwje0);
        super("trackCompanionAppInstall");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        Uri uri0 = intent0.getData();
        if(uri0 != null && uri0.getSchemeSpecificPart().equals(this.a)) {
            cwjd cwjd0 = this.b;
            if(cwjd0 == null) {
                cwjd0 = this.c;
            }
            else {
                cxjs cxjs0 = ((cwgv)cwjd0).a;
                boolean z = cxjs0 != null && cxjs0.B == 8 && !cwgb.b(cumz.e(((cwgv)cwjd0).d.a, "FastPairHandler"), cxjs0.l);
                ((cwgv)cwjd0).b.d().B("FastPairHandler: apply post installed handler? %b", Boolean.valueOf(z));
                if(!z) {
                    cwjd0 = this.c;
                }
            }
            cwjd0.a(context0);
            try {
                context0.unregisterReceiver(this);
            }
            catch(IllegalArgumentException unused_ex) {
                cwfa.a.f().x("trackCompanionAppInstallIntentReceiver already unregistered");
            }
        }
    }
}


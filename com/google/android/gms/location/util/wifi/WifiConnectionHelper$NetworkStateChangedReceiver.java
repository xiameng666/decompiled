package com.google.android.gms.location.util.wifi;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import cnyn;
import cnyo;
import cnyp;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import huqy_phenotype;
import j..util.Objects;

public class WifiConnectionHelper.NetworkStateChangedReceiver extends TracingBroadcastReceiver {
    public final cnyo a;
    public final cnyp b;
    private boolean c;

    public WifiConnectionHelper.NetworkStateChangedReceiver(cnyp cnyp0, cnyo cnyo0) {
        Objects.requireNonNull(cnyp0);
        this.b = cnyp0;
        super(cnyp0.a);
        this.a = cnyo0;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if("android.net.wifi.STATE_CHANGE".equals(intent0.getAction())) {
            NetworkInfo networkInfo0 = (NetworkInfo)intent0.getParcelableExtra("networkInfo");
            boolean z = networkInfo0 != null && networkInfo0.isConnected();
            if(z || this.c) {
                this.c = z;
                cnyn cnyn0 = new cnyn(this, z, (!huqy_phenotype.w() || !z ? null : ((WifiManager)Objects.requireNonNull(this.b.b)).getConnectionInfo().getBSSID()));
                this.b.c.execute(cnyn0);
            }
        }
    }
}


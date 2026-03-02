package com.google.android.gms.nearby.mediums.wifi.hotspot;

import android.content.Context;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.WifiConfiguration;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import czkq;
import dack;
import dagh;
import dagq;
import j..util.Objects;
import java.util.concurrent.CountDownLatch;

public class LegacyStaConnector.1 extends NetworkCallbackWrapper {
    final String a;
    final CountDownLatch b;
    final dagh c;

    public LegacyStaConnector.1(dagh dagh0, String s, CountDownLatch countDownLatch0) {
        this.a = s;
        this.b = countDownLatch0;
        Objects.requireNonNull(dagh0);
        this.c = dagh0;
        super("nearby", "LegacyStaConnectorNetworkCallback");
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void a(Network network0) {
        dagh dagh0 = this.c;
        Context context0 = dagh0.b;
        String s = dack.a(context0).l();
        if(s == null) {
            s = null;
        }
        else if("<unknown ssid>".equals(s)) {
            int v = dack.a(context0).e();
            czkq.a.b().h("[LegacyStaConnector] Failed to get the SSID from WifiInfo. Looking up network %d in the list of configured networks.", Integer.valueOf(v));
            for(Object object0: dagh0.c.getConfiguredNetworks()) {
                WifiConfiguration wifiConfiguration0 = (WifiConfiguration)object0;
                if(wifiConfiguration0.networkId == v) {
                    s = wifiConfiguration0.SSID;
                    break;
                }
            }
        }
        if(this.a.equals(s)) {
            NetworkInfo[] arr_networkInfo = dagq.d(dagh0.d);
            for(int v1 = 0; v1 < arr_networkInfo.length; ++v1) {
                if(dagq.b(arr_networkInfo[v1])) {
                    this.b.countDown();
                    return;
                }
            }
        }
    }
}


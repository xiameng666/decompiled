package com.google.android.gms.nearby.mediums.wifi;

import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiInfo;
import bzs;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import cvno;
import czkq;
import dacu;
import j..util.Objects;
import java.util.Map;

public class WifiNetworkV1.1 extends NetworkCallbackWrapper {
    final dacu a;

    public WifiNetworkV1.1(dacu dacu0) {
        Objects.requireNonNull(dacu0);
        this.a = dacu0;
        super("nearby", "WifiNetworkV1", 0);
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void a(Network network0) {
        dacu dacu0 = this.a;
        NetworkCapabilities networkCapabilities0 = dacu0.b.getNetworkCapabilities(network0);
        if(networkCapabilities0 != null) {
            WifiInfo wifiInfo0 = (WifiInfo)networkCapabilities0.getTransportInfo();
            if(wifiInfo0 != null) {
                dacu0.D(network0, wifiInfo0);
                Map map0 = dacu0.e;
                synchronized(map0) {
                    czkq.a.b().j("%s networkCallback doAvailable netId:%d wifiStatusChangedCallbacks.size:%d", "[WifiNetworkV1]", Integer.valueOf(network0.getNetId()), Integer.valueOf(((bzs)map0).d_num));
                    dacu0.K();
                    for(Object object0: map0.values()) {
                        ((cvno)object0).a();
                    }
                }
            }
        }
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void b(Network network0, NetworkCapabilities networkCapabilities0) {
        WifiInfo wifiInfo0 = (WifiInfo)networkCapabilities0.getTransportInfo();
        if(wifiInfo0 != null) {
            dacu dacu0 = this.a;
            if(dacu0.a() != wifiInfo0.getFrequency()) {
                dacu0.K();
            }
            dacu0.E(network0, wifiInfo0);
        }
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void c(Network network0) {
        dacu dacu0 = this.a;
        boolean z = dacu0.L(network0);
        dacu0.F(network0);
        if(z) {
            Map map0 = dacu0.e;
            synchronized(map0) {
                czkq.a.b().j("%s networkCallback doLost netId:%d wifiStatusChangedCallbacks.size:%d", "[WifiNetworkV1]", Integer.valueOf(network0.getNetId()), Integer.valueOf(((bzs)map0).d_num));
                dacu0.K();
                for(Object object0: map0.values()) {
                    ((cvno)object0).a();
                }
            }
        }
    }
}


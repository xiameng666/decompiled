package com.google.android.gms.nearby.presence.kt.network;

import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import dbix;
import dbjb;
import ibpo;
import ibpz;
import ibts;
import ibuq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class NetworkMonitorImpl.networkCallback.1 extends NetworkCallbackWrapper {
    final dbjb a;

    public NetworkMonitorImpl.networkCallback.1(dbjb dbjb0) {
        this.a = dbjb0;
        super("nearby", "NetworkMonitorImplNetworkCallback");
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void c(Network network0) {
        ibuq.f(network0, "network");
        dbjb dbjb0 = this.a;
        Map map0 = dbjb0.c;
        if(((Set)map0.remove(network0)) != null) {
            ibts ibts0 = dbjb0.e;
            if(ibts0 != null) {
                ibts0.a(new dbix(ibpz.q(map0)));
            }
        }
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void e(Network network0, LinkProperties linkProperties0) {
        ibuq.f(network0, "network");
        ibuq.f(linkProperties0, "linkProperties");
        List list0 = linkProperties0.getLinkAddresses();
        ibuq.e(list0, "getLinkAddresses(...)");
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(((LinkAddress)object0).getAddress());
        }
        Set set0 = ibpo.ay(arrayList0);
        Map map0 = this.a.c;
        map0.put(network0, set0);
        ibts ibts0 = this.a.e;
        if(ibts0 != null) {
            ibts0.a(new dbix(ibpz.q(map0)));
        }
    }
}


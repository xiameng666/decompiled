package com.google.android.gms.ads.internal.state;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import j..util.Objects;

final class d extends ConnectivityManager.NetworkCallback {
    final e a;

    public d(e e0) {
        Objects.requireNonNull(e0);
        this.a = e0;
        super();
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onAvailable(Network network0) {
        this.a.i.set(true);
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onLost(Network network0) {
        this.a.i.set(false);
    }
}


package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.h;
import j..util.Objects;

final class bt implements Runnable {
    final ad a;

    public bt(ad ad0) {
        Objects.requireNonNull(ad0);
        this.a = ad0;
        super();
    }

    @Override
    public final void run() {
        aa aa0 = this.a.a.a;
        if(aa0 != null) {
            try {
                aa0.a();
            }
            catch(RemoteException remoteException0) {
                h.m("Could not notify onAdFailedToLoad event.", remoteException0);
            }
        }
    }
}


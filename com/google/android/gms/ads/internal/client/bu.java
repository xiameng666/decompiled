package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.h;
import j..util.Objects;

final class bu implements Runnable {
    final am a;

    public bu(am am0) {
        Objects.requireNonNull(am0);
        this.a = am0;
        super();
    }

    @Override
    public final void run() {
        aa aa0 = this.a.a;
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


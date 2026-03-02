package com.google.android.gms.ads.internal.clearcut;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.clearcut.a;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.util.client.k;
import com.google.android.gms.ads.internal.util.client.l;
import com.google.android.gms.dynamic.ObjectWrapper;
import wbz;

public final class c implements Runnable {
    public final g a;
    public final Context b;

    public c(g g0, Context context0) {
        this.a = g0;
        this.b = context0;
    }

    @Override
    public final void run() {
        boolean z = ((Boolean)s.aD.g()).booleanValue();
        g g0 = this.a;
        Context context0 = this.b;
        if(z) {
            try {
                g0.c = (a)l.b(context0, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new d());
                ObjectWrapper objectWrapper0 = new ObjectWrapper(context0);
                a a0 = g0.c;
                Parcel parcel0 = a0.jo();
                wbz.h(parcel0, objectWrapper0);
                parcel0.writeString("GMA_SDK");
                a0.jp(2, parcel0);
                g0.a = true;
            }
            catch(k | RemoteException | NullPointerException unused_ex) {
                h.d("Cannot dynamite load clearcut");
            }
        }
    }
}


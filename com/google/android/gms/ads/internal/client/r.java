package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import bjgx;
import com.google.android.gms.ads.internal.mediation.client.e;
import com.google.android.gms.ads.internal.report.d;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.util.client.k;
import com.google.android.gms.ads.internal.util.client.l;
import com.google.android.gms.dynamic.ObjectWrapper;
import j..util.Objects;
import wbz;

public final class r extends t {
    final Context a;
    final String b;
    final e c;
    final s d;

    public r(s s0, Context context0, String s1, e e0) {
        this.a = context0;
        this.b = s1;
        this.c = e0;
        Objects.requireNonNull(s0);
        this.d = s0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.t
    protected final Object a() {
        s.a(this.a, "native_ad");
        return new ag();
    }

    @Override  // com.google.android.gms.ads.internal.client.t
    public final Object b() {
        Context context0 = this.a;
        com.google.android.gms.ads.internal.config.s.c(context0);
        if(((Boolean)com.google.android.gms.ads.internal.config.s.bw.g()).booleanValue()) {
            try {
                ObjectWrapper objectWrapper0 = new ObjectWrapper(context0);
                IBinder iBinder0 = ((ak)l.b(context0, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new q())).newAdLoaderBuilder(objectWrapper0, this.b, this.c, 253434000);
                if(iBinder0 == null) {
                    return null;
                }
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return (iInterface0 instanceof ah) ? ((ah)iInterface0) : new af(iBinder0);
            }
            catch(k | RemoteException | NullPointerException exception0) {
                this.d.c = d.a(this.a);
                this.d.c.e(exception0, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        }
        try {
            ObjectWrapper objectWrapper1 = new ObjectWrapper(this.a);
            IBinder iBinder1 = ((ak)this.d.b.c(this.a)).newAdLoaderBuilder(objectWrapper1, this.b, this.c, 253434000);
            if(iBinder1 == null) {
                return null;
            }
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return (iInterface1 instanceof ah) ? ((ah)iInterface1) : new af(iBinder1);
        }
        catch(RemoteException | bjgx exception1) {
            h.m("Could not create remote builder for AdLoader.", exception1);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.t
    public final Object c(ay ay0) {
        Object object0;
        ObjectWrapper objectWrapper0 = new ObjectWrapper(this.a);
        Parcel parcel0 = ay0.jo();
        wbz.h(parcel0, objectWrapper0);
        parcel0.writeString(this.b);
        wbz.h(parcel0, this.c);
        parcel0.writeInt(253434000);
        Parcel parcel1 = ay0.hM(3, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            object0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            object0 = (iInterface0 instanceof ah) ? ((ah)iInterface0) : new af(iBinder0);
        }
        parcel1.recycle();
        return object0;
    }
}


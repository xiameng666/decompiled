package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import j..util.Objects;
import wbz;

final class o extends t {
    final Context a;
    final AdSizeParcel b;
    final String c;
    final s d;

    public o(s s0, Context context0, AdSizeParcel adSizeParcel0, String s1) {
        this.a = context0;
        this.b = adSizeParcel0;
        this.c = s1;
        Objects.requireNonNull(s0);
        this.d = s0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.t
    public final Object a() {
        s.a(this.a, "search");
        return new am();
    }

    @Override  // com.google.android.gms.ads.internal.client.t
    public final Object b() {
        return this.d.a.b(this.a, this.b, this.c, null, 3);
    }

    @Override  // com.google.android.gms.ads.internal.client.t
    public final Object c(ay ay0) {
        Object object0;
        ObjectWrapper objectWrapper0 = new ObjectWrapper(this.a);
        Parcel parcel0 = ay0.jo();
        wbz.h(parcel0, objectWrapper0);
        wbz.f(parcel0, this.b);
        parcel0.writeString(this.c);
        parcel0.writeInt(253434000);
        Parcel parcel1 = ay0.hM(10, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            object0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            object0 = (iInterface0 instanceof an) ? ((an)iInterface0) : new al(iBinder0);
        }
        parcel1.recycle();
        return object0;
    }
}


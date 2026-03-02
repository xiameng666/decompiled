package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import damz;
import danb;
import dang;
import daoh;

public final class RegisterStatusCallbackRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final danb b;
    public final boolean c;
    @Deprecated
    public final String d;
    @Deprecated
    public final ClientAppContext e;
    public final dang f;

    static {
        RegisterStatusCallbackRequest.CREATOR = new daoh();
    }

    public RegisterStatusCallbackRequest(int v, IBinder iBinder0, IBinder iBinder1, boolean z, String s, ClientAppContext clientAppContext0) {
        dang dang0;
        danb danb0;
        this.a = v;
        if(iBinder0 == null) {
            danb0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            danb0 = (iInterface0 instanceof danb) ? ((danb)iInterface0) : new damz(iBinder0);
        }
        this.b = danb0;
        if(iBinder1 == null) {
            dang0 = null;
        }
        else {
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
            dang0 = (iInterface1 instanceof dang) ? ((dang)iInterface1) : new dang(iBinder1);
        }
        this.f = dang0;
        this.c = z;
        this.d = s;
        this.e = ClientAppContext.b(clientAppContext0, null, s, false);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.D(parcel0, 2, this.b.asBinder());
        baub.D(parcel0, 3, this.f.a);
        baub.e(parcel0, 4, this.c);
        baub.v(parcel0, 5, this.d, false);
        baub.t(parcel0, 6, this.e, v, false);
        baub.c(parcel0, v1);
    }
}


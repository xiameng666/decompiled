package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import damz;
import danb;
import daol;

public final class UnpublishRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final MessageWrapper b;
    public final danb c;
    @Deprecated
    public final String d;
    @Deprecated
    public final String e;
    @Deprecated
    public final boolean f;
    @Deprecated
    public final ClientAppContext g;

    static {
        UnpublishRequest.CREATOR = new daol();
    }

    public UnpublishRequest(int v, MessageWrapper messageWrapper0, IBinder iBinder0, String s, String s1, boolean z, ClientAppContext clientAppContext0) {
        danb danb0;
        this.a = v;
        this.b = messageWrapper0;
        if(iBinder0 == null) {
            danb0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            danb0 = (iInterface0 instanceof danb) ? ((danb)iInterface0) : new damz(iBinder0);
        }
        this.c = danb0;
        this.d = s;
        this.e = s1;
        this.f = z;
        this.g = ClientAppContext.b(clientAppContext0, s1, s, z);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.t(parcel0, 2, this.b, v, false);
        baub.D(parcel0, 3, this.c.asBinder());
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.e(parcel0, 6, this.f);
        baub.t(parcel0, 7, this.g, v, false);
        baub.c(parcel0, v1);
    }
}


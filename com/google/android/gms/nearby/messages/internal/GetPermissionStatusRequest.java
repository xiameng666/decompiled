package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import damt;
import damz;
import danb;

@Deprecated
public class GetPermissionStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final danb b;
    @Deprecated
    public final String c;
    @Deprecated
    public final ClientAppContext d;

    static {
        GetPermissionStatusRequest.CREATOR = new damt();
    }

    public GetPermissionStatusRequest(int v, IBinder iBinder0, String s, ClientAppContext clientAppContext0) {
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
        this.c = s;
        this.d = ClientAppContext.b(clientAppContext0, null, s, false);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.D(parcel0, 2, this.b.asBinder());
        baub.v(parcel0, 3, this.c, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.c(parcel0, v1);
    }
}


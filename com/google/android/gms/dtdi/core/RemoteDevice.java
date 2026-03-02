package com.google.android.gms.dtdi.core;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bhzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;
import java.util.List;

public final class RemoteDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final IBinder a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    static {
        RemoteDevice.CREATOR = new bhzq();
    }

    public RemoteDevice(IBinder iBinder0, String s, String s1, String s2, List list0) {
        ibuq.f(iBinder0, "token");
        ibuq.f(s, "deviceName");
        ibuq.f(list0, "capabilities");
        super();
        this.a = iBinder0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = list0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.E(parcel0, 5, this.e);
        baub.c(parcel0, v1);
    }
}


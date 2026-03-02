package com.google.android.gms.auth.firstparty.dataservice;

import ajna;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ClearTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public String b;

    static {
        ClearTokenRequest.CREATOR = new ajna();
    }

    public ClearTokenRequest() {
        this.a = 1;
    }

    public ClearTokenRequest(int v, String s) {
        this.a = v;
        this.b = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}


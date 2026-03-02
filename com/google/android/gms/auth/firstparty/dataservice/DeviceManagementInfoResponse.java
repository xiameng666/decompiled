package com.google.android.gms.auth.firstparty.dataservice;

import ajne;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DeviceManagementInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final String b;
    public final boolean c;

    static {
        DeviceManagementInfoResponse.CREATOR = new ajne();
    }

    public DeviceManagementInfoResponse(int v, String s, boolean z) {
        this.a = v;
        this.b = s;
        this.c = z;
    }

    public DeviceManagementInfoResponse(String s, boolean z) {
        this(1, s, z);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.e(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}


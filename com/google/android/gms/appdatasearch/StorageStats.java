package com.google.android.gms.appdatasearch;

import abxa;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class StorageStats extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final RegisteredPackageInfo[] a;
    public final long b;
    public final long c;
    public final long d;

    static {
        StorageStats.CREATOR = new abxa();
    }

    public StorageStats(RegisteredPackageInfo[] arr_registeredPackageInfo, long v, long v1, long v2) {
        this.a = arr_registeredPackageInfo;
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.J(parcel0, 1, this.a, v);
        baub.q(parcel0, 2, this.b);
        baub.q(parcel0, 3, this.c);
        baub.q(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}


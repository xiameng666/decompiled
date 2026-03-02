package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fdhp;

public class FastPairAccountKeyParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final byte[] a;

    static {
        FastPairAccountKeyParcelable.CREATOR = new fdhp();
    }

    public FastPairAccountKeyParcelable(byte[] arr_b) {
        this.a = arr_b;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, ((byte[])this.a.clone()), false);
        baub.c(parcel0, v1);
    }
}


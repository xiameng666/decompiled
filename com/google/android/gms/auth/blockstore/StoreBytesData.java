package com.google.android.gms.auth.blockstore;

import aiof;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class StoreBytesData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;
    public final boolean b;
    public final String c;

    static {
        StoreBytesData.CREATOR = new aiof();
    }

    public StoreBytesData(byte[] arr_b, boolean z, String s) {
        this.a = arr_b;
        this.b = z;
        this.c = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.e(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}


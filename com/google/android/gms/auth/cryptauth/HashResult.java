package com.google.android.gms.auth.cryptauth;

import ajfa;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class HashResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final byte[] b;

    static {
        HashResult.CREATOR = new ajfa();
    }

    public HashResult(int v, byte[] arr_b) {
        this.a = v;
        this.b = arr_b;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.i(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.auth.cryptauth;

import ajfi;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SignCryptedBlob extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final byte[] b;
    public final byte[] c;

    static {
        SignCryptedBlob.CREATOR = new ajfi();
    }

    public SignCryptedBlob(int v, byte[] arr_b, byte[] arr_b1) {
        this.a = v;
        this.b = arr_b;
        this.c = arr_b1;
    }

    public SignCryptedBlob(byte[] arr_b, byte[] arr_b1) {
        this(1, arr_b, arr_b1);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.i(parcel0, 2, this.b, false);
        baub.i(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}


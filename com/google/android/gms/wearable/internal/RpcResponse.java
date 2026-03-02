package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fdlc;

public class RpcResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final byte[] c;

    static {
        RpcResponse.CREATOR = new fdlc();
    }

    public RpcResponse(int v, int v1, byte[] arr_b) {
        this.a = v;
        this.b = v1;
        this.c = arr_b;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.i(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}


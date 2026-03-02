package com.google.android.gms.auth.authzen;

import aihi;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AuthzenPublicKey extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final byte[] b;

    static {
        AuthzenPublicKey.CREATOR = new aihi();
    }

    public AuthzenPublicKey(int v, byte[] arr_b) {
        this.a = v;
        this.b = arr_b;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.b, false);
        baub.o(parcel0, 10000, this.a);
        baub.c(parcel0, v1);
    }
}


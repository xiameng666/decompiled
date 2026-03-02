package com.google.android.gms.mdocstore.types;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import crai;
import java.util.ArrayList;

public final class AuthenticationData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;
    public final byte[] b;
    public final long c;

    static {
        AuthenticationData.CREATOR = new crai();
    }

    public AuthenticationData(byte[] arr_b, byte[] arr_b1, long v) {
        this.a = arr_b;
        this.b = arr_b1;
        this.c = v;
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("authKey", this.a, arrayList0);
        basz.b("staticAuthData", this.b, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, this.b, false);
        baub.q(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}


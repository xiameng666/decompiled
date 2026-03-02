package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import czgm;
import java.util.Arrays;

public final class OnConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public byte[] c;

    static {
        OnConnectionRequestParams.CREATOR = new czgm();
    }

    public OnConnectionRequestParams() {
    }

    public OnConnectionRequestParams(String s, String s1, byte[] arr_b) {
        this.a = s;
        this.b = s1;
        this.c = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof OnConnectionRequestParams) && bata.b(this.a, ((OnConnectionRequestParams)object0).a) && bata.b(this.b, ((OnConnectionRequestParams)object0).b) && Arrays.equals(this.c, ((OnConnectionRequestParams)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Arrays.hashCode(this.c)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.i(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}


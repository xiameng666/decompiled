package com.google.android.gms.appdatasearch;

import abvf;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class CacheSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;

    static {
        CacheSpec.CREATOR = new abvf();
    }

    public CacheSpec(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}


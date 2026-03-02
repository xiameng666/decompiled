package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import bzwj;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Route extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    static {
        Route.CREATOR = new bzwj();
    }

    public Route(String s, int v, String s1, String s2, String s3, String s4, String s5) {
        batl.q(s);
        this.a = s;
        this.b = v;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = s4;
        this.g = s5;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.o(parcel0, 3, this.b);
        baub.v(parcel0, 4, this.c, false);
        baub.v(parcel0, 5, this.d, false);
        baub.v(parcel0, 6, this.e, false);
        baub.v(parcel0, 7, this.f, false);
        baub.v(parcel0, 8, this.g, false);
        baub.v(parcel0, 9, this.e, false);
        baub.c(parcel0, v1);
    }
}


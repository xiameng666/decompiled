package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basy;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    static {
        MethodInvocation.CREATOR = new basy();
    }

    public MethodInvocation(int v, int v1, int v2, long v3, long v4, String s, String s1, int v5, int v6) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = s;
        this.g = s1;
        this.h = v5;
        this.i = v6;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.q(parcel0, 4, this.d);
        baub.q(parcel0, 5, this.e);
        baub.v(parcel0, 6, this.f, false);
        baub.v(parcel0, 7, this.g, false);
        baub.o(parcel0, 8, this.h);
        baub.o(parcel0, 9, this.i);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bbwc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PhoneNumberVerification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final Bundle f;
    public final int g;
    public final long h;

    static {
        PhoneNumberVerification.CREATOR = new bbwc();
    }

    public PhoneNumberVerification(String s, long v, int v1, int v2, String s1, Bundle bundle0, int v3, long v4) {
        this.a = s;
        this.b = v;
        this.f = bundle0;
        this.c = v1;
        this.d = v2;
        this.e = s1;
        this.g = v3;
        this.h = v4;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.q(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.v(parcel0, 5, this.e, false);
        baub.g(parcel0, 6, this.f, false);
        baub.o(parcel0, 7, this.g);
        baub.q(parcel0, 8, this.h);
        baub.c(parcel0, v1);
    }
}


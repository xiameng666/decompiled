package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import etlj;

public final class TokenInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final String a;
    final String b;
    final String c;
    final String d;
    final int e;
    final int f;
    final int g;
    final boolean h;
    final String i;
    final String j;
    final Integer k;
    final Integer l;

    static {
        TokenInfo.CREATOR = new etlj();
    }

    public TokenInfo(String s, String s1, String s2, String s3, int v, int v1, int v2, boolean z, String s4, String s5, Integer integer0, Integer integer1) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = v;
        this.f = v1;
        this.g = v2;
        this.h = z;
        this.i = s4;
        this.j = s5;
        this.k = integer0;
        this.l = integer1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.o(parcel0, 5, this.e);
        baub.o(parcel0, 6, this.f);
        baub.o(parcel0, 7, this.g);
        baub.e(parcel0, 8, this.h);
        baub.v(parcel0, 9, this.i, false);
        baub.v(parcel0, 10, this.j, false);
        baub.F(parcel0, 11, this.k);
        baub.F(parcel0, 12, this.l);
        baub.c(parcel0, v1);
    }
}


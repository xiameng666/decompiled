package com.google.android.gms.auth.aang;

import actp;
import actq;
import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public final class GetTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final GoogleAccount a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final int g;
    public final String h;
    public final boolean i;
    public final byte[] j;
    public final String k;
    public final boolean l;
    public final Network m;
    public final boolean n;

    static {
        GetTokenRequest.CREATOR = new actq();
    }

    public GetTokenRequest(GoogleAccount googleAccount0, String s, List list0, List list1, List list2, List list3, int v, String s1, boolean z, byte[] arr_b, String s2, boolean z1, Network network0, boolean z2) {
        this.a = googleAccount0;
        this.b = s;
        this.c = list0;
        this.d = list1;
        this.e = list2;
        this.f = list3;
        this.g = v;
        this.h = s1;
        this.i = z;
        this.j = arr_b;
        this.k = s2;
        this.l = z1;
        this.m = network0;
        this.n = z2;
    }

    public static actp a() {
        actp actp0 = new actp();
        actp0.d(false);
        actp0.c(0);
        actp0.e(false);
        actp0.f(false);
        return actp0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.x(parcel0, 3, this.c, false);
        baub.x(parcel0, 4, this.d, false);
        baub.x(parcel0, 5, this.e, false);
        baub.x(parcel0, 6, this.f, false);
        baub.o(parcel0, 7, this.g);
        baub.v(parcel0, 8, this.h, false);
        baub.e(parcel0, 9, this.i);
        baub.i(parcel0, 10, this.j, false);
        baub.v(parcel0, 11, this.k, false);
        baub.e(parcel0, 12, this.l);
        baub.t(parcel0, 13, this.m, v, false);
        baub.e(parcel0, 14, this.n);
        baub.c(parcel0, v1);
    }
}


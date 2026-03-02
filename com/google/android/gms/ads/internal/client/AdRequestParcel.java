package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.ads.internal.util.client.i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class AdRequestParcel extends AbstractSafeParcelable {
    public final long A;
    public static final Parcelable.Creator CREATOR;
    public final int a;
    @Deprecated
    public final long b;
    public final Bundle c;
    @Deprecated
    public final int d;
    public final List e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final String i;
    public final SearchAdRequestParcel j;
    public final Location k;
    public final String l;
    public final Bundle m;
    public final Bundle n;
    public final List o;
    public final String p;
    public final String q;
    @Deprecated
    public final boolean r;
    public final AdDataParcel s;
    public final int t;
    public final String u;
    public final List v;
    public final int w;
    public final String x;
    public final int y;
    public final long z;

    static {
        AdRequestParcel.CREATOR = new g();
    }

    public AdRequestParcel(int v, long v1, Bundle bundle0, int v2, List list0, boolean z, int v3, boolean z1, String s, SearchAdRequestParcel searchAdRequestParcel0, Location location0, String s1, Bundle bundle1, Bundle bundle2, List list1, String s2, String s3, boolean z2, AdDataParcel adDataParcel0, int v4, String s4, List list2, int v5, String s5, int v6, long v7, long v8) {
        new Bundle();
        this.a = v;
        this.b = v1;
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        this.c = bundle0;
        this.d = v2;
        this.e = list0;
        this.f = z;
        this.g = v3;
        this.h = z1;
        this.i = s;
        this.j = searchAdRequestParcel0;
        this.k = location0;
        this.l = s1;
        this.m = bundle1 == null ? new Bundle() : bundle1;
        this.n = bundle2;
        this.o = list1;
        this.p = s2;
        this.q = s3;
        this.r = z2;
        this.s = adDataParcel0;
        this.t = v4;
        this.u = s4;
        List list3 = list2 == null ? new ArrayList() : list2;
        this.v = list3;
        this.w = v5;
        this.x = s5;
        this.y = v6;
        this.z = v7;
        this.A = v8;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof AdRequestParcel) ? this.a == ((AdRequestParcel)object0).a && this.b == ((AdRequestParcel)object0).b && i.a(this.c, ((AdRequestParcel)object0).c) && this.d == ((AdRequestParcel)object0).d && bata.b(this.e, ((AdRequestParcel)object0).e) && this.f == ((AdRequestParcel)object0).f && this.g == ((AdRequestParcel)object0).g && this.h == ((AdRequestParcel)object0).h && bata.b(this.i, ((AdRequestParcel)object0).i) && bata.b(this.j, ((AdRequestParcel)object0).j) && bata.b(this.k, ((AdRequestParcel)object0).k) && bata.b(this.l, ((AdRequestParcel)object0).l) && i.a(this.m, ((AdRequestParcel)object0).m) && i.a(this.n, ((AdRequestParcel)object0).n) && bata.b(this.o, ((AdRequestParcel)object0).o) && bata.b(this.p, ((AdRequestParcel)object0).p) && bata.b(this.q, ((AdRequestParcel)object0).q) && this.r == ((AdRequestParcel)object0).r && this.t == ((AdRequestParcel)object0).t && bata.b(this.u, ((AdRequestParcel)object0).u) && bata.b(this.v, ((AdRequestParcel)object0).v) && this.w == ((AdRequestParcel)object0).w && bata.b(this.x, ((AdRequestParcel)object0).x) && this.y == ((AdRequestParcel)object0).y && this.z == ((AdRequestParcel)object0).z : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((long)this.b), this.c, ((int)this.d), this.e, Boolean.valueOf(this.f), ((int)this.g), Boolean.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, Boolean.valueOf(this.r), ((int)this.t), this.u, this.v, ((int)this.w), this.x, ((int)this.y), ((long)this.z), ((long)this.A)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.q(parcel0, 2, this.b);
        baub.g(parcel0, 3, this.c, false);
        baub.o(parcel0, 4, this.d);
        baub.x(parcel0, 5, this.e, false);
        baub.e(parcel0, 6, this.f);
        baub.o(parcel0, 7, this.g);
        baub.e(parcel0, 8, this.h);
        baub.v(parcel0, 9, this.i, false);
        baub.t(parcel0, 10, this.j, v, false);
        baub.t(parcel0, 11, this.k, v, false);
        baub.v(parcel0, 12, this.l, false);
        baub.g(parcel0, 13, this.m, false);
        baub.g(parcel0, 14, this.n, false);
        baub.x(parcel0, 15, this.o, false);
        baub.v(parcel0, 16, this.p, false);
        baub.v(parcel0, 17, this.q, false);
        baub.e(parcel0, 18, this.r);
        baub.t(parcel0, 19, this.s, v, false);
        baub.o(parcel0, 20, this.t);
        baub.v(parcel0, 21, this.u, false);
        baub.x(parcel0, 22, this.v, false);
        baub.o(parcel0, 23, this.w);
        baub.v(parcel0, 24, this.x, false);
        baub.o(parcel0, 25, this.y);
        baub.q(parcel0, 26, this.z);
        baub.q(parcel0, 27, this.A);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.appdatasearch;

import abwv;
import abww;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;

public class SearchResults extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int[] b;
    public final byte[] c;
    final Bundle[] d;
    public final Bundle[] e;
    public final Bundle[] f;
    public final int g;
    public final int[] h;
    public final String[] i;
    final byte[] j;
    final double[] k;
    final Bundle l;
    public final int m;
    public final long[] n;
    public final long[] o;
    final Bundle[] p;
    final int[] q;
    final byte[] r;
    final boolean s;

    static {
        SearchResults.CREATOR = new abww();
    }

    public SearchResults(int v, int[] arr_v, String[] arr_s, int[] arr_v1, byte[] arr_b, Bundle[] arr_bundle, Bundle[] arr_bundle1, Bundle[] arr_bundle2, byte[] arr_b1, double[] arr_f, Bundle bundle0, int v1, long[] arr_v2, long[] arr_v3, Bundle[] arr_bundle3, int[] arr_v4, byte[] arr_b2, boolean z) {
        this(null, arr_v1, arr_b, arr_bundle, arr_bundle1, arr_bundle2, v, arr_v, arr_s, arr_b1, arr_f, bundle0, v1, arr_v2, arr_v3, arr_bundle3, arr_v4, arr_b2, z);
    }

    public SearchResults(String s) {
        this(s, null, null, null, null, null, 0, null, null, null, null, null, 0, null, null, null, null, null, false);
    }

    public SearchResults(String s, int[] arr_v, byte[] arr_b, Bundle[] arr_bundle, Bundle[] arr_bundle1, Bundle[] arr_bundle2, int v, int[] arr_v1, String[] arr_s, byte[] arr_b1, double[] arr_f, Bundle bundle0, int v1, long[] arr_v2, long[] arr_v3, Bundle[] arr_bundle3, int[] arr_v4, byte[] arr_b2, boolean z) {
        this.a = s;
        this.b = arr_v;
        this.c = arr_b;
        this.d = arr_bundle;
        this.e = arr_bundle1;
        this.f = arr_bundle2;
        this.g = v;
        this.h = arr_v1;
        this.i = arr_s;
        this.j = arr_b1;
        this.k = arr_f;
        this.l = bundle0;
        this.m = v1;
        this.n = arr_v2;
        this.o = arr_v3;
        this.p = arr_bundle3;
        this.q = arr_v4;
        this.r = arr_b2;
        this.s = z;
    }

    public final boolean a() {
        return this.a != null;
    }

    @Override
    public final Iterator iterator() {
        return new abwv(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.p(parcel0, 2, this.b, false);
        baub.i(parcel0, 3, this.c, false);
        baub.J(parcel0, 4, this.d, v);
        baub.J(parcel0, 5, this.e, v);
        baub.J(parcel0, 6, this.f, v);
        baub.o(parcel0, 7, this.g);
        baub.p(parcel0, 8, this.h, false);
        baub.w(parcel0, 9, this.i, false);
        baub.i(parcel0, 10, this.j, false);
        baub.k(parcel0, 11, this.k, false);
        baub.g(parcel0, 12, this.l, false);
        baub.o(parcel0, 13, this.m);
        baub.r(parcel0, 14, this.n, false);
        baub.r(parcel0, 15, this.o, false);
        baub.J(parcel0, 16, this.p, v);
        baub.p(parcel0, 17, this.q, false);
        baub.i(parcel0, 18, this.r, false);
        baub.e(parcel0, 19, this.s);
        baub.c(parcel0, v1);
    }
}


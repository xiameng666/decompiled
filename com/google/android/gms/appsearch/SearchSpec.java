package com.google.android.gms.appsearch;

import acim;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.Collections;
import java.util.List;

public final class SearchSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    final Bundle b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    final Bundle i;
    public final int j;
    public final int k;
    final Bundle l;
    public final JoinSpec m;
    public final String n;
    public final List o;
    public final String p;
    public final List q;
    public final int r;
    public final List s;
    public final List t;
    private final List u;
    private final List v;
    private final List w;

    static {
        SearchSpec.CREATOR = new acim();
    }

    public SearchSpec(int v, List list0, List list1, Bundle bundle0, List list2, int v1, int v2, int v3, int v4, int v5, int v6, Bundle bundle1, int v7, int v8, Bundle bundle2, JoinSpec joinSpec0, String s, List list3, String s1, List list4, int v9, List list5, List list6) {
        this.a = v;
        this.u = DesugarCollections.unmodifiableList(((List)Objects.requireNonNull(list0)));
        this.v = DesugarCollections.unmodifiableList(((List)Objects.requireNonNull(list1)));
        this.b = (Bundle)Objects.requireNonNull(bundle0);
        this.w = DesugarCollections.unmodifiableList(((List)Objects.requireNonNull(list2)));
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        this.h = v6;
        this.i = (Bundle)Objects.requireNonNull(bundle1);
        this.j = v7;
        this.k = v8;
        this.l = (Bundle)Objects.requireNonNull(bundle2);
        this.m = joinSpec0;
        this.n = (String)Objects.requireNonNull(s);
        this.o = DesugarCollections.unmodifiableList(((List)Objects.requireNonNull(list3)));
        this.p = s1;
        this.q = list4 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list4);
        this.r = v9;
        this.s = list5 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list5);
        this.t = list6 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list6);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.x(parcel0, 2, (this.u == null ? Collections.EMPTY_LIST : this.u), false);
        baub.x(parcel0, 3, (this.v == null ? Collections.EMPTY_LIST : this.v), false);
        baub.g(parcel0, 4, this.b, false);
        baub.x(parcel0, 5, (this.w == null ? Collections.EMPTY_LIST : this.w), false);
        baub.o(parcel0, 6, this.c);
        baub.o(parcel0, 7, this.d);
        baub.o(parcel0, 8, this.e);
        baub.o(parcel0, 9, this.f);
        baub.o(parcel0, 10, this.g);
        baub.o(parcel0, 11, this.h);
        baub.g(parcel0, 12, this.i, false);
        baub.o(parcel0, 13, this.j);
        baub.o(parcel0, 14, this.k);
        baub.g(parcel0, 15, this.l, false);
        baub.t(parcel0, 16, this.m, v, false);
        baub.v(parcel0, 17, this.n, false);
        baub.x(parcel0, 18, this.o, false);
        baub.v(parcel0, 19, this.p, false);
        baub.y(parcel0, 20, this.q, false);
        baub.o(parcel0, 21, this.r);
        baub.x(parcel0, 22, this.s, false);
        baub.x(parcel0, 23, this.t, false);
        baub.c(parcel0, v1);
    }
}


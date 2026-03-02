package com.google.android.gms.appinvite.ui.context;

import accy;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

@Deprecated
public class SelectionFragmentOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;
    public final ArrayList c;
    public final boolean d;
    public final String[] e;
    public final int f;
    public final int g;
    public final String h;
    @Deprecated
    public final String i;
    public final boolean j;
    public final ArrayList k;
    public final boolean l;
    public final boolean m;
    public final Bundle n;

    static {
        SelectionFragmentOptions.CREATOR = new accy();
    }

    public SelectionFragmentOptions(String s, int v, ArrayList arrayList0, boolean z, String[] arr_s, int v1, int v2, String s1, String s2, boolean z1, ArrayList arrayList1, boolean z2, boolean z3, Bundle bundle0) {
        this.a = s;
        this.b = v;
        this.c = arrayList0;
        this.d = z;
        this.e = arr_s;
        this.f = v1;
        this.g = v2;
        this.h = s1;
        this.i = s2;
        this.j = z1;
        this.k = arrayList1;
        this.l = z2;
        this.m = z3;
        this.n = bundle0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.o(parcel0, 3, this.b);
        baub.y(parcel0, 4, this.c, false);
        baub.e(parcel0, 5, this.d);
        baub.w(parcel0, 6, this.e, false);
        baub.o(parcel0, 7, this.f);
        baub.o(parcel0, 8, this.g);
        baub.v(parcel0, 9, this.h, false);
        baub.v(parcel0, 10, this.i, false);
        baub.e(parcel0, 11, this.j);
        baub.y(parcel0, 12, this.k, false);
        baub.e(parcel0, 13, this.l);
        baub.e(parcel0, 14, this.m);
        baub.g(parcel0, 15, this.n, false);
        baub.c(parcel0, v1);
    }
}


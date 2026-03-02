package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cpsf;
import java.util.ArrayList;
import java.util.List;

public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final List b;
    public float c;
    public int d;
    public int e;
    public final float f;
    public final boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public final List k;

    static {
        PolygonOptions.CREATOR = new cpsf();
    }

    public PolygonOptions() {
        this.c = 10.0f;
        this.d = 0xFF000000;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = null;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public PolygonOptions(List list0, List list1, float f, int v, int v1, float f1, boolean z, boolean z1, boolean z2, int v2, List list2) {
        this.a = list0;
        this.b = list1;
        this.c = f;
        this.d = v;
        this.e = v1;
        this.f = f1;
        this.g = z;
        this.h = z1;
        this.i = z2;
        this.j = v2;
        this.k = list2;
    }

    public final void a(Iterable iterable0) {
        batl.t(iterable0, "points must not be null.");
        for(Object object0: iterable0) {
            this.a.add(((LatLng)object0));
        }
    }

    public final void b() {
        this.i = false;
    }

    public final void c() {
        this.h = true;
    }

    public final void d() {
        this.j = 2;
    }

    public final void e() {
        this.c = 2.0f;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 2, this.a, false);
        baub.G(parcel0, 3, this.b);
        baub.l(parcel0, 4, this.c);
        baub.o(parcel0, 5, this.d);
        baub.o(parcel0, 6, this.e);
        baub.l(parcel0, 7, this.f);
        baub.e(parcel0, 8, this.g);
        baub.e(parcel0, 9, this.h);
        baub.e(parcel0, 10, this.i);
        baub.o(parcel0, 11, this.j);
        baub.y(parcel0, 12, this.k, false);
        baub.c(parcel0, v1);
    }
}


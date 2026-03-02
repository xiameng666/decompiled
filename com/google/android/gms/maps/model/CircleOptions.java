package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cprr;
import java.util.List;

public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public LatLng a;
    public double b;
    public float c;
    public int d;
    public int e;
    public final float f;
    public final boolean g;
    public final boolean h;
    public final List i;

    static {
        CircleOptions.CREATOR = new cprr();
    }

    public CircleOptions() {
        this.a = null;
        this.b = 0.0;
        this.c = 10.0f;
        this.d = 0xFF000000;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = null;
    }

    public CircleOptions(LatLng latLng0, double f, float f1, int v, int v1, float f2, boolean z, boolean z1, List list0) {
        this.a = latLng0;
        this.b = f;
        this.c = f1;
        this.d = v;
        this.e = v1;
        this.f = f2;
        this.g = z;
        this.h = z1;
        this.i = list0;
    }

    public final void a(LatLng latLng0) {
        batl.t(latLng0, "center must not be null.");
        this.a = latLng0;
    }

    public final void b() {
        this.e = 0x1F1A73E8;
    }

    public final void c() {
        this.d = -15043608;
    }

    public final void d() {
        this.c = 6.0f;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.j(parcel0, 3, this.b);
        baub.l(parcel0, 4, this.c);
        baub.o(parcel0, 5, this.d);
        baub.o(parcel0, 6, this.e);
        baub.l(parcel0, 7, this.f);
        baub.e(parcel0, 8, this.g);
        baub.e(parcel0, 9, this.h);
        baub.y(parcel0, 10, this.i, false);
        baub.c(parcel0, v1);
    }
}


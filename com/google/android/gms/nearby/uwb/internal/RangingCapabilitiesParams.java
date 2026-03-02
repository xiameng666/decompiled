package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import djew;
import java.util.Arrays;

public final class RangingCapabilitiesParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int[] f;
    public int[] g;
    public float h;
    public int[] i;
    public int[] j;
    public int[] k;
    public boolean l;
    public boolean m;

    static {
        RangingCapabilitiesParams.CREATOR = new djew();
    }

    public RangingCapabilitiesParams() {
    }

    public RangingCapabilitiesParams(boolean z, boolean z1, boolean z2, int v, int v1, int[] arr_v, int[] arr_v1, float f, int[] arr_v2, int[] arr_v3, int[] arr_v4, boolean z3, boolean z4) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = v;
        this.e = v1;
        this.f = arr_v;
        this.g = arr_v1;
        this.h = f;
        this.i = arr_v2;
        this.j = arr_v3;
        this.k = arr_v4;
        this.l = z3;
        this.m = z4;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof RangingCapabilitiesParams) && bata.b(Boolean.valueOf(this.a), Boolean.valueOf(((RangingCapabilitiesParams)object0).a)) && bata.b(Boolean.valueOf(this.b), Boolean.valueOf(((RangingCapabilitiesParams)object0).b)) && bata.b(Boolean.valueOf(this.c), Boolean.valueOf(((RangingCapabilitiesParams)object0).c)) && bata.b(Integer.valueOf(this.d), Integer.valueOf(((RangingCapabilitiesParams)object0).d)) && bata.b(Integer.valueOf(this.e), Integer.valueOf(((RangingCapabilitiesParams)object0).e)) && Arrays.equals(this.f, ((RangingCapabilitiesParams)object0).f) && Arrays.equals(this.g, ((RangingCapabilitiesParams)object0).g) && bata.b(Float.valueOf(this.h), Float.valueOf(((RangingCapabilitiesParams)object0).h)) && Arrays.equals(this.i, ((RangingCapabilitiesParams)object0).i) && Arrays.equals(this.j, ((RangingCapabilitiesParams)object0).j) && Arrays.equals(this.k, ((RangingCapabilitiesParams)object0).k) && bata.b(Boolean.valueOf(this.l), Boolean.valueOf(((RangingCapabilitiesParams)object0).l)) && bata.b(Boolean.valueOf(this.m), Boolean.valueOf(((RangingCapabilitiesParams)object0).m));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), ((int)this.d), ((int)this.e), Arrays.hashCode(this.f), Arrays.hashCode(this.g), ((float)this.h), Arrays.hashCode(this.i), Arrays.hashCode(this.j), Arrays.hashCode(this.k), Boolean.valueOf(this.l), Boolean.valueOf(this.m)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.o(parcel0, 5, this.e);
        baub.p(parcel0, 6, this.f, false);
        baub.p(parcel0, 7, this.g, false);
        baub.l(parcel0, 8, this.h);
        baub.p(parcel0, 9, this.i, false);
        baub.p(parcel0, 10, this.j, false);
        baub.p(parcel0, 11, this.k, false);
        baub.e(parcel0, 12, this.l);
        baub.e(parcel0, 13, this.m);
        baub.c(parcel0, v1);
    }
}


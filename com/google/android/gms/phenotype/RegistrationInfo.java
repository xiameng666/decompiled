package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import einu;
import java.util.Arrays;

public class RegistrationInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int[] a;
    public static final byte[] b;
    public final String c;
    public final int d;
    public final String[] e;
    public final byte[] f;
    public final boolean g;
    public final int[] h;
    public final String i;
    public final byte[] j;
    public final int k;
    public final int l;

    static {
        RegistrationInfo.a = new int[0];
        RegistrationInfo.b = new byte[0];
        RegistrationInfo.CREATOR = new einu();
    }

    public RegistrationInfo(String s, int v, String[] arr_s, byte[] arr_b, String s1, byte[] arr_b1, int v1, int v2) {
        this.c = s;
        this.d = v;
        this.e = arr_s;
        this.f = arr_b;
        this.g = false;
        this.h = RegistrationInfo.a;
        this.i = s1;
        this.j = arr_b1;
        this.k = v1;
        this.l = v2;
    }

    public RegistrationInfo(String s, int v, String[] arr_s, byte[] arr_b, boolean z, int[] arr_v, String s1, byte[] arr_b1) {
        this(s, v, arr_s, arr_b, z, arr_v, s1, arr_b1, 1, 0);
    }

    public RegistrationInfo(String s, int v, String[] arr_s, byte[] arr_b, boolean z, int[] arr_v, String s1, byte[] arr_b1, int v1, int v2) {
        this.c = s;
        this.d = v;
        this.e = arr_s;
        this.f = arr_b;
        this.g = z;
        this.h = arr_v;
        this.i = s1;
        this.j = arr_b1;
        this.k = v1;
        this.l = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof RegistrationInfo) && this.c.equals(((RegistrationInfo)object0).c) && this.d == ((RegistrationInfo)object0).d && Arrays.equals(this.e, ((RegistrationInfo)object0).e) && Arrays.equals(this.f, ((RegistrationInfo)object0).f) && this.g == ((RegistrationInfo)object0).g && Arrays.equals(this.h, ((RegistrationInfo)object0).h) && this.i.equals(((RegistrationInfo)object0).i) && Arrays.equals(this.j, ((RegistrationInfo)object0).j) && this.k == ((RegistrationInfo)object0).k && this.l == ((RegistrationInfo)object0).l;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, ((int)this.d), this.e, this.f, Boolean.valueOf(this.g), this.h, this.i, this.j, ((int)this.k), ((int)this.l)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.c, false);
        baub.o(parcel0, 2, this.d);
        baub.w(parcel0, 3, this.e, false);
        baub.i(parcel0, 4, this.f, false);
        baub.e(parcel0, 5, this.g);
        baub.p(parcel0, 6, this.h, false);
        baub.v(parcel0, 7, this.i, false);
        baub.i(parcel0, 8, this.j, false);
        baub.o(parcel0, 9, this.k);
        baub.o(parcel0, 10, this.l);
        baub.c(parcel0, v1);
    }
}


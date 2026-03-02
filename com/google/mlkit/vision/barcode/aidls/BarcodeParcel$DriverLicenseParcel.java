package com.google.mlkit.vision.barcode.aidls;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import hbsa;

public class BarcodeParcel.DriverLicenseParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    static {
        BarcodeParcel.DriverLicenseParcel.CREATOR = new hbsa();
    }

    public BarcodeParcel.DriverLicenseParcel(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12, String s13) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
        this.g = s6;
        this.h = s7;
        this.i = s8;
        this.j = s9;
        this.k = s10;
        this.l = s11;
        this.m = s12;
        this.n = s13;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.v(parcel0, 6, this.f, false);
        baub.v(parcel0, 7, this.g, false);
        baub.v(parcel0, 8, this.h, false);
        baub.v(parcel0, 9, this.i, false);
        baub.v(parcel0, 10, this.j, false);
        baub.v(parcel0, 11, this.k, false);
        baub.v(parcel0, 12, this.l, false);
        baub.v(parcel0, 13, this.m, false);
        baub.v(parcel0, 14, this.n, false);
        baub.c(parcel0, v1);
    }
}


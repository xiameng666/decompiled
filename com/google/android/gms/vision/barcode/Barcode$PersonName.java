package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import faud;

public class Barcode.PersonName extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    static {
        Barcode.PersonName.CREATOR = new faud();
    }

    public Barcode.PersonName() {
    }

    public Barcode.PersonName(String s, String s1, String s2, String s3, String s4, String s5, String s6) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
        this.g = s6;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.v(parcel0, 4, this.c, false);
        baub.v(parcel0, 5, this.d, false);
        baub.v(parcel0, 6, this.e, false);
        baub.v(parcel0, 7, this.f, false);
        baub.v(parcel0, 8, this.g, false);
        baub.c(parcel0, v1);
    }
}


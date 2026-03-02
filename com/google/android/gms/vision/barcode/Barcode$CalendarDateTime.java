package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fatx;

public class Barcode.CalendarDateTime extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;

    static {
        Barcode.CalendarDateTime.CREATOR = new fatx();
    }

    public Barcode.CalendarDateTime() {
    }

    public Barcode.CalendarDateTime(int v, int v1, int v2, int v3, int v4, int v5, boolean z, String s) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = z;
        this.h = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.o(parcel0, 3, this.b);
        baub.o(parcel0, 4, this.c);
        baub.o(parcel0, 5, this.d);
        baub.o(parcel0, 6, this.e);
        baub.o(parcel0, 7, this.f);
        baub.e(parcel0, 8, this.g);
        baub.v(parcel0, 9, this.h, false);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fatw;

public class Barcode extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public String b;
    public String c;
    public int d;
    public Point[] e;
    public Barcode.Email f;
    public Barcode.Phone g;
    public Barcode.Sms h;
    public Barcode.WiFi i;
    public Barcode.UrlBookmark j;
    public Barcode.GeoPoint k;
    public Barcode.CalendarEvent l;
    public Barcode.ContactInfo m;
    public Barcode.DriverLicense n;
    public byte[] o;
    public boolean p;
    public double q;

    static {
        Barcode.CREATOR = new fatw();
    }

    public Barcode() {
    }

    public Barcode(int v, String s, String s1, int v1, Point[] arr_point, Barcode.Email barcode$Email0, Barcode.Phone barcode$Phone0, Barcode.Sms barcode$Sms0, Barcode.WiFi barcode$WiFi0, Barcode.UrlBookmark barcode$UrlBookmark0, Barcode.GeoPoint barcode$GeoPoint0, Barcode.CalendarEvent barcode$CalendarEvent0, Barcode.ContactInfo barcode$ContactInfo0, Barcode.DriverLicense barcode$DriverLicense0, byte[] arr_b, boolean z, double f) {
        this.a = v;
        this.b = s;
        this.o = arr_b;
        this.c = s1;
        this.d = v1;
        this.e = arr_point;
        this.p = z;
        this.q = f;
        this.f = barcode$Email0;
        this.g = barcode$Phone0;
        this.h = barcode$Sms0;
        this.i = barcode$WiFi0;
        this.j = barcode$UrlBookmark0;
        this.k = barcode$GeoPoint0;
        this.l = barcode$CalendarEvent0;
        this.m = barcode$ContactInfo0;
        this.n = barcode$DriverLicense0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.v(parcel0, 3, this.b, false);
        baub.v(parcel0, 4, this.c, false);
        baub.o(parcel0, 5, this.d);
        baub.J(parcel0, 6, this.e, v);
        baub.t(parcel0, 7, this.f, v, false);
        baub.t(parcel0, 8, this.g, v, false);
        baub.t(parcel0, 9, this.h, v, false);
        baub.t(parcel0, 10, this.i, v, false);
        baub.t(parcel0, 11, this.j, v, false);
        baub.t(parcel0, 12, this.k, v, false);
        baub.t(parcel0, 13, this.l, v, false);
        baub.t(parcel0, 14, this.m, v, false);
        baub.t(parcel0, 15, this.n, v, false);
        baub.i(parcel0, 16, this.o, false);
        baub.e(parcel0, 17, this.p);
        baub.j(parcel0, 18, this.q);
        baub.c(parcel0, v1);
    }
}


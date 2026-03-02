package com.google.mlkit.vision.barcode.aidls;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import hbru;

public class BarcodeParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final String c;
    public final byte[] d;
    public final Point[] e;
    public final int f;
    public final BarcodeParcel.EmailParcel g;
    public final BarcodeParcel.PhoneParcel h;
    public final BarcodeParcel.SmsParcel i;
    public final BarcodeParcel.WiFiParcel j;
    public final BarcodeParcel.UrlBookmarkParcel k;
    public final BarcodeParcel.GeoPointParcel l;
    public final BarcodeParcel.CalendarEventParcel m;
    public final BarcodeParcel.ContactInfoParcel n;
    public final BarcodeParcel.DriverLicenseParcel o;

    static {
        BarcodeParcel.CREATOR = new hbru();
    }

    public BarcodeParcel(int v, String s, String s1, byte[] arr_b, Point[] arr_point, int v1, BarcodeParcel.EmailParcel barcodeParcel$EmailParcel0, BarcodeParcel.PhoneParcel barcodeParcel$PhoneParcel0, BarcodeParcel.SmsParcel barcodeParcel$SmsParcel0, BarcodeParcel.WiFiParcel barcodeParcel$WiFiParcel0, BarcodeParcel.UrlBookmarkParcel barcodeParcel$UrlBookmarkParcel0, BarcodeParcel.GeoPointParcel barcodeParcel$GeoPointParcel0, BarcodeParcel.CalendarEventParcel barcodeParcel$CalendarEventParcel0, BarcodeParcel.ContactInfoParcel barcodeParcel$ContactInfoParcel0, BarcodeParcel.DriverLicenseParcel barcodeParcel$DriverLicenseParcel0) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = arr_b;
        this.e = arr_point;
        this.f = v1;
        this.g = barcodeParcel$EmailParcel0;
        this.h = barcodeParcel$PhoneParcel0;
        this.i = barcodeParcel$SmsParcel0;
        this.j = barcodeParcel$WiFiParcel0;
        this.k = barcodeParcel$UrlBookmarkParcel0;
        this.l = barcodeParcel$GeoPointParcel0;
        this.m = barcodeParcel$CalendarEventParcel0;
        this.n = barcodeParcel$ContactInfoParcel0;
        this.o = barcodeParcel$DriverLicenseParcel0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.i(parcel0, 4, this.d, false);
        baub.J(parcel0, 5, this.e, v);
        baub.o(parcel0, 6, this.f);
        baub.t(parcel0, 7, this.g, v, false);
        baub.t(parcel0, 8, this.h, v, false);
        baub.t(parcel0, 9, this.i, v, false);
        baub.t(parcel0, 10, this.j, v, false);
        baub.t(parcel0, 11, this.k, v, false);
        baub.t(parcel0, 12, this.l, v, false);
        baub.t(parcel0, 13, this.m, v, false);
        baub.t(parcel0, 14, this.n, v, false);
        baub.t(parcel0, 15, this.o, v, false);
        baub.c(parcel0, v1);
    }
}


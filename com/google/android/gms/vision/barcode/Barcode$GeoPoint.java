package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fauc;

public class Barcode.GeoPoint extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public double a;
    public double b;

    static {
        Barcode.GeoPoint.CREATOR = new fauc();
    }

    public Barcode.GeoPoint() {
    }

    public Barcode.GeoPoint(double f, double f1) {
        this.a = f;
        this.b = f1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.j(parcel0, 2, this.a);
        baub.j(parcel0, 3, this.b);
        baub.c(parcel0, v1);
    }
}


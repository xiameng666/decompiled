package com.google.mlkit.vision.barcode.aidls;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import hbsl;

public class BarcodeParcel.WiFiParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final int c;

    static {
        BarcodeParcel.WiFiParcel.CREATOR = new hbsl();
    }

    public BarcodeParcel.WiFiParcel(String s, String s1, int v) {
        this.a = s;
        this.b = s1;
        this.c = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fauh;

public class Barcode.WiFi extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public int c;

    static {
        Barcode.WiFi.CREATOR = new fauh();
    }

    public Barcode.WiFi() {
    }

    public Barcode.WiFi(String s, String s1, int v) {
        this.a = s;
        this.b = s1;
        this.c = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.o(parcel0, 4, this.c);
        baub.c(parcel0, v1);
    }
}


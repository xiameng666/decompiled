package com.google.mlkit.vision.barcode.aidls;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import hbrz;

public class BarcodeParcel.ContactInfoParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final BarcodeParcel.PersonNameParcel a;
    public final String b;
    public final String c;
    public final BarcodeParcel.PhoneParcel[] d;
    public final BarcodeParcel.EmailParcel[] e;
    public final String[] f;
    public final BarcodeParcel.AddressParcel[] g;

    static {
        BarcodeParcel.ContactInfoParcel.CREATOR = new hbrz();
    }

    public BarcodeParcel.ContactInfoParcel(BarcodeParcel.PersonNameParcel barcodeParcel$PersonNameParcel0, String s, String s1, BarcodeParcel.PhoneParcel[] arr_barcodeParcel$PhoneParcel, BarcodeParcel.EmailParcel[] arr_barcodeParcel$EmailParcel, String[] arr_s, BarcodeParcel.AddressParcel[] arr_barcodeParcel$AddressParcel) {
        this.a = barcodeParcel$PersonNameParcel0;
        this.b = s;
        this.c = s1;
        this.d = arr_barcodeParcel$PhoneParcel;
        this.e = arr_barcodeParcel$EmailParcel;
        this.f = arr_s;
        this.g = arr_barcodeParcel$AddressParcel;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.J(parcel0, 4, this.d, v);
        baub.J(parcel0, 5, this.e, v);
        baub.w(parcel0, 6, this.f, false);
        baub.J(parcel0, 7, this.g, v);
        baub.c(parcel0, v1);
    }
}


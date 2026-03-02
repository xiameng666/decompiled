package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fatz;

public class Barcode.ContactInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Barcode.PersonName a;
    public String b;
    public String c;
    public Barcode.Phone[] d;
    public Barcode.Email[] e;
    public String[] f;
    public Barcode.Address[] g;

    static {
        Barcode.ContactInfo.CREATOR = new fatz();
    }

    public Barcode.ContactInfo() {
    }

    public Barcode.ContactInfo(Barcode.PersonName barcode$PersonName0, String s, String s1, Barcode.Phone[] arr_barcode$Phone, Barcode.Email[] arr_barcode$Email, String[] arr_s, Barcode.Address[] arr_barcode$Address) {
        this.a = barcode$PersonName0;
        this.b = s;
        this.c = s1;
        this.d = arr_barcode$Phone;
        this.e = arr_barcode$Email;
        this.f = arr_s;
        this.g = arr_barcode$Address;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.v(parcel0, 3, this.b, false);
        baub.v(parcel0, 4, this.c, false);
        baub.J(parcel0, 5, this.d, v);
        baub.J(parcel0, 6, this.e, v);
        baub.w(parcel0, 7, this.f, false);
        baub.J(parcel0, 8, this.g, v);
        baub.c(parcel0, v1);
    }
}


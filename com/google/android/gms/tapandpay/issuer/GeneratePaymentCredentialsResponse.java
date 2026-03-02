package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ethr;

public class GeneratePaymentCredentialsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final byte[] a;
    final byte[] b;
    final byte[] c;

    static {
        GeneratePaymentCredentialsResponse.CREATOR = new ethr();
    }

    public GeneratePaymentCredentialsResponse(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        this.a = arr_b;
        this.b = arr_b1;
        this.c = arr_b2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, this.b, false);
        baub.i(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}


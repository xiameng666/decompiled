package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import esmi;

public class RetrieveInAppPaymentCredentialResponse extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    final byte[] b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;

    static {
        RetrieveInAppPaymentCredentialResponse.CREATOR = new esmi();
    }

    public RetrieveInAppPaymentCredentialResponse() {
        this(null, null, 0, 0, null, null);
    }

    public RetrieveInAppPaymentCredentialResponse(String s, byte[] arr_b, int v, int v1, String s1) {
        this(s, arr_b, v, v1, s1, null);
    }

    public RetrieveInAppPaymentCredentialResponse(String s, byte[] arr_b, int v, int v1, String s1, String s2) {
        this.a = s;
        this.b = arr_b;
        this.c = v;
        this.d = v1;
        this.e = s1;
        this.f = s2;
    }

    public final byte[] a() {
        return this.b == null ? new byte[0] : this.b;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.i(parcel0, 3, this.b, false);
        baub.o(parcel0, 4, this.c);
        baub.o(parcel0, 5, this.d);
        baub.v(parcel0, 6, this.e, false);
        baub.v(parcel0, 7, this.f, false);
        baub.c(parcel0, v1);
    }
}


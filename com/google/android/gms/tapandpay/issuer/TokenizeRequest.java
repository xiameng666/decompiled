package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import etlm;

public class TokenizeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final String c;
    final int d;
    public final String e;

    static {
        TokenizeRequest.CREATOR = new etlm();
    }

    public TokenizeRequest(int v, String s, String s1, int v1, String s2) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = v1;
        this.e = s2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.o(parcel0, 4, this.d);
        baub.v(parcel0, 5, this.e, false);
        baub.c(parcel0, v1);
    }
}


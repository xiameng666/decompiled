package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ethz;

public class IsTokenizedRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    static {
        IsTokenizedRequest.CREATOR = new ethz();
    }

    public IsTokenizedRequest(String s, int v, int v1, String s1, String s2) {
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = s1;
        this.e = s2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.c(parcel0, v1);
    }
}


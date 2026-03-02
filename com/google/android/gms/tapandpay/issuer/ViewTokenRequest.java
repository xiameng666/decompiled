package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import etlo;

public class ViewTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;
    public final String c;

    static {
        ViewTokenRequest.CREATOR = new etlo();
    }

    public ViewTokenRequest(String s, int v, String s1) {
        this.a = s;
        this.b = v;
        this.c = s1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}


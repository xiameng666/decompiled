package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import etlk;

public final class TokenStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final String a;
    final int b;
    final boolean c;

    static {
        TokenStatus.CREATOR = new etlk();
    }

    public TokenStatus(String s, int v, boolean z) {
        this.a = s;
        this.b = v;
        this.c = z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.o(parcel0, 3, this.b);
        baub.e(parcel0, 4, this.c);
        baub.c(parcel0, v1);
    }
}


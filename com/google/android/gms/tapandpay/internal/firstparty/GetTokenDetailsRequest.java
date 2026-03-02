package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import etci;

public final class GetTokenDetailsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;

    static {
        GetTokenDetailsRequest.CREATOR = new etci();
    }

    public GetTokenDetailsRequest(String s) {
        this.a = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.c(parcel0, v1);
    }
}


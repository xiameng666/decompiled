package com.google.android.gms.auth;

import acrz;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetAccountsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String[] b;

    static {
        GetAccountsRequest.CREATOR = new acrz();
    }

    public GetAccountsRequest(String s, String[] arr_s) {
        this.a = s;
        this.b = arr_s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.w(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}


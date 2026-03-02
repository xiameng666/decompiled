package com.google.android.gms.tapandpay.firstparty;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import esng;

public final class UnifiedTokenizationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final byte[] c;
    public final Integer d;
    public final Integer e;
    public final Bundle f;

    static {
        UnifiedTokenizationRequest.CREATOR = new esng();
    }

    public UnifiedTokenizationRequest(String s, String s1, byte[] arr_b, Integer integer0, Integer integer1, Bundle bundle0) {
        this.a = s;
        this.b = s1;
        this.c = arr_b;
        this.d = integer0;
        this.e = integer1;
        this.f = bundle0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.i(parcel0, 3, this.c, false);
        baub.F(parcel0, 4, this.d);
        baub.F(parcel0, 5, this.e);
        baub.g(parcel0, 6, this.f, false);
        baub.c(parcel0, v1);
    }
}


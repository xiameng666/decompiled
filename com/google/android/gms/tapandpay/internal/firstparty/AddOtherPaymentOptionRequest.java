package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import etaw;

public final class AddOtherPaymentOptionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;

    static {
        AddOtherPaymentOptionRequest.CREATOR = new etaw();
    }

    public AddOtherPaymentOptionRequest(int v, String s) {
        this.a = v;
        this.b = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 3, this.b, false);
        baub.c(parcel0, v1);
    }
}


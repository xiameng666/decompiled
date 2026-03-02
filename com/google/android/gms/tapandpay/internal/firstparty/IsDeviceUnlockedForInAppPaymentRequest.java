package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import etgm;

public final class IsDeviceUnlockedForInAppPaymentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;

    static {
        IsDeviceUnlockedForInAppPaymentRequest.CREATOR = new etgm();
    }

    public IsDeviceUnlockedForInAppPaymentRequest(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.c(parcel0, v1);
    }
}


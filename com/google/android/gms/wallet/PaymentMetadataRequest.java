package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import faxf;

public final class PaymentMetadataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;

    static {
        PaymentMetadataRequest.CREATOR = new faxf();
    }

    public PaymentMetadataRequest(String s) {
        batl.t(s, "paymentMetadataRequestJson cannot be null!");
        this.a = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}


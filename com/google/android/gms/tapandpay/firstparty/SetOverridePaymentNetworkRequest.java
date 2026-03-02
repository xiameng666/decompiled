package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import esmq;
import java.util.Arrays;

public final class SetOverridePaymentNetworkRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;

    static {
        SetOverridePaymentNetworkRequest.CREATOR = new esmq();
    }

    public SetOverridePaymentNetworkRequest() {
    }

    public SetOverridePaymentNetworkRequest(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SetOverridePaymentNetworkRequest) && bata.b(this.a, ((SetOverridePaymentNetworkRequest)object0).a) && bata.b(this.b, ((SetOverridePaymentNetworkRequest)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}


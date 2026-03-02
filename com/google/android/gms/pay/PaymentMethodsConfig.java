package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlhg;
import java.util.Arrays;

public final class PaymentMethodsConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int[] a;

    static {
        PaymentMethodsConfig.CREATOR = new dlhg();
    }

    public PaymentMethodsConfig() {
    }

    public PaymentMethodsConfig(int[] arr_v) {
        this.a = arr_v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof PaymentMethodsConfig) ? Arrays.equals(this.a, ((PaymentMethodsConfig)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.p(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}


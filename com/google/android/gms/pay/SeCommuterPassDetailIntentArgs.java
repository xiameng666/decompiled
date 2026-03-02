package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlii;
import java.util.Arrays;

public final class SeCommuterPassDetailIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public SeServiceProvider a;
    public GooglePaymentMethodId b;
    public String c;
    public byte[] d;
    public int e;

    static {
        SeCommuterPassDetailIntentArgs.CREATOR = new dlii();
    }

    public SeCommuterPassDetailIntentArgs() {
    }

    public SeCommuterPassDetailIntentArgs(SeServiceProvider seServiceProvider0, GooglePaymentMethodId googlePaymentMethodId0, String s, byte[] arr_b, int v) {
        this.a = seServiceProvider0;
        this.b = googlePaymentMethodId0;
        this.c = s;
        this.d = arr_b;
        this.e = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SeCommuterPassDetailIntentArgs) && bata.b(this.a, ((SeCommuterPassDetailIntentArgs)object0).a) && bata.b(this.b, ((SeCommuterPassDetailIntentArgs)object0).b) && bata.b(this.c, ((SeCommuterPassDetailIntentArgs)object0).c) && Arrays.equals(this.d, ((SeCommuterPassDetailIntentArgs)object0).d) && bata.b(Integer.valueOf(this.e), Integer.valueOf(((SeCommuterPassDetailIntentArgs)object0).e));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Arrays.hashCode(this.d), ((int)this.e)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 3, this.b, v, false);
        baub.v(parcel0, 5, this.c, false);
        baub.i(parcel0, 6, this.d, false);
        baub.o(parcel0, 7, this.e);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import crvs;
import java.util.ArrayList;
import java.util.Arrays;

public class PaymentGatewayConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    static {
        PaymentGatewayConfig.CREATOR = new crvs();
    }

    public PaymentGatewayConfig(String s, int v, String s1, String s2, String s3, String s4) {
        this.a = s;
        this.b = v;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = s4;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof PaymentGatewayConfig) ? bata.b(this.a, ((PaymentGatewayConfig)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((PaymentGatewayConfig)object0).b)) && bata.b(this.c, ((PaymentGatewayConfig)object0).c) && bata.b(this.d, ((PaymentGatewayConfig)object0).d) && bata.b(this.e, ((PaymentGatewayConfig)object0).e) && bata.b(this.f, ((PaymentGatewayConfig)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b), this.c, this.d, this.e});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("displayName", this.a, arrayList0);
        basz.b("type", Integer.valueOf(this.b), arrayList0);
        basz.b("paymentGatewayUrl", this.c, arrayList0);
        basz.b("purchaseStatusUrl", this.d, arrayList0);
        basz.b("description", this.e, arrayList0);
        basz.b("title", this.f, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.v(parcel0, 6, this.f, false);
        baub.c(parcel0, v1);
    }
}


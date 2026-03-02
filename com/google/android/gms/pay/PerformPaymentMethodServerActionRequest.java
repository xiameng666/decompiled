package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlhh;
import java.util.Arrays;

public final class PerformPaymentMethodServerActionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Account a;
    public ProtoSafeParcelable b;
    public String c;

    static {
        PerformPaymentMethodServerActionRequest.CREATOR = new dlhh();
    }

    public PerformPaymentMethodServerActionRequest() {
    }

    public PerformPaymentMethodServerActionRequest(Account account0, ProtoSafeParcelable protoSafeParcelable0, String s) {
        this.a = account0;
        this.b = protoSafeParcelable0;
        this.c = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof PerformPaymentMethodServerActionRequest) && bata.b(this.a, ((PerformPaymentMethodServerActionRequest)object0).a) && bata.b(this.b, ((PerformPaymentMethodServerActionRequest)object0).b) && bata.b(this.c, ((PerformPaymentMethodServerActionRequest)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}


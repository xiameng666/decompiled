package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlfx;
import java.util.Arrays;

public final class ListCommuterPassRenewalOptionsForSePrepaidCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Account a;
    public GooglePaymentMethodId b;
    public byte[] c;

    static {
        ListCommuterPassRenewalOptionsForSePrepaidCardRequest.CREATOR = new dlfx();
    }

    public ListCommuterPassRenewalOptionsForSePrepaidCardRequest() {
    }

    public ListCommuterPassRenewalOptionsForSePrepaidCardRequest(Account account0, GooglePaymentMethodId googlePaymentMethodId0, byte[] arr_b) {
        this.a = account0;
        this.b = googlePaymentMethodId0;
        this.c = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ListCommuterPassRenewalOptionsForSePrepaidCardRequest) && bata.b(this.a, ((ListCommuterPassRenewalOptionsForSePrepaidCardRequest)object0).a) && bata.b(this.b, ((ListCommuterPassRenewalOptionsForSePrepaidCardRequest)object0).b) && Arrays.equals(this.c, ((ListCommuterPassRenewalOptionsForSePrepaidCardRequest)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Arrays.hashCode(this.c)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.i(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}


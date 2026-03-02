package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlic;
import java.util.Arrays;

public final class SavePurchasedCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Account a;
    public byte[] b;

    static {
        SavePurchasedCardRequest.CREATOR = new dlic();
    }

    public SavePurchasedCardRequest() {
    }

    public SavePurchasedCardRequest(Account account0, byte[] arr_b) {
        this.a = account0;
        this.b = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SavePurchasedCardRequest) && bata.b(this.a, ((SavePurchasedCardRequest)object0).a) && Arrays.equals(this.b, ((SavePurchasedCardRequest)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Arrays.hashCode(this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.i(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}


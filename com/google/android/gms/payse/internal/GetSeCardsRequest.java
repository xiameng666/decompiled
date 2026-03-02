package com.google.android.gms.payse.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import efnp;

public class GetSeCardsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Account a;

    static {
        GetSeCardsRequest.CREATOR = new efnp();
    }

    public GetSeCardsRequest(Account account0) {
        this.a = account0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eskx;

public final class GetActiveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final AccountInfo a;

    static {
        GetActiveAccountResponse.CREATOR = new eskx();
    }

    public GetActiveAccountResponse(AccountInfo accountInfo0) {
        this.a = accountInfo0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.c(parcel0, v1);
    }
}


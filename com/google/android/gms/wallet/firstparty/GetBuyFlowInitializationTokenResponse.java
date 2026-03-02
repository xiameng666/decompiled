package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fbiq;

public final class GetBuyFlowInitializationTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    byte[] a;

    static {
        GetBuyFlowInitializationTokenResponse.CREATOR = new fbiq();
    }

    GetBuyFlowInitializationTokenResponse() {
        this(new byte[0]);
    }

    public GetBuyFlowInitializationTokenResponse(byte[] arr_b) {
        this.a = arr_b;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 2, this.a, false);
        baub.c(parcel0, v1);
    }
}


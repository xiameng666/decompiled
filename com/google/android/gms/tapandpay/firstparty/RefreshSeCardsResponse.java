package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import esme;

public final class RefreshSeCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        RefreshSeCardsResponse.CREATOR = new esme();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        baub.c(parcel0, baub.a(parcel0));
    }
}


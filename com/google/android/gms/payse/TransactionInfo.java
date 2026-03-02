package com.google.android.gms.payse;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import efnm;

public final class TransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        TransactionInfo.CREATOR = new efnm();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        baub.c(parcel0, baub.a(parcel0));
    }
}


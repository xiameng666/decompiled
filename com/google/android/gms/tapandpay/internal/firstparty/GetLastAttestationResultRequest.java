package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import etcc;

public final class GetLastAttestationResultRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        GetLastAttestationResultRequest.CREATOR = new etcc();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        baub.c(parcel0, baub.a(parcel0));
    }
}


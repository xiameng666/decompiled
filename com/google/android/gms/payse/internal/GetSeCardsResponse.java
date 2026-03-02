package com.google.android.gms.payse.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.payse.SecureElementStoredValue;
import efnq;

public class GetSeCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final SecureElementStoredValue[] a;

    static {
        GetSeCardsResponse.CREATOR = new efnq();
    }

    public GetSeCardsResponse(SecureElementStoredValue[] arr_secureElementStoredValue) {
        this.a = arr_secureElementStoredValue;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.J(parcel0, 1, this.a, v);
        baub.c(parcel0, v1);
    }
}


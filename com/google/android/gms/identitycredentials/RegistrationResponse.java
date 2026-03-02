package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bxvi;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;

public final class RegistrationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        RegistrationResponse.CREATOR = new bxvi();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        baub.c(parcel0, baub.a(parcel0));
    }
}


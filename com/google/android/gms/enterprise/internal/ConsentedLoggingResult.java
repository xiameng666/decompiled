package com.google.android.gms.enterprise.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bjlv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ConsentedLoggingResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        ConsentedLoggingResult.CREATOR = new bjlv();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        baub.c(parcel0, baub.a(parcel0));
    }
}


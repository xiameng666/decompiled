package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dllq;

public final class WearMfiAcquireUserConsentIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        WearMfiAcquireUserConsentIntentArgs.CREATOR = new dllq();
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof WearMfiAcquireUserConsentIntentArgs);
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        baub.c(parcel0, baub.a(parcel0));
    }
}


package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bnjr;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class SyncOwnerKeyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        SyncOwnerKeyResponse.CREATOR = new bnjr();
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SyncOwnerKeyResponse);
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


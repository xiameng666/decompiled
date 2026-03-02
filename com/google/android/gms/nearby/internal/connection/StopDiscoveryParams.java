package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import czij;

public final class StopDiscoveryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        StopDiscoveryParams.CREATOR = new czij();
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof StopDiscoveryParams);
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


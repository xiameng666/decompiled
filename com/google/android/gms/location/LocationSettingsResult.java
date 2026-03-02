package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azuj;
import baub;
import cmoi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LocationSettingsResult extends AbstractSafeParcelable implements azuj {
    public static final Parcelable.Creator CREATOR;
    public final Status a;
    public final LocationSettingsStates b;

    static {
        LocationSettingsResult.CREATOR = new cmoi();
    }

    public LocationSettingsResult(Status status0, LocationSettingsStates locationSettingsStates0) {
        this.a = status0;
        this.b = locationSettingsStates0;
    }

    @Override  // azuj
    public final Status a() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}


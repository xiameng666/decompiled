package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import djer;
import java.util.Arrays;

public final class OnRangingInitializedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public UwbDeviceParams a;

    static {
        OnRangingInitializedParams.CREATOR = new djer();
    }

    public OnRangingInitializedParams() {
    }

    public OnRangingInitializedParams(UwbDeviceParams uwbDeviceParams0) {
        this.a = uwbDeviceParams0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof OnRangingInitializedParams) ? bata.b(this.a, ((OnRangingInitializedParams)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.c(parcel0, v1);
    }
}


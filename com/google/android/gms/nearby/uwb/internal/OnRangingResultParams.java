package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import djes;
import java.util.Arrays;

public final class OnRangingResultParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public UwbDeviceParams a;
    public RangingPositionParams b;

    static {
        OnRangingResultParams.CREATOR = new djes();
    }

    public OnRangingResultParams() {
    }

    public OnRangingResultParams(UwbDeviceParams uwbDeviceParams0, RangingPositionParams rangingPositionParams0) {
        this.a = uwbDeviceParams0;
        this.b = rangingPositionParams0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof OnRangingResultParams) && bata.b(this.a, ((OnRangingResultParams)object0).a) && bata.b(this.b, ((OnRangingResultParams)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}


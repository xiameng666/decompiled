package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import djet;
import java.util.Arrays;

public final class OnRangingSuspendedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public UwbDeviceParams a;
    public int b;

    static {
        OnRangingSuspendedParams.CREATOR = new djet();
    }

    public OnRangingSuspendedParams() {
    }

    public OnRangingSuspendedParams(UwbDeviceParams uwbDeviceParams0, int v) {
        this.a = uwbDeviceParams0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof OnRangingSuspendedParams) && bata.b(this.a, ((OnRangingSuspendedParams)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((OnRangingSuspendedParams)object0).b));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}


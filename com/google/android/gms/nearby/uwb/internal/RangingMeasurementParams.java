package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import djey;
import java.util.Arrays;

public final class RangingMeasurementParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public float b;

    static {
        RangingMeasurementParams.CREATOR = new djey();
    }

    public RangingMeasurementParams() {
    }

    public RangingMeasurementParams(int v, float f) {
        this.a = v;
        this.b = f;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof RangingMeasurementParams) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((RangingMeasurementParams)object0).a)) && bata.b(Float.valueOf(this.b), Float.valueOf(((RangingMeasurementParams)object0).b));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((float)this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.l(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import cmnf;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class DeviceOrientationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a_samplingPeriodMicros;
    public final boolean b_withVelocity;

    static {
        DeviceOrientationRequest.CREATOR = new cmnf();
    }

    public DeviceOrientationRequest(long v, boolean z) {
        this.a_samplingPeriodMicros = v;
        this.b_withVelocity = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof DeviceOrientationRequest) ? this.a_samplingPeriodMicros == ((DeviceOrientationRequest)object0).a_samplingPeriodMicros && this.b_withVelocity == ((DeviceOrientationRequest)object0).b_withVelocity : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a_samplingPeriodMicros), Boolean.valueOf(this.b_withVelocity)});
    }

    @Override
    public final String toString() {
        return "DeviceOrientationRequest[samplingPeriodMicros=" + this.a_samplingPeriodMicros + (this.b_withVelocity ? ", withVelocity" : "") + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 2, this.a_samplingPeriodMicros);
        baub.e(parcel0, 6, this.b_withVelocity);
        baub.c(parcel0, v1);
    }
}


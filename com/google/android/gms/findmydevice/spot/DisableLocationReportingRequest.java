package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import bnhz;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class DisableLocationReportingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;

    static {
        DisableLocationReportingRequest.CREATOR = new bnhz();
    }

    public DisableLocationReportingRequest() {
    }

    public DisableLocationReportingRequest(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof DisableLocationReportingRequest) ? bata.b(this.a, ((DisableLocationReportingRequest)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}


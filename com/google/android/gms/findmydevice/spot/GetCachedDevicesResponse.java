package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bnie;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class GetCachedDevicesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public CachedSpotDevice[] a;

    static {
        GetCachedDevicesResponse.CREATOR = new bnie();
    }

    public GetCachedDevicesResponse() {
    }

    public GetCachedDevicesResponse(CachedSpotDevice[] arr_cachedSpotDevice) {
        this.a = arr_cachedSpotDevice;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof GetCachedDevicesResponse) ? Arrays.equals(this.a, ((GetCachedDevicesResponse)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.J(parcel0, 1, this.a, v);
        baub.c(parcel0, v1);
    }
}


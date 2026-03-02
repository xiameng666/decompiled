package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ezmd;
import ezmo;

public class DeviceDataUploadOptInFlags extends AbstractSafeParcelable implements ezmo {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;

    static {
        DeviceDataUploadOptInFlags.CREATOR = new ezmd();
    }

    public DeviceDataUploadOptInFlags(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    @Override  // ezmo
    public final boolean b() {
        return this.a;
    }

    @Override  // ezmo
    public final boolean kU() {
        return this.b;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 2, this.a);
        baub.e(parcel0, 3, this.b);
        baub.c(parcel0, v1);
    }
}


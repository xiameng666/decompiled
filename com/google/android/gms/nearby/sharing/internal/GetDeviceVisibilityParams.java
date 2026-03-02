package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ddnk;
import ddoe;
import ddog;
import java.util.Arrays;

public final class GetDeviceVisibilityParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public ddog a;

    static {
        GetDeviceVisibilityParams.CREATOR = new ddnk();
    }

    public GetDeviceVisibilityParams() {
    }

    public GetDeviceVisibilityParams(IBinder iBinder0) {
        ddog ddog0;
        if(iBinder0 == null) {
            ddog0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IDeviceVisibilityResultListener");
            ddog0 = (iInterface0 instanceof ddog) ? ((ddog)iInterface0) : new ddoe(iBinder0);
        }
        super();
        this.a = ddog0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof GetDeviceVisibilityParams) ? bata.b(this.a, ((GetDeviceVisibilityParams)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.a.asBinder());
        baub.c(parcel0, v1);
    }
}


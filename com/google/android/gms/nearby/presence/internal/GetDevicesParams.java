package com.google.android.gms.nearby.presence.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.DiscoveryFilter;
import dbal;
import dbaz;
import java.util.Arrays;

public final class GetDevicesParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public DiscoveryFilter a;
    public dbaz b;

    static {
        GetDevicesParams.CREATOR = new dbal();
    }

    private GetDevicesParams() {
    }

    public GetDevicesParams(IBinder iBinder0, DiscoveryFilter discoveryFilter0) {
        dbaz dbaz0;
        if(iBinder0 == null) {
            dbaz0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.presence.internal.IGetDevicesCallback");
            dbaz0 = (iInterface0 instanceof dbaz) ? ((dbaz)iInterface0) : new dbaz(iBinder0);
        }
        super();
        this.b = dbaz0;
        this.a = discoveryFilter0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GetDevicesParams) && bata.b(this.b, ((GetDevicesParams)object0).b) && bata.b(this.a, ((GetDevicesParams)object0).a);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.b.a);
        baub.t(parcel0, 2, this.a, v, false);
        baub.c(parcel0, v1);
    }
}


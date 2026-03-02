package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import djdo;
import djdv;
import djdx;
import java.util.Arrays;

public final class GetRangingCapabilitiesParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public djdx a;

    static {
        GetRangingCapabilitiesParams.CREATOR = new djdo();
    }

    public GetRangingCapabilitiesParams() {
    }

    public GetRangingCapabilitiesParams(IBinder iBinder0) {
        djdx djdx0;
        if(iBinder0 == null) {
            djdx0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IRangingCapabilitiesResultListener");
            djdx0 = (iInterface0 instanceof djdx) ? ((djdx)iInterface0) : new djdv(iBinder0);
        }
        super();
        this.a = djdx0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof GetRangingCapabilitiesParams) ? bata.b(this.a, ((GetRangingCapabilitiesParams)object0).a) : false;
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


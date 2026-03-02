package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import djdl;
import djem;
import djeo;
import java.util.Arrays;

public final class GetComplexChannelParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public djeo a;

    static {
        GetComplexChannelParams.CREATOR = new djdl();
    }

    public GetComplexChannelParams() {
    }

    public GetComplexChannelParams(IBinder iBinder0) {
        djeo djeo0;
        if(iBinder0 == null) {
            djeo0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IUwbComplexChannelResultListener");
            djeo0 = (iInterface0 instanceof djeo) ? ((djeo)iInterface0) : new djem(iBinder0);
        }
        super();
        this.a = djeo0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof GetComplexChannelParams) ? bata.b(this.a, ((GetComplexChannelParams)object0).a) : false;
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


package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import djeh;
import djej;
import djfh;
import java.util.Arrays;

public final class UwbAvailabilityObserverParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public djej a;

    static {
        UwbAvailabilityObserverParams.CREATOR = new djfh();
    }

    public UwbAvailabilityObserverParams() {
    }

    public UwbAvailabilityObserverParams(IBinder iBinder0) {
        djej djej0;
        if(iBinder0 == null) {
            djej0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IUwbAvailabilityObserver");
            djej0 = (iInterface0 instanceof djej) ? ((djej)iInterface0) : new djeh(iBinder0);
        }
        super();
        this.a = djej0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof UwbAvailabilityObserverParams) ? bata.b(this.a, ((UwbAvailabilityObserverParams)object0).a) : false;
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


package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import djeb;
import djed;
import djfc;
import java.util.Arrays;

public final class ReconfigureRangingIntervalParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public djed a;
    public int b;

    static {
        ReconfigureRangingIntervalParams.CREATOR = new djfc();
    }

    public ReconfigureRangingIntervalParams() {
    }

    public ReconfigureRangingIntervalParams(IBinder iBinder0, int v) {
        djed djed0;
        if(iBinder0 == null) {
            djed0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            djed0 = (iInterface0 instanceof djed) ? ((djed)iInterface0) : new djeb(iBinder0);
        }
        super();
        this.a = djed0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ReconfigureRangingIntervalParams) && bata.b(this.a, ((ReconfigureRangingIntervalParams)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((ReconfigureRangingIntervalParams)object0).b));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.a.asBinder());
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}


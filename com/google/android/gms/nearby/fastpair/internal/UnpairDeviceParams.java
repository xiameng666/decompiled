package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cyid;
import cyif;
import cyjd;
import java.util.Arrays;

public final class UnpairDeviceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public byte[] a;
    public cyif b;

    static {
        UnpairDeviceParams.CREATOR = new cyjd();
    }

    public UnpairDeviceParams() {
    }

    public UnpairDeviceParams(byte[] arr_b, IBinder iBinder0) {
        cyif cyif0;
        if(iBinder0 == null) {
            cyif0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairStatusCallback");
            cyif0 = (iInterface0 instanceof cyif) ? ((cyif)iInterface0) : new cyid(iBinder0);
        }
        super();
        this.a = arr_b;
        this.b = cyif0;
    }

    public final IBinder a() {
        return this.b.asBinder();
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof UnpairDeviceParams) && Arrays.equals(this.a, ((UnpairDeviceParams)object0).a) && bata.b(this.b, ((UnpairDeviceParams)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.D(parcel0, 2, this.a());
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.castauth.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import avmp;
import avmy;
import avna;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class GetCastDeviceIdSnapshotParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public avna a;

    static {
        GetCastDeviceIdSnapshotParams.CREATOR = new avmp();
    }

    public GetCastDeviceIdSnapshotParams() {
    }

    public GetCastDeviceIdSnapshotParams(IBinder iBinder0) {
        avna avna0;
        if(iBinder0 == null) {
            avna0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.castauth.internal.ICastDeviceIdSnapshotCallback");
            avna0 = (iInterface0 instanceof avna) ? ((avna)iInterface0) : new avmy(iBinder0);
        }
        super();
        this.a = avna0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof GetCastDeviceIdSnapshotParams) ? bata.b(this.a, ((GetCastDeviceIdSnapshotParams)object0).a) : false;
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


package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ddnq;
import ddol;
import ddon;
import java.util.Arrays;

public final class GetVisibilityParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public ddon a;

    static {
        GetVisibilityParams.CREATOR = new ddnq();
    }

    public GetVisibilityParams() {
    }

    public GetVisibilityParams(IBinder iBinder0) {
        ddon ddon0;
        if(iBinder0 == null) {
            ddon0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IIntResultListener");
            ddon0 = (iInterface0 instanceof ddon) ? ((ddon)iInterface0) : new ddol(iBinder0);
        }
        super();
        this.a = ddon0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof GetVisibilityParams) ? bata.b(this.a, ((GetVisibilityParams)object0).a) : false;
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


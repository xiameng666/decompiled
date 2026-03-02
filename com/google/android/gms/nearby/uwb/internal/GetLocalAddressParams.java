package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import djdm;
import djee;
import djeg;
import java.util.Arrays;

public final class GetLocalAddressParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public djeg a;

    static {
        GetLocalAddressParams.CREATOR = new djdm();
    }

    public GetLocalAddressParams() {
    }

    public GetLocalAddressParams(IBinder iBinder0) {
        djeg djeg0;
        if(iBinder0 == null) {
            djeg0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IUwbAddressResultListener");
            djeg0 = (iInterface0 instanceof djeg) ? ((djeg)iInterface0) : new djee(iBinder0);
        }
        super();
        this.a = djeg0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof GetLocalAddressParams) ? bata.b(this.a, ((GetLocalAddressParams)object0).a) : false;
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


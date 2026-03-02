package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cyhu;
import cyin;
import java.util.Arrays;

public final class IsPeripheralApiEnabledParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public cyhu a;

    static {
        IsPeripheralApiEnabledParams.CREATOR = new cyin();
    }

    private IsPeripheralApiEnabledParams() {
    }

    public IsPeripheralApiEnabledParams(IBinder iBinder0) {
        cyhu cyhu0;
        if(iBinder0 == null) {
            cyhu0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IBooleanCallback");
            cyhu0 = (iInterface0 instanceof cyhu) ? ((cyhu)iInterface0) : new cyhu(iBinder0);
        }
        super();
        this.a = cyhu0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof IsPeripheralApiEnabledParams) ? bata.b(this.a, ((IsPeripheralApiEnabledParams)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.a.a);
        baub.c(parcel0, v1);
    }
}


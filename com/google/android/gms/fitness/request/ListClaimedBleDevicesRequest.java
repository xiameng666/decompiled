package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import brak;
import brcp;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public class ListClaimedBleDevicesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final brak a;

    static {
        ListClaimedBleDevicesRequest.CREATOR = new brcp();
    }

    public ListClaimedBleDevicesRequest(IBinder iBinder0) {
        brak brak0;
        if(iBinder0 == null) {
            brak0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
            brak0 = (iInterface0 instanceof brak) ? ((brak)iInterface0) : new brak(iBinder0);
        }
        this.a = brak0;
    }

    public ListClaimedBleDevicesRequest(brak brak0) {
        this.a = brak0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.a.a);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import brag;
import brai;
import brbt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;

public class ClaimBleDeviceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final BleDevice b;
    public final brai c;

    static {
        ClaimBleDeviceRequest.CREATOR = new brbt();
    }

    public ClaimBleDeviceRequest(String s, BleDevice bleDevice0, IBinder iBinder0) {
        brai brai0;
        this.a = s;
        this.b = bleDevice0;
        if(iBinder0 == null) {
            brai0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            brai0 = (iInterface0 instanceof brai) ? ((brai)iInterface0) : new brag(iBinder0);
        }
        this.c = brai0;
    }

    public ClaimBleDeviceRequest(String s, BleDevice bleDevice0, brai brai0) {
        this.a = s;
        this.b = bleDevice0;
        this.c = brai0;
    }

    @Override
    public final String toString() {
        return String.format("ClaimBleDeviceRequest{%s %s}", this.a, this.b);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.D(parcel0, 3, (this.c == null ? null : this.c.asBinder()));
        baub.c(parcel0, v1);
    }
}


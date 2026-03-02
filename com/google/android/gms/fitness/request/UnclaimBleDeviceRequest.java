package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import brag;
import brai;
import brdg;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class UnclaimBleDeviceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final brai b;

    static {
        UnclaimBleDeviceRequest.CREATOR = new brdg();
    }

    public UnclaimBleDeviceRequest(String s, IBinder iBinder0) {
        brai brai0;
        this.a = s;
        if(iBinder0 == null) {
            brai0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            brai0 = (iInterface0 instanceof brai) ? ((brai)iInterface0) : new brag(iBinder0);
        }
        this.b = brai0;
    }

    public UnclaimBleDeviceRequest(String s, brai brai0) {
        this.a = s;
        this.b = brai0;
    }

    @Override
    public final String toString() {
        return String.format("UnclaimBleDeviceRequest{%s}", this.a);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.D(parcel0, 3, (this.b == null ? null : this.b.asBinder()));
        baub.c(parcel0, v1);
    }
}


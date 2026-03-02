package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import brag;
import brai;
import brci;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DisableFitRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final brai a;

    static {
        DisableFitRequest.CREATOR = new brci();
    }

    public DisableFitRequest(IBinder iBinder0) {
        brai brai0;
        if(iBinder0 == null) {
            brai0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            brai0 = (iInterface0 instanceof brai) ? ((brai)iInterface0) : new brag(iBinder0);
        }
        this.a = brai0;
    }

    public DisableFitRequest(brai brai0) {
        this.a = brai0;
    }

    @Override
    public final String toString() {
        return String.format("DisableFitRequest");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.a.asBinder());
        baub.c(parcel0, v1);
    }
}


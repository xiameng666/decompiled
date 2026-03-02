package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import brag;
import brai;
import brco;
import brde;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public class StopBleScanRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final brai a;
    public final brco b;

    static {
        StopBleScanRequest.CREATOR = new brde();
    }

    public StopBleScanRequest(IBinder iBinder0, IBinder iBinder1) {
        brco brco0;
        brai brai0 = null;
        if(iBinder0 == null) {
            brco0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            brco0 = (iInterface0 instanceof brco) ? ((brco)iInterface0) : new brco(iBinder0);
        }
        this.b = brco0;
        if(iBinder1 != null) {
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            brai0 = (iInterface1 instanceof brai) ? ((brai)iInterface1) : new brag(iBinder1);
        }
        this.a = brai0;
    }

    public StopBleScanRequest(brco brco0, brai brai0) {
        this.b = brco0;
        this.a = brai0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.b.a);
        baub.D(parcel0, 2, (this.a == null ? null : this.a.asBinder()));
        baub.c(parcel0, v1);
    }
}


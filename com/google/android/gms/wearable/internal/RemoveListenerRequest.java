package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fdiz;
import fdjb;
import fdky;

public class RemoveListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final fdjb b;

    static {
        RemoveListenerRequest.CREATOR = new fdky();
    }

    public RemoveListenerRequest(int v, IBinder iBinder0) {
        fdjb fdjb0;
        this.a = v;
        if(iBinder0 == null) {
            fdjb0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            fdjb0 = (iInterface0 instanceof fdjb) ? ((fdjb)iInterface0) : new fdiz(iBinder0);
        }
        this.b = fdjb0;
    }

    public RemoveListenerRequest(fdjb fdjb0) {
        this.a = 1;
        this.b = fdjb0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.D(parcel0, 2, (this.b == null ? null : this.b.asBinder()));
        baub.c(parcel0, v1);
    }
}


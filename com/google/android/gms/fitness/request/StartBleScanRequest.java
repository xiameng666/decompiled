package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import baub;
import brag;
import brai;
import brco;
import brdd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class StartBleScanRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final int b;
    public final brai c;
    public final brco d;

    static {
        StartBleScanRequest.CREATOR = new brdd();
    }

    public StartBleScanRequest(StartBleScanRequest startBleScanRequest0, brai brai0) {
        this.a = startBleScanRequest0.a;
        this.d = startBleScanRequest0.d;
        this.b = startBleScanRequest0.b;
        this.c = brai0;
    }

    public StartBleScanRequest(List list0, IBinder iBinder0, int v, IBinder iBinder1) {
        brco brco0;
        this.a = list0;
        brai brai0 = null;
        if(iBinder0 == null) {
            brco0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            brco0 = (iInterface0 instanceof brco) ? ((brco)iInterface0) : new brco(iBinder0);
        }
        this.d = brco0;
        this.b = v;
        if(iBinder1 != null) {
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            brai0 = (iInterface1 instanceof brai) ? ((brai)iInterface1) : new brag(iBinder1);
        }
        this.c = brai0;
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("dataTypes", this.a, arrayList0);
        basz.b("timeoutSecs", Integer.valueOf(this.b), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, DesugarCollections.unmodifiableList(this.a), false);
        IBinder iBinder0 = null;
        baub.D(parcel0, 2, (this.d == null ? null : this.d.a));
        baub.o(parcel0, 3, this.b);
        brai brai0 = this.c;
        if(brai0 != null) {
            iBinder0 = brai0.asBinder();
        }
        baub.D(parcel0, 4, iBinder0);
        baub.c(parcel0, v1);
    }
}


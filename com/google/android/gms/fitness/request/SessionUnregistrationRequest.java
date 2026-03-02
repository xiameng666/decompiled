package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import brag;
import brai;
import brdc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

public class SessionUnregistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final PendingIntent a;
    public final brai b;

    static {
        SessionUnregistrationRequest.CREATOR = new brdc();
    }

    public SessionUnregistrationRequest(PendingIntent pendingIntent0, IBinder iBinder0) {
        brai brai0;
        this.a = pendingIntent0;
        if(iBinder0 == null) {
            brai0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            brai0 = (iInterface0 instanceof brai) ? ((brai)iInterface0) : new brag(iBinder0);
        }
        this.b = brai0;
    }

    public SessionUnregistrationRequest(PendingIntent pendingIntent0, brai brai0) {
        this.a = pendingIntent0;
        this.b = brai0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SessionUnregistrationRequest) && bata.b(this.a, ((SessionUnregistrationRequest)object0).a);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("pendingIntent", this.a, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.D(parcel0, 2, (this.b == null ? null : this.b.asBinder()));
        baub.c(parcel0, v1);
    }
}


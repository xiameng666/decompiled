package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import damu;

public final class HandleClientLifecycleEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    @Deprecated
    public final ClientAppContext b;
    public final int c;

    static {
        HandleClientLifecycleEventRequest.CREATOR = new damu();
    }

    public HandleClientLifecycleEventRequest(int v, ClientAppContext clientAppContext0, int v1) {
        this.a = v;
        this.b = clientAppContext0;
        this.c = v1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.t(parcel0, 2, this.b, v, false);
        baub.o(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}


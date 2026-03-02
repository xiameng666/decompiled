package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import azxq;
import azxs;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ddpg;
import ddpi;
import ddtm;
import java.util.Arrays;

public final class RegisterStateObserverParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public ddpi a;
    public azxs b;

    static {
        RegisterStateObserverParams.CREATOR = new ddtm();
    }

    public RegisterStateObserverParams() {
    }

    public RegisterStateObserverParams(IBinder iBinder0, IBinder iBinder1) {
        ddpi ddpi0;
        azxs azxs0 = null;
        if(iBinder0 == null) {
            ddpi0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IStateUpdateCallback");
            ddpi0 = (iInterface0 instanceof ddpi) ? ((ddpi)iInterface0) : new ddpg(iBinder0);
        }
        if(iBinder1 != null) {
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            azxs0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
        }
        super();
        this.a = ddpi0;
        this.b = azxs0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof RegisterStateObserverParams) && bata.b(this.a, ((RegisterStateObserverParams)object0).a) && bata.b(this.b, ((RegisterStateObserverParams)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.a.asBinder());
        baub.D(parcel0, 2, this.b.asBinder());
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ddnp;
import ddpd;
import ddpf;
import java.util.Arrays;

public final class GetShareTargetsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public ddpf b;

    static {
        GetShareTargetsParams.CREATOR = new ddnp();
    }

    public GetShareTargetsParams() {
    }

    public GetShareTargetsParams(int v, IBinder iBinder0) {
        ddpf ddpf0;
        if(iBinder0 == null) {
            ddpf0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IShareTargetsResultListener");
            ddpf0 = (iInterface0 instanceof ddpf) ? ((ddpf)iInterface0) : new ddpd(iBinder0);
        }
        super();
        this.a = v;
        this.b = ddpf0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GetShareTargetsParams) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((GetShareTargetsParams)object0).a)) && bata.b(this.b, ((GetShareTargetsParams)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.D(parcel0, 2, this.b.asBinder());
        baub.c(parcel0, v1);
    }
}


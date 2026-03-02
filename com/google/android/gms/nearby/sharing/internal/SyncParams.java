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
import dduj;
import java.util.Arrays;

public final class SyncParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public azxs a;
    public int b;

    static {
        SyncParams.CREATOR = new dduj();
    }

    public SyncParams() {
    }

    public SyncParams(IBinder iBinder0, int v) {
        azxs azxs0;
        if(iBinder0 == null) {
            azxs0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            azxs0 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
        }
        super();
        this.a = azxs0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SyncParams) && bata.b(this.a, ((SyncParams)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((SyncParams)object0).b));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.a.asBinder());
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}


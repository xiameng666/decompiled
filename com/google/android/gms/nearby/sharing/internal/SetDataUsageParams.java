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
import ddts;
import java.util.Arrays;

public final class SetDataUsageParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public azxs b;

    static {
        SetDataUsageParams.CREATOR = new ddts();
    }

    public SetDataUsageParams() {
    }

    public SetDataUsageParams(int v, IBinder iBinder0) {
        azxs azxs0;
        if(iBinder0 == null) {
            azxs0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            azxs0 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
        }
        super();
        this.a = v;
        this.b = azxs0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SetDataUsageParams) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((SetDataUsageParams)object0).a)) && bata.b(this.b, ((SetDataUsageParams)object0).b);
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


package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cyhu;
import cyix;
import java.util.Arrays;

public final class SassDeviceAvailableParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public cyhu b;

    static {
        SassDeviceAvailableParams.CREATOR = new cyix();
    }

    private SassDeviceAvailableParams() {
    }

    public SassDeviceAvailableParams(int v, IBinder iBinder0) {
        cyhu cyhu0;
        if(iBinder0 == null) {
            cyhu0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IBooleanCallback");
            cyhu0 = (iInterface0 instanceof cyhu) ? ((cyhu)iInterface0) : new cyhu(iBinder0);
        }
        super();
        this.a = v;
        this.b = cyhu0;
    }

    public final IBinder a() {
        return this.b.a;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SassDeviceAvailableParams) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((SassDeviceAvailableParams)object0).a)) && bata.b(this.b, ((SassDeviceAvailableParams)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.D(parcel0, 2, this.a());
        baub.c(parcel0, v1);
    }
}


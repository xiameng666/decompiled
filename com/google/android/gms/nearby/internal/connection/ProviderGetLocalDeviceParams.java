package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import czfe;
import czfg;
import czhr;
import java.util.Arrays;

public final class ProviderGetLocalDeviceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public czfg a;
    public byte[] b;

    static {
        ProviderGetLocalDeviceParams.CREATOR = new czhr();
    }

    public ProviderGetLocalDeviceParams() {
    }

    public ProviderGetLocalDeviceParams(IBinder iBinder0, byte[] arr_b) {
        czfg czfg0;
        if(iBinder0 == null) {
            czfg0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDeviceResultListener");
            czfg0 = (iInterface0 instanceof czfg) ? ((czfg)iInterface0) : new czfe(iBinder0);
        }
        super();
        this.a = czfg0;
        this.b = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ProviderGetLocalDeviceParams) && bata.b(this.a, ((ProviderGetLocalDeviceParams)object0).a) && bata.b(this.b, ((ProviderGetLocalDeviceParams)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.a.asBinder());
        baub.i(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}


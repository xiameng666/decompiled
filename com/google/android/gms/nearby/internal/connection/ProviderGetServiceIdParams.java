package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import czgg;
import czgi;
import czhs;
import java.util.Arrays;

public final class ProviderGetServiceIdParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public czgi a;

    static {
        ProviderGetServiceIdParams.CREATOR = new czhs();
    }

    public ProviderGetServiceIdParams() {
    }

    public ProviderGetServiceIdParams(IBinder iBinder0) {
        czgi czgi0;
        if(iBinder0 == null) {
            czgi0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IStringResultListener");
            czgi0 = (iInterface0 instanceof czgi) ? ((czgi)iInterface0) : new czgg(iBinder0);
        }
        super();
        this.a = czgi0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ProviderGetServiceIdParams) ? bata.b(this.a, ((ProviderGetServiceIdParams)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.a.asBinder());
        baub.c(parcel0, v1);
    }
}


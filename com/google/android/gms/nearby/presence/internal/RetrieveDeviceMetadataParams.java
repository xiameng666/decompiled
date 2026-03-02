package com.google.android.gms.nearby.presence.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.PresenceDevice;
import dbbh;
import dbcv;
import java.util.Arrays;

public final class RetrieveDeviceMetadataParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public PresenceDevice b;
    public dbbh c;

    static {
        RetrieveDeviceMetadataParams.CREATOR = new dbcv();
    }

    private RetrieveDeviceMetadataParams() {
    }

    public RetrieveDeviceMetadataParams(IBinder iBinder0, String s, PresenceDevice presenceDevice0) {
        dbbh dbbh0;
        if(iBinder0 == null) {
            dbbh0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.presence.internal.IRetrieveDeviceMetadataCallback");
            dbbh0 = (iInterface0 instanceof dbbh) ? ((dbbh)iInterface0) : new dbbh(iBinder0);
        }
        super();
        this.c = dbbh0;
        this.a = s;
        this.b = presenceDevice0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof RetrieveDeviceMetadataParams) && bata.b(this.c, ((RetrieveDeviceMetadataParams)object0).c) && bata.b(this.a, ((RetrieveDeviceMetadataParams)object0).a) && bata.b(this.b, ((RetrieveDeviceMetadataParams)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.c.a);
        baub.v(parcel0, 2, this.a, false);
        baub.t(parcel0, 3, this.b, v, false);
        baub.c(parcel0, v1);
    }
}


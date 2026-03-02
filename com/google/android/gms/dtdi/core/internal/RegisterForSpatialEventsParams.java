package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import azxq;
import azxs;
import bata;
import baub;
import bivz;
import biwf;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class RegisterForSpatialEventsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public azxs a;
    private bivz b;

    static {
        RegisterForSpatialEventsParams.CREATOR = new biwf();
    }

    private RegisterForSpatialEventsParams() {
    }

    public RegisterForSpatialEventsParams(IBinder iBinder0, IBinder iBinder1) {
        bivz bivz0;
        azxs azxs0 = null;
        if(iBinder0 == null) {
            bivz0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IOnSpatialEventListener");
            bivz0 = (iInterface0 instanceof bivz) ? ((bivz)iInterface0) : new bivz(iBinder0);
        }
        if(iBinder1 != null) {
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            azxs0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
        }
        super();
        this.b = bivz0;
        this.a = azxs0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof RegisterForSpatialEventsParams) && bata.b(this.b, ((RegisterForSpatialEventsParams)object0).b) && bata.b(this.a, ((RegisterForSpatialEventsParams)object0).a);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.b.a);
        baub.D(parcel0, 2, this.a.asBinder());
        baub.c(parcel0, v1);
    }
}


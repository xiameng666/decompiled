package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import biuv;
import bivn;
import bivp;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class GetMediaTransferEnabledParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public bivp a;

    static {
        GetMediaTransferEnabledParams.CREATOR = new biuv();
    }

    public GetMediaTransferEnabledParams() {
    }

    public GetMediaTransferEnabledParams(IBinder iBinder0) {
        bivp bivp0;
        if(iBinder0 == null) {
            bivp0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IMediaTransferStatusCallback");
            bivp0 = (iInterface0 instanceof bivp) ? ((bivp)iInterface0) : new bivn(iBinder0);
        }
        super();
        this.a = bivp0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof GetMediaTransferEnabledParams) ? bata.b(this.a, ((GetMediaTransferEnabledParams)object0).a) : false;
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


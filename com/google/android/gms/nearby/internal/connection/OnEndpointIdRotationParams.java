package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import czfn;
import czfp;
import czgu;
import java.util.Arrays;

public final class OnEndpointIdRotationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public czfp a;
    public String b;

    static {
        OnEndpointIdRotationParams.CREATOR = new czgu();
    }

    public OnEndpointIdRotationParams() {
    }

    public OnEndpointIdRotationParams(IBinder iBinder0, String s) {
        czfp czfp0;
        if(iBinder0 == null) {
            czfp0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IEndpointIdRotationResultListener");
            czfp0 = (iInterface0 instanceof czfp) ? ((czfp)iInterface0) : new czfn(iBinder0);
        }
        super();
        this.a = czfp0;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof OnEndpointIdRotationParams) && bata.b(this.a, ((OnEndpointIdRotationParams)object0).a) && bata.b(this.b, ((OnEndpointIdRotationParams)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.a.asBinder());
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}


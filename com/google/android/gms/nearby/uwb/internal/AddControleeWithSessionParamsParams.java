package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import djdg;
import djeb;
import djed;
import java.util.Arrays;

public final class AddControleeWithSessionParamsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public djed a;
    public RangingControleeParams b;

    static {
        AddControleeWithSessionParamsParams.CREATOR = new djdg();
    }

    private AddControleeWithSessionParamsParams() {
    }

    public AddControleeWithSessionParamsParams(IBinder iBinder0, RangingControleeParams rangingControleeParams0) {
        djed djed0;
        if(iBinder0 == null) {
            djed0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            djed0 = (iInterface0 instanceof djed) ? ((djed)iInterface0) : new djeb(iBinder0);
        }
        super();
        this.a = djed0;
        this.b = rangingControleeParams0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof AddControleeWithSessionParamsParams) && bata.b(this.a, ((AddControleeWithSessionParamsParams)object0).a) && bata.b(this.b, ((AddControleeWithSessionParamsParams)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, (this.a == null ? null : this.a.asBinder()));
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}


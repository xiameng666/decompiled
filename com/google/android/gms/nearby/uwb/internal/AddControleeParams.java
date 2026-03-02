package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import djdf;
import djeb;
import djed;
import java.util.Arrays;

public final class AddControleeParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public djed a;
    public UwbAddressParams b;

    static {
        AddControleeParams.CREATOR = new djdf();
    }

    public AddControleeParams() {
    }

    public AddControleeParams(IBinder iBinder0, UwbAddressParams uwbAddressParams0) {
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
        this.b = uwbAddressParams0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof AddControleeParams) && bata.b(this.a, ((AddControleeParams)object0).a) && bata.b(this.b, ((AddControleeParams)object0).b);
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


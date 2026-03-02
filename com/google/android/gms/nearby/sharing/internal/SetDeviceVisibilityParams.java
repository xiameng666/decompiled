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
import ddtu;
import java.util.Arrays;

public final class SetDeviceVisibilityParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public azxs a;
    public int b;
    public long c;
    public String d;

    static {
        SetDeviceVisibilityParams.CREATOR = new ddtu();
    }

    public SetDeviceVisibilityParams() {
    }

    public SetDeviceVisibilityParams(IBinder iBinder0, int v, long v1, String s) {
        azxs azxs0;
        if(iBinder0 == null) {
            azxs0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            azxs0 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
        }
        super();
        this.a = azxs0;
        this.b = v;
        this.c = v1;
        this.d = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SetDeviceVisibilityParams) && bata.b(this.a, ((SetDeviceVisibilityParams)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((SetDeviceVisibilityParams)object0).b)) && bata.b(Long.valueOf(this.c), Long.valueOf(((SetDeviceVisibilityParams)object0).c)) && bata.b(this.d, ((SetDeviceVisibilityParams)object0).d);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b), ((long)this.c), this.d});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.a.asBinder());
        baub.o(parcel0, 2, this.b);
        baub.q(parcel0, 3, this.c);
        baub.v(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}


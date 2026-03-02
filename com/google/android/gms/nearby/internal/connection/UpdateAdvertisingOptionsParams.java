package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import czfx;
import czfz;
import czin;
import java.util.Arrays;

public final class UpdateAdvertisingOptionsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public czfz a;
    public String b;
    public AdvertisingOptions c;
    public byte[] d;
    public String e;

    static {
        UpdateAdvertisingOptionsParams.CREATOR = new czin();
    }

    public UpdateAdvertisingOptionsParams() {
    }

    public UpdateAdvertisingOptionsParams(IBinder iBinder0, String s, AdvertisingOptions advertisingOptions0, byte[] arr_b, String s1) {
        czfz czfz0;
        if(iBinder0 == null) {
            czfz0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            czfz0 = (iInterface0 instanceof czfz) ? ((czfz)iInterface0) : new czfx(iBinder0);
        }
        super();
        this.a = czfz0;
        this.b = s;
        this.c = advertisingOptions0;
        this.d = arr_b;
        this.e = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof UpdateAdvertisingOptionsParams) && bata.b(this.a, ((UpdateAdvertisingOptionsParams)object0).a) && bata.b(this.b, ((UpdateAdvertisingOptionsParams)object0).b) && bata.b(this.c, ((UpdateAdvertisingOptionsParams)object0).c) && Arrays.equals(this.d, ((UpdateAdvertisingOptionsParams)object0).d) && bata.b(this.e, ((UpdateAdvertisingOptionsParams)object0).e);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Arrays.hashCode(this.d), this.e});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, (this.a == null ? null : this.a.asBinder()));
        baub.v(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.i(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.c(parcel0, v1);
    }
}


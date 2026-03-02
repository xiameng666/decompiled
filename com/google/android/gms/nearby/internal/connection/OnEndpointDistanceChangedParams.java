package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.UwbRangingData;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import czgr;
import java.util.Arrays;

public final class OnEndpointDistanceChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public int b;
    public UwbRangingData c;
    public int d;
    public ConnectionsDevice e;
    public DctDevice f;

    static {
        OnEndpointDistanceChangedParams.CREATOR = new czgr();
    }

    public OnEndpointDistanceChangedParams() {
        this.d = 0;
    }

    public OnEndpointDistanceChangedParams(String s, int v, UwbRangingData uwbRangingData0, int v1, ConnectionsDevice connectionsDevice0, DctDevice dctDevice0) {
        this.a = s;
        this.b = v;
        this.c = uwbRangingData0;
        this.d = v1;
        this.e = connectionsDevice0;
        this.f = dctDevice0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof OnEndpointDistanceChangedParams) && bata.b(this.a, ((OnEndpointDistanceChangedParams)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((OnEndpointDistanceChangedParams)object0).b)) && bata.b(this.c, ((OnEndpointDistanceChangedParams)object0).c) && bata.b(Integer.valueOf(this.d), Integer.valueOf(((OnEndpointDistanceChangedParams)object0).d)) && bata.b(this.e, ((OnEndpointDistanceChangedParams)object0).e) && bata.b(this.f, ((OnEndpointDistanceChangedParams)object0).f);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b), this.c, ((int)this.d), this.e, this.f});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.t(parcel0, 3, this.c, v, false);
        baub.o(parcel0, 4, this.d);
        baub.t(parcel0, 5, this.e, v, false);
        baub.t(parcel0, 6, this.f, v, false);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.PresenceDevice;
import czdy;
import java.util.Arrays;

public final class DeviceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public PresenceDevice b;

    static {
        DeviceParams.CREATOR = new czdy();
    }

    public DeviceParams() {
        this.a = 0;
    }

    public DeviceParams(int v, PresenceDevice presenceDevice0) {
        this.a = v;
        this.b = presenceDevice0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof DeviceParams) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((DeviceParams)object0).a)) && bata.b(this.b, ((DeviceParams)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}


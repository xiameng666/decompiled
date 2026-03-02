package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import czgo;
import java.util.Arrays;

public final class OnConnectionResultParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public int b;
    public byte[] c;
    public int d;
    public PresenceDevice e;
    public ConnectionsDevice f;
    public DctDevice g;

    static {
        OnConnectionResultParams.CREATOR = new czgo();
    }

    public OnConnectionResultParams() {
        this.d = 0;
    }

    public OnConnectionResultParams(String s, int v, byte[] arr_b, int v1, PresenceDevice presenceDevice0, ConnectionsDevice connectionsDevice0, DctDevice dctDevice0) {
        this.a = s;
        this.b = v;
        this.c = arr_b;
        this.d = v1;
        this.e = presenceDevice0;
        this.f = connectionsDevice0;
        this.g = dctDevice0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof OnConnectionResultParams) && bata.b(this.a, ((OnConnectionResultParams)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((OnConnectionResultParams)object0).b)) && Arrays.equals(this.c, ((OnConnectionResultParams)object0).c) && bata.b(Integer.valueOf(this.d), Integer.valueOf(((OnConnectionResultParams)object0).d)) && bata.b(this.e, ((OnConnectionResultParams)object0).e) && bata.b(this.f, ((OnConnectionResultParams)object0).f) && bata.b(this.g, ((OnConnectionResultParams)object0).g);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b), Arrays.hashCode(this.c), ((int)this.d), this.e, this.f, this.g});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.i(parcel0, 3, this.c, false);
        baub.o(parcel0, 4, this.d);
        baub.t(parcel0, 5, this.e, v, false);
        baub.t(parcel0, 6, this.f, v, false);
        baub.t(parcel0, 7, this.g, v, false);
        baub.c(parcel0, v1);
    }
}


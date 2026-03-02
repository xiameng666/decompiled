package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import czgp;
import java.util.Arrays;

public final class OnDisconnectedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public int b;
    public PresenceDevice c;
    public ConnectionsDevice d;
    public DctDevice e;
    public int f;

    static {
        OnDisconnectedParams.CREATOR = new czgp();
    }

    public OnDisconnectedParams() {
        this.b = 0;
        this.f = 0;
    }

    public OnDisconnectedParams(String s, int v, PresenceDevice presenceDevice0, ConnectionsDevice connectionsDevice0, DctDevice dctDevice0, int v1) {
        this.a = s;
        this.b = v;
        this.c = presenceDevice0;
        this.d = connectionsDevice0;
        this.e = dctDevice0;
        this.f = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof OnDisconnectedParams) && bata.b(this.a, ((OnDisconnectedParams)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((OnDisconnectedParams)object0).b)) && bata.b(this.c, ((OnDisconnectedParams)object0).c) && bata.b(this.d, ((OnDisconnectedParams)object0).d) && bata.b(this.e, ((OnDisconnectedParams)object0).e) && bata.b(Integer.valueOf(this.f), Integer.valueOf(((OnDisconnectedParams)object0).f));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b), this.c, this.d, this.e, ((int)this.f)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.t(parcel0, 3, this.c, v, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.t(parcel0, 5, this.e, v, false);
        baub.o(parcel0, 6, this.f);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import czgl;
import java.util.Arrays;

public final class OnConnectionInitiatedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public boolean d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public boolean h;
    public int i;
    public PresenceDevice j;
    public ConnectionsDevice k;
    public DctDevice l;
    public int m;

    static {
        OnConnectionInitiatedParams.CREATOR = new czgl();
    }

    public OnConnectionInitiatedParams() {
        this.i = 0;
        this.m = 0;
    }

    public OnConnectionInitiatedParams(String s, String s1, String s2, boolean z, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, boolean z1, int v, PresenceDevice presenceDevice0, ConnectionsDevice connectionsDevice0, DctDevice dctDevice0, int v1) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = z;
        this.e = arr_b;
        this.f = arr_b1;
        this.g = arr_b2;
        this.h = z1;
        this.i = v;
        this.j = presenceDevice0;
        this.k = connectionsDevice0;
        this.l = dctDevice0;
        this.m = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof OnConnectionInitiatedParams) && bata.b(this.a, ((OnConnectionInitiatedParams)object0).a) && bata.b(this.b, ((OnConnectionInitiatedParams)object0).b) && bata.b(this.c, ((OnConnectionInitiatedParams)object0).c) && bata.b(Boolean.valueOf(this.d), Boolean.valueOf(((OnConnectionInitiatedParams)object0).d)) && Arrays.equals(this.e, ((OnConnectionInitiatedParams)object0).e) && Arrays.equals(this.f, ((OnConnectionInitiatedParams)object0).f) && Arrays.equals(this.g, ((OnConnectionInitiatedParams)object0).g) && bata.b(Boolean.valueOf(this.h), Boolean.valueOf(((OnConnectionInitiatedParams)object0).h)) && bata.b(Integer.valueOf(this.i), Integer.valueOf(((OnConnectionInitiatedParams)object0).i)) && bata.b(this.j, ((OnConnectionInitiatedParams)object0).j) && bata.b(this.k, ((OnConnectionInitiatedParams)object0).k) && bata.b(this.l, ((OnConnectionInitiatedParams)object0).l) && bata.b(Integer.valueOf(this.m), Integer.valueOf(((OnConnectionInitiatedParams)object0).m));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d), Arrays.hashCode(this.e), Arrays.hashCode(this.f), Arrays.hashCode(this.g), Boolean.valueOf(this.h), ((int)this.i), this.j, this.k, this.l, ((int)this.m)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.e(parcel0, 4, this.d);
        baub.i(parcel0, 5, this.e, false);
        baub.i(parcel0, 6, this.f, false);
        baub.i(parcel0, 7, this.g, false);
        baub.e(parcel0, 8, this.h);
        baub.o(parcel0, 9, this.i);
        baub.t(parcel0, 10, this.j, v, false);
        baub.t(parcel0, 11, this.k, v, false);
        baub.o(parcel0, 12, this.m);
        baub.t(parcel0, 13, this.l, v, false);
        baub.c(parcel0, v1);
    }
}


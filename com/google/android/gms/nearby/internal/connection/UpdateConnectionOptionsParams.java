package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.PresenceDevice;
import czfx;
import czfz;
import czip;
import java.util.Arrays;

public final class UpdateConnectionOptionsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public czfz a;
    public String b;
    public String c;
    public ConnectionOptions d;
    public int e;
    public PresenceDevice f;

    static {
        UpdateConnectionOptionsParams.CREATOR = new czip();
    }

    public UpdateConnectionOptionsParams() {
        this.e = 0;
    }

    public UpdateConnectionOptionsParams(IBinder iBinder0, String s, String s1, ConnectionOptions connectionOptions0, int v, PresenceDevice presenceDevice0) {
        batl.s(iBinder0);
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
        czfz czfz0 = (iInterface0 instanceof czfz) ? ((czfz)iInterface0) : new czfx(iBinder0);
        super();
        this.a = czfz0;
        this.b = s;
        this.c = s1;
        this.d = connectionOptions0;
        this.e = v;
        this.f = presenceDevice0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof UpdateConnectionOptionsParams) && bata.b(this.a, ((UpdateConnectionOptionsParams)object0).a) && bata.b(this.b, ((UpdateConnectionOptionsParams)object0).b) && bata.b(this.c, ((UpdateConnectionOptionsParams)object0).c) && bata.b(this.d, ((UpdateConnectionOptionsParams)object0).d) && bata.b(Integer.valueOf(this.e), Integer.valueOf(((UpdateConnectionOptionsParams)object0).e)) && bata.b(this.f, ((UpdateConnectionOptionsParams)object0).f);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, ((int)this.e), this.f});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, (this.a == null ? null : this.a.asBinder()));
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.o(parcel0, 5, this.e);
        baub.t(parcel0, 6, this.f, v, false);
        baub.c(parcel0, v1);
    }
}


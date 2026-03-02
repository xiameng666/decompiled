package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.ConnectionOptions;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import czev;
import czex;
import czfx;
import czfz;
import czhy;
import java.util.Arrays;

public final class SendConnectionRequestParamsV3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public czfz a;
    public czex b;
    public ConnectionOptions c;
    public ConnectionsDevice d;
    public int e;
    public PresenceDevice f;
    public ConnectionsDevice g;
    public DctDevice h;
    public String i;

    static {
        SendConnectionRequestParamsV3.CREATOR = new czhy();
    }

    public SendConnectionRequestParamsV3() {
        this.e = 0;
    }

    public SendConnectionRequestParamsV3(IBinder iBinder0, IBinder iBinder1, ConnectionOptions connectionOptions0, ConnectionsDevice connectionsDevice0, int v, PresenceDevice presenceDevice0, ConnectionsDevice connectionsDevice1, DctDevice dctDevice0, String s) {
        czfz czfz0;
        czex czex0 = null;
        if(iBinder0 == null) {
            czfz0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            czfz0 = (iInterface0 instanceof czfz) ? ((czfz)iInterface0) : new czfx(iBinder0);
        }
        if(iBinder1 != null) {
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            czex0 = (iInterface1 instanceof czex) ? ((czex)iInterface1) : new czev(iBinder1);
        }
        super();
        this.a = czfz0;
        this.b = czex0;
        this.c = connectionOptions0;
        this.d = connectionsDevice0;
        this.e = v;
        this.f = presenceDevice0;
        this.g = connectionsDevice1;
        this.h = dctDevice0;
        this.i = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SendConnectionRequestParamsV3) && bata.b(this.a, ((SendConnectionRequestParamsV3)object0).a) && bata.b(this.b, ((SendConnectionRequestParamsV3)object0).b) && bata.b(this.c, ((SendConnectionRequestParamsV3)object0).c) && bata.b(this.d, ((SendConnectionRequestParamsV3)object0).d) && bata.b(Integer.valueOf(this.e), Integer.valueOf(((SendConnectionRequestParamsV3)object0).e)) && bata.b(this.f, ((SendConnectionRequestParamsV3)object0).f) && bata.b(this.g, ((SendConnectionRequestParamsV3)object0).g) && bata.b(this.h, ((SendConnectionRequestParamsV3)object0).h) && bata.b(this.i, ((SendConnectionRequestParamsV3)object0).i);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, ((int)this.e), this.f, this.g, this.h, this.i});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        IBinder iBinder0 = null;
        baub.D(parcel0, 1, (this.a == null ? null : this.a.asBinder()));
        czex czex0 = this.b;
        if(czex0 != null) {
            iBinder0 = czex0.asBinder();
        }
        baub.D(parcel0, 2, iBinder0);
        baub.t(parcel0, 3, this.c, v, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.o(parcel0, 5, this.e);
        baub.t(parcel0, 6, this.f, v, false);
        baub.t(parcel0, 7, this.g, v, false);
        baub.v(parcel0, 8, this.i, false);
        baub.t(parcel0, 9, this.h, v, false);
        baub.c(parcel0, v1);
    }
}


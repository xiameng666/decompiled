package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import czfx;
import czfz;
import czhz;
import java.util.Arrays;

public final class SendPayloadParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public czfz a;
    public String[] b;
    public ParcelablePayload c;
    public boolean d;
    public int e;
    public PresenceDevice f;
    public ConnectionsDevice g;
    public DctDevice h;

    static {
        SendPayloadParams.CREATOR = new czhz();
    }

    public SendPayloadParams() {
        this.e = 0;
    }

    public SendPayloadParams(IBinder iBinder0, String[] arr_s, ParcelablePayload parcelablePayload0, boolean z, int v, PresenceDevice presenceDevice0, ConnectionsDevice connectionsDevice0, DctDevice dctDevice0) {
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
        this.b = arr_s;
        this.c = parcelablePayload0;
        this.d = z;
        this.e = v;
        this.f = presenceDevice0;
        this.g = connectionsDevice0;
        this.h = dctDevice0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SendPayloadParams) && bata.b(this.a, ((SendPayloadParams)object0).a) && Arrays.equals(this.b, ((SendPayloadParams)object0).b) && bata.b(this.c, ((SendPayloadParams)object0).c) && bata.b(Boolean.valueOf(this.d), Boolean.valueOf(((SendPayloadParams)object0).d)) && bata.b(Integer.valueOf(this.e), Integer.valueOf(((SendPayloadParams)object0).e)) && bata.b(this.f, ((SendPayloadParams)object0).f) && bata.b(this.g, ((SendPayloadParams)object0).g) && bata.b(this.h, ((SendPayloadParams)object0).h);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Arrays.hashCode(this.b), this.c, Boolean.valueOf(this.d), ((int)this.e), this.f, this.g, this.h});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, (this.a == null ? null : this.a.asBinder()));
        baub.w(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.e(parcel0, 4, this.d);
        baub.o(parcel0, 5, this.e);
        baub.t(parcel0, 6, this.f, v, false);
        baub.t(parcel0, 7, this.g, v, false);
        baub.t(parcel0, 8, this.h, v, false);
        baub.c(parcel0, v1);
    }
}


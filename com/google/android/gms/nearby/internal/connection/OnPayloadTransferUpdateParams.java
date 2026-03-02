package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import czgz;
import java.util.Arrays;

public final class OnPayloadTransferUpdateParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public PayloadTransferUpdate b;
    public int c;
    public PresenceDevice d;
    public ConnectionsDevice e;
    public DctDevice f;

    static {
        OnPayloadTransferUpdateParams.CREATOR = new czgz();
    }

    public OnPayloadTransferUpdateParams() {
        this.c = 0;
    }

    public OnPayloadTransferUpdateParams(String s, PayloadTransferUpdate payloadTransferUpdate0, int v, PresenceDevice presenceDevice0, ConnectionsDevice connectionsDevice0, DctDevice dctDevice0) {
        this.a = s;
        this.b = payloadTransferUpdate0;
        this.c = v;
        this.d = presenceDevice0;
        this.e = connectionsDevice0;
        this.f = dctDevice0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof OnPayloadTransferUpdateParams) && bata.b(this.a, ((OnPayloadTransferUpdateParams)object0).a) && bata.b(this.b, ((OnPayloadTransferUpdateParams)object0).b) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((OnPayloadTransferUpdateParams)object0).c)) && bata.b(this.d, ((OnPayloadTransferUpdateParams)object0).d) && bata.b(this.e, ((OnPayloadTransferUpdateParams)object0).e) && bata.b(this.f, ((OnPayloadTransferUpdateParams)object0).f);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, ((int)this.c), this.d, this.e, this.f});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.o(parcel0, 3, this.c);
        baub.t(parcel0, 4, this.d, v, false);
        baub.t(parcel0, 5, this.e, v, false);
        baub.t(parcel0, 6, this.f, v, false);
        baub.c(parcel0, v1);
    }
}


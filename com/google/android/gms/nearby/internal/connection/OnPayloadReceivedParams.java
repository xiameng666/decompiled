package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import czgy;
import java.util.Arrays;

public final class OnPayloadReceivedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public ParcelablePayload b;
    public boolean c;
    public int d;
    public PresenceDevice e;
    public ConnectionsDevice f;
    public DctDevice g;

    static {
        OnPayloadReceivedParams.CREATOR = new czgy();
    }

    public OnPayloadReceivedParams() {
        this.d = 0;
    }

    public OnPayloadReceivedParams(String s, ParcelablePayload parcelablePayload0, boolean z, int v, PresenceDevice presenceDevice0, ConnectionsDevice connectionsDevice0, DctDevice dctDevice0) {
        this.a = s;
        this.b = parcelablePayload0;
        this.c = z;
        this.d = v;
        this.e = presenceDevice0;
        this.f = connectionsDevice0;
        this.g = dctDevice0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof OnPayloadReceivedParams) && bata.b(this.a, ((OnPayloadReceivedParams)object0).a) && bata.b(this.b, ((OnPayloadReceivedParams)object0).b) && bata.b(Boolean.valueOf(this.c), Boolean.valueOf(((OnPayloadReceivedParams)object0).c)) && bata.b(Integer.valueOf(this.d), Integer.valueOf(((OnPayloadReceivedParams)object0).d)) && bata.b(this.e, ((OnPayloadReceivedParams)object0).e) && bata.b(this.f, ((OnPayloadReceivedParams)object0).f) && bata.b(this.g, ((OnPayloadReceivedParams)object0).g);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), ((int)this.d), this.e, this.f, this.g});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        czgy.a(this, parcel0, v);
    }
}


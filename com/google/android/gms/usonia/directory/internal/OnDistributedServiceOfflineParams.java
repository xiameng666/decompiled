package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.usonia.PeerAddress;
import fapl;
import java.util.Arrays;

public final class OnDistributedServiceOfflineParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public PeerAddress b;

    static {
        OnDistributedServiceOfflineParams.CREATOR = new fapl();
    }

    private OnDistributedServiceOfflineParams() {
    }

    public OnDistributedServiceOfflineParams(String s, PeerAddress peerAddress0) {
        this.a = s;
        this.b = peerAddress0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof OnDistributedServiceOfflineParams) && bata.b(this.a, ((OnDistributedServiceOfflineParams)object0).a) && bata.b(this.b, ((OnDistributedServiceOfflineParams)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}


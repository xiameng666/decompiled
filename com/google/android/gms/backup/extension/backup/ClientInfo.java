package com.google.android.gms.backup.extension.backup;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import arsk;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ClientInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        ClientInfo.CREATOR = new arsk();
    }

    public ClientInfo(int v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ClientInfo) && this.a == ((ClientInfo)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "ClientInfo{supportedApiVersionNumber=" + this.a + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}


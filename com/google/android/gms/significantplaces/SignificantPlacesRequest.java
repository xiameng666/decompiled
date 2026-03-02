package com.google.android.gms.significantplaces;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import epgb;
import ibni;
import ibuq;

public final class SignificantPlacesRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final ClientIdentity a;

    static {
        SignificantPlacesRequest.CREATOR = new epgb();
    }

    @ibni
    public SignificantPlacesRequest(ClientIdentity clientIdentity0) {
        this.a = clientIdentity0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof SignificantPlacesRequest) ? ibuq.m(this.a, ((SignificantPlacesRequest)object0).a) : true;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Request[");
        ClientIdentity clientIdentity0 = this.a;
        if(clientIdentity0 != null) {
            stringBuilder0.append(" ");
            stringBuilder0.append(clientIdentity0);
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "parcel");
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.c(parcel0, v1);
    }
}


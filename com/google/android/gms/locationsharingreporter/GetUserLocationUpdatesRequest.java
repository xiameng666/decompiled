package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import coba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;

public class GetUserLocationUpdatesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;

    static {
        GetUserLocationUpdatesRequest.CREATOR = new coba();
    }

    public GetUserLocationUpdatesRequest(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof GetUserLocationUpdatesRequest) && this.b == ((GetUserLocationUpdatesRequest)object0).b && Objects.equals(this.a, ((GetUserLocationUpdatesRequest)object0).a);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, ((int)this.b)});
    }

    @Override
    public final String toString() {
        return "GetUserLocationUpdatesRequest{shareId=\'" + this.a + "\', requestedFreshness=" + this.b + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}


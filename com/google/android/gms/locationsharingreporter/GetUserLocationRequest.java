package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import coaz;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;

public class GetUserLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;

    static {
        GetUserLocationRequest.CREATOR = new coaz();
    }

    public GetUserLocationRequest(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof GetUserLocationRequest) ? Objects.equals(this.a, ((GetUserLocationRequest)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Override
    public final String toString() {
        return "GetUserLocationRequest [shareId=" + this.a + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}


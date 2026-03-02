package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dleg;
import java.util.Arrays;

public final class GetPassesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public PassInstance[] a;

    static {
        GetPassesResponse.CREATOR = new dleg();
    }

    public GetPassesResponse() {
    }

    public GetPassesResponse(PassInstance[] arr_passInstance) {
        this.a = arr_passInstance;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof GetPassesResponse) ? Arrays.equals(this.a, ((GetPassesResponse)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.J(parcel0, 1, this.a, v);
        baub.c(parcel0, v1);
    }
}


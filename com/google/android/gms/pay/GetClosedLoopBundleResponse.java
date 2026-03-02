package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dldp;
import java.util.Arrays;

public final class GetClosedLoopBundleResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public byte[] a;

    static {
        GetClosedLoopBundleResponse.CREATOR = new dldp();
    }

    public GetClosedLoopBundleResponse() {
    }

    public GetClosedLoopBundleResponse(byte[] arr_b) {
        this.a = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof GetClosedLoopBundleResponse) ? Arrays.equals(this.a, ((GetClosedLoopBundleResponse)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}


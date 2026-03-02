package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlfe;
import java.util.Arrays;

public final class GetTransitPassResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public TransitPass[] a;
    public String b;

    static {
        GetTransitPassResponse.CREATOR = new dlfe();
    }

    public GetTransitPassResponse() {
    }

    public GetTransitPassResponse(TransitPass[] arr_transitPass, String s) {
        this.a = arr_transitPass;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GetTransitPassResponse) && Arrays.equals(this.a, ((GetTransitPassResponse)object0).a) && bata.b(this.b, ((GetTransitPassResponse)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.J(parcel0, 1, this.a, v);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}


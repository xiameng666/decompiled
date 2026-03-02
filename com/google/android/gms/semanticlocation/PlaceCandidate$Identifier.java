package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elvj;

public class PlaceCandidate.Identifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final long b;

    static {
        PlaceCandidate.Identifier.CREATOR = new elvj();
    }

    public PlaceCandidate.Identifier(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final String toString() {
        return String.format("0x%s:0x%s", Long.toHexString(this.b), Long.toHexString(this.a));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.q(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import coch;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PeriodicLocationUploadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final LocationCollectionReason a;
    public final LocationShare b;
    public final int c;
    public final long d;
    @Deprecated
    public final boolean e;
    public final String f;
    public final boolean g;

    static {
        PeriodicLocationUploadRequest.CREATOR = new coch();
    }

    public PeriodicLocationUploadRequest(LocationCollectionReason locationCollectionReason0, LocationShare locationShare0, int v, long v1, boolean z, String s, boolean z1) {
        this.a = locationCollectionReason0;
        this.b = locationShare0;
        this.c = v;
        this.d = v1;
        this.e = z;
        this.f = s;
        this.g = z1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.o(parcel0, 3, this.c);
        baub.q(parcel0, 4, this.d);
        baub.e(parcel0, 5, this.e);
        baub.v(parcel0, 6, this.f, false);
        baub.e(parcel0, 7, this.g);
        baub.c(parcel0, v1);
    }
}


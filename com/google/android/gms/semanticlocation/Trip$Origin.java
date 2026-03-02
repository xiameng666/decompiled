package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elvp;

public class Trip.Origin extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final PlaceCandidate.Identifier a;
    public final PlaceCandidate.Point b;

    static {
        Trip.Origin.CREATOR = new elvp();
    }

    public Trip.Origin(PlaceCandidate.Identifier placeCandidate$Identifier0, PlaceCandidate.Point placeCandidate$Point0) {
        this.a = placeCandidate$Identifier0;
        this.b = placeCandidate$Point0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}


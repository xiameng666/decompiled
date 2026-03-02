package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elva;

public class Trip.Destination extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final PlaceCandidate.Identifier a;

    static {
        Trip.Destination.CREATOR = new elva();
    }

    public Trip.Destination(PlaceCandidate.Identifier placeCandidate$Identifier0) {
        this.a = placeCandidate$Identifier0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.semanticlocation.PlaceCandidate.Identifier;
import com.google.android.gms.semanticlocation.PlaceCandidate.Point;
import emuo;

public class InferredPlace extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final PlaceCandidate.Identifier a;
    public final PlaceCandidate.Point b;
    public final int c;

    static {
        InferredPlace.CREATOR = new emuo();
    }

    public InferredPlace(PlaceCandidate.Identifier placeCandidate$Identifier0, PlaceCandidate.Point placeCandidate$Point0, int v) {
        this.a = placeCandidate$Identifier0;
        this.b = placeCandidate$Point0;
        this.c = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.o(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}


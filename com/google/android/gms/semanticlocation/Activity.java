package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eluq;

public class Activity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final PlaceCandidate.Point a;
    public final PlaceCandidate.Point b;
    public final float c;
    public final float d;
    @Deprecated
    public final float e;
    public final ActivityCandidate f;
    public final AdditionalActivityCandidates g;
    public final Parking h;

    static {
        Activity.CREATOR = new eluq();
    }

    public Activity(PlaceCandidate.Point placeCandidate$Point0, PlaceCandidate.Point placeCandidate$Point1, float f, float f1, float f2, ActivityCandidate activityCandidate0, AdditionalActivityCandidates additionalActivityCandidates0, Parking parking0) {
        this.a = placeCandidate$Point0;
        this.b = placeCandidate$Point1;
        this.c = f;
        this.d = f1;
        this.e = f2;
        this.f = activityCandidate0;
        this.g = additionalActivityCandidates0;
        this.h = parking0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.l(parcel0, 3, this.c);
        baub.l(parcel0, 4, this.d);
        baub.l(parcel0, 5, this.e);
        baub.t(parcel0, 6, this.f, v, false);
        baub.t(parcel0, 7, this.g, v, false);
        baub.t(parcel0, 8, this.h, v, false);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elur;

public class ActivityEndEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final float a;
    @Deprecated
    public final float b;
    public final ActivityCandidate c;
    public final AdditionalActivityCandidates d;

    static {
        ActivityEndEvent.CREATOR = new elur();
    }

    public ActivityEndEvent(float f, float f1, ActivityCandidate activityCandidate0, AdditionalActivityCandidates additionalActivityCandidates0) {
        this.a = f;
        this.b = f1;
        this.c = activityCandidate0;
        this.d = additionalActivityCandidates0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.l(parcel0, 1, this.a);
        baub.l(parcel0, 2, this.b);
        baub.t(parcel0, 3, this.c, v, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.c(parcel0, v1);
    }
}


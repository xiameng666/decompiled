package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elwq;

public class TimelineMemory extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Trip a;
    public final Note b;

    static {
        TimelineMemory.CREATOR = new elwq();
    }

    public TimelineMemory(Trip trip0, Note note0) {
        this.a = trip0;
        this.b = note0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.reporting.ReportingState;
import emut;

public class LocationHistorySettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final int b;
    public final ReportingState c;

    static {
        LocationHistorySettings.CREATOR = new emut();
    }

    public LocationHistorySettings(boolean z, int v, ReportingState reportingState0) {
        this.a = z;
        this.b = v;
        this.c = reportingState0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}


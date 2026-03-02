package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import cmoj;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    static {
        LocationSettingsStates.CREATOR = new cmoj();
    }

    public LocationSettingsStates(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.e(parcel0, 4, this.d);
        baub.e(parcel0, 5, this.e);
        baub.e(parcel0, 6, this.f);
        baub.c(parcel0, v1);
    }
}


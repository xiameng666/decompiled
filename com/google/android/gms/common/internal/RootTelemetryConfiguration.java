package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bats;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    static {
        RootTelemetryConfiguration.CREATOR = new bats();
    }

    public RootTelemetryConfiguration(int v, boolean z, boolean z1, int v1, int v2) {
        this.a = v;
        this.b = z;
        this.c = z1;
        this.d = v1;
        this.e = v2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.o(parcel0, 5, this.e);
        baub.c(parcel0, v1);
    }
}


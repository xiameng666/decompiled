package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aqdb;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PowerStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final double b;

    static {
        PowerStateImpl.CREATOR = new aqdb();
    }

    public PowerStateImpl(int v, double f) {
        this.a = v;
        this.b = f;
    }

    @Override
    public final String toString() {
        return "PowerConnectionState = " + Integer.toString(this.a) + " Battery Percentage = " + this.b;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.j(parcel0, 3, this.b);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import cmny;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final LocationAvailability a;
    public static final LocationAvailability b;
    final int c;

    static {
        LocationAvailability.a = new LocationAvailability(0);
        LocationAvailability.b = new LocationAvailability(1000);
        LocationAvailability.CREATOR = new cmny();
    }

    @Deprecated
    public LocationAvailability(int v) {
        this.c = v;
    }

    public static LocationAvailability a(Intent intent0) {
        if(!LocationAvailability.b(intent0)) {
            return null;
        }
        try {
            return (LocationAvailability)intent0.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        }
        catch(ClassCastException unused_ex) {
            return null;
        }
    }

    public static boolean b(Intent intent0) {
        return intent0 != null && intent0.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public final boolean c() {
        return this.c < 1000;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof LocationAvailability) && this.c == ((LocationAvailability)object0).c;
    }

    @Override
    public final int hashCode() {
        return this.c;
    }

    @Override
    public final String toString() {
        return "LocationAvailability[" + this.c() + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 4, this.c);
        baub.e(parcel0, 6, this.c());
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cpry;

public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final double a;
    public final double b;

    static {
        LatLng.CREATOR = new cpry();
    }

    public LatLng(double f, double f1) {
        if((f1 < -180.0) || f1 >= 180.0) {
            f1 = ((f1 - 180.0) % 360.0 + 360.0) % 360.0 - 180.0;
        }
        this.b = f1;
        this.a = Math.max(-90.0, Math.min(90.0, f));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof LatLng) ? Double.doubleToLongBits(this.a) == Double.doubleToLongBits(((LatLng)object0).a) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(((LatLng)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        long v = Double.doubleToLongBits(this.a);
        long v1 = Double.doubleToLongBits(this.b);
        return (((int)(v ^ v >>> 0x20)) + 0x1F) * 0x1F + ((int)(v1 ^ v1 >>> 0x20));
    }

    @Override
    public final String toString() {
        return "lat/lng: (" + this.a + "," + this.b + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.j(parcel0, 2, this.a);
        baub.j(parcel0, 3, this.b);
        baub.c(parcel0, v1);
    }
}


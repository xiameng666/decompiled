package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cpsm;
import java.util.Arrays;

public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final StreetViewSource a;
    public final int b;

    static {
        StreetViewSource.CREATOR = new cpsm();
        StreetViewSource.a = new StreetViewSource(0);
    }

    public StreetViewSource(int v) {
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof StreetViewSource) ? this.b == ((StreetViewSource)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.b)});
    }

    @Override
    public final String toString() {
        int v = this.b;
        switch(v) {
            case 0: {
                return String.format("StreetViewSource:%s", "DEFAULT");
            }
            case 1: {
                return String.format("StreetViewSource:%s", "OUTDOOR");
            }
            default: {
                return String.format("StreetViewSource:%s", String.format("UNKNOWN(%s)", v));
            }
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}


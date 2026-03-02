package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dass;
import j..util.Objects;

public class PresenceZone.DistanceBoundary extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final float a;
    public final float b;
    public final int c;

    static {
        PresenceZone.DistanceBoundary.CREATOR = new dass();
    }

    public PresenceZone.DistanceBoundary(float f, float f1, int v) {
        this.a = f;
        this.b = f1;
        this.c = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof PresenceZone.DistanceBoundary) ? Float.compare(((PresenceZone.DistanceBoundary)object0).a, this.a) == 0 && Float.compare(((PresenceZone.DistanceBoundary)object0).b, this.b) == 0 && this.c == ((PresenceZone.DistanceBoundary)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((float)this.a), ((float)this.b), ((int)this.c)});
    }

    @Override
    public final String toString() {
        return "DistanceBoundary{minDistanceMeters=" + this.a + ", maxDistanceMeters=" + this.b + ", distanceRange=" + this.c + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.l(parcel0, 1, this.a);
        baub.l(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}


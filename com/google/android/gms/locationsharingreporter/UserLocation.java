package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import cocq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;

public class UserLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final UserId a;
    public final LocationInfo b;
    public final BatteryState c;

    static {
        UserLocation.CREATOR = new cocq();
    }

    public UserLocation(UserId userId0, LocationInfo locationInfo0, BatteryState batteryState0) {
        this.a = userId0;
        this.b = locationInfo0;
        this.c = batteryState0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof UserLocation) && Objects.equals(this.a, ((UserLocation)object0).a) && Objects.equals(this.b, ((UserLocation)object0).b) && Objects.equals(this.c, ((UserLocation)object0).c);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }

    @Override
    public final String toString() {
        return "UserLocation [sharerUserId=" + this.a + ", locationInfo=" + this.b + ", batteryState=" + this.c + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.home.matter.beacon;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bwgy;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gged_interceptors;
import java.util.Arrays;
import java.util.List;

public final class BeaconData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final List b;
    public final List c;

    static {
        BeaconData.CREATOR = new bwgy();
    }

    public BeaconData(List list0, List list1, List list2) {
        this.a = gged_interceptors.i(list0);
        this.b = gged_interceptors.i(list1);
        this.c = gged_interceptors.i(list2);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof BeaconData) ? this.a.equals(((BeaconData)object0).a) && this.b.equals(((BeaconData)object0).b) && this.c.equals(((BeaconData)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a, false);
        baub.y(parcel0, 2, this.b, false);
        baub.y(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}


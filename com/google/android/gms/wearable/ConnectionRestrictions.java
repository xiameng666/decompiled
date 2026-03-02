package com.google.android.gms.wearable;

import MoreObjects;
import ToStringHelper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fceo;
import java.util.List;

public class ConnectionRestrictions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final List b;
    public final List c;

    static {
        ConnectionRestrictions.CREATOR = new fceo();
    }

    public ConnectionRestrictions(List list0, List list1, List list2) {
        this.a = list0;
        this.b = list1;
        this.c = list2;
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("allowedDataItemFilters", this.a);
        gfsv0.add("allowedCapabilities", this.b);
        gfsv0.add("allowedPackages", this.c);
        return gfsv0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a, false);
        baub.x(parcel0, 2, this.b, false);
        baub.x(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}


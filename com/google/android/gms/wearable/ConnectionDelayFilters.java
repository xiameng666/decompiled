package com.google.android.gms.wearable;

import MoreObjects;
import ToStringHelper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fcen;
import j..util.Objects;
import java.util.List;

public final class ConnectionDelayFilters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;

    static {
        ConnectionDelayFilters.CREATOR = new fcen();
    }

    public ConnectionDelayFilters(List list0) {
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ConnectionDelayFilters) ? Objects.equals(this.a, ((ConnectionDelayFilters)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("dataItemFilters", this.a);
        return gfsv0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}


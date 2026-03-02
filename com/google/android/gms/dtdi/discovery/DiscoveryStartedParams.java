package com.google.android.gms.dtdi.discovery;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bjdg;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;
import java.util.List;

public final class DiscoveryStartedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final List b;

    static {
        DiscoveryStartedParams.CREATOR = new bjdg();
    }

    public DiscoveryStartedParams(int v, List list0) {
        ibuq.f(list0, "identityTypes");
        super();
        this.a = v;
        this.b = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DiscoveryStartedParams)) {
            return false;
        }
        return this.a == ((DiscoveryStartedParams)object0).a ? ibuq.m(this.b, ((DiscoveryStartedParams)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "DiscoveryStartedParams(identitySource=" + this.a + ", identityTypes=" + this.b + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.E(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}


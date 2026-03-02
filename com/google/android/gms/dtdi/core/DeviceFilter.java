package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bhzf;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;

public final class DeviceFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final Integer b;
    public final DeviceBrandFilter c;

    static {
        DeviceFilter.CREATOR = new bhzf();
    }

    public DeviceFilter(String s, Integer integer0, DeviceBrandFilter deviceBrandFilter0) {
        this.a = s;
        this.b = integer0;
        this.c = deviceBrandFilter0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DeviceFilter)) {
            return false;
        }
        if(!ibuq.m(this.a, ((DeviceFilter)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((DeviceFilter)object0).b) ? ibuq.m(this.c, ((DeviceFilter)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        DeviceBrandFilter deviceBrandFilter0 = this.c;
        if(deviceBrandFilter0 != null) {
            v = deviceBrandFilter0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "DeviceFilter(featureFilter=" + this.a + ", trustRelationshipFilter=" + this.b + ", deviceBrandFilter=" + this.c + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.F(parcel0, 2, this.b);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}


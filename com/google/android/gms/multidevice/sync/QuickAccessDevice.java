package com.google.android.gms.multidevice.sync;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ctgh;
import ibuq;

public final class QuickAccessDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;

    static {
        QuickAccessDevice.CREATOR = new ctgh();
    }

    public QuickAccessDevice(String s, String s1) {
        ibuq.f(s, "id");
        ibuq.f(s1, "displayName");
        super();
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof QuickAccessDevice)) {
            return false;
        }
        return ibuq.m(this.a, ((QuickAccessDevice)object0).a) ? ibuq.m(this.b, ((QuickAccessDevice)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "QuickAccessDevice(id=" + this.a + ", displayName=" + this.b + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.activeunlock;

import aayk;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;

public final class DeviceIdentifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;

    static {
        DeviceIdentifier.CREATOR = new aayk();
    }

    public DeviceIdentifier(String s) {
        ibuq.f(s, "bluetoothAddress");
        super();
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof DeviceIdentifier) ? ibuq.m(this.a, ((DeviceIdentifier)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "DeviceIdentifier(bluetoothAddress=" + this.a + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}


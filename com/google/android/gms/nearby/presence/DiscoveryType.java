package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dasr;

public final class DiscoveryType extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        DiscoveryType.CREATOR = new dasr();
    }

    public DiscoveryType(int v) {
        this.a = v;
    }

    @Override
    public final String toString() {
        switch(this.a) {
            case 1: {
                return "DiscoveryType<AMBIENT>";
            }
            case 2: {
                return "DiscoveryType<ACTIVE>";
            }
            default: {
                return "DiscoveryType<UNKNOWN>";
            }
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}


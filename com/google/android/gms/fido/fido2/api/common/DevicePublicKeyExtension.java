package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bmhp;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class DevicePublicKeyExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        DevicePublicKeyExtension.CREATOR = new bmhp();
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof DevicePublicKeyExtension)) {
            return false;
        }
        DevicePublicKeyExtension devicePublicKeyExtension0 = (DevicePublicKeyExtension)object0;
        return true;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(false)});
    }

    @Override
    public final String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, false);
        baub.c(parcel0, v1);
    }
}


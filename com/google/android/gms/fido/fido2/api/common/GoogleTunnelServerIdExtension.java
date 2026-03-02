package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import bmib;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class GoogleTunnelServerIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;

    static {
        GoogleTunnelServerIdExtension.CREATOR = new bmib();
    }

    public GoogleTunnelServerIdExtension(String s) {
        batl.s(s);
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof GoogleTunnelServerIdExtension) ? this.a.equals(((GoogleTunnelServerIdExtension)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}


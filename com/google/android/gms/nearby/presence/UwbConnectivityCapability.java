package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import datz;
import j..util.Objects;
import java.util.Locale;

public class UwbConnectivityCapability extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final UwbConnectivityCapability a;
    public final boolean b;
    public final boolean c;

    static {
        UwbConnectivityCapability.a = new UwbConnectivityCapability(false, false);
        UwbConnectivityCapability.CREATOR = new datz();
    }

    public UwbConnectivityCapability(boolean z, boolean z1) {
        this.b = z;
        this.c = z1;
    }

    public final boolean a() {
        return this.b || this.c;
    }

    public final byte[] b() {
        byte[] arr_b = new byte[4];
        int v = 0;
        arr_b[0] = 0;
        int v1 = this.b ? 0xFFFFFF80 : 0;
        if(this.c) {
            v = 0x40;
        }
        arr_b[1] = (byte)(v1 | v);
        return arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof UwbConnectivityCapability) ? this.b == ((UwbConnectivityCapability)object0).b && this.c == ((UwbConnectivityCapability)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "UwbConnectivityCapability<S-STS: %s, P-STS: %s>", Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.b);
        baub.e(parcel0, 2, this.c);
        baub.c(parcel0, v1);
    }
}


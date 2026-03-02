package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import epxt;
import java.util.Arrays;
import java.util.Locale;

public class ConnectionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final D2DDevice a;
    public final String b;
    public final String c;
    public final byte[] d;
    public final String e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;

    static {
        ConnectionRequest.CREATOR = new epxt();
    }

    public ConnectionRequest(D2DDevice d2DDevice0, String s, String s1, byte[] arr_b, String s2, int v, boolean z, boolean z1, boolean z2, int v1, int v2) {
        this.a = d2DDevice0;
        this.b = s;
        this.c = s1;
        this.d = arr_b;
        this.e = s2;
        this.f = v;
        this.g = z;
        this.h = z1;
        this.i = z2;
        this.j = v1;
        this.k = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        return object0 == this ? true : (object0 instanceof ConnectionRequest) && (bata.b(((ConnectionRequest)object0).a, this.a) && bata.b(((ConnectionRequest)object0).b, this.b) && bata.b(((ConnectionRequest)object0).c, this.c) && Arrays.equals(((ConnectionRequest)object0).d, this.d) && bata.b(((ConnectionRequest)object0).e, this.e) && ((ConnectionRequest)object0).f == this.f && ((ConnectionRequest)object0).g == this.g && ((ConnectionRequest)object0).h == this.h && ((ConnectionRequest)object0).i == this.i && ((ConnectionRequest)object0).j == this.j && ((ConnectionRequest)object0).k == this.k);
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.d);
        return Arrays.hashCode(new Object[]{this.a, this.b, integer0, this.c, this.e, ((int)this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i), ((int)this.j), ((int)this.k)});
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.US;
        String s = Arrays.toString(this.d);
        return String.format(locale0, "device: %s, pin: %s, deeplinkPairingCode: %s, fastpairCode: %s, outOfBandKey: %s, triggerType: %d, isQuickStartReconnect: %b, isQuickStartConnection: %b, requiresLongTimeout: %b, oemType: %s, targetDeviceType: %s", this.a, this.b, this.c, s, this.e, ((int)this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i), ((int)this.j), ((int)this.k));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.i(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.o(parcel0, 6, this.f);
        baub.e(parcel0, 7, this.g);
        baub.e(parcel0, 8, this.h);
        baub.e(parcel0, 9, this.i);
        baub.o(parcel0, 10, this.j);
        baub.o(parcel0, 11, this.k);
        baub.c(parcel0, v1);
    }
}


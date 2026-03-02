package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import bxf;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import daks;
import daoo;
import daop;
import java.util.Arrays;

public class Update extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final int b;
    public final Message c;
    public final DistanceImpl d;
    public final BleSignalImpl e;
    public final NearbyDevice f;
    public final byte[] g;

    static {
        Update.CREATOR = new daop();
    }

    public Update(int v, int v1, Message message0, DistanceImpl distanceImpl0, BleSignalImpl bleSignalImpl0, NearbyDevice nearbyDevice0, byte[] arr_b) {
        this.a = v;
        boolean z = Update.c(v1, 2);
        if(z) {
            v1 = 2;
        }
        this.b = v1;
        this.c = message0;
        if(z) {
            distanceImpl0 = null;
        }
        this.d = distanceImpl0;
        if(z) {
            bleSignalImpl0 = null;
        }
        this.e = bleSignalImpl0;
        if(z) {
            nearbyDevice0 = null;
        }
        this.f = nearbyDevice0;
        if(z) {
            arr_b = null;
        }
        this.g = arr_b;
    }

    public Update(daoo daoo0) {
        this(1, daoo0.a, daoo0.b, daoo0.c, daoo0.d, daoo0.e, daoo0.f);
    }

    public final String a() {
        return "Update{address=" + this.c.a().d + ", distance=" + this.d + ", bleSignal=" + this.e + "}";
    }

    public final boolean b(int v) {
        return Update.c(this.b, v);
    }

    public static boolean c(int v, int v1) {
        return (v & v1) != 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        return (object0 instanceof Update) ? this.b == ((Update)object0).b && bata.b(this.c, ((Update)object0).c) && bata.b(this.d, ((Update)object0).d) && bata.b(this.e, ((Update)object0).e) && bata.b(this.f, ((Update)object0).f) && Arrays.equals(this.g, ((Update)object0).g) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.b), this.c, this.d, this.e, this.f, this.g});
    }

    @Override
    public final String toString() {
        bxf bxf0 = new bxf();
        if(this.b(1)) {
            bxf0.add("FOUND");
        }
        if(this.b(2)) {
            bxf0.add("LOST");
        }
        if(this.b(4)) {
            bxf0.add("DISTANCE");
        }
        if(this.b(8)) {
            bxf0.add("BLE_SIGNAL");
        }
        if(this.b(16)) {
            bxf0.add("DEVICE");
        }
        if(this.b(0x20)) {
            bxf0.add("BLE_RECORD");
        }
        String s = String.valueOf(daks.a(this.g));
        return "Update{types=" + bxf0.toString() + ", message=" + this.c + ", distance=" + this.d + ", bleSignal=" + this.e + ", device=" + this.f + ", bleRecord=" + s + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.t(parcel0, 3, this.c, v, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.t(parcel0, 5, this.e, v, false);
        baub.t(parcel0, 6, this.f, v, false);
        baub.i(parcel0, 7, this.g, false);
        baub.c(parcel0, v1);
    }
}


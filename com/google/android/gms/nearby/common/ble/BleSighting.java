package com.google.android.gms.nearby.common.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cunz;
import cuoc;
import java.util.Arrays;

public class BleSighting extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final BluetoothDevice a;
    public final cunz b;
    public final byte[] c;
    public final int d;
    public final long e;

    static {
        BleSighting.CREATOR = new cuoc();
    }

    public BleSighting(BluetoothDevice bluetoothDevice0, byte[] arr_b, int v, long v1) {
        this.a = bluetoothDevice0;
        this.c = arr_b;
        this.d = v;
        this.e = v1;
        this.b = cunz.a(arr_b);
    }

    public static BleSighting a(ScanResult scanResult0) {
        ScanRecord scanRecord0 = scanResult0.getScanRecord();
        return scanRecord0 == null ? null : new BleSighting(scanResult0.getDevice(), scanRecord0.getBytes(), scanResult0.getRssi(), scanResult0.getTimestampNanos());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof BleSighting) ? bata.b(this.a, ((BleSighting)object0).a) && this.d == ((BleSighting)object0).d && Arrays.equals(this.c, ((BleSighting)object0).c) && this.e == ((BleSighting)object0).e : false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.c);
        return Arrays.hashCode(new Object[]{this.a, ((int)this.d), ((long)this.e), integer0});
    }

    @Override
    public final String toString() {
        return "BleSighting{device=" + this.a + ", bleRecord=" + this.b.toString() + ", rssi=" + this.d + ", timestampNanos=" + this.e + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.i(parcel0, 3, this.c, false);
        baub.o(parcel0, 4, this.d);
        baub.q(parcel0, 5, this.e);
        baub.c(parcel0, v1);
    }
}


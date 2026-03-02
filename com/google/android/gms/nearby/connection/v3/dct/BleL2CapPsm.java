package com.google.android.gms.nearby.connection.v3.dct;

import android.util.Log;
import java.util.Arrays;

public class BleL2CapPsm extends DctDeviceDataElement {
    public static final int a;

    public BleL2CapPsm(int v) {
        super(4, 2, new byte[]{((byte)(v & 0xFF)), ((byte)(v >> 8 & 0xFF))});
    }

    public BleL2CapPsm(byte[] arr_b) {
        super(4, 2, Arrays.copyOf(arr_b, arr_b.length));
        if(arr_b.length == 2) {
            return;
        }
        Log.i("NC_BleL2CapPsm", String.format("Incorrect size for BLE L2CAP PSM: expected %d, actual %d", ((int)2), ((int)arr_b.length)));
        throw new IllegalArgumentException("Incorrect size for BLE L2CAP PSM.");
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof BleL2CapPsm) ? Arrays.equals(this.d, ((BleL2CapPsm)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.d);
    }

    @Override  // com.google.android.gms.nearby.connection.v3.dct.DctDeviceDataElement
    public final String toString() {
        return String.format("BleL2CapPsm: %s", Arrays.toString(this.d));
    }
}


package com.google.android.gms.nearby.connection.v3.dct;

import java.util.Arrays;

public class TransmitPower extends DctDeviceDataElement {
    public static final int a;

    public TransmitPower(byte b) {
        super(3, 1, new byte[]{b});
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof TransmitPower) ? Arrays.equals(this.d, ((TransmitPower)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.d);
    }

    @Override  // com.google.android.gms.nearby.connection.v3.dct.DctDeviceDataElement
    public final String toString() {
        return String.format("TransmitPower: %s", Arrays.toString(this.d));
    }
}


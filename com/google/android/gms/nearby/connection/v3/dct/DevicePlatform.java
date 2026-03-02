package com.google.android.gms.nearby.connection.v3.dct;

import java.util.Arrays;

public class DevicePlatform extends DctDeviceDataElement {
    public static final int a;

    public DevicePlatform(int v) {
        super(2, 1, new byte[]{((byte)v)});
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof DevicePlatform) ? Arrays.equals(this.d, ((DevicePlatform)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.d);
    }

    @Override  // com.google.android.gms.nearby.connection.v3.dct.DctDeviceDataElement
    public final String toString() {
        return String.format("DevicePlatform: %s", Arrays.toString(this.d));
    }
}


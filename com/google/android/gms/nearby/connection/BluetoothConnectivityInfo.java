package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cuvd;
import cuve;
import cuvx;
import cuwa;
import gftb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class BluetoothConnectivityInfo extends AbstractSafeParcelable implements cuvx {
    public static final Parcelable.Creator CREATOR;
    private final byte[] a;
    private final byte[] b;
    private final byte[] c;

    static {
        BluetoothConnectivityInfo.CREATOR = new cuvd();
    }

    public BluetoothConnectivityInfo(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        this.a = arr_b;
        this.b = arr_b1;
        this.c = arr_b2;
    }

    @Override  // cuvx
    public final int a() {
        return 2;
    }

    public final byte[] b() {
        return this.c == null ? null : ((byte[])this.c.clone());
    }

    public final byte[] c() {
        return this.a == null ? null : ((byte[])this.a.clone());
    }

    public final byte[] d() {
        return this.b == null ? null : ((byte[])this.b.clone());
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof BluetoothConnectivityInfo) && Arrays.equals(this.a, ((BluetoothConnectivityInfo)object0).a) && Arrays.equals(this.b, ((BluetoothConnectivityInfo)object0).b) && Arrays.equals(this.c, ((BluetoothConnectivityInfo)object0).c);
    }

    @Override  // cuvz
    public final byte[] g() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            byte[] arr_b = this.a;
            if(arr_b == null || arr_b.length != 6) {
                throw new IllegalArgumentException("The MAC address can\'t be empty");
            }
            byteArrayOutputStream0.write(0);
            byte[] arr_b1 = this.b;
            int v = arr_b1 == null || arr_b1.length != 4 ? 0 : 1;
            byteArrayOutputStream0.write((1 == v ? 0x60 : 0x40));
            byteArrayOutputStream0.write(arr_b);
            if(v != 0) {
                gftb.check(arr_b1);
                byteArrayOutputStream0.write(arr_b1);
            }
            byte[] arr_b2 = this.c;
            if(arr_b2 != null && arr_b2.length > 0) {
                String s = cuve.b(arr_b2);
                Log.i("NearbyConnections", String.format("Writing %d action(s): %s", ((int)arr_b2.length), s));
                byteArrayOutputStream0.write(arr_b2);
            }
            byte[] arr_b3 = byteArrayOutputStream0.toByteArray();
            byteArrayOutputStream0.reset();
            byteArrayOutputStream0.write(cuwa.g(20, arr_b3.length));
            byteArrayOutputStream0.write(arr_b3);
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException unused_ex) {
            Log.i("NearbyConnections", "Failed to write Bluetooth data elements bytes.");
            return new byte[0];
        }
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), Arrays.hashCode(this.b), Arrays.hashCode(this.c)});
    }

    @Override
    public final String toString() {
        Integer integer0 = null;
        Integer integer1 = this.a == null ? null : Arrays.hashCode(this.a);
        Integer integer2 = this.b == null ? null : Arrays.hashCode(this.b);
        byte[] arr_b = this.c;
        if(arr_b != null) {
            integer0 = Arrays.hashCode(arr_b);
        }
        return String.format("BluetoothConnectivityInfo:<bluetoothMacAddress hash: %s, bluetoothUuid hash: %s, actions hash: %s>", integer1, integer2, integer0);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.c(), false);
        baub.i(parcel0, 2, this.d(), false);
        baub.i(parcel0, 3, this.b(), false);
        baub.c(parcel0, v1);
    }
}


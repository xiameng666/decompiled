package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cuvx;
import cuwa;
import cuxo;
import gged_interceptors;
import glwl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class WifiLanConnectivityInfoV2 extends AbstractSafeParcelable implements cuvx {
    public static final Parcelable.Creator CREATOR;
    public static final gged_interceptors a;
    public final byte[] b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;

    static {
        WifiLanConnectivityInfoV2.CREATOR = new cuxo();
        Byte byte0 = (byte)0;
        WifiLanConnectivityInfoV2.a = gged_interceptors.q(byte0, byte0, byte0, byte0, byte0, byte0);
    }

    public WifiLanConnectivityInfoV2(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3) {
        this.b = arr_b;
        this.c = arr_b1;
        this.d = arr_b2;
        this.e = arr_b3;
    }

    @Override  // cuvx
    public final int a() {
        return 5;
    }

    public final byte[] b() {
        return (byte[])this.c.clone();
    }

    public final byte[] c() {
        return (byte[])this.b.clone();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof WifiLanConnectivityInfoV2) && Arrays.equals(this.b, ((WifiLanConnectivityInfoV2)object0).b) && Arrays.equals(this.c, ((WifiLanConnectivityInfoV2)object0).c) && Arrays.equals(this.d, ((WifiLanConnectivityInfoV2)object0).d) && Arrays.equals(this.e, ((WifiLanConnectivityInfoV2)object0).e);
    }

    @Override  // cuvz
    public final byte[] g() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            byte[] arr_b = this.b;
            int v = 2;
            boolean z = true;
            batl.c(arr_b.length == 2, "The Port can\'t be empty");
            byte[] arr_b1 = this.c;
            int v1 = arr_b1.length;
            switch(v1) {
                case 4: {
                    break;
                }
                case 16: {
                    v1 = 16;
                    break;
                }
                default: {
                    z = false;
                }
            }
            batl.c(z, "The IP address has invalid length");
            if(v1 != 4) {
                v = 3;
            }
            byteArrayOutputStream0.write(v);
            byteArrayOutputStream0.write(arr_b1);
            byteArrayOutputStream0.write(arr_b);
            byte[] arr_b2 = this.d;
            if(arr_b2 != null && arr_b2.length == 6) {
                byteArrayOutputStream0.write(arr_b2);
            }
            else {
                byteArrayOutputStream0.write(glwl.e(WifiLanConnectivityInfoV2.a));
            }
            byte[] arr_b3 = this.e;
            if(arr_b3 != null && arr_b3.length > 0) {
                byteArrayOutputStream0.write(arr_b3);
            }
            byte[] arr_b4 = byteArrayOutputStream0.toByteArray();
            byteArrayOutputStream0.reset();
            byteArrayOutputStream0.write(cuwa.g(20, arr_b4.length));
            byteArrayOutputStream0.write(arr_b4);
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException unused_ex) {
            Log.i("NearbyConnections", "Failed to write WifiLan data elements bytes.");
            return new byte[0];
        }
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.b), Arrays.hashCode(this.c), Arrays.hashCode(this.d), Arrays.hashCode(this.e)});
    }

    @Override
    public final String toString() {
        return String.format("WifiLanConnectivityInfoV2:<wifiLanPort hash: %s>, <wifiLanIp hash: %s>, <BSSID hash: %s>, <actions hash: %s>", Arrays.hashCode(this.b), Arrays.hashCode(this.c), Arrays.hashCode(this.d), Arrays.hashCode(this.e));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.c(), false);
        baub.i(parcel0, 2, this.b(), false);
        byte[] arr_b = null;
        baub.i(parcel0, 3, (this.d == null ? null : ((byte[])this.d.clone())), false);
        byte[] arr_b1 = this.e;
        if(arr_b1 != null) {
            arr_b = (byte[])arr_b1.clone();
        }
        baub.i(parcel0, 4, arr_b, false);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.trustagent.trustlet.device.bluetooth.model;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ezgp;
import ezgv;
import ezka;
import gftb;
import ggia;
import j..util.Optional;
import java.util.List;

public class TrustableDevice extends AbstractSafeParcelable implements ReflectedParcelable, ezgp {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final boolean b;
    private static final ClassLoader c;

    static {
        TrustableDevice.CREATOR = new ezgv();
        TrustableDevice.c = TrustableDevice.class.getClassLoader();
    }

    public TrustableDevice(BluetoothDevice bluetoothDevice0, boolean z) {
        this(ggia.d(new BluetoothDevice[]{bluetoothDevice0}), z);
    }

    public TrustableDevice(List list0, boolean z) {
        boolean z1 = true;
        gftb.b(((boolean)(list0.isEmpty() ^ 1)), "Cannot create empty TrustableDevice");
        if(list0.get(0) == null) {
            z1 = false;
        }
        gftb.b(z1, "Cannot create with null device");
        this.a = list0;
        this.b = z;
    }

    @Override  // ezgp
    public final String a() {
        return this.d();
    }

    public final BluetoothDevice b() {
        return (BluetoothDevice)this.a.get(0);
    }

    public static Optional c(Bundle bundle0, String s) {
        if(bundle0 != null) {
            ClassLoader classLoader0 = TrustableDevice.c;
            if(classLoader0 != null) {
                bundle0.setClassLoader(classLoader0);
            }
            return Optional.ofNullable(((TrustableDevice)bundle0.getParcelable(s)));
        }
        return Optional.empty();
    }

    public final String d() {
        return this.b().getAddress();
    }

    public final String e() {
        return ezka.b(this.b());
    }

    public static Optional f(Intent intent0) {
        return TrustableDevice.c(intent0.getExtras(), "trustable_device");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a, false);
        baub.e(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}


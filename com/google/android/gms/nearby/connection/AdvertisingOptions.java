package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cuuu;
import damp;
import java.util.Arrays;
import java.util.Locale;

public final class AdvertisingOptions extends AbstractSafeParcelable {
    public int A;
    public byte[] B;
    public boolean C;
    public static final Parcelable.Creator CREATOR;
    public int D;
    @Deprecated
    public final boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final long I;
    public final boolean J;
    public Strategy a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public byte[] f;
    public boolean g;
    public ParcelUuid h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final int o;
    public final int p;
    public byte[] q;
    public long r;
    public UwbSenderInfo[] s;
    public boolean t;
    @Deprecated
    public boolean u;
    public boolean v;
    public boolean w;
    public int[] x;
    public int[] y;
    public final boolean z;

    static {
        AdvertisingOptions.CREATOR = new cuuu();
    }

    public AdvertisingOptions() {
        this.b = true;
        this.c = true;
        this.d = true;
        this.e = true;
        this.g = false;
        this.i = true;
        this.j = true;
        this.k = true;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = 0;
        this.p = 0;
        this.r = 0L;
        this.t = false;
        this.u = true;
        this.v = false;
        this.w = true;
        this.z = true;
        this.A = 0;
        this.C = true;
        this.D = 0;
        this.E = false;
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = 0L;
        this.J = false;
    }

    public AdvertisingOptions(Strategy strategy0, boolean z, boolean z1, boolean z2, boolean z3, byte[] arr_b, boolean z4, ParcelUuid parcelUuid0, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int v, int v1, byte[] arr_b1, long v2, UwbSenderInfo[] arr_uwbSenderInfo, boolean z11, boolean z12, boolean z13, boolean z14, int[] arr_v, int[] arr_v1, boolean z15, int v3, byte[] arr_b2, boolean z16, int v4, boolean z17, boolean z18, boolean z19, boolean z20, long v5, boolean z21) {
        this.a = strategy0;
        this.b = z;
        this.c = z1;
        this.d = z2;
        this.e = z3;
        this.f = arr_b;
        this.g = z4;
        this.h = parcelUuid0;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = z9;
        this.n = z10;
        this.o = v;
        this.p = v1;
        this.q = arr_b1;
        this.r = v2;
        this.s = arr_uwbSenderInfo;
        this.t = z11;
        this.u = z12;
        this.v = z13;
        this.w = z14;
        this.x = arr_v;
        this.y = arr_v1;
        this.z = z15;
        this.A = v3;
        this.B = arr_b2;
        this.C = z16;
        this.D = v4;
        this.E = z17;
        this.F = z18;
        this.G = z19;
        this.H = z20;
        this.I = v5;
        this.J = z21;
    }

    public static void a(AdvertisingOptions advertisingOptions0) {
        advertisingOptions0.D = 2;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof AdvertisingOptions) && bata.b(this.a, ((AdvertisingOptions)object0).a) && bata.b(Boolean.valueOf(this.b), Boolean.valueOf(((AdvertisingOptions)object0).b)) && bata.b(Boolean.valueOf(this.c), Boolean.valueOf(((AdvertisingOptions)object0).c)) && bata.b(Boolean.valueOf(this.d), Boolean.valueOf(((AdvertisingOptions)object0).d)) && bata.b(Boolean.valueOf(this.e), Boolean.valueOf(((AdvertisingOptions)object0).e)) && Arrays.equals(this.f, ((AdvertisingOptions)object0).f) && bata.b(Boolean.valueOf(this.g), Boolean.valueOf(((AdvertisingOptions)object0).g)) && bata.b(this.h, ((AdvertisingOptions)object0).h) && bata.b(Boolean.valueOf(this.i), Boolean.valueOf(((AdvertisingOptions)object0).i)) && bata.b(Boolean.valueOf(this.j), Boolean.valueOf(((AdvertisingOptions)object0).j)) && bata.b(Boolean.valueOf(this.k), Boolean.valueOf(((AdvertisingOptions)object0).k)) && bata.b(Boolean.valueOf(this.l), Boolean.valueOf(((AdvertisingOptions)object0).l)) && bata.b(Boolean.valueOf(this.m), Boolean.valueOf(((AdvertisingOptions)object0).m)) && bata.b(Boolean.valueOf(this.n), Boolean.valueOf(((AdvertisingOptions)object0).n)) && bata.b(Integer.valueOf(this.o), Integer.valueOf(((AdvertisingOptions)object0).o)) && bata.b(Integer.valueOf(this.p), Integer.valueOf(((AdvertisingOptions)object0).p)) && Arrays.equals(this.q, ((AdvertisingOptions)object0).q) && bata.b(Long.valueOf(this.r), Long.valueOf(((AdvertisingOptions)object0).r)) && Arrays.equals(this.s, ((AdvertisingOptions)object0).s) && bata.b(Boolean.valueOf(this.t), Boolean.valueOf(((AdvertisingOptions)object0).t)) && bata.b(Boolean.valueOf(this.u), Boolean.valueOf(((AdvertisingOptions)object0).u)) && bata.b(Boolean.valueOf(this.v), Boolean.valueOf(((AdvertisingOptions)object0).v)) && bata.b(Boolean.valueOf(this.w), Boolean.valueOf(((AdvertisingOptions)object0).w)) && Arrays.equals(this.x, ((AdvertisingOptions)object0).x) && Arrays.equals(this.y, ((AdvertisingOptions)object0).y) && bata.b(Boolean.valueOf(this.z), Boolean.valueOf(((AdvertisingOptions)object0).z)) && bata.b(Integer.valueOf(this.A), Integer.valueOf(((AdvertisingOptions)object0).A)) && Arrays.equals(this.B, ((AdvertisingOptions)object0).B) && bata.b(Boolean.valueOf(this.C), Boolean.valueOf(((AdvertisingOptions)object0).C)) && bata.b(Integer.valueOf(this.D), Integer.valueOf(((AdvertisingOptions)object0).D)) && bata.b(Boolean.valueOf(this.E), Boolean.valueOf(((AdvertisingOptions)object0).E)) && bata.b(Boolean.valueOf(this.F), Boolean.valueOf(((AdvertisingOptions)object0).F)) && bata.b(Boolean.valueOf(this.G), Boolean.valueOf(((AdvertisingOptions)object0).G)) && bata.b(Boolean.valueOf(this.H), Boolean.valueOf(((AdvertisingOptions)object0).H)) && bata.b(Long.valueOf(this.I), Long.valueOf(((AdvertisingOptions)object0).I)) && bata.b(Boolean.valueOf(this.J), Boolean.valueOf(((AdvertisingOptions)object0).J));
    }

    @Override
    public final int hashCode() {
        Strategy strategy0 = this.a;
        Boolean boolean0 = Boolean.valueOf(this.b);
        Boolean boolean1 = Boolean.valueOf(this.c);
        Boolean boolean2 = Boolean.valueOf(this.d);
        Boolean boolean3 = Boolean.valueOf(this.e);
        Integer integer0 = Arrays.hashCode(this.f);
        Boolean boolean4 = Boolean.valueOf(this.g);
        ParcelUuid parcelUuid0 = this.h;
        Boolean boolean5 = Boolean.valueOf(this.i);
        Boolean boolean6 = Boolean.valueOf(this.j);
        Boolean boolean7 = Boolean.valueOf(this.k);
        Boolean boolean8 = Boolean.valueOf(this.l);
        Boolean boolean9 = Boolean.valueOf(this.m);
        Boolean boolean10 = Boolean.valueOf(this.n);
        Integer integer1 = Arrays.hashCode(this.q);
        Long long0 = (long)this.r;
        Integer integer2 = Arrays.hashCode(this.s);
        Boolean boolean11 = Boolean.valueOf(this.t);
        Boolean boolean12 = Boolean.valueOf(this.u);
        Boolean boolean13 = Boolean.valueOf(this.v);
        Boolean boolean14 = Boolean.valueOf(this.w);
        Integer integer3 = Arrays.hashCode(this.x);
        Integer integer4 = Arrays.hashCode(this.y);
        Integer integer5 = (int)this.A;
        Integer integer6 = Arrays.hashCode(this.B);
        return Arrays.hashCode(new Object[]{strategy0, boolean0, boolean1, boolean2, boolean3, integer0, boolean4, parcelUuid0, boolean5, boolean6, boolean7, boolean8, boolean9, boolean10, ((int)this.o), ((int)this.p), integer1, long0, integer2, boolean11, boolean12, boolean13, boolean14, integer3, integer4, Boolean.valueOf(this.z), integer5, integer6, Boolean.valueOf(this.C), ((int)this.D), Boolean.valueOf(this.E), Boolean.valueOf(this.F), Boolean.valueOf(this.G), Boolean.valueOf(this.H), ((long)this.I), Boolean.valueOf(this.J)});
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.US;
        Strategy strategy0 = this.a;
        Boolean boolean0 = Boolean.valueOf(this.b);
        Boolean boolean1 = Boolean.valueOf(this.c);
        Boolean boolean2 = Boolean.valueOf(this.d);
        Boolean boolean3 = Boolean.valueOf(this.e);
        String s = this.f == null ? null : damp.b(this.f);
        Boolean boolean4 = Boolean.valueOf(this.g);
        ParcelUuid parcelUuid0 = this.h;
        Boolean boolean5 = Boolean.valueOf(this.i);
        Boolean boolean6 = Boolean.valueOf(this.j);
        Boolean boolean7 = Boolean.valueOf(this.k);
        Boolean boolean8 = Boolean.valueOf(this.l);
        Boolean boolean9 = Boolean.valueOf(this.m);
        Boolean boolean10 = Boolean.valueOf(this.n);
        Integer integer0 = (int)this.o;
        Integer integer1 = (int)this.p;
        String s1 = this.q == null ? "null" : damp.b(this.q);
        Long long0 = (long)this.r;
        String s2 = Arrays.toString(this.s);
        Boolean boolean11 = Boolean.valueOf(this.t);
        Boolean boolean12 = Boolean.valueOf(this.u);
        Boolean boolean13 = Boolean.valueOf(this.w);
        return this.B == null ? String.format(locale0, "AdvertisingOptions{strategy: %s, autoUpgradeBandwidth: %s, enforceTopologyConstraints: %s, enableBluetooth: %s, enableBle: %s, nearbyNotificationsBeaconData: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableBluetoothListening: %s, enableWebRtcListening: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, remoteUwbAddress: %s, flowId: %d, uwbSenderInfo: %s, enableOutOfBandConnection: %s, disruptiveUpgrade: %s, useStableIdentifiers: %s, deviceInfo: %s,allowGattConnections: %s, connectionType: %d, enableBleL2capListening: %s, upgradeBandwidthTimeoutMillis: %d,skipPayloadInProgressUpdate: %s}", strategy0, boolean0, boolean1, boolean2, boolean3, s, boolean4, parcelUuid0, boolean5, boolean6, boolean7, boolean8, boolean9, boolean10, integer0, integer1, s1, long0, s2, boolean11, boolean12, boolean13, null, Boolean.valueOf(this.C), ((int)this.D), Boolean.valueOf(this.H), ((long)this.I), Boolean.valueOf(this.J)) : String.format(locale0, "AdvertisingOptions{strategy: %s, autoUpgradeBandwidth: %s, enforceTopologyConstraints: %s, enableBluetooth: %s, enableBle: %s, nearbyNotificationsBeaconData: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableBluetoothListening: %s, enableWebRtcListening: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, remoteUwbAddress: %s, flowId: %d, uwbSenderInfo: %s, enableOutOfBandConnection: %s, disruptiveUpgrade: %s, useStableIdentifiers: %s, deviceInfo: %s,allowGattConnections: %s, connectionType: %d, enableBleL2capListening: %s, upgradeBandwidthTimeoutMillis: %d,skipPayloadInProgressUpdate: %s}", strategy0, boolean0, boolean1, boolean2, boolean3, s, boolean4, parcelUuid0, boolean5, boolean6, boolean7, boolean8, boolean9, boolean10, integer0, integer1, s1, long0, s2, boolean11, boolean12, boolean13, damp.b(this.B), Boolean.valueOf(this.C), ((int)this.D), Boolean.valueOf(this.H), ((long)this.I), Boolean.valueOf(this.J));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.e(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.e(parcel0, 4, this.d);
        baub.e(parcel0, 5, this.e);
        baub.i(parcel0, 6, this.f, false);
        baub.e(parcel0, 7, this.g);
        baub.t(parcel0, 8, this.h, v, false);
        baub.e(parcel0, 9, this.i);
        baub.e(parcel0, 10, this.j);
        baub.e(parcel0, 11, this.k);
        baub.e(parcel0, 12, this.l);
        baub.e(parcel0, 13, this.m);
        baub.e(parcel0, 14, this.n);
        baub.o(parcel0, 15, this.o);
        baub.o(parcel0, 16, this.p);
        baub.i(parcel0, 17, this.q, false);
        baub.q(parcel0, 18, this.r);
        baub.J(parcel0, 19, this.s, v);
        baub.e(parcel0, 20, this.t);
        baub.e(parcel0, 21, this.u);
        baub.e(parcel0, 22, this.v);
        baub.e(parcel0, 23, this.w);
        baub.p(parcel0, 24, this.x, false);
        baub.p(parcel0, 25, this.y, false);
        baub.e(parcel0, 26, this.z);
        baub.o(parcel0, 27, this.A);
        baub.i(parcel0, 28, this.B, false);
        baub.e(parcel0, 29, this.C);
        baub.o(parcel0, 30, this.D);
        baub.e(parcel0, 0x1F, this.E);
        baub.e(parcel0, 0x20, this.F);
        baub.e(parcel0, 33, this.G);
        baub.e(parcel0, 34, this.H);
        baub.q(parcel0, 35, this.I);
        baub.e(parcel0, 36, this.J);
        baub.c(parcel0, v1);
    }
}


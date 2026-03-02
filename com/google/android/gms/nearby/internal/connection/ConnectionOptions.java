package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.Strategy;
import cyyo;
import cyyp;
import damp;
import java.util.Arrays;
import java.util.Locale;

public final class ConnectionOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public byte[] i;
    public boolean j;
    public boolean k;
    @Deprecated
    public boolean l;
    public int m;
    public int n;
    public int[] o;
    public int[] p;
    public byte[] q;
    public Strategy r;
    public int s;
    public long t;
    @Deprecated
    public boolean u;
    public boolean v;
    public boolean w;
    public String x;
    public boolean y;

    static {
        ConnectionOptions.CREATOR = new cyyp();
    }

    public ConnectionOptions() {
        this.a = false;
        this.b = true;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = true;
        this.j = false;
        this.k = true;
        this.l = true;
        this.m = 0;
        this.n = 0;
        this.s = 0;
        this.t = 0L;
        this.u = false;
        this.v = true;
        this.w = true;
        this.y = false;
    }

    public ConnectionOptions(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, byte[] arr_b, boolean z8, boolean z9, boolean z10, int v, int v1, int[] arr_v, int[] arr_v1, byte[] arr_b1, Strategy strategy0, int v2, long v3, boolean z11, boolean z12, boolean z13, String s, boolean z14) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = arr_b;
        this.j = z8;
        this.k = z9;
        this.l = z10;
        this.m = v;
        this.n = v1;
        this.o = arr_v;
        this.p = arr_v1;
        this.q = arr_b1;
        this.r = strategy0;
        this.s = v2;
        this.t = v3;
        this.u = z11;
        this.v = z12;
        this.w = z13;
        this.x = s;
        this.y = z14;
    }

    public static ConnectionOptions a(com.google.android.gms.nearby.connection.ConnectionOptions connectionOptions0) {
        ConnectionOptions connectionOptions1 = new ConnectionOptions();
        connectionOptions1.a = connectionOptions0.a;
        connectionOptions1.b = connectionOptions0.b;
        connectionOptions1.c = connectionOptions0.c;
        connectionOptions1.d = connectionOptions0.d;
        connectionOptions1.e = connectionOptions0.e;
        connectionOptions1.f = connectionOptions0.f;
        connectionOptions1.g = connectionOptions0.g;
        connectionOptions1.h = connectionOptions0.h;
        connectionOptions1.i = connectionOptions0.i;
        connectionOptions1.j = connectionOptions0.j;
        connectionOptions1.k = connectionOptions0.k;
        connectionOptions1.l = connectionOptions0.l;
        connectionOptions1.m = connectionOptions0.m;
        connectionOptions1.n = connectionOptions0.n;
        connectionOptions1.q = connectionOptions0.q;
        connectionOptions1.r = connectionOptions0.r;
        connectionOptions1.s = connectionOptions0.s;
        connectionOptions1.t = connectionOptions0.t;
        connectionOptions1.u = connectionOptions0.u;
        connectionOptions1.v = connectionOptions0.v;
        connectionOptions1.w = connectionOptions0.w;
        connectionOptions1.y = connectionOptions0.x;
        int[] arr_v = connectionOptions0.p;
        if(arr_v != null) {
            connectionOptions1.p = arr_v;
        }
        int[] arr_v1 = connectionOptions0.o;
        if(arr_v1 != null) {
            connectionOptions1.o = arr_v1;
        }
        cyyo.a(connectionOptions1);
        return connectionOptions1;
    }

    public static void b(int v, ConnectionOptions connectionOptions0) {
        if(v != 12) {
            switch(v) {
                case 2: {
                    connectionOptions0.b = true;
                    return;
                }
                case 3: {
                    connectionOptions0.g = true;
                    return;
                }
                case 4: {
                    connectionOptions0.c = true;
                    return;
                }
                case 5: {
                    connectionOptions0.d = true;
                    return;
                }
                case 6: {
                    connectionOptions0.f = true;
                    return;
                }
                case 7: {
                    connectionOptions0.e = true;
                    return;
                }
                case 8: {
                    connectionOptions0.h = true;
                    return;
                }
                case 9: {
                    break;
                }
                default: {
                    return;
                }
            }
        }
        connectionOptions0.j = true;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ConnectionOptions) && bata.b(Boolean.valueOf(this.a), Boolean.valueOf(((ConnectionOptions)object0).a)) && bata.b(Boolean.valueOf(this.b), Boolean.valueOf(((ConnectionOptions)object0).b)) && bata.b(Boolean.valueOf(this.c), Boolean.valueOf(((ConnectionOptions)object0).c)) && bata.b(Boolean.valueOf(this.d), Boolean.valueOf(((ConnectionOptions)object0).d)) && bata.b(Boolean.valueOf(this.e), Boolean.valueOf(((ConnectionOptions)object0).e)) && bata.b(Boolean.valueOf(this.f), Boolean.valueOf(((ConnectionOptions)object0).f)) && bata.b(Boolean.valueOf(this.g), Boolean.valueOf(((ConnectionOptions)object0).g)) && bata.b(Boolean.valueOf(this.h), Boolean.valueOf(((ConnectionOptions)object0).h)) && Arrays.equals(this.i, ((ConnectionOptions)object0).i) && bata.b(Boolean.valueOf(this.j), Boolean.valueOf(((ConnectionOptions)object0).j)) && bata.b(Boolean.valueOf(this.k), Boolean.valueOf(((ConnectionOptions)object0).k)) && bata.b(Boolean.valueOf(this.l), Boolean.valueOf(((ConnectionOptions)object0).l)) && bata.b(Integer.valueOf(this.m), Integer.valueOf(((ConnectionOptions)object0).m)) && bata.b(Integer.valueOf(this.n), Integer.valueOf(((ConnectionOptions)object0).n)) && Arrays.equals(this.o, ((ConnectionOptions)object0).o) && Arrays.equals(this.p, ((ConnectionOptions)object0).p) && Arrays.equals(this.q, ((ConnectionOptions)object0).q) && bata.b(this.r, ((ConnectionOptions)object0).r) && bata.b(Integer.valueOf(this.s), Integer.valueOf(((ConnectionOptions)object0).s)) && bata.b(Long.valueOf(this.t), Long.valueOf(((ConnectionOptions)object0).t)) && bata.b(Boolean.valueOf(this.u), Boolean.valueOf(((ConnectionOptions)object0).u)) && bata.b(Boolean.valueOf(this.v), Boolean.valueOf(((ConnectionOptions)object0).v)) && bata.b(Boolean.valueOf(this.w), Boolean.valueOf(((ConnectionOptions)object0).w)) && bata.b(this.x, ((ConnectionOptions)object0).x) && bata.b(Boolean.valueOf(this.y), Boolean.valueOf(((ConnectionOptions)object0).y));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Arrays.hashCode(this.i), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), ((int)this.m), ((int)this.n), Arrays.hashCode(this.o), Arrays.hashCode(this.p), Arrays.hashCode(this.q), this.r, ((int)this.s), ((long)this.t), Boolean.valueOf(this.u), Boolean.valueOf(this.v), Boolean.valueOf(this.w), this.x, Boolean.valueOf(this.y)});
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.US;
        Boolean boolean0 = Boolean.valueOf(this.a);
        Boolean boolean1 = Boolean.valueOf(this.b);
        Boolean boolean2 = Boolean.valueOf(this.c);
        Boolean boolean3 = Boolean.valueOf(this.d);
        Boolean boolean4 = Boolean.valueOf(this.e);
        Boolean boolean5 = Boolean.valueOf(this.f);
        Boolean boolean6 = Boolean.valueOf(this.g);
        Boolean boolean7 = Boolean.valueOf(this.h);
        String s = null;
        String s1 = this.i == null ? null : damp.b(this.i);
        Boolean boolean8 = Boolean.valueOf(this.j);
        Boolean boolean9 = Boolean.valueOf(this.k);
        Boolean boolean10 = Boolean.valueOf(this.l);
        byte[] arr_b = this.q;
        if(arr_b != null) {
            s = damp.b(arr_b);
        }
        return String.format(locale0, "ConnectionOptions{lowPower: %s, enableBluetooth: %s, enableBle: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableWifiHotspot: %s, enableWifiDirect: %s, remoteBluetoothMacAddress: %s, enableWebRtc: %s, enforceTopologyConstraints: %s, disruptiveUpgrade: %s, deviceInfo: %s, strategy: %s, connectionType: %d, flowId: %d, connection mediums %s, upgrade mediums %s, skipPayloadInProgressUpdate: %s}", boolean0, boolean1, boolean2, boolean3, boolean4, boolean5, boolean6, boolean7, s1, boolean8, boolean9, boolean10, s, this.r, ((int)this.s), ((long)this.t), Arrays.toString(this.p), Arrays.toString(this.o), Boolean.valueOf(this.y));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.e(parcel0, 4, this.d);
        baub.e(parcel0, 5, this.e);
        baub.e(parcel0, 6, this.f);
        baub.e(parcel0, 7, this.g);
        baub.e(parcel0, 8, this.h);
        baub.i(parcel0, 9, this.i, false);
        baub.e(parcel0, 10, this.j);
        baub.e(parcel0, 11, this.k);
        baub.e(parcel0, 12, this.l);
        baub.o(parcel0, 13, this.m);
        baub.o(parcel0, 14, this.n);
        baub.p(parcel0, 15, this.o, false);
        baub.p(parcel0, 16, this.p, false);
        baub.i(parcel0, 17, this.q, false);
        baub.t(parcel0, 18, this.r, v, false);
        baub.o(parcel0, 19, this.s);
        baub.q(parcel0, 20, this.t);
        baub.e(parcel0, 21, this.u);
        baub.e(parcel0, 22, this.v);
        baub.e(parcel0, 23, this.w);
        baub.v(parcel0, 24, this.x, false);
        baub.e(parcel0, 25, this.y);
        baub.c(parcel0, v1);
    }
}


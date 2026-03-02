package com.google.android.gms.location;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bauc;
import cmou;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class WifiScan extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final long[] a;
    public static final int[] b;
    public final long c;
    final long[] d;
    final int[] e;
    final int[] f;
    final int[] g;
    final int[] h;
    final int[] i;
    final int[] j;

    static {
        WifiScan.a = new long[0];
        WifiScan.b = new int[0];
        WifiScan.CREATOR = new cmou();
    }

    public WifiScan(long v, long[] arr_v, int[] arr_v1, int[] arr_v2, int[] arr_v3, int[] arr_v4, int[] arr_v5, int[] arr_v6) {
        this.c = v;
        if(arr_v == null) {
            arr_v = WifiScan.a;
        }
        this.d = arr_v;
        if(arr_v1 == null) {
            arr_v1 = WifiScan.b;
        }
        this.e = arr_v1;
        if(arr_v2 == null) {
            arr_v2 = WifiScan.b;
        }
        this.f = arr_v2;
        if(arr_v3 == null) {
            arr_v3 = WifiScan.b;
        }
        this.g = arr_v3;
        if(arr_v4 == null) {
            arr_v4 = WifiScan.b;
        }
        this.h = arr_v4;
        if(arr_v5 == null) {
            arr_v5 = WifiScan.b;
        }
        this.i = arr_v5;
        if(arr_v6 == null) {
            arr_v6 = WifiScan.b;
        }
        this.j = arr_v6;
    }

    public final byte a(int v) {
        this.l(v);
        return (byte)(((int)((this.d[v] & 0xFF000000000000L) >>> 0x30)));
    }

    public final int b(int v) {
        this.l(v);
        return this.e[v];
    }

    public final int c() {
        return this.d.length;
    }

    public final int d(int v) {
        this.l(v);
        return v >= this.f.length ? 0 : this.f[v];
    }

    public final int e(int v) {
        this.l(v);
        return v >= this.j.length ? 0 : this.j[v];
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof WifiScan) ? ((WifiScan)object0).c == this.c && Arrays.equals(((WifiScan)object0).d, this.d) && Arrays.equals(((WifiScan)object0).e, this.e) && Arrays.equals(((WifiScan)object0).f, this.f) && Arrays.equals(((WifiScan)object0).g, this.g) && Arrays.equals(((WifiScan)object0).h, this.h) && Arrays.equals(((WifiScan)object0).i, this.i) && Arrays.equals(((WifiScan)object0).j, this.j) : false;
    }

    public final int f(int v) {
        this.l(v);
        return v >= this.i.length ? 0 : this.i[v];
    }

    public final int g(int v) {
        this.l(v);
        return v >= this.h.length ? 0 : this.h[v];
    }

    public final int h(int v) {
        this.l(v);
        return v >= this.g.length ? 0 : this.g[v];
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.d);
    }

    public final long i(int v) {
        this.l(v);
        return this.d[v] & 0xFFFFFFFFFFFFL;
    }

    public static WifiScan j(byte[] arr_b) {
        return (WifiScan)bauc.a(arr_b, WifiScan.CREATOR);
    }

    public static WifiScan k(Location location0) {
        Bundle bundle0 = location0.getExtras();
        if(bundle0 != null) {
            byte[] arr_b = bundle0.getByteArray("wifiScan");
            return arr_b == null ? null : WifiScan.j(arr_b);
        }
        return null;
    }

    private final void l(int v) {
        if(v >= 0 && v < this.c()) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + v + " out of bounds: [0, " + this.c() + ")");
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("WifiScan[elapsed rt: ");
        stringBuilder0.append(this.c);
        int v = this.c();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append(", Device[mac: ");
            stringBuilder0.append(this.i(v1));
            stringBuilder0.append(", dbm: ");
            stringBuilder0.append(this.a(v1));
            stringBuilder0.append(", mhz: ");
            stringBuilder0.append(this.b(v1));
            stringBuilder0.append("]");
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.c);
        baub.r(parcel0, 2, this.d, false);
        baub.p(parcel0, 3, this.e, false);
        baub.p(parcel0, 4, this.f, false);
        baub.p(parcel0, 5, this.g, false);
        baub.p(parcel0, 6, this.h, false);
        baub.p(parcel0, 7, this.i, false);
        baub.p(parcel0, 8, this.j, false);
        baub.c(parcel0, v1);
    }
}


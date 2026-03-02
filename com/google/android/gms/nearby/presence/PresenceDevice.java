package com.google.android.gms.nearby.presence;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cuvx;
import cuwb;
import cuwc;
import cuwd;
import czdz;
import dasz;
import data;
import gged_interceptors;
import ggna;
import java.util.Arrays;
import java.util.List;

public class PresenceDevice extends AbstractSafeParcelable implements cuwd {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final String b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final byte[] g;
    public final PresenceIdentity h;
    public final byte[] i;
    public final DataElementCollection j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;
    public final String o;
    private static final String[] p;
    private final byte[] q;
    private final List r;

    static {
        PresenceDevice.CREATOR = new data();
        PresenceDevice.p = new String[]{"UNKNOWN", "PHONE", "TABLET", "DISPLAY", "LAPTOP", "TV", "WATCH", "CHROMEOS", "FOLDABLE", "AUTOMOTIVE", "SPEAKER"};
    }

    public PresenceDevice(long v, String s, int v1, String s1, long v2, String s2, byte[] arr_b, byte[] arr_b1, List list0, PresenceIdentity presenceIdentity0, byte[] arr_b2, DataElementCollection dataElementCollection0, int v3, int v4, String s3, String s4, String s5) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = s1;
        this.e = v2;
        this.f = s2;
        this.q = arr_b;
        this.g = arr_b1;
        this.r = list0;
        this.h = presenceIdentity0;
        this.i = arr_b2;
        this.j = dataElementCollection0;
        this.k = v3;
        this.l = v4;
        this.m = s3;
        this.n = s4;
        this.o = s5;
    }

    @Override  // cuwd
    public final int a() {
        return 2;
    }

    @Override  // cuwd
    public final int b() {
        return this.l;
    }

    public final dasz c() {
        dasz dasz0 = new dasz();
        dasz0.b = this.b;
        dasz0.c = this.c;
        dasz0.a = this.a;
        dasz0.d = this.d;
        dasz0.j = this.l;
        dasz0.h(this.f);
        dasz0.k = this.m;
        dasz0.f(this.o);
        dasz0.g(this.n);
        byte[] arr_b = this.g;
        if(arr_b != null) {
            dasz0.f = arr_b;
        }
        byte[] arr_b1 = this.q;
        if(arr_b1 != null) {
            dasz0.e = arr_b1;
        }
        List list0 = this.r;
        if(list0 != null) {
            dasz0.d(list0);
        }
        dasz0.i = this.h;
        byte[] arr_b2 = this.i;
        if(arr_b2 != null) {
            for(Object object0: czdz.h(arr_b2)) {
                dasz0.c(((cuvx)object0));
            }
        }
        DataElementCollection dataElementCollection0 = this.j;
        if(dataElementCollection0 != null) {
            dasz0.g = dataElementCollection0;
        }
        dasz0.h = this.k;
        return dasz0;
    }

    @Override  // cuwd
    public final cuwc d() {
        return this.c();
    }

    @Override  // cuwd
    public final String e() {
        return this.f;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof PresenceDevice) && bata.b(Long.valueOf(this.a), Long.valueOf(((PresenceDevice)object0).a)) && bata.b(this.b, ((PresenceDevice)object0).b) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((PresenceDevice)object0).c)) && bata.b(this.d, ((PresenceDevice)object0).d) && bata.b(this.f, ((PresenceDevice)object0).f) && Arrays.equals(this.q, ((PresenceDevice)object0).q) && Arrays.equals(this.g, ((PresenceDevice)object0).g) && bata.b(this.r, ((PresenceDevice)object0).r) && bata.b(this.h, ((PresenceDevice)object0).h) && Arrays.equals(this.i, ((PresenceDevice)object0).i) && bata.b(this.j, ((PresenceDevice)object0).j) && bata.b(Integer.valueOf(this.k), Integer.valueOf(((PresenceDevice)object0).k)) && bata.b(Integer.valueOf(this.l), Integer.valueOf(((PresenceDevice)object0).l)) && bata.b(this.m, ((PresenceDevice)object0).m) && bata.b(this.n, ((PresenceDevice)object0).n) && bata.b(this.o, ((PresenceDevice)object0).o);
    }

    @Override  // cuwd
    public final List f() {
        return czdz.h(this.i);
    }

    @Override  // cuwd
    public final byte[] g() {
        return this.q == null ? null : ((byte[])this.q.clone());
    }

    public static String h(int v) {
        String[] arr_s = PresenceDevice.p;
        switch(v) {
            case 1: {
                return arr_s[1];
            }
            case 2: {
                return arr_s[2];
            }
            case 3: {
                return arr_s[3];
            }
            case 4: {
                return arr_s[4];
            }
            case 5: {
                return arr_s[5];
            }
            case 6: {
                return arr_s[6];
            }
            case 7: {
                return arr_s[7];
            }
            case 8: {
                return arr_s[8];
            }
            case 9: {
                return arr_s[9];
            }
            case 10: {
                return arr_s[10];
            }
            default: {
                return arr_s[0];
            }
        }
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.q);
        Integer integer1 = Arrays.hashCode(this.g);
        Integer integer2 = Arrays.hashCode(this.i);
        return Arrays.hashCode(new Object[]{((long)this.a), this.b, ((int)this.c), this.d, this.f, integer0, integer1, this.r, this.h, integer2, this.j, ((int)this.k), ((int)this.l), this.m, this.n, this.o});
    }

    public static String i(Context context0, int v) {
        return v == 2 ? "tablet" : null;
    }

    public final List j() {
        return this.r == null ? ggna.a : gged_interceptors.i(this.r);
    }

    @Override
    public final String toString() {
        Long long0 = (long)this.a;
        String s = this.b;
        String s1 = PresenceDevice.h(this.c);
        String s2 = this.d;
        Long long1 = (long)this.e;
        String s3 = this.f;
        String s4 = null;
        String s5 = this.q == null ? null : Arrays.toString(this.q);
        Integer integer0 = this.g == null ? null : Arrays.hashCode(this.g);
        List list0 = this.r;
        PresenceIdentity presenceIdentity0 = this.h;
        byte[] arr_b = this.i;
        if(arr_b != null) {
            s4 = Arrays.toString(arr_b);
        }
        return String.format("PresenceDevice:<deviceId: %s, deviceName: %s, deviceType: %s, deviceImageUrl: %s, discoveryTimestampMillis: %s, endpointId: %s, endpointInfo: %s, bluetoothMacAddress hash: %s, actions: %s, identityType: %s, connectivityBytes hash: %s, dataElements: %s, discoveryMedium: %s, instance type %s, Dusi: %s, modelName: %s, manufacturer: %s>", long0, s, s1, s2, long1, s3, s5, integer0, list0, presenceIdentity0, s4, this.j, ((int)this.k), cuwb.a(this.l), this.m, this.n, this.o);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        data.a(this, parcel0, v);
    }
}


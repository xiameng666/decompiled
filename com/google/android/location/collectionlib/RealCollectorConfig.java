package com.google.android.location.collectionlib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.location.collectionlib.utils.ParcelableSensorScannerConfig;
import fvlf;
import fvlg;
import fvlh;
import fvnl;
import fvns;
import fvnx;
import fvpm;
import fwyc;
import gftb;
import ggeo;
import ggqj;
import gwth;
import j..util.DesugarCollections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class RealCollectorConfig implements Parcelable, fvlh {
    public boolean A;
    public final int B;
    public static final Parcelable.Creator CREATOR;
    public static final ggeo a;
    public static final ggeo b;
    public final Set c;
    public final boolean d;
    public final String e;
    public final String f;
    public final byte[] g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final boolean m;
    public final boolean n;
    public final ParcelableSensorScannerConfig o;
    public final int p;
    public final int q;
    public int r;
    public final Map s;
    public String t;
    public final boolean u;
    public volatile boolean v;
    public fwyc w;
    public gwth x;
    public fvlg y;
    public fvlg z;

    static {
        EnumMap enumMap0 = new EnumMap(fvns.class);
        enumMap0.put(fvns.c, Integer.valueOf(3));
        enumMap0.put(fvns.d, Integer.valueOf(1));
        enumMap0.put(fvns.e, Integer.valueOf(4));
        enumMap0.put(fvns.f, Integer.valueOf(2));
        enumMap0.put(fvns.i, Integer.valueOf(6));
        enumMap0.put(fvns.j, Integer.valueOf(14));
        enumMap0.put(fvns.o, Integer.valueOf(19));
        enumMap0.put(fvns.n, Integer.valueOf(21));
        enumMap0.put(fvns.k, Integer.valueOf(5));
        enumMap0.put(fvns.l, Integer.valueOf(8));
        enumMap0.put(fvns.u, Integer.valueOf(0x10005));
        ggeo ggeo0 = ggeo.k(enumMap0);
        RealCollectorConfig.a = ggeo0;
        HashMap hashMap0 = new HashMap();
        ggqj ggqj0 = ggeo0.v().om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            hashMap0.put(((Integer)((Map.Entry)object0).getValue()), ((fvns)((Map.Entry)object0).getKey()));
        }
        RealCollectorConfig.b = ggeo.k(hashMap0);
        RealCollectorConfig.CREATOR = new fvnl();
    }

    public RealCollectorConfig(Parcel parcel0) {
        int v = 2;
        this.r = 2;
        this.s = DesugarCollections.synchronizedMap(new EnumMap(fvns.class));
        boolean z = false;
        this.v = false;
        this.x = null;
        this.A = false;
        int v1 = parcel0.readInt();
        EnumSet enumSet0 = EnumSet.noneOf(fvns.class);
        Set set0 = fvns.y;
        for(Object object0: set0) {
            fvns fvns0 = (fvns)object0;
            if((fvns0.z & v1) != 0) {
                enumSet0.add(fvns0);
            }
        }
        this.c = enumSet0;
        this.d = parcel0.readInt() == 1;
        String s = parcel0.readString();
        if(s == null) {
            v = 1;
        }
        else {
            switch(s) {
                case "LOCAL": {
                    break;
                }
                case "LOCAL_AND_MEMORY": {
                    v = 4;
                    break;
                }
                case "LOCAL_AND_TEMP_MEMORY": {
                    v = 5;
                    break;
                }
                case "MEMORY": {
                    v = 1;
                    break;
                }
                case "MEMORY_SENSOR_EVENTS": {
                    v = 3;
                    break;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        this.B = v;
        this.e = parcel0.readString();
        this.m = parcel0.readInt() == 1;
        this.h = parcel0.readLong();
        this.i = parcel0.readLong();
        this.j = parcel0.readLong();
        this.k = parcel0.readLong();
        long v2 = parcel0.readLong();
        ParcelableSensorScannerConfig parcelableSensorScannerConfig0 = (ParcelableSensorScannerConfig)parcel0.readParcelable(null);
        this.o = parcelableSensorScannerConfig0;
        if(parcelableSensorScannerConfig0 != null) {
            v2 = 0L;
        }
        this.l = v2;
        this.r = parcel0.readInt();
        Bundle bundle0 = parcel0.readBundle();
        Map map0 = this.s;
        if(bundle0 != null) {
            for(Object object1: bundle0.keySet()) {
                String s1 = (String)object1;
                try {
                    int v3 = Integer.parseInt(s1);
                    int v4 = 0;
                    fvns fvns1 = null;
                    for(Object object2: set0) {
                        fvns fvns2 = (fvns)object2;
                        if((fvns2.z & v3) != 0) {
                            ++v4;
                            fvns1 = fvns2;
                        }
                    }
                    if(v4 != 1) {
                        fvns1 = null;
                    }
                    if(fvns1 == null) {
                        continue;
                    }
                    map0.put(fvns1, Integer.valueOf(bundle0.getInt(s1)));
                }
                catch(NumberFormatException unused_ex) {
                }
            }
        }
        this.t = parcel0.readString();
        this.f = parcel0.readString();
        int v5 = parcel0.readInt();
        if(v5 > 0) {
            byte[] arr_b = new byte[v5];
            this.g = arr_b;
            parcel0.readByteArray(arr_b);
        }
        else {
            this.g = null;
        }
        this.u = parcel0.readInt() != 0;
        this.v = parcel0.readInt() != 0;
        this.n = parcel0.readInt() != 0;
        this.q = parcel0.readInt();
        this.p = parcel0.readInt();
        if(parcel0.readInt() != 0) {
            z = true;
        }
        this.A = z;
    }

    public RealCollectorConfig(Set set0, boolean z, boolean z1, long v, long v1, long v2, long v3, long v4, ParcelableSensorScannerConfig parcelableSensorScannerConfig0, int v5, String s, byte[] arr_b, boolean z2, fwyc fwyc0, boolean z3, int v6, int v7, gwth gwth0, fvlg fvlg0, fvlg fvlg1, boolean z4) {
        this.r = 2;
        this.s = DesugarCollections.synchronizedMap(new EnumMap(fvns.class));
        this.v = false;
        this.x = null;
        this.A = false;
        gftb.b(Long.compare(v, 0L) >= 0, "wifiScanIntervalMillis is negative");
        gftb.b(v1 >= 0L, "gnssScanIntervalMillis is negative");
        gftb.b(v2 >= 0L, "flpScanIntervalMillis is negative");
        gftb.b(v3 >= 0L, "cellScanIntervalMillis is negative");
        if(parcelableSensorScannerConfig0 == null) {
            this.m = z1;
        }
        else {
            this.m = false;
            v4 = 0L;
        }
        int v8 = 2;
        if(v5 == 2) {
            gftb.z(s, "dataPath could not be null if you want to write data to local storage");
        }
        else {
            v8 = v5;
        }
        if(v8 == 1) {
            gftb.b((parcelableSensorScannerConfig0 == null ? v4 : parcelableSensorScannerConfig0.a.c) >= 0L, "Invalid scan duration for MEMORY collection destination.");
        }
        else {
            gftb.b(v4 >= 0L, "Scan duration should be >= 0");
        }
        if(v8 == 3) {
            for(Object object0: set0) {
                if(!((fvns)object0).A) {
                    throw new IllegalArgumentException("Scanner types can\'t include non-sensor type when destination is ScannerType.MEMORY_SENSOR_EVENTS");
                }
            }
        }
        if(!fvpm.a(s)) {
            gftb.b(arr_b != null && arr_b.length == 0x20, "You must specify a valid key for encryption when writing data to persistent storage.");
            arr_b.getClass();
        }
        gftb.checkTrue(!set0.contains(fvns.m) || !set0.contains(fvns.w));
        if(set0.contains(fvns.w)) {
            gftb.checkTrue(v7 >= 0);
            gftb.checkTrue(v6 >= 0);
            gftb.checkTrue(v7 >= v6);
        }
        this.f = null;
        this.g = arr_b;
        this.c = set0;
        this.d = z;
        this.h = v;
        this.i = v1;
        this.j = v2;
        this.k = v3;
        this.l = v4;
        this.o = parcelableSensorScannerConfig0;
        this.B = v8;
        this.e = s;
        this.u = z2;
        this.w = fwyc0;
        this.n = z3;
        this.q = v6;
        this.p = v7;
        this.x = gwth0;
        this.y = fvlg0;
        this.z = fvlg1;
        this.A = z4;
    }

    @Override  // fvlh
    public final int a(fvns fvns0) {
        Integer integer0 = (Integer)this.s.get(fvns0);
        return integer0 == null ? this.r : ((int)integer0);
    }

    @Override  // fvlh
    public final fvnx b() {
        return this.o == null ? null : this.o.a;
    }

    @Override  // fvlh
    public final Map c() {
        Map map0 = new HashMap();
        for(Object object0: this.c) {
            fvns fvns0 = (fvns)object0;
            ggeo ggeo0 = RealCollectorConfig.a;
            if(ggeo0.containsKey(fvns0)) {
                Integer integer0 = (Integer)ggeo0.get(fvns0);
                Integer integer1 = (Integer)this.s.get(fvns0);
                map0.put(integer0, Integer.valueOf((integer1 == null ? this.r : ((int)integer1))));
            }
        }
        return map0;
    }

    public final void d(fvns fvns0, int v) {
        this.s.put(fvns0, Integer.valueOf(v));
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.US;
        Long long0 = (long)this.l;
        Map map0 = this.c();
        return String.format(locale0, "ScannerTypes: %s; Dest: %s; WifiDelay: %d; GpsDelay: %d, FlpDelay: %d, CellDelay: %d; ScanDuration: %d, SensorConfig: %s, SensorDelay: %s; Data path: %s; Key path: %s; AutomaticShutDown: %s; ForceUpload: %s; Batching Sensor Allowed: %s; Batch scan duration %s.", this.c, fvlf.a(this.B), ((long)this.h), ((long)this.i), ((long)this.j), ((long)this.k), long0, this.o, map0, this.e, this.f, Boolean.valueOf(this.u), Boolean.valueOf(this.v), Boolean.valueOf(this.n), long0);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = 0;
        int v2 = 0;
        for(Object object0: this.c) {
            v2 |= ((fvns)object0).z;
        }
        parcel0.writeInt(v2);
        parcel0.writeInt(((int)this.d));
        int v3 = this.B;
        if(v3 == 0) {
            throw null;
        }
        parcel0.writeString(fvlf.a(v3));
        parcel0.writeString(this.e);
        parcel0.writeInt(((int)this.m));
        parcel0.writeLong(this.h);
        parcel0.writeLong(this.i);
        parcel0.writeLong(this.j);
        parcel0.writeLong(this.k);
        parcel0.writeLong(this.l);
        parcel0.writeParcelable(this.o, v);
        parcel0.writeInt(this.r);
        Bundle bundle0 = new Bundle();
        for(Object object1: this.s.entrySet()) {
            bundle0.putInt(String.valueOf(((fvns)((Map.Entry)object1).getKey()).z), ((Integer)((Map.Entry)object1).getValue()).intValue());
        }
        parcel0.writeBundle(bundle0);
        parcel0.writeString(this.t);
        parcel0.writeString(this.f);
        byte[] arr_b = this.g;
        if(arr_b != null) {
            v1 = arr_b.length;
        }
        parcel0.writeInt(v1);
        if(v1 > 0) {
            parcel0.writeByteArray(arr_b);
        }
        parcel0.writeInt(((int)this.u));
        parcel0.writeInt(((int)this.v));
        parcel0.writeInt(((int)this.n));
        parcel0.writeInt(this.q);
        parcel0.writeInt(this.p);
        parcel0.writeInt(((int)this.A));
    }
}


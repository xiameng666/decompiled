package com.google.android.gms.nearby.presence.managers.registration;

import android.content.Context;
import android.os.WorkSource;
import android.util.ArrayMap;
import android.util.ArraySet;
import bboh;
import bbrd;
import cjcn;
import cjcw;
import cjde;
import cjdq;
import cjlz;
import cjol;
import cjon;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.libs.platform.foreground.ForegroundHelper.ForegroundListener;
import com.google.android.gms.nearby.presence.DiscoveryFilter;
import com.google.android.gms.nearby.presence.DiscoveryRequest;
import com.google.android.gms.nearby.presence.PresenceAction;
import com.google.android.gms.nearby.presence.PresenceDevice;
import com.google.android.gms.nearby.presence.PresenceIdentity;
import com.google.android.gms.nearby.presence.PresenceZone;
import com.google.android.gms.nearby.presence.RangingData;
import cusq;
import cuui;
import daus;
import daut;
import dauz;
import davy;
import dawa;
import dawb;
import dawe;
import daxh;
import dbof;
import dbow;
import dbpa;
import dbpc;
import dbpj;
import dbuu;
import esaa;
import fgvt;
import geae;
import gged_interceptors;
import ggfn;
import ggfp;
import ggna;
import ggnj;
import ggtj;
import hvqn;
import j..util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;

public abstract class DiscoveryRegistration extends cjdq implements ForegroundHelper.ForegroundListener {
    private final cjcw A;
    private dawb B;
    private int C;
    private int D;
    private boolean E;
    private final ScheduledExecutorService F;
    private final dbof G;
    public final Object f;
    public final fgvt g;
    public final daxh h;
    public final DiscoveryFilter i;
    public final DiscoveryRequest j;
    public final WorkSource k;
    public final esaa l;
    public final Long m;
    public final String n;
    public final daus o;
    public final Map p;
    public final Set q;
    public final Map r;
    public final Map s;
    public final Map t;
    public boolean u;
    private final cjlz v;
    private final Context w;
    private final cjon x;
    private final daut y;
    private final int z;

    protected DiscoveryRegistration(Context context0, DiscoveryRequest discoveryRequest0, daxh daxh0, dbpj dbpj0, cjcw cjcw0, Object object0, dbof dbof0, Long long0, Executor executor0, fgvt fgvt0) {
        super(executor0, dbpj0);
        this.s = new ArrayMap();
        this.t = new ArrayMap();
        this.F = cuui.f();
        this.w = context0;
        this.i = discoveryRequest0.d;
        this.j = discoveryRequest0;
        this.h = daxh0;
        this.A = cjcw0;
        this.f = object0;
        this.x = cjol.a();
        this.G = dbof0;
        ClientIdentity clientIdentity0 = daxh0.a;
        if(!bbrd.g(discoveryRequest0.g) && clientIdentity0.p()) {
            this.k = discoveryRequest0.g;
        }
        else {
            WorkSource workSource0 = new WorkSource();
            bbrd.e(workSource0, clientIdentity0.c, clientIdentity0.e);
            this.k = workSource0;
        }
        this.m = long0;
        String s = clientIdentity0.f == null ? clientIdentity0.e : clientIdentity0.e + ":" + clientIdentity0.f;
        this.n = s;
        this.g = fgvt0;
        daut daut0 = (daut)cusq.c(context0, daut.class);
        this.y = daut0;
        int v = daut0.d(s);
        this.z = v;
        this.o = daut0.c(v, s);
        boolean z = !hvqn.a.p().aa();
        this.p = new ArrayMap();
        this.q = new ArraySet();
        this.r = new ArrayMap();
        this.v = cjlz.a(context0);
        this.B = dawa.a(new ArrayMap(), null, 400, ggnj.a);
        esaa esaa0 = new esaa(context0, 1, "PresenceDiscovery", "ClientRegistration", clientIdentity0.e);
        this.l = esaa0;
        esaa0.j(true);
        esaa0.k(this.k);
    }

    @Override  // com.google.android.gms.libs.platform.foreground.ForegroundHelper$ForegroundListener
    public final void a(int v, boolean z) {
        if(this.h.a.c != v) {
            return;
        }
        synchronized(this.f) {
            if(!this.g()) {
                return;
            }
            if(z == this.E) {
                return;
            }
            this.E = z;
            if(this.w()) {
                this.n();
            }
        }
    }

    @Override  // cjdq
    protected void f() {
        synchronized(this.f) {
            Map map0 = this.s;
            for(Object object1: map0.values()) {
                ((dbpc)object1).a();
            }
            map0.clear();
            this.p.clear();
            this.q.clear();
            this.r.clear();
        }
        super.f();
        this.x.c(this);
        Level level0 = dauz.a();
        ((ggtj)dauz.a.g(level0).ar(8726)).B("removed discovery registration %s", this.h);
        this.o.h();
        this.y.b(this.z);
    }

    @Override  // cjdq
    protected final cjcn h() {
        return this.A;
    }

    @Override  // cjdq
    protected void j() {
        Level level0 = dauz.a();
        ((ggtj)dauz.a.g(level0).ar(8725)).R("added discovery registration %s -> %s", this.h, this.i);
        this.x.a(this.w, this.h.a.c, this.F, this);
        this.u();
        boolean z = this.x.d(this.h.a.c);
        this.a(this.h.a.c, z);
        this.w();
        if(hvqn.N()) {
            this.o.f(this.j);
            return;
        }
        this.o.e();
    }

    public final ClientIdentity o() {
        return this.h.a;
    }

    public final cjde p(dawe dawe0) {
        this.t.remove(Long.valueOf(dawe0.a.a));
        return this.q(1, dawe0, new dbow(this, dawe0.a.a));
    }

    public final cjde q(int v, dawe dawe0, Runnable runnable0) {
        int v2;
        String s;
        bboh bboh0 = dauz.a;
        ggtj ggtj0 = (ggtj)bboh0.g(dauz.a()).ar(8727);
        if(v == 0) {
            s = "DEVICE_DISCOVERED";
        }
        else {
            switch(v) {
                case 1: {
                    s = "DEVICE_LOST";
                    break;
                }
                case 2: {
                    s = "DEVICE_RANGING_UPDATE";
                    break;
                }
                default: {
                    s = v == 3 ? "DEVICE_RANGING_LOST" : "DEVICE_UPDATED";
                }
            }
        }
        ggtj0.R("[NP_API_CALLBACK] report result %s, %s", s, dawe0);
        RangingData rangingData0 = dawe0.b;
        if(rangingData0 == null) {
            v2 = 0;
        }
        else if(rangingData0.f == 2) {
            v2 = 100;
        }
        else {
            v2 = 0;
        }
        String[] arr_s = DiscoveryRegistration.v(v2);
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            if(this.v.d(arr_s[v1], this.o().c, this.o().e, this.o().f, this.o().g) != 0) {
                ((ggtj)bboh0.g(dauz.a()).ar(8728)).B("delivery noteOp denied for %s", this.o());
                return null;
            }
        }
        return new dbpa(this, v, dawe0, runnable0);
    }

    public final dawb r() {
        synchronized(this.f) {
        }
        return this.B;
    }

    public final void s(dawe dawe0) {
        if(dawe0.d != geae.e) {
            PresenceDevice presenceDevice0 = dawe0.a;
            Map map0 = this.s;
            Long long0 = (long)presenceDevice0.a;
            dbpc dbpc0 = (dbpc)map0.get(long0);
            if(dbpc0 == null) {
                dbpc dbpc1 = new dbpc(this, dawe0, this.F);
                map0.put(long0, dbpc1);
                dbpc0 = dbpc1;
            }
            dbpc0.b();
            Level level0 = dauz.a();
            ((ggtj)dauz.a.g(level0).ar(8729)).B("FusedDiscoveryEngine updated state for %s", presenceDevice0);
        }
    }

    public final boolean t() {
        boolean z = true;
        synchronized(this.f) {
            if(this.C != 1 && this.C != 3) {
                z = false;
            }
        }
        return z;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0;
        String s;
        synchronized(this.f) {
            stringBuilder0 = new StringBuilder();
            stringBuilder0.append(this.h);
            ArraySet arraySet0 = new ArraySet(2);
            if(!this.E) {
                arraySet0.add("bg");
            }
            if(!this.u) {
                arraySet0.add("na");
            }
            if(!arraySet0.isEmpty()) {
                stringBuilder0.append(" ");
                stringBuilder0.append(arraySet0);
            }
            stringBuilder0.append(" (");
            int v1 = this.C;
            if(v1 == 0) {
                s = "NONE";
            }
            else {
                switch(v1) {
                    case 1: {
                        s = "LOCATION_ONLY";
                        break;
                    }
                    case 2: {
                        s = "NEARBY_DEVICE_ONLY";
                        break;
                    }
                    default: {
                        s = "NEARBY_DEVICE_AND_LOCATION";
                    }
                }
            }
            stringBuilder0.append(s);
            stringBuilder0.append(") ");
            stringBuilder0.append(this.r());
        }
        return stringBuilder0.toString();
    }

    public final boolean u() {
        boolean z;
        Context context0 = this.w;
        daxh daxh0 = this.h;
        int v = 3;
        if(hvqn.M()) {
            ClientIdentity clientIdentity0 = daxh0.a;
            if(!clientIdentity0.m(context0, new String[]{"android.permission.BLUETOOTH_SCAN"})) {
                v = 0;
            }
            else if(dbuu.a(context0, clientIdentity0, new String[]{"android.permission.BLUETOOTH_SCAN"})) {
                v = 2;
            }
            else if(!clientIdentity0.m(context0, new String[]{"android.permission.ACCESS_FINE_LOCATION"})) {
                v = 0;
            }
        }
        else {
            ClientIdentity clientIdentity1 = daxh0.a;
            if(!clientIdentity1.m(context0, new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.UWB_RANGING"})) {
                v = 0;
            }
            else if(dbuu.a(context0, clientIdentity1, new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.UWB_RANGING"})) {
                v = 2;
            }
            else if(!clientIdentity1.m(context0, new String[]{"android.permission.ACCESS_FINE_LOCATION"})) {
                v = 0;
            }
        }
        if(v != this.C) {
            this.C = v;
        }
        if(hvqn.M()) {
            int v1 = daxh0.a.m(context0, new String[]{"android.permission.UWB_RANGING"}) ? 100 : 0;
            if(v1 != this.D) {
                if(v1 != 0 && v1 != 100) {
                    throw new IllegalArgumentException("Invalid permission level: " + v1);
                }
                this.D = v1;
            }
        }
        if(this.C >= 2) {
            int v2 = this.j.d.a == 2 ? 100 : 0;
            if(hvqn.M() && this.D < v2) {
                Level level0 = dauz.a();
                ((ggtj)dauz.a.g(level0).ar(0x2209)).X("ranging permission denied for %s, required permission level is: %s, actual permission level is: %s", this.o(), Integer.valueOf(100), Integer.valueOf(this.D));
            }
            else {
                z = true;
                String[] arr_s = DiscoveryRegistration.v(v2);
                int v3 = 0;
                while(true) {
                    if(v3 >= arr_s.length) {
                        goto label_47;
                    }
                    if(this.v.b(arr_s[v3], daxh0.a.c, daxh0.a.e) != 0) {
                        break;
                    }
                    ++v3;
                }
            }
        }
        else {
            Level level1 = dauz.a();
            ((ggtj)dauz.a.g(level1).ar(0x220A)).X("discovery permission denied for %s, required permission level is: %s, actual permission level is: %s", this.o(), Integer.valueOf(2), Integer.valueOf(this.C));
        }
        z = false;
    label_47:
        if(z != this.u) {
            this.u = z;
            return true;
        }
        return false;
    }

    static String[] v(int v) {
        gged_interceptors gged0;
        String[] arr_s = hvqn.M() ? new String[]{"android:bluetooth_scan"} : new String[]{"android:bluetooth_scan", "android:uwb_ranging"};
        if(hvqn.M()) {
            switch(v) {
                case 0: {
                    gged0 = ggna.a;
                    break;
                }
                case 100: {
                    gged0 = gged_interceptors.l("android:uwb_ranging");
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Invalid permission level: " + v);
                }
            }
            int v2 = ((ggna)gged0).c;
            String[] arr_s1 = (String[])Objects.requireNonNull(((String[])Arrays.copyOf(arr_s, arr_s.length + v2)));
            for(int v1 = 0; v1 < v2; ++v1) {
                arr_s1[arr_s.length + v1] = (String)gged0.get(v1);
            }
            return arr_s1;
        }
        return arr_s;
    }

    private final boolean w() {
        davy davy0;
        ArrayMap arrayMap0;
        Object object0 = this.f;
        synchronized(object0) {
            boolean z = false;
            arrayMap0 = new ArrayMap();
            DiscoveryFilter discoveryFilter0 = this.i;
            for(Object object1: discoveryFilter0.c()) {
                if(((PresenceZone)object1).a != null) {
                    z = true;
                    break;
                }
            }
            if(this.j == null || !this.j.c) {
                for(Object object2: discoveryFilter0.c()) {
                    if(((PresenceZone)object2).a().isEmpty()) {
                        continue;
                    }
                    davy0 = new davy(discoveryFilter0.a, z, true);
                    goto label_20;
                }
                davy0 = new davy(discoveryFilter0.a, z, false);
            }
            else {
                davy0 = new davy(discoveryFilter0.a, z, true);
            }
        label_20:
            if(discoveryFilter0.a().isEmpty()) {
                for(Object object5: discoveryFilter0.b()) {
                    dawa.b(new PresenceAction(-1), ((PresenceIdentity)object5), davy0, arrayMap0);
                }
            }
            else {
                for(Object object3: discoveryFilter0.a()) {
                    PresenceAction presenceAction0 = (PresenceAction)object3;
                    for(Object object4: discoveryFilter0.b()) {
                        dawa.b(presenceAction0, ((PresenceIdentity)object4), davy0, arrayMap0);
                    }
                }
            }
            __monitor_enter(object0);
        }
        int v = 200;
        __monitor_exit(object0);
        try {
            if(this.E && ((int)hvqn.f()) == 100) {
                v = 100;
            }
            WorkSource workSource0 = this.k;
            int[] arr_v = (int[])Objects.requireNonNull(this.j.a());
            ggfp ggfp0 = ggnj.a;
            if(arr_v != null) {
                ggfn ggfn0 = new ggfn();
                ggfn0.k(ggfp0);
                for(int v1 = 0; v1 < arr_v.length; ++v1) {
                    ggfn0.i(Integer.valueOf(arr_v[v1]));
                }
                ggfp0 = ggfn0.h();
            }
            dawb dawb0 = dawa.a(arrayMap0, workSource0, v, ggfp0);
            if(!this.B.equals(dawb0)) {
                this.B = dawb0;
                this.G.a.B();
                goto label_62;
            }
            goto label_64;
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
    label_62:
        __monitor_exit(object0);
        return true;
    label_64:
        __monitor_exit(object0);
        return false;
    }
}


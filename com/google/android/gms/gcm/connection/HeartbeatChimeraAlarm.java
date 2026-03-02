package com.google.android.gms.gcm.connection;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import bbng;
import bsrb;
import bsrd;
import bsru;
import bsst;
import bssv;
import bssx;
import bstq;
import bsug;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import htgo;
import htgr;
import ibnf;
import ibnh;
import j..time.Duration;
import java.util.Arrays;

@ibnh
public class HeartbeatChimeraAlarm extends TracingBroadcastReceiver {
    static final Duration a;
    public boolean b;
    public long c;
    public final bsrb d;
    public final ibnf e;
    public final bsug f;
    public long g;
    public int h;
    public volatile bsrd i;
    public int j;
    public boolean k;
    public long l;
    long m;
    public long n;
    long o;
    boolean p;
    public final bbng q;
    boolean r;
    public final bstq s;
    private final Context t;
    private final Intent u;

    static {
        HeartbeatChimeraAlarm.a = Duration.ofSeconds(30L);
    }

    public HeartbeatChimeraAlarm(Context context0, bstq bstq0, bsrb bsrb0, bsst bsst0, bbng bbng0, ibnf ibnf0) {
        super("gcm");
        this.b = false;
        this.c = 0L;
        this.m = 0L;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
        Intent intent0 = new Intent("com.google.android.gms.gcm.ACTION_DID_HEARTBEAT");
        this.u = intent0;
        this.r = false;
        this.t = context0;
        this.s = bstq0;
        this.d = bsrb0;
        this.f = bsst0;
        this.q = bbng0;
        this.e = ibnf0;
        intent0.setFlags(0x40000000);
        this.k = false;
        bsst0.i(new bssx(this));
    }

    public final int b() {
        bsrd bsrd0 = this.i;
        int v = bsrd0 == null || !this.j(bsrd0) ? -1 : bsrd0.a();
        return v == -1 || v == this.j ? -1 : v;
    }

    public final long c() {
        long v = htgr.f();
        if(this.r && v > 0L) {
            return v;
        }
        return this.l() ? this.d() + htgr.a.g().i() : this.d();
    }

    public final long d() {
        long v = htgr.d();
        long v1 = (long)this.h;
        if(v1 > 0L && v > v1) {
            v = v1;
        }
        this.i = null;
        int v2 = this.s.b();
        if(HeartbeatChimeraAlarm.k(v2)) {
            bsrd bsrd0 = this.d.b(v2).a(this.t);
            if(bsrd0 != null) {
                this.i = bsrd0;
                return (long)bsrd0.a();
            }
        }
        return v;
    }

    public final void e() {
        bsru bsru0 = (bsru)this.e.get();
        if(!htgo.r() || !bsru0.w()) {
            bsru0.p(false);
        }
        this.f.h();
    }

    public final void f() {
        ibnf ibnf0 = this.e;
        bsru bsru0 = (bsru)ibnf0.get();
        if(htgo.r() && bsru0.w() && this.b) {
            this.l = SystemClock.elapsedRealtime() - this.m;
            if(this.p) {
                this.n();
            }
            this.b = false;
        }
        else if(bsru0.r()) {
            this.l = SystemClock.elapsedRealtime() - this.m;
            bsru0.p(false);
            if(this.p) {
                this.n();
            }
        }
        else if(((bsru)ibnf0.get()).w() && SystemClock.elapsedRealtime() - Math.max(this.n, this.o) > this.d() - HeartbeatChimeraAlarm.a.toMillis()) {
            this.n();
        }
        this.o = SystemClock.elapsedRealtime();
        long v = this.c();
        this.f.g(v);
    }

    // Detected as a lambda impl.
    public final void g() {
        bsru bsru0 = (bsru)this.e.get();
        if(!bsru0.s()) {
            return;
        }
        if(htgo.r() && bsru0.w()) {
            if(this.b) {
                this.n();
                this.b = false;
            }
            this.i(true);
            return;
        }
        if(bsru0.r()) {
            long v = SystemClock.elapsedRealtime();
            long v1 = v - this.m;
            long v2 = htgr.e();
            if(Long.compare(v1, v2) < 0) {
                this.f.g(v2 - v1);
                Log.w("GCM", "Heartbeat alarm fired early: " + v1);
                return;
            }
            Log.w("GCM", "Heartbeat timeout, GCM connection reset " + (this.f.e() - v));
            this.e();
            bsru0.z(6, null);
            this.g = SystemClock.elapsedRealtime();
            return;
        }
        this.i(true);
    }

    public final void h() {
        this.f.a.g();
    }

    public final void i(boolean z) {
        bsru bsru0 = (bsru)this.e.get();
        if(!htgo.r()) {
            long v = (long)bsru0.c();
            this.f.a.c(v);
        }
        this.p = Long.compare(SystemClock.elapsedRealtime(), this.n + this.d()) >= 0;
        bsru0.y();
        this.m = SystemClock.elapsedRealtime();
        if(htgr.a.g().q() && z) {
            this.t.sendBroadcast(this.u);
        }
        if(htgo.r() && bsru0.w()) {
            this.b = true;
            long v1 = this.c();
            this.f.g(v1);
            return;
        }
        bsru0.p(true);
        long v2 = htgr.e();
        this.f.g(v2);
    }

    public final boolean j(bsrd bsrd0) {
        int v = this.s.b();
        return HeartbeatChimeraAlarm.k(v) && bsrd0.a.c == v;
    }

    public static boolean k(int v) {
        return !Arrays.asList(htgr.a.g().l().split(";")).contains(Integer.toString(v));
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        String s = intent0.getAction();
        bsru bsru0 = (bsru)this.e.get();
        if(s == null) {
            if(!Log.isLoggable("GCM", 4)) {
                return;
            }
            Log.i("GCM", "Action not present in HeartbeatAlarm: null");
            return;
        }
        switch(s) {
            case "android.intent.action.SCREEN_OFF": {
                this.r = false;
                return;
            }
            case "android.intent.action.USER_PRESENT": {
                this.r = true;
                break;
            }
            case "com.google.android.gms.gcm.ACTION_HEARTBEAT_NOW": {
                break;
            }
            case "com.google.android.gms.gcm.HEARTBEAT_ALARM": {
                bsru0.n(() -> {
                    bsru bsru0 = (bsru)this.e.get();
                    if(!bsru0.s()) {
                        return;
                    }
                    if(htgo.r() && bsru0.w()) {
                        if(this.b) {
                            this.n();
                            this.b = false;
                        }
                        this.i(true);
                        return;
                    }
                    if(bsru0.r()) {
                        long v = SystemClock.elapsedRealtime();
                        long v1 = v - this.m;
                        long v2 = htgr.e();
                        if(Long.compare(v1, v2) < 0) {
                            this.f.g(v2 - v1);
                            Log.w("GCM", "Heartbeat alarm fired early: " + v1);
                            return;
                        }
                        Log.w("GCM", "Heartbeat timeout, GCM connection reset " + (this.f.e() - v));
                        this.e();
                        bsru0.z(6, null);
                        this.g = SystemClock.elapsedRealtime();
                        return;
                    }
                    this.i(true);
                });
                return;
            }
            case "com.google.android.intent.action.MCS_HEARTBEAT": {
                break;
            }
            default: {
                if(Log.isLoggable("GCM", 4)) {
                    Log.i("GCM", "Unknown intent action in HeartbeatAlarm: " + s);
                }
                return;
            }
        }
        bsru0.n(new bssv(this));
    }

    public final boolean l() {
        return htgr.h() ? ((bsru)this.e.get()).w() : false;
    }

    public final boolean m() {
        bsru bsru0 = (bsru)this.e.get();
        return !htgo.r() || !bsru0.w() ? bsru0.r() : SystemClock.elapsedRealtime() - this.m < htgo.j() + htgo.a.k().Z();
    }

    private final void n() {
        bsrd bsrd0 = this.i;
        if(bsrd0 != null && this.j(bsrd0)) {
            int v = bsrd0.a();
            boolean z = true;
            bsrd0.d(1);
            if(v != bsrd0.a()) {
                z = false;
            }
            this.k = z;
        }
    }
}


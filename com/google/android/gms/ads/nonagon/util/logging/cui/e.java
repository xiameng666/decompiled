package com.google.android.gms.ads.nonagon.util.logging.cui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.report.d;
import gfud;

public final class e implements b {
    public long a;
    public long b;
    public boolean c;
    public int d;
    public final String e;
    public final String f;
    public String g;
    public String h;
    public p i;
    public String j;
    public String k;
    public String l;
    public final int m;
    public int n;
    public int o;
    private final Context p;
    private boolean q;
    private boolean r;

    public e(Context context0, int v) {
        this.a = 0L;
        this.b = -1L;
        this.c = false;
        this.n = 2;
        this.o = 2;
        this.d = 0;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = p.b;
        this.j = "";
        this.k = "";
        this.l = "";
        this.q = false;
        this.r = false;
        this.p = context0;
        this.m = v;
    }

    @Override  // com.google.android.gms.ads.nonagon.util.logging.cui.b
    public final boolean a() {
        synchronized(this) {
        }
        return this.r;
    }

    @Override  // com.google.android.gms.ads.nonagon.util.logging.cui.b
    public final boolean b() {
        return !TextUtils.isEmpty(this.g);
    }

    @Override  // com.google.android.gms.ads.nonagon.util.logging.cui.b
    public final f c() {
        f f0;
        synchronized(this) {
            if(this.q) {
                return null;
            }
            this.q = true;
            if(!this.r) {
                this.s();
            }
            if(this.b < 0L) {
                this.t();
            }
            f0 = new f(this);
        }
        return f0;
    }

    @Override  // com.google.android.gms.ads.nonagon.util.logging.cui.b
    public final void d() {
        this.n();
    }

    @Override  // com.google.android.gms.ads.nonagon.util.logging.cui.b
    public final void e() {
        this.o();
    }

    @Override  // com.google.android.gms.ads.nonagon.util.logging.cui.b
    public final void f(p p0) {
        this.p(p0);
    }

    @Override  // com.google.android.gms.ads.nonagon.util.logging.cui.b
    public final void g(int v) {
        this.u(v);
    }

    @Override  // com.google.android.gms.ads.nonagon.util.logging.cui.b
    public final void h() {
        this.m();
    }

    @Override  // com.google.android.gms.ads.nonagon.util.logging.cui.b
    public final void i(boolean z) {
        this.q(z);
    }

    @Override  // com.google.android.gms.ads.nonagon.util.logging.cui.b
    public final void j(Throwable throwable0) {
        this.r(throwable0);
    }

    @Override  // com.google.android.gms.ads.nonagon.util.logging.cui.b
    public final void k() {
        this.s();
    }

    @Override  // com.google.android.gms.ads.nonagon.util.logging.cui.b
    public final void l() {
        this.t();
    }

    public final void m() {
        synchronized(this) {
            if(((Boolean)s.bp.g()).booleanValue()) {
                this.l = "Failed loading new engine";
            }
        }
    }

    public final void n() {
        synchronized(this) {
            this.g = null;
        }
    }

    public final void o() {
        synchronized(this) {
            this.h = null;
        }
    }

    public final void p(p p0) {
        synchronized(this) {
            this.i = p0;
        }
    }

    public final void q(boolean z) {
        synchronized(this) {
            this.c = z;
        }
    }

    public final void r(Throwable throwable0) {
        synchronized(this) {
            if(((Boolean)s.bp.g()).booleanValue()) {
                this.k = d.d(throwable0);
                String s = d.c(throwable0);
                Object object0 = gfud.e('\n').l(s).iterator().next();
                this.j = (String)object0;
            }
        }
    }

    public final void s() {
        synchronized(this) {
            this.d = ((Boolean)s.bk.g()).booleanValue() ? 0 : ((TelephonyManager)this.p.getSystemService("phone")).getNetworkType();
            Resources resources0 = this.p.getResources();
            int v1 = 2;
            if(resources0 != null) {
                Configuration configuration0 = resources0.getConfiguration();
                if(configuration0 != null) {
                    v1 = configuration0.orientation == 2 ? 4 : 3;
                }
            }
            this.o = v1;
            this.a = SystemClock.elapsedRealtime();
            this.r = true;
        }
    }

    public final void t() {
        synchronized(this) {
            this.b = SystemClock.elapsedRealtime();
        }
    }

    public final void u(int v) {
        synchronized(this) {
            this.n = v;
        }
    }
}


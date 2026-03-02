package com.google.android.gms.ads.internal.js;

import batl;
import com.google.android.gms.ads.internal.util.promise.b;
import com.google.android.gms.ads.internal.util.promise.f;
import com.google.android.gms.ads.internal.util.v;

public final class ag extends f {
    public final v a;
    private final Object c;
    private boolean d;
    private int e;

    public ag(v v0) {
        this.c = new Object();
        this.a = v0;
        this.d = false;
        this.e = 0;
    }

    public final ab a() {
        ab ab0 = new ab(this);
        synchronized(this.c) {
            this.i(new ac(this, ab0), new ad(this, ab0));
            batl.l(this.e >= 0);
            ++this.e;
        }
        return ab0;
    }

    public final void b() {
        synchronized(this.c) {
            batl.l(this.e >= 0);
            this.d = true;
            this.c();
        }
    }

    protected final void c() {
        synchronized(this.c) {
            batl.l(this.e >= 0);
            if(this.d && this.e == 0) {
                this.i(new af(this), new b());
            }
        }
    }

    protected final void d() {
        synchronized(this.c) {
            batl.l(this.e > 0);
            --this.e;
            this.c();
        }
    }
}


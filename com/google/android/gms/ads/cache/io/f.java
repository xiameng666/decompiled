package com.google.android.gms.ads.cache.io;

import j..util.Objects;
import java.io.File;

final class f extends e {
    public int g;
    final g h;
    private final File i;

    public f(g g0, File file0) {
        Objects.requireNonNull(g0);
        this.h = g0;
        super(file0);
        this.i = file0;
        this.g = 1;
    }

    @Override  // com.google.android.gms.ads.cache.io.e
    public final void close() {
        g g0 = this.h;
        synchronized(g0.b) {
            int v1 = this.g - 1;
            this.g = v1;
            if(v1 != 0) {
                return;
            }
            g0.c.remove(this.i);
            super.close();
        }
    }

    @Override  // com.google.android.gms.ads.cache.io.e
    public final void e() {
        synchronized(this.h.b) {
            this.g = 0;
            this.h.c.remove(this.i);
            synchronized(this.a) {
                this.d();
                super.f();
                this.b.delete();
                this.d.close();
                this.d = null;
            }
        }
    }
}


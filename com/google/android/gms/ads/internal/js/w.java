package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.flag.h;
import com.google.android.gms.ads.internal.util.promise.c;
import com.google.android.gms.ads.nonagon.util.logging.cui.b;
import com.google.android.gms.ads.nonagon.util.logging.cui.o;
import j..util.Objects;

final class w implements c {
    final ag a;
    final b b;
    final ah c;

    public w(ah ah0, ag ag0, b b0) {
        this.a = ag0;
        this.b = b0;
        Objects.requireNonNull(ah0);
        this.c = ah0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.util.promise.c
    public final void a(Object object0) {
        k k0 = (k)object0;
        ah ah0 = this.c;
        synchronized(ah0.a) {
            ah0.h = 0;
            ag ag0 = ah0.g;
            if(ag0 != null && this.a != ag0) {
                ag0.b();
            }
            ah0.g = this.a;
            if(((Boolean)h.d.d()).booleanValue()) {
                o o0 = ah0.e;
                if(o0 != null) {
                    this.b.i(true);
                    o0.b(this.b.c());
                }
            }
        }
    }
}


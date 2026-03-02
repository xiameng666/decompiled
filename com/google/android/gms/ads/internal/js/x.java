package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.flag.h;
import com.google.android.gms.ads.internal.util.promise.a;
import com.google.android.gms.ads.nonagon.util.logging.cui.b;
import com.google.android.gms.ads.nonagon.util.logging.cui.o;
import j..util.Objects;

final class x implements a {
    final ag a;
    final b b;
    final ah c;

    public x(ah ah0, ag ag0, b b0) {
        this.a = ag0;
        this.b = b0;
        Objects.requireNonNull(ah0);
        this.c = ah0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.util.promise.a
    public final void a() {
        ah ah0 = this.c;
        synchronized(ah0.a) {
            ah0.h = 1;
            this.a.b();
            if(((Boolean)h.d.d()).booleanValue()) {
                o o0 = ah0.e;
                if(o0 != null) {
                    this.b.h();
                    this.b.i(false);
                    o0.b(this.b.c());
                }
            }
        }
    }
}


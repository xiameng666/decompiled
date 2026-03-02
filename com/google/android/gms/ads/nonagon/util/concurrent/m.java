package com.google.android.gms.ads.nonagon.util.concurrent;

import com.google.android.gms.ads.nonagon.util.event.b;
import com.google.android.gms.ads.nonagon.util.event.c;
import gmbg;
import j..util.Objects;

final class m implements gmbg {
    final h a;
    final n b;

    public m(n n0, h h0) {
        this.a = h0;
        Objects.requireNonNull(n0);
        this.b = n0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        b b0 = new b(this.a);
        this.b.a.b.d(b0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        c c0 = new c(this.a);
        this.b.a.b.d(c0);
    }
}


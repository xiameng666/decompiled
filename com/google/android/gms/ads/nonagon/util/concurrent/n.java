package com.google.android.gms.ads.nonagon.util.concurrent;

import com.google.android.gms.ads.internal.util.future.e;
import com.google.android.gms.ads.nonagon.util.event.a;
import com.google.android.gms.ads.nonagon.util.event.d;
import glzd;
import glzn;
import gmbu;
import gmcd;
import j..util.Objects;
import java.util.List;

public final class n {
    public final o a;
    private final Object b;
    private final gmcd c;
    private final List d;
    private final gmcd e;

    public n(o o0, Object object0, gmcd gmcd0, List list0, gmcd gmcd1) {
        Objects.requireNonNull(o0);
        this.a = o0;
        super();
        this.b = object0;
        this.c = gmcd0;
        this.d = list0;
        this.e = gmcd1;
    }

    public final h a() {
        h h0 = new h(this.b, ((a)this.b).B, this.e);
        d d0 = new d();
        this.a.b.d(d0);
        l l0 = new l(this, h0);
        this.c.hB(l0, e.d);
        gmbu.t(h0, new m(this, h0), e.d);
        return h0;
    }

    public final n b(g g0) {
        return this.c(new k(g0));
    }

    public final n c(glzn glzn0) {
        gmcd gmcd0 = glzd.g(this.e, glzn0, this.a.a);
        return new n(this.a, this.b, this.c, this.d, gmcd0);
    }
}


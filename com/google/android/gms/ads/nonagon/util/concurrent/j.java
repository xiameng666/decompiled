package com.google.android.gms.ads.nonagon.util.concurrent;

import com.google.android.gms.ads.internal.util.future.e;
import gmbl;
import gmbu;
import gmcd;
import j..util.Objects;
import java.util.List;
import java.util.concurrent.Callable;

public final class j {
    final o a;
    private final Object b;
    private final List c;

    public j(o o0, Object object0, List list0) {
        Objects.requireNonNull(o0);
        this.a = o0;
        super();
        this.b = object0;
        this.c = list0;
    }

    public final n a(Callable callable0) {
        gmbl gmbl0 = gmbu.c(this.c);
        gmcd gmcd0 = gmbl0.a(new i(), e.d);
        gmcd gmcd1 = gmbl0.a(callable0, this.a.a);
        return new n(this.a, this.b, gmcd0, this.c, gmcd1);
    }
}


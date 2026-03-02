package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import j..util.DesugarCollections;
import java.util.List;
import java.util.Set;

public final class bo {
    public final List a;
    public final Set b;
    public final Bundle c;
    public final int d;
    public final Set e;
    public final Bundle f;
    public final Set g;
    public final boolean h;
    public long i;

    public bo(bn bn0) {
        this.i = 0L;
        this.a = bn0.g;
        this.b = DesugarCollections.unmodifiableSet(bn0.a);
        this.c = bn0.b;
        DesugarCollections.unmodifiableMap(bn0.c);
        this.d = bn0.h;
        this.e = DesugarCollections.unmodifiableSet(bn0.d);
        this.f = bn0.e;
        this.g = DesugarCollections.unmodifiableSet(bn0.f);
        this.h = bn0.i;
    }
}


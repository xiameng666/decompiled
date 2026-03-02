package com.google.android.gms.ads.nonagon.util.concurrent;

import gmcd;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class h implements gmcd {
    public final Object a;
    public final String b;
    private final gmcd c;

    public h(Object object0, String s, gmcd gmcd0) {
        this.a = object0;
        this.b = s;
        this.c = gmcd0;
    }

    @Override
    public final boolean cancel(boolean z) {
        return this.c.cancel(z);
    }

    @Override
    public final Object get() {
        return this.c.get();
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) {
        return this.c.get(v, timeUnit0);
    }

    @Override  // gmcd
    public final void hB(Runnable runnable0, Executor executor0) {
        this.c.hB(runnable0, executor0);
    }

    @Override
    public final boolean isCancelled() {
        return this.c.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.c.isDone();
    }

    @Override
    public final String toString() {
        return this.b + "@" + System.identityHashCode(this);
    }
}


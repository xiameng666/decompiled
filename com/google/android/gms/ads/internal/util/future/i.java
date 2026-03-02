package com.google.android.gms.ads.internal.util.future;

import com.google.android.gms.ads.internal.c;
import gmcd;
import gmcu;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class i implements gmcd {
    private final gmcu a;

    public i() {
        this.a = new gmcu();
    }

    public final void a(Object object0) {
        i.d(this.a.q(object0));
    }

    public final void c(Throwable throwable0) {
        i.d(this.a.r(throwable0));
    }

    @Override
    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    private static final void d(boolean z) {
        if(!z) {
            c.d().b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
    }

    @Override
    public final Object get() {
        return this.a.u();
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) {
        return this.a.v(v, timeUnit0);
    }

    @Override  // gmcd
    public final void hB(Runnable runnable0, Executor executor0) {
        this.a.hB(runnable0, executor0);
    }

    @Override
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.a.isDone();
    }
}


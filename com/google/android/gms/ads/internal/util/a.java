package com.google.android.gms.ads.internal.util;

import j..util.Objects;

final class a implements Runnable {
    final b a;

    public a(b b0) {
        Objects.requireNonNull(b0);
        this.a = b0;
        super();
    }

    @Override
    public final void run() {
        this.a.b = Thread.currentThread();
        this.a.a();
    }
}


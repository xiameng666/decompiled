package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.future.e;
import gmcd;

public abstract class b {
    private final Runnable a;
    public volatile Thread b;

    public b() {
        this.a = new a(this);
    }

    public abstract void a();

    public final gmcd b() {
        return e.a.d(this.a);
    }
}


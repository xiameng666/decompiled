package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.util.promise.c;
import j..util.Objects;

final class z implements c {
    final ab a;

    public z(ab ab0) {
        Objects.requireNonNull(ab0);
        this.a = ab0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.util.promise.c
    public final void a(Object object0) {
        ai ai0 = (ai)object0;
        this.a.a.d();
    }
}


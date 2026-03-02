package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.util.promise.b;
import com.google.android.gms.ads.internal.util.promise.f;

public final class ab extends f {
    public final ag a;
    private final Object c;
    private boolean d;

    public ab(ag ag0) {
        this.c = new Object();
        this.a = ag0;
    }

    public final void a() {
        synchronized(this.c) {
            if(this.d) {
                return;
            }
            this.d = true;
            this.i(new y(this), new b());
            this.i(new z(this), new aa(this));
        }
    }
}


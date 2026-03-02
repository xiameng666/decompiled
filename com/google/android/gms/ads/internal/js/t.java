package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.gmsg.e;
import com.google.android.gms.ads.internal.util.af;
import com.google.android.gms.ads.internal.util.client.h;
import j..util.Objects;
import java.util.Map;

final class t implements e {
    final af a;
    final ah b;
    final k c;

    public t(ah ah0, k k0, af af0) {
        this.c = k0;
        this.a = af0;
        Objects.requireNonNull(ah0);
        this.b = ah0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.gmsg.e
    public final void a(Object object0, Map map0) {
        ai ai0 = (ai)object0;
        ah ah0 = this.b;
        synchronized(ah0.a) {
            h.i("JS Engine is requesting an update");
            if(ah0.h == 0) {
                h.i("Starting reload.");
                ah0.h = 2;
                ah0.a();
            }
            this.c.g("/requestReload", ((e)this.a.a));
        }
    }
}


package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.gmsg.d;
import com.google.android.gms.ads.internal.gmsg.e;
import j..util.Objects;
import java.util.Map;
import jeb.synthetic.FIN;

final class s implements e {
    final ag a;
    final ah b;
    final k c;

    public s(ah ah0, ag ag0, k k0) {
        this.a = ag0;
        this.c = k0;
        Objects.requireNonNull(ah0);
        this.b = ah0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.gmsg.e
    public final void a(Object object0, Map map0) {
        ai ai0 = (ai)object0;
        ah ah0 = this.b;
        Object object1 = ah0.a;
        __monitor_enter(object1);
        int v = FIN.finallyOpen$NT();
        ag ag0 = this.a;
        switch(ag0.e()) {
            case -1: 
            case 1: {
                FIN.finallyExec$NT(v);
                return;
            }
            default: {
                ah0.h = 0;
                this.c.f("/log", d.a);
                this.c.f("/result", d.b);
                ag0.h(this.c);
                ah0.g = ag0;
                FIN.finallyCodeBegin$NT(v);
            }
        }
    }
}


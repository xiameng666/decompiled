package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.util.future.e;
import j..util.Objects;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import jeb.synthetic.FIN;

final class v implements Runnable {
    final ag a;
    final ArrayList b;
    final ah c;
    final k d;

    public v(ah ah0, ag ag0, k k0, ArrayList arrayList0) {
        this.a = ag0;
        this.d = k0;
        this.b = arrayList0;
        Objects.requireNonNull(ah0);
        this.c = ah0;
        super();
    }

    @Override
    public final void run() {
        Object object0 = this.c.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        ag ag0 = this.a;
        switch(ag0.e()) {
            case -1: 
            case 1: {
                FIN.finallyExec$NT(v);
                return;
            }
            default: {
                if(((Boolean)s.ba.g()).booleanValue()) {
                    ag0.g(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                }
                else {
                    ag0.f();
                }
                Objects.requireNonNull(this.d);
                u u0 = new u(this.d);
                e.c.execute(u0);
                s.d.g();
                ag0.e();
                ArrayList arrayList0 = this.b;
                if(!arrayList0.isEmpty()) {
                    arrayList0.get(0);
                }
                FIN.finallyCodeBegin$NT(v);
            }
        }
    }
}


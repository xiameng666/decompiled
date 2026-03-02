package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.util.future.e;
import j..util.Objects;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import jeb.synthetic.FIN;

public final class o implements Runnable {
    public final ah a;
    public final ag b;
    public final ArrayList c;
    public final k d;

    public o(ah ah0, ag ag0, k k0, ArrayList arrayList0) {
        this.a = ah0;
        this.b = ag0;
        this.d = k0;
        this.c = arrayList0;
    }

    @Override
    public final void run() {
        ag ag0 = this.b;
        k k0 = this.d;
        ArrayList arrayList0 = this.c;
        Object object0 = this.a.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        switch(ag0.e()) {
            case -1: 
            case 1: {
                FIN.finallyExec$NT(v);
                return;
            }
            default: {
                if(((Boolean)s.ba.g()).booleanValue()) {
                    ag0.g(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                }
                else {
                    ag0.f();
                }
                Objects.requireNonNull(k0);
                m m0 = new m(k0);
                e.c.execute(m0);
                s.c.g();
                ag0.e();
                arrayList0.get(0);
                FIN.finallyCodeBegin$NT(v);
            }
        }
    }
}


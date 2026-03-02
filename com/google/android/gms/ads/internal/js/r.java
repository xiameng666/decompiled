package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.util.af;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.util.m;
import j..util.Objects;
import java.util.ArrayList;

public final class r implements Runnable {
    public final ah a;
    public final ag b;

    public r(ah ah0, ag ag0) {
        this.a = ah0;
        this.b = ag0;
    }

    @Override
    public final void run() {
        k k0;
        long v = System.currentTimeMillis();
        ArrayList arrayList0 = new ArrayList();
        ah ah0 = this.a;
        ag ag0 = this.b;
        try {
            k0 = new k(ah0.b, ah0.d);
        }
        catch(Throwable throwable0) {
            h.h("Error creating webview.", throwable0);
            if(((Boolean)s.ba.g()).booleanValue()) {
                ag0.g(throwable0, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if(((Boolean)s.bc.g()).booleanValue()) {
                c.d().b(throwable0, "SdkJavascriptFactory.loadJavascriptEngine");
                ag0.f();
                return;
            }
            c.d().c(throwable0, "SdkJavascriptFactory.loadJavascriptEngine");
            ag0.f();
            return;
        }
        n n0 = new n(ah0, arrayList0, v, ag0, k0);
        com.google.android.gms.ads.internal.webview.n n1 = k0.a.m();
        Objects.requireNonNull(n0);
        n1.e = new f(n0);
        k0.f("/jsLoaded", new com.google.android.gms.ads.internal.js.s(ah0, ag0, k0));
        af af0 = new af();
        t t0 = new t(ah0, k0, af0);
        af0.a = t0;
        k0.f("/requestReload", t0);
        String s = ah0.c;
        if(s.endsWith(".js")) {
            k.h(new i(k0, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", s)));
        }
        else if(s.startsWith("<html>")) {
            k.h(new com.google.android.gms.ads.internal.js.h(k0, s));
        }
        else {
            k.h(new e(k0, s));
        }
        v v1 = new v(ah0, ag0, k0, arrayList0);
        long v2 = (long)(((int)(((Integer)s.d.g()))));
        m.a.postDelayed(v1, v2);
    }
}


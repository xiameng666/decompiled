package com.google.android.gms.ads.internal.js.function;

import com.google.android.gms.ads.internal.js.ab;
import com.google.android.gms.ads.internal.js.ag;
import com.google.android.gms.ads.internal.js.ah;
import com.google.android.gms.ads.internal.js.p;
import com.google.android.gms.ads.internal.js.q;
import com.google.android.gms.ads.internal.util.future.i;
import glzn;
import gmcd;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class o implements glzn {
    public final c a;
    public final d b;
    public final String c;
    private final ah d;

    public o(ah ah0, String s, d d0, c c0) {
        this.d = ah0;
        this.c = s;
        this.b = d0;
        this.a = c0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        return this.b(object0);
    }

    public final gmcd b(Object object0) {
        ab ab0;
        gmcd gmcd0 = new i();
        ah ah0 = this.d;
        Object object1 = ah0.a;
        synchronized(object1) {
            __monitor_enter(object1);
        }
        ag ag0 = ah0.g;
        if(ag0 != null && ah0.h == 0) {
            try {
                ag0.i(new p(ah0), new q());
            }
            catch(Throwable throwable1) {
                try {
                    __monitor_exit(object1);
                    throw throwable1;
                }
                catch(Throwable throwable0) {
                    __monitor_exit(object1);
                    throw throwable0;
                }
            }
        }
        __monitor_exit(object1);
        try {
            if(ah0.g != null && ah0.g.e() != -1) {
                switch(ah0.h) {
                    case 0: {
                        ab0 = ah0.g.a();
                        break;
                    }
                    case 1: {
                        ah0.h = 2;
                        ah0.a();
                        ab0 = ah0.g.a();
                        break;
                    }
                    default: {
                        ab0 = ah0.g.a();
                    }
                }
            }
            else {
                ah0.h = 2;
                ah0.g = ah0.a();
                ab0 = ah0.g.a();
            }
        }
        catch(Throwable throwable0) {
            __monitor_exit(object1);
            throw throwable0;
        }
        __monitor_exit(object1);
        ab0.i(new l(this, ab0, object0, ((i)gmcd0)), new m(this, ((i)gmcd0), ab0));
        return gmcd0;
    }

    public final Object c(Object object0, long v) {
        try {
            return this.b(object0).get(v, TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            throw new a(interruptedException0);
        }
        catch(CancellationException | ExecutionException | TimeoutException exception0) {
            throw new a(exception0);
        }
    }
}


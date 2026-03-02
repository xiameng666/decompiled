package com.google.android.gms.ads.nonagon.ad.event;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class c {
    protected final Map a;

    public c(Set set0) {
        this.a = new HashMap();
        this.c(set0);
    }

    public final void a(d d0) {
        synchronized(this) {
            this.b(d0.a, d0.b);
        }
    }

    public final void b(Object object0, Executor executor0) {
        synchronized(this) {
            this.a.put(object0, executor0);
        }
    }

    public final void c(Set set0) {
        synchronized(this) {
            for(Object object0: set0) {
                this.a(((d)object0));
            }
        }
    }

    public final void d(b b0) {
        synchronized(this) {
            for(Object object0: this.a.entrySet()) {
                Object object1 = ((Map.Entry)object0).getKey();
                ((Executor)((Map.Entry)object0).getValue()).execute(new a(b0, object1));
            }
        }
    }
}


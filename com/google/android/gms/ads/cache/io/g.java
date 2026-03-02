package com.google.android.gms.ads.cache.io;

import bzs;
import java.io.File;

public final class g {
    public static final g a;
    public final Object b;
    public final bzs c;

    static {
        g.a = new g();
    }

    public g() {
        this.b = new Object();
        this.c = new bzs();
    }

    public final e a(File file0) {
        e e0;
        File file1 = file0.getCanonicalFile();
        synchronized(this.b) {
            bzs bzs0 = this.c;
            e0 = (f)bzs0.get(file1);
            if(e0 == null) {
                e0 = new f(this, file1);
                bzs0.put(file1, e0);
            }
            else {
                synchronized(e0.h.b) {
                    ++e0.g;
                }
            }
        }
        return e0;
    }
}


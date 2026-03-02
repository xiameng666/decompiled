package com.google.android.gms.ads.social;

import hopm;
import java.util.concurrent.Callable;

public final class l implements Callable {
    public final GmsDoritosProvider a;
    public final String b;

    public l(GmsDoritosProvider gmsDoritosProvider0, String s) {
        this.a = gmsDoritosProvider0;
        this.b = s;
    }

    @Override
    public final Object call() {
        return !hopm.j() || !u.b(this.a.a, this.b) ? a.a : a.b;
    }
}


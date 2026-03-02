package com.google.android.gms.ads.nonagon.adapter;

import ibnh;
import java.util.HashMap;
import java.util.Map;

@ibnh
public final class b {
    private final Map a;

    public b() {
        this.a = new HashMap();
    }

    public final void a(String s) {
        synchronized(this) {
            a a0 = (a)this.a.get(s);
        }
    }
}


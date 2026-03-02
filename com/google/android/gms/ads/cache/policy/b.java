package com.google.android.gms.ads.cache.policy;

import bata;
import bxd;
import bzs;
import com.google.android.gms.ads.cache.s;
import com.google.android.gms.ads.internal.js.function.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class b {
    public static final e a;
    private Map b;

    static {
        b.a = new a();
    }

    public b() {
        this.b = new bxd();
    }

    public b(b b0) {
        this.b = new bxd(((bzs)b0.b).d_num);
        for(Object object0: b0.b.entrySet()) {
            ArrayList arrayList0 = new ArrayList(((List)((Map.Entry)object0).getValue()));
            this.b.put(((String)((Map.Entry)object0).getKey()), arrayList0);
        }
    }

    public b(Map map0) {
        this.b = map0;
    }

    public final List a(String s) {
        List list0 = (List)this.b.get(s);
        return list0 == null ? new ArrayList() : list0;
    }

    public final Set b() {
        return this.b.keySet();
    }

    public final void c(s s0) {
        String s1 = s0.c;
        List list0 = (List)this.b.get(s1);
        if(list0 == null) {
            list0 = new ArrayList();
            this.b.put(s1, list0);
        }
        list0.add(s0);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof b) ? bata.b(this.b, ((b)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final String toString() {
        return this.b.toString();
    }
}


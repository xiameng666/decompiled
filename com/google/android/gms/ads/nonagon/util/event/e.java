package com.google.android.gms.ads.nonagon.util.event;

import com.google.android.gms.ads.nonagon.ad.event.b;
import com.google.android.gms.ads.nonagon.clearcut.l;
import com.google.android.gms.ads.nonagon.clearcut.m;
import com.google.android.gms.ads.nonagon.util.concurrent.h;
import java.util.Map;

public final class e implements b {
    public final h a;

    public e(h h0) {
        this.a = h0;
    }

    @Override  // com.google.android.gms.ads.nonagon.ad.event.b
    public final void a(Object object0) {
        Map map0 = ((m)object0).a;
        Object object1 = this.a.a;
        if(map0.containsKey(object1)) {
            int v = ((l)map0.get(object1)).a;
            ((m)object0).b.b(v);
        }
    }
}


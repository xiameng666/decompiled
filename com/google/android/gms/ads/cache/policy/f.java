package com.google.android.gms.ads.cache.policy;

import a;
import batl;
import bxd;
import com.google.android.gms.ads.cache.h;
import com.google.android.gms.ads.cache.m;
import com.google.android.gms.ads.cache.p;
import com.google.android.gms.ads.cache.q;
import com.google.android.gms.ads.cache.r;
import com.google.android.gms.ads.cache.s;
import gfta;
import java.util.List;
import java.util.Map;

public final class f {
    public static Map a(List list0) {
        String s6;
        Map map0 = new bxd();
        for(Object object0: list0) {
            String s = ((s)object0).c;
            m m0 = ((s)object0).d;
            if(m0 == null) {
                m0 = m.a;
            }
            String s1 = m0.c;
            m m1 = ((s)object0).d;
            if(m1 == null) {
                m1 = m.a;
            }
            String s2 = m1.d;
            r r0 = ((s)object0).e;
            if(r0 == null) {
                r0 = r.a;
            }
            String s3 = r0.c;
            q q0 = ((s)object0).f;
            if(q0 == null) {
                q0 = q.a;
            }
            String s4 = null;
            for(Object object1: q0.c) {
                p p0 = (p)object1;
                if(p0.c.equals("check_url")) {
                    s4 = p0.d;
                    break;
                }
            }
            if(((Boolean)com.google.android.gms.ads.internal.config.s.as.g()).booleanValue() && (s3 != null || s4 != null)) {
                String s5 = gfta.c(s3) ? h.b(s4) : h.b(s3);
                if(s5 == null) {
                    s6 = h.a(s, s1, s2);
                }
                else {
                    batl.s(s);
                    batl.s(s1);
                    batl.s(s2);
                    s6 = a.ar(s5, s2, new StringBuilder(), s1, s);
                }
            }
            else {
                s6 = h.a(s, s1, s2);
            }
            map0.put(s6, ((s)object0));
        }
        return map0;
    }
}


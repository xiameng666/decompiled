package com.google.android.gms.people.cpg.model;

import aef;
import aen;
import aeq;
import aes;
import aeu;
import aew;
import aez;
import afa;
import gged_interceptors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ..__AppSearch__GroupContactOrder implements aeu {
    @Override  // aeu
    public final aes a() {
        aef aef0 = new aef("cpg:GroupContactOrder");
        aen aen0 = new aen("order");
        aen0.b(1);
        aen0.c(0);
        aef0.c(aen0.a());
        aeq aeq0 = new aeq("dirty");
        aeq0.b(2);
        aeq0.e(1);
        aeq0.c(1);
        aeq0.d(0);
        aef0.c(aeq0.a());
        aen aen1 = new aen("docVersion");
        aen1.b(2);
        aen1.c(0);
        aef0.c(aen1.a());
        return aef0.a();
    }

    @Override  // aeu
    public final afa b(Object object0) {
        aez aez0 = new aez(((GroupContactOrder)object0).a, ((GroupContactOrder)object0).b, "cpg:GroupContactOrder");
        gged_interceptors gged0 = ((GroupContactOrder)object0).b();
        if(gged0 != null) {
            long[] arr_v = new long[gged0.size()];
            int v = gged0.size();
            int v1 = 0;
            for(int v2 = 0; v1 < v; ++v2) {
                arr_v[v2] = (long)(((Long)gged0.get(v1)));
                ++v1;
            }
            aez0.k("order", arr_v);
        }
        String s = ((GroupContactOrder)object0).d;
        if(s != null) {
            aez0.b("dirty", new String[]{s});
        }
        long v3 = ((GroupContactOrder)object0).a();
        Long.valueOf(v3).getClass();
        aez0.k("docVersion", new long[]{v3});
        return aez0.e();
    }

    @Override  // aeu
    public final Object c(afa afa0, aew aew0) {
        ArrayList arrayList0;
        String s = afa0.l();
        String s1 = afa0.k();
        long[] arr_v = afa0.s("order");
        Long long0 = null;
        if(arr_v == null) {
            arrayList0 = null;
        }
        else {
            arrayList0 = new ArrayList(arr_v.length);
            for(int v = 0; v < arr_v.length; ++v) {
                arrayList0.add(Long.valueOf(arr_v[v]));
            }
        }
        String[] arr_s = afa0.u("dirty");
        String s2 = arr_s == null || arr_s.length == 0 ? null : arr_s[0];
        long[] arr_v1 = afa0.s("docVersion");
        if(arr_v1 != null && arr_v1.length != 0) {
            long0 = (long)arr_v1[0];
        }
        return new GroupContactOrder(s1, s, arrayList0, s2, long0);
    }

    @Override  // aeu
    public final String d() {
        return "cpg:GroupContactOrder";
    }

    @Override  // aeu
    public final List e() {
        return Collections.EMPTY_LIST;
    }
}


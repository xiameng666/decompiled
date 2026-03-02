import android.content.Context;
import android.util.ArrayMap;
import android.util.ArraySet;
import j..util.Map.-EL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class ffod {
    final Map a;
    final Set b;
    final Set c;
    final Set d;
    final Set e;
    final Set f;
    final Map g;
    final Map h;
    final ffoc i;
    final gghp j;
    final gghp k;
    final gghp l;
    final gghp m;
    final gghp n;
    final gghp o;
    final gghp p;
    final gghp q;
    final gghp r;
    final gghp s;
    final Map t;
    boolean u;
    final gghp v;
    final Context w;
    final boolean x;
    final ayvf y;
    public static final int z;

    static {
        bboh.b("WestworldMultiMerge", bbcu.ea);
    }

    public ffod(Context context0, ayvf ayvf0, ffoc ffoc0) {
        this.a = new HashMap();
        this.b = ffnp.b(iabs.i());
        this.c = ffnp.b(iabs.h());
        this.d = ffnp.b(iabs.g());
        this.e = ffnp.b(iabs.j());
        this.f = new ArraySet();
        this.g = new ArrayMap();
        this.h = new ArrayMap();
        this.j = new gfza();
        this.k = new gfza();
        this.l = new gfza();
        this.m = new gfza(3, 100);
        this.n = new gfza();
        this.o = new gfza();
        this.p = new gfza();
        this.q = new gfza();
        this.r = new gfza();
        this.s = new gfza();
        this.t = new ArrayMap();
        this.u = false;
        this.v = new gfza();
        this.w = context0;
        this.i = ffoc0;
        azts azts0 = new azts(context0, new faig());
        this.x = !ffoz.n(context0) || !ffoz.l(azts0) ? ffoz.m(azts0) : true;
        this.y = ayvf0;
        this.u = iacm.i();
    }

    final void a(long v, rfi rfi0) {
        Map map0 = this.g;
        Long long0 = v;
        int v1 = map0.containsKey(long0) ? ((Boolean)map0.get(long0)).booleanValue() : 1;
        map0.put(long0, Boolean.valueOf(((boolean)((ffoz.i(v) ^ 1) & v1 & rfi0.v))));
    }

    final void b(long v, rfi rfi0) {
        Map map0 = this.h;
        Long long0 = v;
        int v1 = Math.max((map0.containsKey(long0) ? ((int)(((Integer)map0.get(long0)))) : 0), rfi0.C);
        if(v1 > 0) {
            map0.put(long0, Integer.valueOf(v1));
        }
    }

    final void c(rfi rfi0) {
        rew rew0 = rew.a;
        if(this.i(rew0) && rfi0.p.size() != 0) {
            long v = iabs.b();
            this.f(v);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)this.a.get(Long.valueOf(v));
            this.g(v, rfi0);
            for(Object object0: rfi0.p) {
                reh reh0 = (reh)object0;
                Set set0 = this.d;
                if(ffod.j(set0, reh0.b, this.n.g(Long.valueOf(v)))) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    rfi rfi1 = (rfi)hftp0.b_message;
                    reh0.getClass();
                    hfuo hfuo0 = rfi1.p;
                    if(!hfuo0.c()) {
                        rfi1.p = ProtoLiteMessage.E(hfuo0);
                    }
                    rfi1.p.add(reh0);
                }
                if(!set0.contains(Long.valueOf(reh0.b))) {
                    for(Object object1: this.i.k.g(Long.valueOf(reh0.b))) {
                        rfl rfl0 = (rfl)object1;
                        if(ffod.j(this.e, rfl0.b, this.o.g(Long.valueOf(v)))) {
                            hftp0.ab(rfl0);
                        }
                    }
                }
            }
        }
        for(Object object2: rfi0.f) {
            req req0 = (req)object2;
            for(Object object3: ffoz.g((req0.g == null ? rew0 : req0.g))) {
                Long long0 = (Long)object3;
                Set set1 = this.b;
                if(this.l(set1, req0.c, (req0.g == null ? rew0 : req0.g), this.m.g(long0), rfi0.s, this.r.g(long0))) {
                    this.f(long0.longValue());
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)this.a.get(long0);
                    if(this.k(req0.c, long0.longValue())) {
                        this.m(hftp1, req0.d, rfi0.c);
                        if((req0.b & 4) != 0) {
                            this.o(hftp1, req0.e, rfi0.c);
                        }
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        rfi rfi2 = (rfi)hftp1.b_message;
                        req0.getClass();
                        hfuo hfuo1 = rfi2.f;
                        if(!hfuo1.c()) {
                            rfi2.f = ProtoLiteMessage.E(hfuo1);
                        }
                        rfi2.f.add(req0);
                        this.n(hftp1, req0.c, rfi0.c);
                        if(req0.h) {
                            this.f.add(long0);
                        }
                        if(iacm.e()) {
                            this.e(rfi0.c, long0.longValue(), req0.f);
                        }
                        if(this.u && rfi0.H) {
                            ffnw ffnw0 = new ffnw();
                            ((Set)Map.-EL.computeIfAbsent(this.t, long0, ffnw0)).add(Long.valueOf(req0.c));
                        }
                    }
                    this.a(long0.longValue(), rfi0);
                    this.b(long0.longValue(), rfi0);
                }
                if(!set1.contains(Long.valueOf(req0.c)) && this.i((req0.g == null ? rew0 : req0.g))) {
                    this.g(long0.longValue(), rfi0);
                    this.d(rfi0.c, long0.longValue(), req0.c);
                }
            }
        }
        for(Object object4: rfi0.g) {
            ren ren0 = (ren)object4;
            for(Object object5: ffoz.g((ren0.g == null ? rew0 : ren0.g))) {
                Long long1 = (Long)object5;
                Set set2 = this.b;
                if(this.l(set2, ren0.c, (ren0.g == null ? rew0 : ren0.g), this.m.g(long1), rfi0.s, this.r.g(long1))) {
                    this.f(long1.longValue());
                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)this.a.get(long1);
                    if(this.k(ren0.c, long1.longValue())) {
                        this.m(hftp2, ren0.d, rfi0.c);
                        if((ren0.b & 4) != 0) {
                            this.o(hftp2, ren0.e, rfi0.c);
                        }
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        rfi rfi3 = (rfi)hftp2.b_message;
                        ren0.getClass();
                        hfuo hfuo2 = rfi3.g;
                        if(!hfuo2.c()) {
                            rfi3.g = ProtoLiteMessage.E(hfuo2);
                        }
                        rfi3.g.add(ren0);
                        this.n(hftp2, ren0.c, rfi0.c);
                        if(ren0.h) {
                            this.f.add(long1);
                        }
                        this.e(rfi0.c, long1.longValue(), ren0.f);
                        if(this.u && rfi0.H) {
                            ffob ffob0 = new ffob();
                            ((Set)Map.-EL.computeIfAbsent(this.t, long1, ffob0)).add(Long.valueOf(ren0.c));
                        }
                    }
                    this.a(long1.longValue(), rfi0);
                    this.b(long1.longValue(), rfi0);
                }
                if(!set2.contains(Long.valueOf(ren0.c)) && this.i((ren0.g == null ? rew0 : ren0.g))) {
                    this.g(long1.longValue(), rfi0);
                    this.d(rfi0.c, long1.longValue(), ren0.c);
                }
            }
        }
        for(Object object6: rfi0.j) {
            reo reo0 = (reo)object6;
            for(Object object7: ffoz.g((reo0.g == null ? rew0 : reo0.g))) {
                Long long2 = (Long)object7;
                Set set3 = this.b;
                if(this.l(set3, reo0.c, (reo0.g == null ? rew0 : reo0.g), this.m.g(long2), rfi0.s, this.r.g(long2))) {
                    this.f(long2.longValue());
                    ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)this.a.get(long2);
                    if(this.k(reo0.c, long2.longValue())) {
                        this.o(hftp3, reo0.d, rfi0.c);
                        if((reo0.b & 4) != 0) {
                            this.o(hftp3, reo0.e, rfi0.c);
                        }
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        rfi rfi4 = (rfi)hftp3.b_message;
                        reo0.getClass();
                        hfuo hfuo3 = rfi4.j;
                        if(!hfuo3.c()) {
                            rfi4.j = ProtoLiteMessage.E(hfuo3);
                        }
                        rfi4.j.add(reo0);
                        this.n(hftp3, reo0.c, rfi0.c);
                        if(reo0.h) {
                            this.f.add(long2);
                        }
                        this.e(rfi0.c, long2.longValue(), reo0.f);
                        if(this.u && rfi0.H) {
                            ffnz ffnz0 = new ffnz();
                            ((Set)Map.-EL.computeIfAbsent(this.t, long2, ffnz0)).add(Long.valueOf(reo0.c));
                        }
                    }
                    this.a(long2.longValue(), rfi0);
                    this.b(long2.longValue(), rfi0);
                }
                if(!set3.contains(Long.valueOf(reo0.c)) && this.i((reo0.g == null ? rew0 : reo0.g))) {
                    this.g(long2.longValue(), rfi0);
                    this.d(rfi0.c, long2.longValue(), reo0.c);
                }
            }
        }
        for(Object object8: rfi0.h) {
            rfm rfm0 = (rfm)object8;
            for(Object object9: ffoz.g((rfm0.g == null ? rew0 : rfm0.g))) {
                Long long3 = (Long)object9;
                Set set4 = this.b;
                if(this.l(set4, rfm0.c, (rfm0.g == null ? rew0 : rfm0.g), this.m.g(long3), rfi0.s, this.r.g(long3))) {
                    this.f(long3.longValue());
                    ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)this.a.get(long3);
                    if(this.k(rfm0.c, long3.longValue())) {
                        this.m(hftp4, rfm0.d, rfi0.c);
                        if((rfm0.b & 8) != 0) {
                            this.o(hftp4, rfm0.e, rfi0.c);
                        }
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        rfi rfi5 = (rfi)hftp4.b_message;
                        rfm0.getClass();
                        hfuo hfuo4 = rfi5.h;
                        if(!hfuo4.c()) {
                            rfi5.h = ProtoLiteMessage.E(hfuo4);
                        }
                        rfi5.h.add(rfm0);
                        this.n(hftp4, rfm0.c, rfi0.c);
                        if(rfm0.h) {
                            this.f.add(long3);
                        }
                        this.e(rfi0.c, long3.longValue(), rfm0.f);
                        if(this.u && rfi0.H) {
                            ffnx ffnx0 = new ffnx();
                            ((Set)Map.-EL.computeIfAbsent(this.t, long3, ffnx0)).add(Long.valueOf(rfm0.c));
                        }
                    }
                    this.a(long3.longValue(), rfi0);
                    this.b(long3.longValue(), rfi0);
                }
                if(!set4.contains(Long.valueOf(rfm0.c)) && this.i((rfm0.g == null ? rew0 : rfm0.g))) {
                    this.g(long3.longValue(), rfi0);
                    this.d(rfi0.c, long3.longValue(), rfm0.c);
                }
            }
        }
        for(Object object10: rfi0.i) {
            ret ret0 = (ret)object10;
            for(Object object11: ffoz.g((ret0.h == null ? rew0 : ret0.h))) {
                Long long4 = (Long)object11;
                Set set5 = this.b;
                if(this.l(set5, ret0.c, (ret0.h == null ? rew0 : ret0.h), this.m.g(long4), rfi0.s, this.r.g(long4))) {
                    this.f(long4.longValue());
                    ProtoLiteBuilder hftp5 = (ProtoLiteBuilder)this.a.get(long4);
                    if(this.k(ret0.c, long4.longValue())) {
                        this.m(hftp5, ret0.d, rfi0.c);
                        if((ret0.b & 16) != 0) {
                            this.o(hftp5, ret0.f, rfi0.c);
                        }
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        rfi rfi6 = (rfi)hftp5.b_message;
                        ret0.getClass();
                        hfuo hfuo5 = rfi6.i;
                        if(!hfuo5.c()) {
                            rfi6.i = ProtoLiteMessage.E(hfuo5);
                        }
                        rfi6.i.add(ret0);
                        this.n(hftp5, ret0.c, rfi0.c);
                        if((ret0.b & 4) != 0) {
                            this.m(hftp5, ret0.e, rfi0.c);
                        }
                        if(ret0.i) {
                            this.f.add(long4);
                        }
                        if(iacm.e()) {
                            this.e(rfi0.c, long4.longValue(), ret0.g);
                        }
                        if(this.u && rfi0.H) {
                            ffny ffny0 = new ffny();
                            ((Set)Map.-EL.computeIfAbsent(this.t, long4, ffny0)).add(Long.valueOf(ret0.c));
                        }
                    }
                    this.a(long4.longValue(), rfi0);
                    this.b(long4.longValue(), rfi0);
                }
                if(!set5.contains(Long.valueOf(ret0.c)) && this.i((ret0.h == null ? rew0 : ret0.h))) {
                    this.g(long4.longValue(), rfi0);
                    this.d(rfi0.c, long4.longValue(), ret0.c);
                }
            }
        }
        for(Object object12: rfi0.k) {
            reu reu0 = (reu)object12;
            for(Object object13: ffoz.g((reu0.g == null ? rew0 : reu0.g))) {
                Long long5 = (Long)object13;
                Set set6 = this.b;
                if(this.l(set6, reu0.c, (reu0.g == null ? rew0 : reu0.g), this.m.g(long5), rfi0.s, this.r.g(long5))) {
                    this.f(long5.longValue());
                    ProtoLiteBuilder hftp6 = (ProtoLiteBuilder)this.a.get(long5);
                    if(this.k(reu0.c, long5.longValue())) {
                        this.m(hftp6, reu0.d, rfi0.c);
                        if((reu0.b & 8) != 0) {
                            this.o(hftp6, reu0.e, rfi0.c);
                        }
                        if(!hftp6.b_message.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        rfi rfi7 = (rfi)hftp6.b_message;
                        reu0.getClass();
                        hfuo hfuo6 = rfi7.k;
                        if(!hfuo6.c()) {
                            rfi7.k = ProtoLiteMessage.E(hfuo6);
                        }
                        rfi7.k.add(reu0);
                        this.n(hftp6, reu0.c, rfi0.c);
                        if(reu0.h) {
                            this.f.add(long5);
                        }
                        this.e(rfi0.c, long5.longValue(), reu0.f);
                        if(this.u && rfi0.H) {
                            ffoa ffoa0 = new ffoa();
                            ((Set)Map.-EL.computeIfAbsent(this.t, long5, ffoa0)).add(Long.valueOf(reu0.c));
                        }
                    }
                    this.a(long5.longValue(), rfi0);
                    this.b(long5.longValue(), rfi0);
                }
                if(!set6.contains(Long.valueOf(reu0.c)) && this.i((reu0.g == null ? rew0 : reu0.g))) {
                    this.g(long5.longValue(), rfi0);
                    this.d(rfi0.c, long5.longValue(), reu0.c);
                }
            }
        }
    }

    private final void d(long v, long v1, long v2) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)this.a.get(Long.valueOf(v1));
        ffoc ffoc0 = this.i;
        for(Object object0: ffoc0.h.g(Long.valueOf(v2))) {
            Long long0 = (Long)object0;
            long v3 = (long)long0;
            Map map0 = ffoc0.c;
            if(map0.containsKey(long0)) {
                Set set0 = this.c;
                if(ffod.j(set0, v3, this.l.g(Long.valueOf(v1)))) {
                    rei rei0 = (rei)map0.get(long0);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    rfi rfi0 = (rfi)hftp0.b_message;
                    rei0.getClass();
                    hfuo hfuo0 = rfi0.o;
                    if(!hfuo0.c()) {
                        rfi0.o = ProtoLiteMessage.E(hfuo0);
                    }
                    rfi0.o.add(rei0);
                }
                if(set0.contains(long0)) {
                    continue;
                }
                for(Object object1: ffoc0.j.g(long0)) {
                    rfl rfl0 = (rfl)object1;
                    if(ffod.j(this.e, rfl0.b, this.o.g(Long.valueOf(v1))) && !set0.contains(long0)) {
                        hftp0.ab(rfl0);
                    }
                }
            }
            else {
                ffod.h(v, this.y);
            }
        }
    }

    private final void e(long v, long v1, List list0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)this.a.get(Long.valueOf(v1));
        for(Object object0: list0) {
            Long long0 = (Long)object0;
            long v2 = (long)long0;
            Map map0 = this.i.d;
            if(!map0.containsKey(long0)) {
                ffod.h(v, this.y);
            }
            if(ffod.j(ggnj.a, v2, this.p.g(Long.valueOf(v1)))) {
                rff rff0 = (rff)map0.get(long0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                rfi rfi0 = (rfi)hftp0.b_message;
                rff0.getClass();
                hfuo hfuo0 = rfi0.n;
                if(!hfuo0.c()) {
                    rfi0.n = ProtoLiteMessage.E(hfuo0);
                }
                rfi0.n.add(rff0);
            }
        }
    }

    private final void f(long v) {
        Map map0 = this.a;
        Long long0 = v;
        if(!map0.containsKey(long0)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)rfi.a).v_newBuilder();
            if(((int)(v - iabs.b() >> 12 & 1L)) == 1) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                rfi rfi0 = (rfi)hftp0.b_message;
                rfi0.b |= 0x80;
                rfi0.y = true;
            }
            map0.put(long0, hftp0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            rfi rfi1 = (rfi)hftp0.b_message;
            rfi1.b |= 1;
            rfi1.c = v;
        }
    }

    private final void g(long v, rfi rfi0) {
        Long long0 = v;
        gghp gghp0 = this.v;
        if(gghp0.A(long0, Long.valueOf(rfi0.c))) {
            return;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)this.a.get(long0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)rfg.a).v_newBuilder();
        long v1 = rfi0.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((rfg)hftv0).b |= 1;
        ((rfg)hftv0).c = v1;
        int v2 = rfi0.d;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        rfg rfg0 = (rfg)hftp1.b_message;
        rfg0.b |= 2;
        rfg0.d = v2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        rfi rfi1 = (rfi)hftp0.b_message;
        rfg rfg1 = (rfg)hftp1.N_build();
        rfg1.getClass();
        hfuo hfuo0 = rfi1.t;
        if(!hfuo0.c()) {
            rfi1.t = ProtoLiteMessage.E(hfuo0);
        }
        rfi1.t.add(rfg1);
        List list0 = this.q.g(long0);
        for(Object object0: rfi0.s) {
            Long long1 = (Long)object0;
            if(!list0.contains(long1)) {
                list0.add(long1);
            }
        }
        gghp0.v(Long.valueOf(v), Long.valueOf(rfi0.c));
    }

    private static void h(long v, ayvf ayvf0) {
        ayvb ayvb0 = ayvf0.f("InvalidConfigMissingElements");
        ayvb0.a(ayvb0.g.a(v), 1L, ayvf.b);
    }

    private final boolean i(rew rew0) {
        return rew0.h ? bbmq.S() : this.x;
    }

    private static boolean j(Set set0, long v, List list0) {
        Long long0 = v;
        if(!list0.contains(long0) && !set0.contains(long0)) {
            list0.add(long0);
            return true;
        }
        return false;
    }

    private final boolean k(long v, long v1) {
        ffoc ffoc0 = this.i;
        Map map0 = ffoc0.m;
        Long long0 = v;
        if(map0.containsKey(long0)) {
            gfsz gfsz0 = (gfsz)map0.get(long0);
            Object object0 = gfsz0.a;
            Map map1 = ffoc0.l;
            if(map1.containsKey(object0)) {
                long v2 = (long)(((Long)map1.get(object0)));
                if(((long)(((Long)gfsz0.b))) < v2) {
                    if(ffoc0.h.u(long0)) {
                        this.s.v(Long.valueOf(v1), long0);
                        return true;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean l(Set set0, long v, rew rew0, List list0, List list1, List list2) {
        Long long0 = v;
        if(!list1.contains(long0) && !list2.contains(long0)) {
            list2.add(long0);
        }
        if(!set0.contains(long0) && !list0.contains(long0)) {
            list0.add(long0);
            return this.i(rew0);
        }
        return false;
    }

    private final void m(ProtoLiteBuilder hftp0, long v, long v1) {
        ffoc ffoc0 = this.i;
        Map map0 = ffoc0.a;
        Long long0 = v;
        if(map0.containsKey(long0)) {
            List list0 = this.k.g(Long.valueOf(((rfi)hftp0.b_message).c));
            if(!ffod.j(ggnj.a, v, list0)) {
                return;
            }
            rek rek0 = (rek)map0.get(long0);
            if(rek0.b == 3) {
                for(Object object0: ffoc0.f.g(long0)) {
                    this.m(hftp0, ((Long)object0).longValue(), v1);
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            rfi rfi0 = (rfi)hftp0.b_message;
            rek0.getClass();
            hfuo hfuo0 = rfi0.l;
            if(!hfuo0.c()) {
                rfi0.l = ProtoLiteMessage.E(hfuo0);
            }
            rfi0.l.add(rek0);
            return;
        }
        ffod.h(v1, this.y);
    }

    private final void n(ProtoLiteBuilder hftp0, long v, long v1) {
        ffoc ffoc0 = this.i;
        for(Object object0: ffoc0.i.g(Long.valueOf(v))) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            rfi rfi0 = (rfi)hftp0.b_message;
            ((rev)object0).getClass();
            hfuo hfuo0 = rfi0.w;
            if(!hfuo0.c()) {
                rfi0.w = ProtoLiteMessage.E(hfuo0);
            }
            rfi0.w.add(((rev)object0));
        }
        for(Object object1: ffoc0.g.g(Long.valueOf(v))) {
            this.m(hftp0, ((Long)object1).longValue(), v1);
        }
    }

    private final void o(ProtoLiteBuilder hftp0, long v, long v1) {
        ffoc ffoc0 = this.i;
        Map map0 = ffoc0.b;
        Long long0 = v;
        if(map0.containsKey(long0)) {
            List list0 = this.j.g(Long.valueOf(((rfi)hftp0.b_message).c));
            if(!ffod.j(ggnj.a, v, list0)) {
                return;
            }
            rey rey0 = (rey)map0.get(long0);
            if(rey0.b == 2) {
                this.m(hftp0, ((rfe)rey0.c).c, v1);
                int v2 = rey0.b;
                if(((v2 == 2 ? ((rfe)rey0.c) : rfe.a).b & 2) != 0) {
                    this.m(hftp0, (v2 == 2 ? ((rfe)rey0.c) : rfe.a).d, v1);
                }
                int v3 = rey0.b;
                if(((v3 == 2 ? ((rfe)rey0.c) : rfe.a).b & 8) != 0) {
                    this.m(hftp0, (v3 == 2 ? ((rfe)rey0.c) : rfe.a).e, v1);
                }
            }
            else {
                for(Object object0: ffoc0.e.g(long0)) {
                    this.o(hftp0, ((Long)object0).longValue(), v1);
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            rfi rfi0 = (rfi)hftp0.b_message;
            rey0.getClass();
            hfuo hfuo0 = rfi0.m;
            if(!hfuo0.c()) {
                rfi0.m = ProtoLiteMessage.E(hfuo0);
            }
            rfi0.m.add(rey0);
            return;
        }
        ffod.h(v1, this.y);
    }
}


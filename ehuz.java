import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class ehuz {
    public ehup a;
    public final ehut b;
    protected ehup c;
    protected final eibz d;
    private int e;
    private gfsx f;
    private final ehuw g;

    public ehuz(eibz eibz0, ehuw ehuw0) {
        ehut ehut0 = new ehut(ehuw0);
        super();
        this.e = 0;
        this.f = gfqx.a;
        this.d = eibz0;
        this.g = ehuw0;
        this.b = ehut0;
    }

    final int a(ehup ehup0, ehup ehup1) {
        return !(ehup0 != null && ehup0.h > ((float)this.g.b)) && !(ehup1.h > ((float)this.g.b)) ? 1 : ((int)this.g.f);
    }

    public final gwhe b(ehup ehup0) {
        int v7;
        gwhe gwhe2;
        ehuy ehuy0;
        gwhe gwhe0 = gwhe.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwhe0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwhe)hftp0.b_message).c = 3;
        ((gwhe)hftp0.b_message).b |= 1;
        gwhe gwhe1 = (gwhe)hftp0.N_build();
        ehup ehup1 = this.a;
        if(ehup1 == null) {
            ehuy0 = ehuy.a;
        }
        else {
            long v = ehup0.d;
            float f = ehup0.h;
            long v1 = ehup1.d;
            if(v1 > v) {
                ehuy0 = ehuy.g;
            }
            else {
                float f1 = ehup1.h;
                ehuw ehuw0 = this.g;
                if((-50.0f + f1 > f)) {
                    ehuy0 = ehuy.c;
                }
                else if(ehuw0.a + v1 > v) {
                    ehuy0 = ehuy.h;
                }
                else if((f < ((float)ehuw0.b))) {
                    ehuy0 = ehuy.b;
                }
                else if((ehuz.i(ehup1, ehup0) <= (f1 + f) * ((float)this.a(ehup1, ehup0)))) {
                    ehuy0 = ehuy.i;
                }
                else if(this.h(ehup1, ehup0)) {
                    Long long0 = v1;
                    Long long1 = v;
                    this.d.a(String.format(Locale.US, "Location change. Confirming motion using AR between elapsed timestamp:%d and %d", long0, long1));
                    ArrayList arrayList0 = new ArrayList(this.b.e.subMap(long0, long1).values());
                    if(arrayList0.isEmpty()) {
                        ehuy0 = ehuy.j;
                    }
                    else {
                        int v2 = 0;
                        int v3 = 0;
                        for(Object object0: arrayList0) {
                            if(ehut.a.containsKey(Integer.valueOf(((ehuh)object0).a))) {
                                ++v2;
                            }
                            ++v3;
                        }
                        ehuy0 = (((float)v2) * 100.0f / ((float)v3) > 30.0f) && v3 >= 3 ? ehuy.e : ehuy.j;
                    }
                }
                else {
                    ehuy0 = ehuy.d;
                }
            }
        }
        if(!ehuy0.k) {
            this.d.b(ehuy0.l);
            return gwhe1;
        }
        ehuw ehuw1 = this.g;
        if(ehuw1.k) {
            double f2 = ehup0.f;
            double f3 = ehup0.g;
            Map map0 = ehun.a;
            if(map0.isEmpty()) {
                HashMap hashMap0 = new HashMap();
                long[] arr_v = ehun.b;
                int v4 = 0;
                while(v4 < 0xCC8) {
                    ggym ggym0 = new ggym(arr_v[v4]);
                    Long long2 = (long)ggym0.E(10).c;
                    if(!hashMap0.containsKey(long2)) {
                        hashMap0.put(long2, new ArrayList());
                    }
                    List list0 = (List)hashMap0.get(long2);
                    gftb.check(list0);
                    list0.add(ggym0);
                    ++v4;
                    gwhe0 = gwhe0;
                }
                gwhe2 = gwhe0;
                for(Object object1: hashMap0.entrySet()) {
                    map0.put(((Long)((Map.Entry)object1).getKey()), ggyq.c(((Iterable)((Map.Entry)object1).getValue())));
                }
            }
            else {
                gwhe2 = gwhe0;
            }
            ggym ggym1 = ggym.A(ggzv.i(f2, f3));
            Long long3 = (long)ggym1.E(10).c;
            if(map0.containsKey(long3)) {
                ggyq ggyq0 = (ggyq)map0.get(long3);
                gftb.check(ggyq0);
                if(ggyq0.e(ggym1)) {
                    if(this.f.i()) {
                        long v5 = ehup0.d;
                        if(v5 - ((ehup)this.f.d()).d >= TimeUnit.MINUTES.toMillis(ehuw1.l)) {
                            String s = String.format(Locale.US, "No alert zone detected. First seen in zone(elapsedSeconds:%d, epoch:%s), Last seen(elapsedSeconds:%d, epoch:%s)", TimeUnit.MILLISECONDS.toSeconds(((ehup)this.f.d()).d), eice.b(((ehup)this.f.d()).a), TimeUnit.MILLISECONDS.toSeconds(v5), eice.b(ehup0.a));
                            this.d.a(s);
                            this.e();
                            this.f();
                            this.d.a("No alert zone detected.");
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwhe2).v_newBuilder();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((gwhe)hftp1.b_message).c = 5;
                            ((gwhe)hftp1.b_message).b |= 1;
                            return (gwhe)hftp1.N_build();
                        }
                    }
                    this.f = this.f.i() ? this.f : gfsx.m(ehup0);
                }
                else {
                    this.f = gfqx.a;
                }
            }
            else {
                this.f = gfqx.a;
            }
        }
        else {
            gwhe2 = gwhe0;
            this.f = gfqx.a;
        }
        ehup ehup2 = this.a;
        if(ehup2 == null) {
            this.a = ehup0;
            this.d.b("LastLocation was null: no distance computed");
            return gwhe1;
        }
        ehuz.i(ehup2, ehup0);
        if(this.h(this.a, ehup0)) {
            gftb.check(this.a);
            if(this.g(this.a, ehup0)) {
                return this.c();
            }
            gwhe1 = this.d();
        }
        else if(this.c != null && this.h(this.c, ehup0)) {
            gftb.check(this.c);
            if(this.g(this.c, ehup0)) {
                return this.c();
            }
            gftb.check(this.c);
            ehux.b(this.c, ehup0);
            gwhe1 = this.d();
        }
        else if((ehuz.i(this.a, ehup0) < ((float)ehuw1.d))) {
            int v6 = this.e;
            if(v6 == 0) {
                this.c = ehup0;
                v7 = 0;
            }
            else {
                v7 = v6;
            }
            this.e = v7 + 1;
            if(((long)(v7 + 1)) == ehuw1.e) {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwhe2).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((gwhe)hftp2.b_message).c = 2;
                ((gwhe)hftp2.b_message).b |= 1;
                gwhe1 = (gwhe)hftp2.N_build();
            }
            else {
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwhe2).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((gwhe)hftp3.b_message).c = 3;
                ((gwhe)hftp3.b_message).b |= 1;
                gwhe1 = (gwhe)hftp3.N_build();
            }
        }
        this.a = ehup0;
        return gwhe1;
    }

    protected final gwhe c() {
        this.e();
        this.f();
        this.d.a("High speed travel detected");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwhe.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwhe)hftp0.b_message).c = 4;
        ((gwhe)hftp0.b_message).b |= 1;
        return (gwhe)hftp0.N_build();
    }

    protected final gwhe d() {
        this.e();
        this.f();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwhe.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwhe)hftp0.b_message).c = 1;
        ((gwhe)hftp0.b_message).b |= 1;
        return (gwhe)hftp0.N_build();
    }

    final void e() {
        this.c = null;
    }

    final void f() {
        this.e = 0;
    }

    protected final boolean g(ehup ehup0, ehup ehup1) {
        gftb.check(ehup0);
        if(ehup0 != null && ehup0.c == ehup1.c) {
            float f = ehux.b(ehup0, ehup1) - ehuz.j(ehup0, ehup1);
            long v = ehup1.d - ehup0.d;
            return v != 0L && (v >= this.g.h && f / (((float)v) / 3600.0f) >= ((float)this.g.g));
        }
        return false;
    }

    protected final boolean h(ehup ehup0, ehup ehup1) {
        if(ehup0 != null) {
            float f = ehuz.i(ehup0, ehup1);
            return f >= ((float)this.g.c) && f > ehuz.j(ehup0, ehup1) * ((float)this.a(this.a, ehup1));
        }
        return false;
    }

    protected static final float i(ehup ehup0, ehup ehup1) {
        gftb.check(ehup0);
        return ehux.b(ehup0, ehup1);
    }

    private static float j(ehup ehup0, ehup ehup1) {
        return ehup0.h + ehup1.h;
    }
}


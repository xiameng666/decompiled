import j..util.Comparator.-CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;

public class ehvm {
    public final Map a;
    public final Map b;
    protected final List c;
    protected final List d;
    protected final ConcurrentSkipListSet e;
    public final ehva f;
    public boolean g;
    public final Object h;
    protected ehup i;
    public final eibz j;

    public ehvm(Map map0, ehva ehva0, eibz eibz0) {
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ConcurrentSkipListSet(Comparator.-CC.comparingLong(new ehvi()));
        this.g = false;
        this.h = new Object();
        this.a = map0;
        this.f = ehva0;
        this.j = eibz0;
    }

    public float a(ehup ehup0, ehup ehup1) {
        return (float)GeoMath.a(ehup0.f, ehup0.g, ehup1.f, ehup1.g);
    }

    protected final gfsx b(ehvk ehvk0) {
        gfsx gfsx0 = gfqx.a;
        if(ehvk0 == null) {
            return gfsx0;
        }
        gwgx gwgx0 = ehvk0.b;
        gwgx gwgx1 = ehvk0.a;
        List list0 = this.d(gwgx1, gwgx0);
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            gfsx0 = this.k(((ehvl)object0).a, ((ehvl)object0).b);
        }
        if(list0.isEmpty()) {
            this.d.add(ehvk0);
            return gfsx0;
        }
        long v = ((ehvl)gggq.p(list0)).a.f;
        if(v < gwgx0.f && v >= gwgx1.f) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gwgx1).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gwgx1));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwgx gwgx2 = (gwgx)hftp0.b_message;
            gwgx2.b |= 8;
            gwgx2.f = v;
            ehvk ehvk1 = new ehvk(((gwgx)hftp0.N_build()), gwgx0);
            this.d.add(ehvk1);
        }
        return gfsx0;
    }

    protected final gfsx c(gwgx gwgx0, ehup ehup0) {
        if(!this.h(gwgx0, ehup0)) {
            this.c.add(gwgx0);
            this.j.a("TDA Not processed. Timestamp > max");
            return gfqx.a;
        }
        return this.k(gwgx0, ehup0);
    }

    public final List d(gwgx gwgx0, gwgx gwgx1) {
        gwgx gwgx4;
        HashMap hashMap0 = new HashMap();
        ArrayList arrayList0 = new ArrayList(this.e);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            gwgx gwgx2 = gwgx0 == null ? gwgx1 : gwgx0;
            ehup ehup0 = (ehup)arrayList0.get(v1);
            long v2 = ehup0.a;
            if(v2 <= gwgx2.f && this.h(gwgx2, ehup0)) {
                ehvm.j(hashMap0, new ehvl(gwgx2, ehup0));
            }
            else if(v2 >= gwgx1.f && this.h(gwgx1, ehup0)) {
                ehvm.j(hashMap0, new ehvl(gwgx1, ehup0));
            }
            else if(ehup0 != null && v2 >= gwgx2.f && v2 <= gwgx1.f) {
                if(this.h(gwgx1, ehup0)) {
                    gwgx4 = gwgx1;
                }
                else {
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gwgx1).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)gwgx1));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwgx gwgx3 = (gwgx)hftp0.b_message;
                    gwgx3.b |= 8;
                    gwgx3.f = v2;
                    gwgx4 = (gwgx)hftp0.N_build();
                }
                ehvm.j(hashMap0, new ehvl(gwgx4, ehup0));
            }
        }
        return gged_interceptors.D(Comparator.-CC.comparingLong(new ehvj()), hashMap0.values());
    }

    @Deprecated
    public final Map e(ehup ehup0, boolean z) {
        Map map1;
        synchronized(this) {
            if(this.g) {
                return this.f(gged_interceptors.l(ehup0), z);
            }
            map1 = new HashMap();
            if(this.i == null || this.i(ehup0, this.i)) {
                this.i = ehup0;
                if(z) {
                    List list0 = this.c;
                    ArrayList arrayList0 = new ArrayList(list0);
                    int v1 = arrayList0.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        gwgx gwgx0 = (gwgx)arrayList0.get(v2);
                        gfsx gfsx0 = this.c(gwgx0, ehup0);
                        if(gfsx0.i()) {
                            map1.put(gwgx0, gfsx0.d());
                        }
                        list0.remove(gwgx0);
                    }
                }
            }
        }
        return map1;
    }

    public final Map f(List list0, boolean z) {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList();
            ehup ehup0 = this.i;
            for(Object object0: list0) {
                ehup ehup1 = (ehup)object0;
                if(this.i(ehup1, ehup0)) {
                    arrayList0.add(ehup1);
                    ehup0 = ehup1;
                }
            }
            if(!arrayList0.isEmpty()) {
                synchronized(this.h) {
                    this.e.addAll(arrayList0);
                    this.i = (ehup)this.e.last();
                }
                if(z) {
                    HashMap hashMap0 = new HashMap();
                    List list1 = this.d;
                    ArrayList arrayList1 = new ArrayList(list1);
                    int v2 = arrayList1.size();
                    for(int v3 = 0; v3 < v2; ++v3) {
                        ehvk ehvk0 = (ehvk)arrayList1.get(v3);
                        gfsx gfsx0 = this.b(ehvk0);
                        if(gfsx0.i()) {
                            Object object1 = gfsx0.d();
                            hashMap0.put(ehvk0.b, object1);
                        }
                        list1.remove(ehvk0);
                    }
                    return ggeo.k(hashMap0);
                }
            }
        }
        return ggnf.a;
    }

    public final void g(boolean z) {
        synchronized(this) {
            this.g = z;
        }
    }

    protected final boolean h(gwgx gwgx0, ehup ehup0) {
        return Math.abs(gwgx0.f - (ehup0 == null ? 0L : ehup0.a)) <= ((long)this.f.h);
    }

    public final boolean i(ehup ehup0, ehup ehup1) {
        if(ehup1 == null) {
            return true;
        }
        return ehup0.h < ((float)this.f.e) || this.a(ehup0, ehup1) > (ehup1.h + ehup0.h) * ((float)this.f.f) ? true : this.f.i && this.a(ehup0, ehup1) < ((float)this.f.g);
    }

    protected static final void j(Map map0, ehvl ehvl0) {
        long v = ehvl0.a.f;
        Long long0 = v;
        if(!map0.containsKey(long0)) {
            map0.put(long0, ehvl0);
            return;
        }
        ehvl ehvl1 = (ehvl)map0.get(long0);
        gftb.check(ehvl1);
        if(Math.abs(v - ehvl0.b.a) < Math.abs(v - ehvl1.b.a)) {
            map0.put(long0, ehvl0);
        }
    }

    private final gfsx k(gwgx gwgx0, ehup ehup0) {
        gwhf gwhf1;
        if(gwgx0 != null && ehup0 != null) {
            String s = gwgx0.c;
            boolean z = false;
            int v = this.b.containsKey(s) ? ((int)this.a(((ehup)this.b.get(s)), ehup0)) : 0;
            this.b.put(s, ehup0);
            if(this.g) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwhf.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gwhf)hftv0).b |= 1;
                ((gwhf)hftv0).c = v;
                float f = ehup0.h;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((gwhf)hftv1).b |= 2;
                ((gwhf)hftv1).d = (int)f;
                long v1 = ehup0.b;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp0.b_message;
                ((gwhf)hftv2).b |= 0x20;
                ((gwhf)hftv2).h = v1;
                long v2 = ehup0.a;
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwhf gwhf0 = (gwhf)hftp0.b_message;
                gwhf0.b |= 4;
                gwhf0.e = v2;
                gwhf1 = (gwhf)hftp0.N_build();
            }
            else {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwhf.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp1.b_message;
                ((gwhf)hftv3).b |= 1;
                ((gwhf)hftv3).c = v;
                float f1 = ehup0.h;
                if(!hftv3.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp1.b_message;
                ((gwhf)hftv4).b |= 2;
                ((gwhf)hftv4).d = (int)f1;
                long v3 = ehup0.b;
                if(!hftv4.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwhf gwhf2 = (gwhf)hftp1.b_message;
                gwhf2.b |= 4;
                gwhf2.e = v3;
                gwhf1 = (gwhf)hftp1.N_build();
            }
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwhi.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp2.b_message;
            ((gwhi)hftv5).d = gwgx0;
            ((gwhi)hftv5).b |= 2;
            if(!hftv5.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwhi gwhi0 = (gwhi)hftp2.b_message;
            gwhf1.getClass();
            gwhi0.e = gwhf1;
            gwhi0.b |= 4;
            gwhi gwhi1 = (gwhi)hftp2.N_build();
            Map map0 = this.a;
            if(map0.containsKey(s)) {
                ((List)map0.get(s)).add(gwhi1);
            }
            else {
                map0.put(s, new ArrayList(Arrays.asList(new gwhi[]{gwhi1})));
            }
            String s1 = gwgx0.c;
            if(gwgx0.i != 101) {
                this.j.a("TDA Not processed. Mustn\'t process.");
                return gfqx.a;
            }
            List list0 = map0.containsKey(s1) ? new ArrayList(((Collection)map0.get(s1))) : Collections.EMPTY_LIST;
            if(list0.isEmpty()) {
                this.j.a("TDA Not processed. No data.");
                return gfqx.a;
            }
            gwgx gwgx1 = ((gwhi)gggq.p(list0)).d;
            if(gwgx1 == null) {
                gwgx1 = gwgx.a;
            }
            long v4 = gwgx1.f;
            gwgx gwgx2 = ((gwhi)list0.get(0)).d;
            if(gwgx2 == null) {
                gwgx2 = gwgx.a;
            }
            long v5 = v4 - gwgx2.f;
            int v6 = 0;
            int v7 = 1;
            for(Object object0: list0) {
                gwhf gwhf3 = ((gwhi)object0).e;
                if((gwhf3 == null ? gwhf.a : gwhf3).c > this.f.d) {
                    if(gwhf3 == null) {
                        gwhf3 = gwhf.a;
                    }
                    v6 += gwhf3.c;
                    ++v7;
                }
            }
            if(v7 >= this.f.a && v6 >= this.f.b && v5 >= ((long)this.f.c)) {
                z = true;
            }
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwmg.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv6 = hftp3.b_message;
            ((gwmg)hftv6).b |= 1;
            ((gwmg)hftv6).c = z;
            if(!hftv6.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv7 = hftp3.b_message;
            ((gwmg)hftv7).b |= 2;
            ((gwmg)hftv7).d = v7;
            if(!hftv7.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv8 = hftp3.b_message;
            ((gwmg)hftv8).b |= 4;
            ((gwmg)hftv8).e = v5;
            if(!hftv8.isImmutable()) {
                hftp3.ensureMutable();
            }
            gwmg gwmg0 = (gwmg)hftp3.b_message;
            gwmg0.b |= 8;
            gwmg0.f = v6;
            return gfsx.m(((gwmg)hftp3.N_build()));
        }
        this.j.a("Skip running detection");
        return gfqx.a;
    }
}


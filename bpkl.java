import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import j..time.Duration;
import j..util.Collection.-EL;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;

@ibnh
public final class bpkl implements bpjp {
    public static final bboh a;
    public final Map b;
    public final TreeMap c;
    public gfsx d;
    public ArrayDeque e;
    public final bpad f;
    public final bpkq g;
    public final fgvt h;
    public final Executor i;
    public final gtcf j;
    public final Object k;
    private final ArrayDeque l;
    private volatile gfsx m;
    private final Context n;
    private final fqxe o;
    private final ibnf p;
    private final bnnl q;
    private final ConnectivityManager r;
    private final long s;
    private final bpkh t;

    static {
        bpkl.a = bboh.b("SightingAggregator", bbcu.eD);
    }

    public bpkl(Context context0, fqxe fqxe0, bpad bpad0, ibnf ibnf0, bnnl bnnl0, bpkq bpkq0, fgvt fgvt0, Executor executor0) {
        this.n = context0;
        this.o = fqxe0;
        this.f = bpad0;
        this.p = ibnf0;
        this.q = bnnl0;
        this.g = bpkq0;
        this.h = fgvt0;
        this.i = executor0;
        Object object0 = context0.getSystemService("connectivity");
        batl.s(object0);
        this.r = (ConnectivityManager)object0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtcf.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtce.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gtce)hftp1.b_message).b = "25.34.34 (190400-{{cl}})";
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtcf gtcf0 = (gtcf)hftp0.b_message;
        gtce gtce0 = (gtce)hftp1.N_build();
        gtce0.getClass();
        gtcf0.c = gtce0;
        gtcf0.b = 2;
        this.j = (gtcf)hftp0.N_build();
        this.s = Duration.ofSeconds(hsxv.a.y().T()).toMillis();
        this.k = new Object();
        this.l = new ArrayDeque();
        this.m = gfqx.a;
        this.b = new HashMap();
        this.c = new TreeMap();
        this.t = new bpkh(this);
        this.d = gfqx.a;
        this.e = new ArrayDeque();
    }

    @Override  // bpjp
    public final gmcd a(long v, List list0) {
        return !hsxl.i() ? gmbx.a : gdta.g(this.o.f()).h(new bpkf(this, v, list0), this.i);
    }

    @Override  // bpjp
    public final gmcd b() {
        gmcd gmcd0;
        fqxe fqxe0 = this.o;
        gdta gdta0 = gdta.g(((boul)fqxe0).f()).i(new bosy(((boul)fqxe0)), ((boul)fqxe0).h);
        if(hsxl.i()) {
            gmcd0 = fqxe0.f();
            return gdtd.h(new gmcd[]{gdta0, gmcd0}).b(new bpka(this, gdta0, gmcd0), this.i);
        }
        gmcd0 = gmbu.i(fqzl.a);
        return gdtd.h(new gmcd[]{gdta0, gmcd0}).b(new bpka(this, gdta0, gmcd0), this.i);
    }

    @Override  // bpjp
    public final gmcd c(bpjo bpjo0) {
        return hsxl.i() && !this.n(bpjo0.c) ? gmbx.a : gdta.g(this.o.f()).h(new bpjw(this, bpjo0), this.i);
    }

    @Override  // bpjp
    public final void d(gsyz gsyz0) {
        synchronized(this.k) {
            gtch gtch0 = this.t.a(gsyz0);
            fqus[] arr_fqus = fqus.values();
            for(int v1 = 0; v1 < arr_fqus.length; ++v1) {
                bpki bpki0 = new bpki(gtch0, arr_fqus[v1]);
                bpkj bpkj0 = (bpkj)this.b.remove(bpki0);
                if(bpkj0 != null) {
                    gmcd gmcd0 = (gmcd)this.c.remove(bpkj0);
                }
            }
        }
    }

    public final void e(fqzl fqzl0) {
        for(Object object0: this.e) {
            boolean z = bouv.e(fqzl0);
            this.i((fqzl0.j == null ? fqxm.a : fqzl0.j), ((bpjo)object0).a, ((bpjo)object0).b, ((bpjo)object0).c, z);
        }
        this.e = new ArrayDeque();
    }

    public final void f(long v) {
        Iterator iterator0 = this.l.descendingIterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(((bpkg)object0).a >= v - this.s) {
                break;
            }
            iterator0.remove();
        }
    }

    public final void g(long v) {
        this.h(v, ggna.a, false);
    }

    public final void h(long v, List list0, boolean z) {
        ggek ggek0 = new ggek();
        Map map0 = this.b;
        gfsx gfsx0 = gfqx.a;
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            bpkj bpkj0 = (bpkj)map$Entry0.getValue();
            if(!list0.contains(bpkj0.f)) {
                bpkk bpkk0 = new bpkk(bpkj0);
                ggek0.i(((bpki)map$Entry0.getKey()), bpkk0);
                if(hsxl.d() && bpkj0.d.b) {
                    gfsx0 = gfsx.m(bpkk0);
                }
            }
        }
        bpkg bpkg0 = new bpkg(v, ggek0.b(), gfsx0);
        if(!bpkg0.b.isEmpty()) {
            this.l.push(bpkg0);
            gfsx gfsx1 = bpkg0.c;
            if(gfsx1.i()) {
                this.m = gfsx1;
            }
        }
        if(list0.isEmpty()) {
            map0.clear();
            this.c.clear();
            return;
        }
        Iterator iterator1 = map0.entrySet().iterator();
        while(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            bpkj bpkj1 = (bpkj)((Map.Entry)object1).getValue();
            gfsx gfsx2 = bpkj1.f;
            if(list0.contains(gfsx2)) {
                hadw hadw0 = bpkq.b(gfsx2, z);
                this.g.c(hadx.s, bpkj1.d, hadw0);
            }
            else {
                iterator1.remove();
                gmcd gmcd0 = (gmcd)this.c.remove(bpkj1);
            }
        }
    }

    public final void i(fqxm fqxm0, Iterable iterable0, Location location0, gfsx gfsx0, boolean z) {
        gfsx gfsx3;
        gmcd gmcd1;
        boolean z4;
        boolean z2;
        Iterator iterator1;
        gtch gtch0;
        gggq.s(gggq.j(iterable0, new bpjt()));
        boolean z1 = gfsx0.i();
        long v = this.h.a();
        this.f(v);
        if(hsxl.i() || this.n(gfsx0)) {
            int v1 = 0;
            int v2 = 0;
            Iterator iterator0 = iterable0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                bpko bpko0 = (bpko)object0;
                bpko0.c();
                gfsx gfsx1 = bpko0.c;
                gfsx gfsx2 = gfsx0.i() ? gfsx0 : bpko0.e;
                hadw hadw0 = bpkq.b(gfsx2, z);
                if(!gfsx2.i()) {
                    v2 |= bpkl.k(bpko0, v);
                    if(bpko0.a.isEmpty()) {
                        continue;
                    }
                    gfsx1 = gfqx.a;
                }
                int v3 = bpko0.k;
                if(gfsx1.i()) {
                    gsyz gsyz0 = (gsyz)gfsx1.d();
                    gtch0 = this.t.a(gsyz0);
                    iterator1 = iterator0;
                    z2 = z1;
                }
                else {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtch.a).v_newBuilder();
                    iterator1 = iterator0;
                    z2 = z1;
                    ByteString hfsf0 = bpko0.a.j(0, 10);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gtch gtch1 = (gtch)hftp0.b_message;
                    hfsf0.getClass();
                    gtch1.b = 6;
                    gtch1.c = hfsf0;
                    gtch0 = (gtch)hftp0.N_build();
                }
                bpki bpki0 = new bpki(gtch0, bpko0.d);
                bpkj bpkj0 = (bpkj)this.b.get(bpki0);
                if(bpkj0 != null) {
                    bpko bpko1 = bpkj0.d;
                    long v4 = bpko0.f;
                    long v5 = bpko1.f;
                    if(Math.abs(v4 - v5) > hsxv.s()) {
                        if(v4 < v5) {
                            this.g.c(hadx.p, bpko0, hadw0);
                            goto label_130;
                        }
                    }
                    else if((bpko0.i > bpko1.i)) {
                        this.g.c(hadx.p, bpko0, hadw0);
                        goto label_130;
                    }
                }
                boolean z3 = z2 || v3 != 0;
                if(hsxl.d() && bpko0.b) {
                    if(this.m.i()) {
                        long v6 = z3 ? hsxv.q() : hsxv.a.y().aa();
                        z4 = bpkl.m(bpko0, location0, ((bpkk)this.m.d()), v6);
                        goto label_63;
                    }
                    else {
                        goto label_77;
                    }
                    goto label_56;
                }
                else {
                label_56:
                    long v7 = z3 ? hsxv.q() : Duration.ofMillis(this.s).toSeconds();
                    Iterator iterator2 = this.l.iterator();
                    while(true) {
                        if(!iterator2.hasNext()) {
                            goto label_77;
                        }
                        Object object1 = iterator2.next();
                        bpkk bpkk0 = (bpkk)((bpkg)object1).b.get(bpki0);
                        if(bpkk0 != null) {
                            z4 = bpkl.m(bpko0, location0, bpkk0, v7);
                            break;
                        }
                    }
                }
            label_63:
                if(z4) {
                label_77:
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtat.a).v_newBuilder();
                    int v8 = fraw.a(location0.getLatitude());
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gtat)hftp1.b_message).b = v8;
                    int v9 = fraw.a(location0.getLongitude());
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gtat)hftp1.b_message).c = v9;
                    int v10 = (int)Math.round(location0.getAltitude());
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gtat)hftp1.b_message).d = v10;
                    float f = location0.getAccuracy();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gtat)hftp1.b_message).e = f;
                    ByteString hfsf1 = fraw.b(((gtat)hftp1.N_build()));
                    if(gfsx1.i()) {
                        Object object2 = gfsx1.d();
                        gmcd1 = gdtf.k((bpko0.b ? gmbu.i(gfsx.m(fqxm0.c)) : gdtf.j(((fquu)this.p.get()).j(((gsyz)object2)), new bpjs(), gmap.a)), new bpkb(hfsf1, bpko0), this.i);
                    }
                    else {
                        try {
                            gmcd1 = gmbu.i(fqvf.b(hfsf1, bpko0.a));
                        }
                        catch(fqwb fqwb0) {
                            a.ae(bpkl.a.i(), "Sighting encryption failed.", fqwb0);
                            gfsx3 = gfqx.a;
                            goto label_106;
                        }
                    }
                    gfsx3 = gfsx.m(gdtf.j(gmcd1, new bpkc(bpko0), gmap.a));
                label_106:
                    if(gfsx3.i()) {
                        bpkj bpkj2 = new bpkj(gtch0, bpko0, gfsx2, location0.getLatitude(), location0.getLongitude(), location0.getAccuracy());
                        Map map0 = this.b;
                        bpkj bpkj3 = (bpkj)map0.put(bpki0, bpkj2);
                        if(bpkj3 == null) {
                            TreeMap treeMap0 = this.c;
                            if(((long)treeMap0.size()) == hsxv.a.y().L()) {
                                Map.Entry map$Entry0 = treeMap0.pollFirstEntry();
                                batl.s(map$Entry0);
                                bpkj bpkj4 = (bpkj)map$Entry0.getKey();
                                map0.remove(new bpki(bpkj4.e, bpkj4.d.d));
                                boolean z5 = hsxl.a.b().f() ? bpxy.a(this.r) : this.r.isDefaultNetworkActive();
                                this.g.c((z5 ? hadx.g : hadx.h), bpkj4.d, hadw0);
                                if(!hsxo.e()) {
                                    bpjv bpjv0 = new bpjv(z5);
                                    this.q.a(bpjv0);
                                }
                            }
                        }
                        else {
                            gmcd gmcd2 = (gmcd)this.c.remove(bpkj3);
                            this.g.c(hadx.m, bpkj3.d, hadw0);
                            if(!hsxo.e()) {
                                bpkd bpkd0 = new bpkd();
                                this.q.a(bpkd0);
                            }
                        }
                        gdta gdta0 = gdta.g(((gmcd)gfsx3.d())).h(new bpke(this, bpkj2, hadw0), gmap.a);
                        this.c.put(bpkj2, gdta0);
                    }
                }
                else {
                    bpkq bpkq0 = this.g;
                    bpkq0.c(hadx.o, bpko0, hadw0);
                    bpkj bpkj1 = (bpkj)this.b.remove(bpki0);
                    if(!hsxo.e()) {
                        bpjx bpjx0 = new bpjx();
                        this.q.a(bpjx0);
                    }
                    if(bpkj1 != null) {
                        gmcd gmcd0 = (gmcd)this.c.remove(bpkj1);
                        bpkq0.c(hadx.n, bpkj1.d, hadw0);
                        if(!hsxo.e()) {
                            bpjy bpjy0 = new bpjy();
                            this.q.a(bpjy0);
                        }
                    }
                }
            label_130:
                v1 |= v3;
                iterator0 = iterator1;
                z1 = z2;
                v = v;
            }
            if(!hsxl.i()) {
                this.l(z1 || v1 != 0, ((boolean)v2));
            }
        }
    }

    public final void j(boolean z, long v) {
        this.l(z, Collection.-EL.stream(this.b.values()).anyMatch(new bpjr(v)));
    }

    public static boolean k(bpko bpko0, long v) {
        if(hsxl.k()) {
            long v1 = Duration.ofMillis(v).minusSeconds(hsxv.a.y().F()).toSeconds();
            return bpko0.f >= v1;
        }
        return true;
    }

    private final void l(boolean z, boolean z1) {
        if(this.b.isEmpty()) {
            this.f.b();
            return;
        }
        this.f.d(z, z || z1);
    }

    private static boolean m(bpko bpko0, Location location0, bpkk bpkk0, long v) {
        float[] arr_f = new float[1];
        double f = location0.getLatitude();
        double f1 = location0.getLongitude();
        Location.distanceBetween(bpkk0.a, bpkk0.b, f, f1, arr_f);
        hsxv hsxv0 = hsxv.a;
        if(arr_f[0] < ((float)hsxv0.y().S()) && bpko0.f - v <= bpkk0.d) {
            double f2 = ((double)location0.getAccuracy()) * hsxv0.y().f();
            return ((double)bpkk0.c) > f2;
        }
        return true;
    }

    private final boolean n(gfsx gfsx0) {
        gged_interceptors gged0 = bpsq.g(this.n);
        if(gged0.isEmpty()) {
            ((ggtj)bpkl.a.j()).x("No Google accounts are allowed to report sightings.");
            return false;
        }
        if(gfsx0.i() && !gged0.contains(gfsx0.d())) {
            ((ggtj)bpkl.a.j()).x("Owner sighting report for a supervised account or an unknown account.");
            return false;
        }
        return true;
    }
}


import android.text.TextUtils.TruncateAt;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class beih {
    public static final bboh a;
    public final bdbm b;
    public final bdbk c;
    public final bbng d;
    public final lqi e;
    public final lqd f;
    public final lqi g;
    public final lqd h;
    public final lqi i;
    public final lqd j;
    public final lqi k;
    public final lqd l;
    public final Collator m;
    public final icnj n;
    public final icnj o;
    public final icnl p;
    public final icnl q;
    public final icnl r;
    public final aysr s;
    private final Comparator t;
    private final icnl u;

    static {
        beih.a = bboh.b("PasswordDataRepository", bbcu.cX);
    }

    public beih(aysr aysr0, bdbm bdbm0, bdbk bdbk0, bbng bbng0) {
        this.s = aysr0;
        this.b = bdbm0;
        this.c = bdbk0;
        this.d = bbng0;
        lqi lqi0 = new lqi();
        this.e = lqi0;
        this.f = lqi0;
        lqi lqi1 = new lqi();
        this.g = lqi1;
        this.h = lqi1;
        lqi lqi2 = new lqi();
        this.i = lqi2;
        this.j = lqi2;
        lqi lqi3 = new lqi();
        this.k = lqi3;
        this.l = lqi3;
        Collator collator0 = Collator.getInstance(bgmp.b());
        collator0.setStrength(0);
        ibuq.e(collator0, "apply(...)");
        this.m = collator0;
        this.t = new begv(this);
        icnl icnl0 = icnm.a(new bedv(bedu.b, null, null));
        this.p = icnl0;
        this.n = new icmp(icnl0);
        icnl icnl1 = icnm.a(null);
        this.u = icnl1;
        this.o = new icmp(icnl1);
        this.q = icnm.a(null);
        this.r = icnm.a(new bedv(bedu.b, null, null));
    }

    public final lqd a(bedc bedc0) {
        ibuq.f(bedc0, "blocklistEntryToDelete");
        lqd lqd0 = new lqi(new bedv(bedu.b, null, null));
        evql evql0 = this.b.a(((MessageLite)bedc0.e));
        evql0.b(new behk(new behj(this, bedc0, ((lqi)lqd0))));
        evql0.A(new behl(((lqi)lqd0)));
        return lqd0;
    }

    public final lqd b(gqmd gqmd0) {
        ibuq.f(gqmd0, "credentialGroupToDelete");
        gged_interceptors gged0 = gqmd0.c();
        ArrayList arrayList0 = new ArrayList(ibpo.q(gged0, 10));
        ggqk ggqk0 = gged0.E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            arrayList0.add(((bedg)object0).e);
        }
        gged_interceptors gged1 = ggdx.a(arrayList0);
        lqd lqd0 = new lqi(new bedv(bedu.b, null, null));
        evql evql0 = this.b.b(gged1);
        evql0.b(new beib(new beia(((lqi)lqd0))));
        evql0.A(new beic(((lqi)lqd0)));
        evql0.z((/* MISSING LAMBDA PARAMETER */) -> {
            if(false) {
                bedv bedv0 = new bedv(bedu.b, null, null);
                this.e.l(bedv0);
                bedv bedv1 = new bedv(bedu.b, null, null);
                this.p.f(bedv1);
                bedv bedv2 = new bedv(bedu.b, null, null);
                this.g.l(bedv2);
                bedv bedv3 = new bedv(bedu.b, null, null);
                this.k.l(bedv3);
                bedv bedv4 = new bedv(bedu.b, null, null);
                this.r.f(bedv4);
            }
            evql evql0 = this.e(this.b.c());
            evql0.A(new behd(false, this));
            return evql0;
        });
        return lqd0;
    }

    @ibni
    public final lqd c(gged_interceptors gged0) {
        ibuq.f(gged0, "passwordsData");
        lqd lqd0 = new lqi(new bedv(bedu.b, null, null));
        if(gged0.isEmpty()) {
            lqd0.l(new bedv(bedu.a, null, null));
            return lqd0;
        }
        evql evql0 = this.h(gged0);
        evql0.b(new begz(new begy(((lqi)lqd0))));
        evql0.A(new beha(((lqi)lqd0)));
        return lqd0;
    }

    public final evql d(heqb heqb0) {
        ibuq.f(heqb0, "password");
        evql evql0 = this.b.a(((MessageLite)heqb0));
        evql0.A(new behg());
        return evql0;
    }

    public final evql e(evql evql0) {
        evqp evqp0 = new evqp();
        evql0.A(new beht(evqp0));
        evql0.b(new behv(new behu(this, evqp0)));
        return evqp0.a;
    }

    public final evql f() {
        return this.g(true);
    }

    // Detected as a lambda impl.
    public final evql g(boolean z) {
        if(z) {
            bedv bedv0 = new bedv(bedu.b, null, null);
            this.e.l(bedv0);
            bedv bedv1 = new bedv(bedu.b, null, null);
            this.p.f(bedv1);
            bedv bedv2 = new bedv(bedu.b, null, null);
            this.g.l(bedv2);
            bedv bedv3 = new bedv(bedu.b, null, null);
            this.k.l(bedv3);
            bedv bedv4 = new bedv(bedu.b, null, null);
            this.r.f(bedv4);
        }
        evql evql0 = this.e(this.b.c());
        evql0.A(new behd(z, this));
        return evql0;
    }

    public final evql h(gged_interceptors gged0) {
        ibuq.f(gged0, "passwordsData");
        ArrayList arrayList0 = new ArrayList(ibpo.q(gged0, 10));
        for(Object object0: gged0) {
            arrayList0.add(this.b.e(((MessageLite)(((heqb)object0)))));
        }
        evql evql0 = evrg.e(arrayList0);
        evql0.A(new behb());
        evql0.z((/* MISSING LAMBDA PARAMETER */) -> {
            if(false) {
                bedv bedv0 = new bedv(bedu.b, null, null);
                this.e.l(bedv0);
                bedv bedv1 = new bedv(bedu.b, null, null);
                this.p.f(bedv1);
                bedv bedv2 = new bedv(bedu.b, null, null);
                this.g.l(bedv2);
                bedv bedv3 = new bedv(bedu.b, null, null);
                this.k.l(bedv3);
                bedv bedv4 = new bedv(bedu.b, null, null);
                this.r.f(bedv4);
            }
            evql evql0 = this.e(this.b.c());
            evql0.A(new behd(false, this));
            return evql0;
        });
        return evql0;
    }

    public static Object i(beih beih0, String s, ibrl ibrl0) {
        gged_interceptors gged1;
        heqb heqb2;
        beih beih2;
        heqb heqb0;
        beie beie0;
        if((ibrl0 instanceof beie)) {
            beie0 = (beie)ibrl0;
            int v = beie0.c;
            if((v & 0x80000000) == 0) {
                beie0 = new beie(beih0, ibrl0);
            }
            else {
                beie0.c = v - 0x80000000;
            }
        }
        else {
            beie0 = new beie(beih0, ibrl0);
        }
        Object object0 = beie0.a;
        Object object1 = ibrx.a;
        switch(beie0.c) {
            case 0: {
                ibnx.b(object0);
                heqd heqd0 = heqc.a(((ProtoLiteMessage)heqb.a).v_newBuilder());
                heqd0.e(s);
                heqd0.h(s);
                heqd0.b(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
                heqd0.k();
                heqb0 = heqd0.a();
                try {
                    evql evql0 = beih0.b.e(((MessageLite)heqb0));
                    beie0.d = beih0;
                    beie0.e = heqb0;
                    beie0.c = 1;
                    object0 = ictn.b(evql0, beie0);
                    if(object0 != object1) {
                        goto label_32;
                    label_27:
                        heqb heqb1 = beie0.e;
                        beih beih1 = beie0.d;
                        ibnx.b(object0);
                        heqb0 = heqb1;
                        beih0 = beih1;
                    label_32:
                        Void void0 = (Void)object0;
                        goto label_38;
                    }
                    return object1;
                }
                catch(aztb aztb0) {
                    return new bedv(bedu.c, null, aztb0);
                }
                catch(CancellationException cancellationException0) {
                    return new bedv(bedu.c, null, cancellationException0);
                }
            }
            case 1: {
                goto label_27;
                try {
                label_38:
                    gged_interceptors gged0 = gged_interceptors.l(heqb0);
                    ibuq.e(gged0, "of(...)");
                    evql evql1 = beih0.c.a(gged0);
                    beie0.d = beih0;
                    beie0.e = heqb0;
                    beie0.c = 2;
                    object0 = ictn.b(evql1, beie0);
                }
                catch(aztb unused_ex) {
                    beih2 = beih0;
                    heqb2 = heqb0;
                    break;
                }
                catch(CancellationException unused_ex) {
                    beih2 = beih0;
                    heqb2 = heqb0;
                    gged1 = ggna.a;
                    ibuq.c(gged1);
                    beih2.l(heqb2, gged1);
                    return new bedv(bedu.a, null, null);
                }
                if(object0 != object1) {
                    beih2 = beih0;
                    heqb2 = heqb0;
                    gged1 = (gged_interceptors)object0;
                    goto label_67;
                }
                return object1;
            }
            case 2: {
                try {
                    heqb2 = beie0.e;
                    beih2 = beie0.d;
                    ibnx.b(object0);
                    gged1 = (gged_interceptors)object0;
                    goto label_67;
                }
                catch(aztb unused_ex) {
                    break;
                }
                catch(CancellationException unused_ex) {
                    gged1 = ggna.a;
                    ibuq.c(gged1);
                    beih2.l(heqb2, gged1);
                    return new bedv(bedu.a, null, null);
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        gged1 = ggna.a;
        ibuq.c(gged1);
    label_67:
        beih2.l(heqb2, gged1);
        return new bedv(bedu.a, null, null);
    }

    public static Object j(beih beih0, bedc bedc0, ibrl ibrl0) {
        beif beif0;
        if((ibrl0 instanceof beif)) {
            beif0 = (beif)ibrl0;
            int v = beif0.c;
            if((v & 0x80000000) == 0) {
                beif0 = new beif(beih0, ibrl0);
            }
            else {
                beif0.c = v - 0x80000000;
            }
        }
        else {
            beif0 = new beif(beih0, ibrl0);
        }
        Object object0 = beif0.a;
        Object object1 = ibrx.a;
        switch(beif0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    evql evql0 = beih0.b.a(((MessageLite)bedc0.e));
                    beif0.d = beih0;
                    beif0.e = bedc0;
                    beif0.c = 1;
                    if(ictn.b(evql0, beif0) == object1) {
                        return object1;
                    label_20:
                        bedc0 = beif0.e;
                        beih0 = beif0.d;
                        ibnx.b(object0);
                    }
                    beih0.m(bedc0);
                    return new bedv(bedu.a, null, null);
                }
                catch(aztb aztb0) {
                    break;
                }
                catch(CancellationException cancellationException0) {
                    return new bedv(bedu.c, null, cancellationException0);
                }
            }
            case 1: {
                goto label_20;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return new bedv(bedu.c, null, aztb0);
    }

    public static Object k(beih beih0, gged_interceptors gged0, ibrl ibrl0) {
        beig beig0;
        if((ibrl0 instanceof beig)) {
            beig0 = (beig)ibrl0;
            int v = beig0.c;
            if((v & 0x80000000) == 0) {
                beig0 = new beig(beih0, ibrl0);
            }
            else {
                beig0.c = v - 0x80000000;
            }
        }
        else {
            beig0 = new beig(beih0, ibrl0);
        }
        Object object0 = beig0.a;
        Object object1 = ibrx.a;
        switch(beig0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    evql evql0 = beih0.h(gged0);
                    beig0.c = 1;
                    object0 = ictn.b(evql0, beig0);
                    if(object0 == object1) {
                        return object1;
                    label_19:
                        ibnx.b(object0);
                    }
                    return new bedv(bedu.a, object0, null);
                }
                catch(aztb aztb0) {
                    break;
                }
                catch(ExecutionException executionException0) {
                    return new bedv(bedu.c, null, executionException0);
                }
                catch(CancellationException cancellationException0) {
                    return new bedv(bedu.c, null, cancellationException0);
                }
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return new bedv(bedu.c, null, aztb0);
    }

    public final void l(heqb heqb0, gged_interceptors gged0) {
        lqd lqd0 = this.l;
        if(lqd0.ij() == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object object0 = lqd0.ij();
        ibuq.c(object0);
        ibuq.c(((bedv)object0).b);
        SortedSet sortedSet0 = ibpo.H(((Iterable)((bedv)object0).b), this.t);
        sortedSet0.add(beih.p(heqb0, gged0));
        gged_interceptors gged1 = ggdx.a(sortedSet0);
        Object object1 = lqd0.ij();
        ibuq.c(object1);
        Object object2 = lqd0.ij();
        ibuq.c(object2);
        bedv bedv0 = new bedv(((bedv)object1).a, gged1, ((bedv)object2).c);
        this.k.l(bedv0);
        Object object3 = lqd0.ij();
        ibuq.c(object3);
        Object object4 = lqd0.ij();
        ibuq.c(object4);
        bedv bedv1 = new bedv(((bedv)object3).a, gged1, ((bedv)object4).c);
        this.r.f(bedv1);
    }

    public final void m(bedc bedc0) {
        bedv bedv0 = (bedv)this.l.ij();
        if(bedv0 != null) {
            Object object0 = bedv0.b;
            if(object0 != null) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: ((Iterable)object0)) {
                    ibuq.c(((bedc)object1));
                    bedb bedb0 = ((bedc)object1).a();
                    bedb0.c("");
                    bedc bedc1 = bedb0.a();
                    bedb bedb1 = bedc0.a();
                    bedb1.c("");
                    if(!ibuq.m(bedc1, bedb1.a())) {
                        arrayList0.add(object1);
                    }
                }
                gged_interceptors gged0 = ggdx.a(arrayList0);
                bedv bedv1 = new bedv(bedv0.a, gged0, bedv0.c);
                this.k.l(bedv1);
                bedv bedv2 = new bedv(bedv0.a, gged0, bedv0.c);
                this.r.f(bedv2);
                return;
            }
        }
        throw new IllegalArgumentException("Delete was requested before data was available.");
    }

    public final void n(Exception exception0) {
        bedv bedv0 = new bedv(bedu.c, null, exception0);
        this.e.l(bedv0);
        bedv bedv1 = new bedv(bedu.c, null, exception0);
        this.p.f(bedv1);
        bedv bedv2 = new bedv(bedu.c, null, exception0);
        this.g.l(bedv2);
        bedv bedv3 = new bedv(bedu.c, null, exception0);
        this.k.l(bedv3);
        bedv bedv4 = new bedv(bedu.c, null, exception0);
        this.r.f(bedv4);
        bedv bedv5 = new bedv(bedu.c, null, exception0);
        this.i.l(bedv5);
        bedv bedv6 = new bedv(bedu.c, null, exception0);
        this.q.f(bedv6);
    }

    public final void o(gged_interceptors gged0, gged_interceptors gged1) {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: gged1) {
            if(((heqb)object0).l) {
                arrayList0.add(object0);
            }
            else {
                arrayList1.add(object0);
            }
        }
        ibns ibns0 = new ibns(arrayList0, arrayList1);
        gged_interceptors gged2 = bedl.a(((List)ibns0.b));
        ibuq.c(gged2);
        gged_interceptors gged3 = gqnb.a(gged2, gged0);
        ibuq.c(gged3);
        List list0 = ibpo.ao(gged3, new behs(new behq(this)));
        gged_interceptors gged4 = ggdx.a(list0);
        bedu bedu0 = bedu.a;
        bedv bedv0 = new bedv(bedu0, gged4, null);
        this.e.l(bedv0);
        bedv bedv1 = new bedv(bedu0, ggdx.a(list0), null);
        this.p.f(bedv1);
        bedi bedi0 = new bedi(gged2, gged0);
        bedv bedv2 = new bedv(bedu0, bedi0, null);
        this.g.l(bedv2);
        this.u.f(bedi0);
        gged_interceptors gged5 = ggdx.a(((List)ibns0.a));
        ArrayList arrayList2 = new ArrayList(ibpo.q(gged5, 10));
        for(Object object1: gged5) {
            ibuq.c(((heqb)object1));
            arrayList2.add(beih.p(((heqb)object1), gged0));
        }
        gged_interceptors gged6 = ggdx.a(ibpo.H(arrayList2, this.t));
        bedv bedv3 = new bedv(bedu0, gged6, null);
        this.k.l(bedv3);
        bedv bedv4 = new bedv(bedu0, gged6, null);
        this.r.f(bedv4);
    }

    private static final bedc p(heqb heqb0, gged_interceptors gged0) {
        hhyd hhyd0 = null;
        bedb bedb0 = new bedb(null);
        bedb0.e(heqb0.d);
        bedb0.d(heqb0);
        String s = heqb0.d;
        ibuq.f(gged0, "facetGroups");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: gged0) {
            hfuo hfuo0 = ((hhyh)object0).c;
            ibuq.e(hfuo0, "getFacetList(...)");
            ibpo.D(arrayList0, hfuo0);
        }
        for(Object object1: arrayList0) {
            hhyf hhyf0 = (hhyf)object1;
            String s1 = hhyf0.c;
            if(s1 == null || s1.length() == 0 || s == null || s.length() == 0) {
                continue;
            }
            if(!ibzk.J(s1, "/")) {
                s1 = s1 + "/";
            }
            if(!ibuq.m(s1, (ibzk.J(s, "/") ? s : s + "/"))) {
                continue;
            }
            String s2 = (hhyf0.d == null ? hhyd.a : hhyf0.d).c;
            ibuq.e(s2, "getName(...)");
            if(s2.length() <= 0) {
                continue;
            }
            goto label_28;
        }
        object1 = null;
    label_28:
        if(((hhyf)object1) != null) {
            hhyd0 = ((hhyf)object1).d;
            if(hhyd0 == null) {
                hhyd0 = hhyd.a;
            }
        }
        gfsx gfsx0 = hhyd0 == null ? gfqx.a : gfsx.l(hhyd0);
        hhyd hhyd1 = (hhyd)gfsx0.g();
        if(hhyd1 != null) {
            bedb0.c(hhyd1.e);
            bedb0.b(hhyd1.c);
            bedb0.f(((hhyc.b(hhyd1.d) == null ? hhyc.a : hhyc.b(hhyd1.d)) == hhyc.b ? TextUtils.TruncateAt.START : TextUtils.TruncateAt.END));
        }
        return bedb0.a();
    }
}


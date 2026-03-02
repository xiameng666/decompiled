import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import j..time.Duration;
import j..time.Instant;
import j..util.Collection.-EL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class dtxg extends dtwk {
    public static final bboh j;
    private final Context k;
    private final String l;
    private final String m;
    private final dtwp n;
    private final icck o;
    private Map p;
    private final dtup q;

    static {
        dtxg.j = bboh.b("Pay", bbcu.cZ);
    }

    public dtxg(Context context0, Account account0, dtxm dtxm0, dtqm dtqm0, dtts dtts0, dtze dtze0, azts azts0, dtup dtup0, String s, String s1, gmcg gmcg0, ibrt ibrt0, dtwp dtwp0) {
        ibuq.f(azts0, "payClient");
        ibuq.f(gmcg0, "executor");
        super(account0, dtxm0, dtqm0, dtts0, dtze0, azts0, gmcg0);
        this.k = context0;
        this.q = dtup0;
        this.l = s;
        this.m = s1;
        this.n = dtwp0;
        this.o = iccl.b(ibrt0);
    }

    @Override  // dtwk
    public final void a(String s) {
        ibuq.f(s, "provisioningId");
        dtxf dtxf0 = new dtxf(this, s, null);
        icbb.a(this.o, null, null, dtxf0, 3);
    }

    @Override  // dtwk
    protected final void e(Set set0) {
        ibuq.f(set0, "mdocInfoSet");
        if(!hwfk.R()) {
            dtxb dtxb0 = new dtxb(this, set0, null);
            icbb.a(this.o, null, null, dtxb0, 3);
            return;
        }
        Map map0 = dtxa.a();
        hgkq hgkq0 = (hgkq)map0.get("");
        if(hgkq0 == null) {
            hgkq0 = hgkq.a;
            ibuq.e(hgkq0, "getDefaultInstance(...)");
        }
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        LinkedHashSet linkedHashSet1 = new LinkedHashSet();
        Collection.-EL.stream(set0).forEach(new dtwz(new dtwy(map0, hgkq0, linkedHashSet0, linkedHashSet1)));
        if(!linkedHashSet0.isEmpty()) {
            this.n.e(linkedHashSet0);
        }
        if(!linkedHashSet1.isEmpty()) {
            dtxc dtxc0 = new dtxc(this, set0, null);
            icbb.a(this.o, null, null, dtxc0, 3);
        }
    }

    public final Instant f(String s) {
        Instant instant0 = this.j(s);
        return instant0 == null ? null : instant0.plusSeconds(hwmp.g());
    }

    public final Object g(Set set0, ibrl ibrl0) {
        Object object4;
        Instant instant1;
        Object object3;
        dtxd dtxd0;
        if((ibrl0 instanceof dtxd)) {
            dtxd0 = (dtxd)ibrl0;
            int v = dtxd0.e;
            if((v & 0x80000000) == 0) {
                dtxd0 = new dtxd(this, ibrl0);
            }
            else {
                dtxd0.e = v - 0x80000000;
            }
        }
        else {
            dtxd0 = new dtxd(this, ibrl0);
        }
        Object object0 = dtxd0.c;
        Object object1 = ibrx.a;
        switch(dtxd0.e) {
            case 0: {
                ibnx.b(object0);
                Instant instant0 = Instant.ofEpochMilli(System.currentTimeMillis());
                ibuq.e(instant0, "ofEpochMilli(...)");
                ArrayList arrayList0 = new ArrayList(ibpo.q(set0, 10));
                for(Object object2: set0) {
                    arrayList0.add(((gtxg)object2).b);
                }
                this.h(arrayList0);
                ArrayList arrayList1 = new ArrayList();
                object3 = set0.iterator();
                instant1 = instant0;
                object4 = arrayList1;
                goto label_45;
            }
            case 1: {
                String s = dtxd0.h;
                gtxg gtxg0 = dtxd0.g;
                object3 = dtxd0.b;
                object4 = dtxd0.a;
                instant1 = dtxd0.f;
                ibnx.b(object0);
            alab1:
                while(true) {
                    switch(((dtyo)object0).a.ordinal()) {
                        case 1: {
                            dtxe dtxe0 = new dtxe(this, s, instant1, null);
                            iccs iccs0 = icbb.a(this.o, null, null, dtxe0, 3);
                            ((List)object4).add(iccs0);
                            iccs0.t(new dtwt(s));
                            break;
                        }
                        case 2: {
                            Instant instant2 = ((dtyo)object0).b;
                            if(instant2 == null) {
                                instant2 = instant1;
                            }
                            this.m(gtxg0, instant2);
                        }
                    }
                label_45:
                    while(((Iterator)object3).hasNext()) {
                        Object object5 = ((Iterator)object3).next();
                        gtxg0 = (gtxg)object5;
                        s = gtxg0.b;
                        ibuq.e(s, "getProvisioningIdString(...)");
                        Instant instant3 = this.f(s);
                        if(instant3 != null && instant3.isAfter(instant1)) {
                            this.m(gtxg0, instant3);
                            continue;
                        }
                        List list0 = this.k(s);
                        dtxd0.f = instant1;
                        dtxd0.a = object4;
                        dtxd0.b = object3;
                        dtxd0.g = gtxg0;
                        dtxd0.h = s;
                        dtxd0.e = 1;
                        object0 = this.q.a(s, instant1, list0, dtxd0);
                        if(object0 != object1) {
                            continue alab1;
                        }
                        break alab1;
                    }
                    dtxd0.f = null;
                    dtxd0.a = null;
                    dtxd0.b = null;
                    dtxd0.g = null;
                    dtxd0.h = null;
                    dtxd0.e = 2;
                    if(icay.a(((Collection)object4), dtxd0) != object1) {
                        return ibom.a;
                    }
                    break;
                }
                return object1;
            }
            case 2: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final void h(List list0) {
        hfuo hfuo0 = new dtsg(this.k, this.l, this.m).a(list0, 0L, 0, false, null).c;
        ibuq.e(hfuo0, "getGroupsList(...)");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(hfuo0, 10)), 16));
        for(Object object0: hfuo0) {
            String s = ((fshr)object0).c;
            ibuq.e(s, "getProvisioningId(...)");
            linkedHashMap0.put(s, ((fshr)object0).e);
        }
        this.p = linkedHashMap0;
    }

    public final void i(String s, Instant instant0) {
        try {
            Duration duration0 = Duration.ofSeconds(hwmp.g());
            ibuq.e(duration0, "ofSeconds(...)");
            Instant instant1 = instant0.plus(duration0);
            ibuq.e(instant1, "plus(...)");
            this.n(s, instant1);
            List list0 = ibpo.b(this.j(s));
            this.l(s, fshp.e, instant0, list0);
            this.e.a(s);
            Instant instant2 = Instant.ofEpochMilli(System.currentTimeMillis());
            ibuq.e(instant2, "ofEpochMilli(...)");
            List list1 = ibpo.b(instant0);
            this.l(s, fshp.f, instant2, list1);
        }
        catch(Throwable throwable0) {
            a.e(dtxg.j.i(), "Error refresh mdoc %s", s, throwable0);
            Instant instant3 = Instant.ofEpochMilli(System.currentTimeMillis());
            ibuq.e(instant3, "ofEpochMilli(...)");
            List list2 = ibpo.b(instant0);
            this.l(s, fshp.g, instant3, list2);
            throw throwable0;
        }
    }

    private final Instant j(String s) {
        for(Object object0: this.k(s)) {
            fshp fshp0 = fshp.b(((fshq)object0).e);
            if(fshp0 == null) {
                fshp0 = fshp.h;
            }
            if(fshp0 == fshp.e) {
                return ((fshq)object0) == null ? null : Instant.ofEpochMilli(((fshq)object0).c);
            }
        }
        return null;
    }

    private final List k(String s) {
        Map map0 = this.p;
        if(map0 == null) {
            ibuq.j("timestampsMap");
            map0 = null;
        }
        List list0 = (List)map0.get(s);
        return list0 == null ? ibps.a : list0;
    }

    private final void l(String s, fshp fshp0, Instant instant0, Iterable iterable0) {
        Instant instant1 = instant0.minusSeconds(hwly.h());
        ibuq.e(instant1, "minusSeconds(...)");
        dtsg dtsg0 = new dtsg(this.k, this.l, this.m);
        long v = instant0.toEpochMilli();
        fshp fshp1 = fshp.f;
        long v1 = instant1.toEpochMilli();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            Instant instant2 = (Instant)object0;
            Long long0 = instant2 == null ? null : instant2.toEpochMilli();
            if(long0 != null) {
                arrayList0.add(long0);
            }
        }
        dtsg0.b(s, v, fshp0 == fshp1, fshp0, v1, ibpo.aG(arrayList0));
    }

    private final void m(gtxg gtxg0, Instant instant0) {
        if(hwfk.R()) {
            String s = fshl.a(gtxg0).g;
            ibuq.e(s, "getIssuerId(...)");
            hgkq hgkq0 = (hgkq)dtxa.a().get(s);
            if(hgkq0 != null && hgkq0.d) {
                ggtj ggtj0 = (ggtj)dtxg.j.h();
                String s1 = Integer.toString(gtxg0.b.hashCode(), 16);
                ibuq.e(s1, "toString(...)");
                ggtj0.B("Skipping mdoc refresh scheduling for %s", s1);
                return;
            }
        }
        String s2 = gtxg0.b;
        ibuq.e(s2, "getProvisioningIdString(...)");
        this.n(s2, instant0);
    }

    private final void n(String s, Instant instant0) {
        Instant instant1 = Instant.ofEpochMilli(System.currentTimeMillis());
        ibuq.e(instant1, "ofEpochMilli(...)");
        Duration duration0 = Duration.ofSeconds(hwmp.a.l().l());
        ibuq.e(duration0, "ofSeconds(...)");
        Duration duration1 = Duration.between(instant1, instant0);
        ibuq.e(duration1, "between(...)");
        Comparable comparable0 = ibrc.d(duration0, duration1);
        ibuq.e(comparable0, "maxOf(...)");
        String s1 = this.b.name;
        ibuq.e(s1, "name");
        long v = ((Duration)comparable0).toSeconds();
        ibuq.f(s1, "accountName");
        ibuq.f(s, "provisioningId");
        gftb.g(Long.compare(v, 0L) >= 0, "Invalid start delay", new Object[0]);
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
        clkn0.t("mdoc.refresh." + s.hashCode());
        clkn0.v(1);
        clkn0.e(v, 1L + v);
        Bundle bundle0 = new Bundle();
        bundle0.putString("extra_account_name", s1);
        clkn0.u = bundle0;
        clko clko0 = clkn0.a();
        cljp.a(this.k).f(clko0);
        Instant instant2 = instant1.plus(((Duration)comparable0));
        ibuq.e(instant2, "plus(...)");
        Object object0 = Collection.-EL.stream(this.k(s)).filter(new dtwv(new dtwu())).map(new dtwx(new dtww())).collect(ggaf.a);
        ibuq.e(object0, "collect(...)");
        this.l(s, fshp.b, instant2, ((gged_interceptors)object0));
    }
}


import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public final class garw extends gaxs {
    public gast a;
    public gbfv b;
    public Bundle c;
    final byi d;
    public final ArrayList e;
    public final Map f;
    final garv g;
    public static final int h;
    private boolean i;
    private lqj j;
    private lqj k;

    public garw() {
        this.d = new byi();
        this.e = new ArrayList(1);
        this.g = new garv(new clht(Looper.getMainLooper()));
        this.f = new HashMap();
    }

    public final long a(long v, long v1) {
        byi byi0 = this.d;
        if(byi0.j(v1)) {
            Map map0 = (Map)byi0.d(v1);
            if(map0 != null) {
                Long long0 = v;
                if(map0.containsKey(long0)) {
                    Long long1 = (Long)map0.get(long0);
                    return long1 == null ? v : ((long)long1);
                }
            }
        }
        return v;
    }

    public final garp b(hcnu hcnu0, Bundle bundle0) {
        long v = (hcnu0.c == null ? hcos.a : hcnu0.c).c;
        if(this.aR(v) == null) {
            Bundle bundle1 = garw.aQ(v, bundle0);
            if(bundle1 == null) {
                gaxl.a();
                if(hzka.c()) {
                    hcos hcos0 = hcnu0.c == null ? hcos.a : hcnu0.c;
                    hcoj hcoj0 = hcos0.d == null ? hcoj.a : hcos0.d;
                    if((hcog.b(hcoj0.d) == null ? hcog.a : hcog.b(hcoj0.d)) != hcog.c) {
                        int v1 = hcnu0.i;
                        switch(v1) {
                            case 228971052: 
                            case 0xDEF33BF: 
                            case 0xFCB580B: 
                            case 0x1A460BC4: 
                            case 0x1A460BC5: {
                                break;
                            }
                            case 0x1D25F33B: {
                                gaxl.a();
                                if(!hzlv.l()) {
                                    v1 = 0x1D25F33B;
                                label_15:
                                    if(v1 != 310995137) {
                                        gaxl.a();
                                        return !hzmb.a.b().p() || v1 != 0x1B454423 ? null : this.s(hcnu0, null, garp.class);
                                    }
                                    hfta hfta0 = hcvm.p;
                                    hcnu0.f(hfta0);
                                    hftu hftu0 = hfta0.d;
                                    Object object0 = hcnu0.s.k(hftu0);
                                    if(!gbsf.br(((hcvm)(object0 == null ? hfta0.b : hfta0.d(object0))))) {
                                        hcnu0.f(hfta0);
                                        Object object1 = hcnu0.s.k(hftu0);
                                        if(!gbsf.bs(((hcvm)(object1 == null ? hfta0.b : hfta0.d(object1))))) {
                                            v1 = 310995137;
                                            gaxl.a();
                                            return !hzmb.a.b().p() || v1 != 0x1B454423 ? null : this.s(hcnu0, null, garp.class);
                                        }
                                    }
                                }
                                break;
                            }
                            default: {
                                goto label_15;
                            }
                        }
                    }
                }
            }
            return this.s(hcnu0, bundle1, garp.class);
        }
        return null;
    }

    public final garp f(long v) {
        return this.g(v, garp.class);
    }

    public final garp g(long v, Class class0) {
        if(bbqt.a()) {
            return this.h(v, class0);
        }
        FutureTask futureTask0 = new FutureTask(new garu(this, v, class0));
        try {
            return !this.g.a.post(futureTask0) || !((gfsx)futureTask0.get()).i() ? null : ((garp)((gfsx)futureTask0.get()).d());
        }
        catch(ExecutionException | InterruptedException unused_ex) {
            this.g.a.removeCallbacks(futureTask0);
            return null;
        }
    }

    public final garp h(long v, Class class0) {
        gavr.a(bbqt.a(), "BE_DM_01", this.a.a.g, new gayw(v), "Components must be retrieved on the MainThread.");
        boolean z = true;
        if(this.i) {
            gaxl.a();
            if(hzka.c()) {
                z = false;
            }
        }
        gavr.a(z, "BE_DM_02", this.a.a.g, new gayw(v), "Can not retrieve DataComponents while constructing a new one if LazyDataCreation feature is enabled.");
        garp garp0 = (garp)gavs.b("BE_DM_07", this.a.a.g, new gayw(v), new gart(this, v, class0));
        if(garp0 == null && this.q(v)) {
            hcnu hcnu0 = (hcnu)this.b.b.get(Long.valueOf(v));
            gavs.h(hcnu0, "BE_DM_03", this.a.a.g, new gayw(v));
            garp garp1 = this.s(hcnu0, null, class0);
            garp1.G();
            return garp1;
        }
        return garp0;
    }

    public final garp i(long v, String s) {
        garp garp0 = this.f(v);
        gavs.f(garp0, s, this.a.a.g, new gayw(v));
        return garp0;
    }

    public final garp j(long v, Class class0, String s) {
        garp garp0 = this.g(v, class0);
        gavs.f(garp0, s, this.a.a.g, new gayw(v));
        return garp0;
    }

    public final hcnu k(long v) {
        hcnu hcnu0 = (hcnu)this.b.b.get(Long.valueOf(v));
        gavs.h(hcnu0, "BE_DM_12", this.a.a.g, new gayw(v));
        gavr.a(hcop.a((hcnu0.c == null ? hcos.a : hcnu0.c).l) == 2, "BE_DM_13", this.a.a.g, new gayw(v), "Data is not a template data.");
        return hcnu0;
    }

    public final void m(long v, Map map0) {
        this.d.h(v, map0);
    }

    public final void n(long v) {
        this.d.i(v);
    }

    @Override  // gaxs
    public final void nb() {
        this.b.f.j(this.j);
        this.b.e.j(this.k);
    }

    public final void o(List list0) {
        this.p(ggna.a, list0, ggna.a, ggna.a);
    }

    public final void p(List list0, List list1, List list2, List list3) {
        gbfv gbfv0 = this.b;
        ibuq.f(list1, "toAddOrReplaceData");
        ibuq.f(list0, "toRemove");
        ibuq.f(list2, "toReplaceDataValue");
        ibuq.f(list3, "toReplaceDataValuePreservingExtension");
        for(Object object0: list0) {
            gbfv0.d(((Number)object0).longValue());
        }
        for(Object object1: list1) {
            gbfv0.b(((hcnu)object1));
        }
        ArrayList arrayList0 = new ArrayList(ibpo.q(list2, 10));
        for(Object object2: list2) {
            hcnu hcnu0 = gbfv0.a(gbfv0.b, ((hcos)object2).c, "BE_DR_01");
            hcnu hcnu1 = gbbs.b(gbfv0.g, hcnu0, ((hcos)object2), false);
            ibuq.c(hcnu1);
            arrayList0.add(gbfv0.b(hcnu1));
        }
        ArrayList arrayList1 = new ArrayList(ibpo.q(list3, 10));
        for(Object object3: list3) {
            hcnu hcnu2 = gbfv0.a(gbfv0.b, ((hcos)object3).c, "BE_DR_02");
            hcnu hcnu3 = gbbs.b(gbfv0.g, hcnu2, ((hcos)object3), true);
            ibuq.c(hcnu3);
            arrayList1.add(gbfv0.b(hcnu3));
        }
        gbfr gbfr0 = new gbfr(list1, list0, arrayList0, arrayList1);
        gbfv0.f.l(gbfr0);
        gbgc.a(gbfv0.c);
    }

    public final boolean q(long v) {
        return this.b.b.containsKey(Long.valueOf(v));
    }

    public final void r(gbfv gbfv0, Bundle bundle0) {
        this.b = gbfv0;
        this.c = bundle0;
        this.j = new garr(this);
        gbfv0.f.ih(this.j);
        this.k = new gars(this);
        gbfv0.e.ih(this.k);
        this.c = null;
    }

    private final garp s(hcnu hcnu0, Bundle bundle0, Class class0) {
        gbuc gbuc0;
        gavr.a(((boolean)(this.i ^ 1)), "BE_DM_10", this.a.a.g, new gayw((hcnu0.c == null ? hcos.a : hcnu0.c).c), "Can not construct a new DataComponent before adding the current one being constructed.");
        this.i = true;
        hcos hcos0 = hcnu0.c;
        if(hcop.a((hcos0 == null ? hcos.a : hcos0).l) == 2) {
            gaym gaym0 = this.a.a.g;
            if(hcos0 == null) {
                hcos0 = hcos.a;
            }
            gavv.a("BW_DM_01", gaym0, new gayw(hcos0.c), new garq());
        }
        gast gast0 = this.a;
        switch(hcnu0.i) {
            case 1001: {
                gbuc0 = new gbuc(gast0);
                break;
            }
            case 1004: {
                gbuc0 = new gbwz(gast0);
                break;
            }
            case 1005: {
                gbuc0 = new gbwq(gast0);
                break;
            }
            case 0x40B5BE0: {
                gbuc0 = new gccd(gast0);
                break;
            }
            case 0xCF5D70A: {
                gbuc0 = new gccv(gast0);
                break;
            }
            case 0xCF5DFD8: {
                gbuc0 = new gcab(gast0);
                break;
            }
            case 0xD290F5D: {
                gbuc0 = new gcbj(gast0);
                break;
            }
            case 0xD290F5F: {
                gbuc0 = new gcex(gast0);
                break;
            }
            case 0xD4FF7A6: {
                gbuc0 = new gcdu(gast0);
                break;
            }
            case 0xD4FF7A7: {
                gbuc0 = new gcdx(gast0);
                break;
            }
            case 0xD4FF7A8: {
                gbuc0 = new gcfl(gast0);
                break;
            }
            case 0xD4FF7A9: {
                gbuc0 = new gcdg(gast0);
                break;
            }
            case 0xD4FF7AB: {
                gbuc0 = new gbye(gast0);
                break;
            }
            case 228971049: {
                gbuc0 = new gcfi(gast0);
                break;
            }
            case 228971052: {
                gbuc0 = new gbpm(gast0);
                break;
            }
            case 0xDAFA0A5: {
                gbuc0 = new gcdj(gast0);
                break;
            }
            case 0xDD4EAC0: {
                gbuc0 = new gbpf(gast0);
                break;
            }
            case 232057537: {
                gbuc0 = new gbtb(gast0);
                break;
            }
            case 232060280: {
                gbuc0 = new gcco(gast0);
                break;
            }
            case 0xDD95C1F: {
                gbuc0 = new gbtg(gast0);
                break;
            }
            case 0xDE27A5C: {
                gbuc0 = new gbwt(gast0);
                break;
            }
            case 0xDEF33BF: {
                gbuc0 = new gbvd(gast0);
                break;
            }
            case 0xE80AA8E: {
                gbuc0 = new gccc(gast0);
                break;
            }
            case 0xEC34A20: {
                gbuc0 = new gbwn(gast0);
                break;
            }
            case 0xED145B6: {
                gbuc0 = new gbpo(gast0);
                break;
            }
            case 0xF2DEBB3: {
                gbuc0 = new gbwj(gast0);
                break;
            }
            case 0xF3A4A5B: {
                gbuc0 = new gcel(gast0);
                break;
            }
            case 0xF8297C8: {
                gbuc0 = new gcfe(gast0);
                break;
            }
            case 0xFA16463: {
                gbuc0 = new gbvi(gast0);
                break;
            }
            case 0xFCB580B: {
                gbuc0 = new gbvl(gast0);
                break;
            }
            case 0xFD39F86: {
                gbuc0 = new gcad(gast0);
                break;
            }
            case 0xFFB3EDC: {
                gbuc0 = new gbvj(gast0);
                break;
            }
            case 0xFFE904F: {
                gbuc0 = new gbuo(gast0);
                break;
            }
            case 0x103EF528: {
                gbuc0 = new gcfb(gast0);
                break;
            }
            case 0x1065DBFD: {
                gbuc0 = new gbtq(gast0);
                break;
            }
            case 0x1091B577: {
                gbuc0 = new gbsw(gast0);
                break;
            }
            case 0x1091EB73: {
                gbuc0 = new gbsu(gast0);
                break;
            }
            case 280016706: {
                gbuc0 = new gbuy(gast0);
                break;
            }
            case 0x10EEEDC1: {
                gbuc0 = new gbwx(gast0);
                break;
            }
            case 0x110CE795: {
                gbuc0 = new gbww(gast0);
                break;
            }
            case 0x111E820F: {
                gbuc0 = new gbsv(gast0);
                break;
            }
            case 0x115600CD: {
                gbuc0 = new gbuv(gast0);
                break;
            }
            case 0x115600CE: {
                gbuc0 = new gbur(gast0);
                break;
            }
            case 0x115600CF: {
                gbuc0 = new gbut(gast0);
                break;
            }
            case 0x118D7644: {
                gbuc0 = new gbvo(gast0);
                break;
            }
            case 0x11B64B22: {
                gbuc0 = new gbxe(gast0);
                break;
            }
            case 301214406: {
                gbuc0 = new gbzy(gast0);
                break;
            }
            case 0x1205B869: {
                gbuc0 = new gbts(gast0);
                break;
            }
            case 0x1215BF65: {
                gbuc0 = new gbpx(gast0);
                break;
            }
            case 310995137: {
                gbuc0 = new gbsf(gast0);
                break;
            }
            case 0x12E074FC: {
                gbuc0 = new gbrc(gast0);
                break;
            }
            case 0x12FC1E56: {
                gbuc0 = new gbra(gast0);
                break;
            }
            case 0x12FC2153: {
                gbuc0 = new gbrd(gast0);
                break;
            }
            case 323033777: {
                gbuc0 = new gbtu(gast0);
                break;
            }
            case 0x134DDB75: {
                gbuc0 = new gbri(gast0);
                break;
            }
            case 0x13635E37: {
                gbuc0 = new gbrh(gast0);
                break;
            }
            case 0x13E29559: {
                gbuc0 = new gbtk(gast0);
                break;
            }
            case 0x13E5BAE4: {
                gbuc0 = new gbtn(gast0);
                break;
            }
            case 0x144F9EAD: {
                gbuc0 = new gbpi(gast0);
                break;
            }
            case 0x1477BFA2: {
                gbuc0 = new gbty(gast0);
                break;
            }
            case 0x1498557F: {
                gbuc0 = new gces(gast0);
                break;
            }
            case 0x14A146D2: {
                gbuc0 = new gcbt(gast0);
                break;
            }
            case 346198508: {
                gbuc0 = new gbyn(gast0);
                break;
            }
            case 358920565: {
                gbuc0 = new gbvx(gast0);
                break;
            }
            case 0x177E2BDF: {
                gbuc0 = new gbqp(gast0);
                break;
            }
            case 0x196FD570: {
                gbuc0 = new gbrr(gast0);
                break;
            }
            case 0x1983D1F9: {
                gbuc0 = new gbvg(gast0);
                break;
            }
            case 0x19E8A115: {
                gbuc0 = new gbss(gast0);
                break;
            }
            case 0x1A460BC4: {
                gbuc0 = new gbqb(gast0);
                break;
            }
            case 0x1A460BC5: {
                gbuc0 = new gbqf(gast0);
                break;
            }
            case 440798150: {
                gbuc0 = new gbqm(gast0);
                break;
            }
            case 447370518: {
                gbuc0 = new gbux(gast0);
                break;
            }
            case 0x1B0BFC76: {
                gbuc0 = new gbtw(gast0);
                break;
            }
            case 0x1B454423: {
                gbuc0 = new gbva(gast0);
                break;
            }
            case 462181704: {
                gbuc0 = new gbvh(gast0);
                break;
            }
            case 0x1D035857: {
                gbuc0 = new gbvn(gast0);
                break;
            }
            case 0x1D25F33B: {
                gbuc0 = new gbti(gast0);
                break;
            }
            case 501037104: {
                gbuc0 = new gbql(gast0);
                break;
            }
            case 525000000: {
                gbuc0 = new gbte(gast0);
                break;
            }
            case 525000001: {
                gbuc0 = new gbsy(gast0);
                break;
            }
            default: {
                gbuc0 = null;
            }
        }
        garp garp0 = (garp)class0.cast(gbuc0);
        gaym gaym1 = this.a.a.g;
        hcos hcos1 = hcnu0.c;
        gayw gayw0 = new gayw((hcos1 == null ? hcos.a : hcos1).c);
        if(hcos1 == null) {
            hcos1 = hcos.a;
        }
        gavr.b(garp0, "BE_DM_11", gaym1, gayw0, String.format("Unable to create data %s of extension number %s", ((long)hcos1.c), ((int)hcnu0.i)));
        garp0.T(bundle0);
        garp0.S(hcnu0, bundle0);
        this.i = false;
        this.aU(garp0.nz(), garp0);
        return garp0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DataManager: [");
        int v = this.aP();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append(this.aT(v1));
            stringBuilder0.append(",");
        }
        stringBuilder0.append(" ] ");
        return stringBuilder0.toString();
    }
}


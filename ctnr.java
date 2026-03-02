import com.google.android.gms.multidevice.XdFeatureStatusUpdate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class ctnr implements csrl, ctnn {
    public final bboh a;
    public static final int b;
    private static final Map c;
    private static final Map d;
    private final csrd e;
    private boolean f;
    private final icnl g;

    static {
        ctnl[] arr_ctnl = ctnl.values();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(arr_ctnl.length), 16));
        for(int v = 0; true; ++v) {
            int v1 = 10;
            if(v >= arr_ctnl.length) {
                break;
            }
            ctnl ctnl0 = arr_ctnl[v];
            ibuq.f(ctnl0, "featureName");
            switch(ctnl0.ordinal()) {
                case 0: {
                    v1 = 7;
                    break;
                }
                case 1: {
                    break;
                }
                case 2: {
                    v1 = 8;
                    break;
                }
                case 3: {
                    v1 = 9;
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
            ibns ibns0 = new ibns(ctnl0, v1);
            linkedHashMap0.put(ibns0.a, ibns0.b);
        }
        ctnr.c = linkedHashMap0;
        Set set0 = linkedHashMap0.keySet();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(set0, 10)), 16));
        for(Object object0: set0) {
            ibns ibns1 = new ibns(((ctnl)object0), ctnm.a);
            linkedHashMap1.put(ibns1.a, ibns1.b);
        }
        ctnr.d = linkedHashMap1;
    }

    public ctnr(csrd csrd0) {
        ibuq.f(csrd0, "featureSettingsClient");
        super();
        this.e = csrd0;
        this.a = ctnb.b("Common");
        this.g = icnm.a(ctnr.d);
    }

    @Override  // csrl
    public final void a(XdFeatureStatusUpdate xdFeatureStatusUpdate0) {
        Map map1;
        ctnm ctnm0;
        ibuq.f(xdFeatureStatusUpdate0, "featureStatusUpdate");
        xdFeatureStatusUpdate0.b();
        do {
            icnl icnl0 = this.g;
            Object object0 = icnl0.b();
            Map map0 = (Map)object0;
            cteb cteb0 = (cteb)xdFeatureStatusUpdate0.b().get(Integer.valueOf(7));
            if(cteb0 == null || cteb0 == cteb.a) {
                map1 = ctnr.d;
            }
            else if(cteb0 == cteb.b) {
                Set set0 = ctnr.c.entrySet();
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(set0, 10)), 16));
                for(Object object1: set0) {
                    ctnl ctnl0 = (ctnl)((Map.Entry)object1).getKey();
                    int v = ((Number)((Map.Entry)object1).getValue()).intValue();
                    if(ctnl0 == ctnl.a) {
                        ctnm0 = ctnm.d;
                    }
                    else {
                        cteb cteb1 = (cteb)xdFeatureStatusUpdate0.b().get(Integer.valueOf(v));
                        if(cteb1 != null) {
                            switch(cteb1.ordinal()) {
                                case 0: {
                                    ctnm0 = ctnm.b;
                                    goto label_32;
                                }
                                case 1: {
                                    ctnm0 = ctnm.d;
                                    goto label_32;
                                }
                                case 2: {
                                    ctnm0 = ctnm.c;
                                    goto label_32;
                                }
                                case 3: {
                                    break;
                                }
                                default: {
                                    throw new ibnq();
                                }
                            }
                        }
                        ctnm0 = ctnm.a;
                    }
                label_32:
                    ibns ibns0 = new ibns(ctnl0, ctnm0);
                    linkedHashMap0.put(ibns0.a, ibns0.b);
                }
                map1 = linkedHashMap0;
            }
            else {
                ((ggtj)this.a.j()).x("MULTIDEVICE_SYNC is disabled");
                map1 = ctnr.d;
            }
        }
        while(!icnl0.h(object0, map1));
    }

    @Override  // ctnn
    public final icnj b() {
        return this.g;
    }

    @Override  // ctnn
    public final void c() {
        if(!hvnp.c()) {
            throw new IllegalStateException("Check failed.");
        }
        if(this.f) {
            throw new IllegalStateException("Check failed.");
        }
        List list0 = ibpo.ar(ctnr.c.values());
        evql evql0 = this.e.c(list0, this);
        evql0.b(new ctnp(new ctno()));
        evql0.A(new ctnq(this));
        this.f = true;
    }

    @Override  // ctnn
    public final void d() {
        if(!this.f) {
            throw new IllegalStateException("Check failed.");
        }
        this.e.b(this);
        this.f = false;
    }
}


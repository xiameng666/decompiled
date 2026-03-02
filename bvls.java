import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class bvls implements bvlp {
    public static final bboh a;
    public final bvkz b;
    public final bvkz c;
    public final Map d;
    public final bvlo e;
    public final Map f;
    public final clnw g;
    public final bvlv h;
    private final List i;

    static {
        bvls.a = bboh.b("SettingsCategoryRuleImpl", bbcu.fK);
    }

    public bvls(clnw clnw0, bvkz bvkz0, bvkz bvkz1, bvlv bvlv0) {
        this.g = clnw0;
        this.b = bvkz0;
        this.c = bvkz1;
        this.h = bvlv0;
        bvlq bvlq0 = new bvlq();
        bvlr bvlr0 = new bvlr(this);
        bvlq0.a(bvlr0);
        List list0 = ibpo.ar(bvlr0.a);
        this.i = list0;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list0, 10)), 16));
        for(Object object0: list0) {
            ibns ibns0 = new ibns(((bvlo)((ibns)object0).a).a, ((ibns)object0).a);
            linkedHashMap0.put(ibns0.a, ibns0.b);
        }
        this.d = linkedHashMap0;
        String s = this.g.b(0x7F1514B0);  // string:gs_category_other "Other"
        this.e = new bvlo(buyi.n, s, 1000);
        ibqu ibqu0 = new ibqu();
        for(Object object1: this.i) {
            bvlo bvlo0 = (bvlo)((ibns)object1).a;
            for(Object object2: ((List)((ibns)object1).b)) {
                ibqu0.put(((awkv)object2), bvlo0);
            }
        }
        this.f = ibpz.b(ibqu0);
    }
}


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class igyc implements fsry {
    private static final Map a;
    public static final Map f;

    static {
        Map map0 = ibpz.i(new ibns[]{new ibns(((int)1), new igxm(null)), new ibns(((int)2), new igxn(null)), new ibns(((int)3), new igxo(null)), new ibns(((int)4), new igxy(null)), new ibns(((int)5), new igxw(null)), new ibns(((int)6), new igxk(null)), new ibns(((int)7), new igyb(null)), new ibns(((int)8), new igxq(null)), new ibns(((int)9), igxl.a), new ibns(((int)10), new igxt(0, null, null)), new ibns(((int)11), new igxv(0, null))});
        igyc.f = map0;
        Set set0 = map0.entrySet();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(set0, 10)), 16));
        for(Object object0: set0) {
            ibns ibns0 = new ibns(new ibuk(((Map.Entry)object0).getValue().getClass()), ((Map.Entry)object0).getKey());
            linkedHashMap0.put(ibns0.a, ibns0.b);
        }
        igyc.a = linkedHashMap0;
    }

    public List a() {
        return ibps.a;
    }

    @Override  // fsry
    public final fsvb b() {
        ibuk ibuk0 = new ibuk(this.getClass());
        return fssm.k(null, Integer.valueOf(((Number)ibpz.g(igyc.a, ibuk0)).intValue()), null, null, null, null, null, this.a(), 0x7D);
    }

    public igyc c(List list0) {
        ibuq.f(list0, "args");
        return this;
    }
}


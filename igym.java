import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class igym implements fsry {
    private static final Map a;
    public static final igye b;
    public static final Map c;

    static {
        igym.b = new igye();
        Map map0 = ibpz.i(new ibns[]{new ibns(((int)0), igyf.a), new ibns(((int)1), new igyk(0L, 3)), new ibns(((int)2), new igyl(null)), new ibns(((int)3), new igyd(null)), new ibns(((int)4), new igyh(0, null, 15)), new ibns(((int)5), new igyj(null)), new ibns(((int)6), new igyi(igyf.a))});
        igym.c = map0;
        Set set0 = map0.entrySet();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(set0, 10)), 16));
        for(Object object0: set0) {
            ibns ibns0 = new ibns(new ibuk(((Map.Entry)object0).getValue().getClass()), ((Map.Entry)object0).getKey());
            linkedHashMap0.put(ibns0.a, ibns0.b);
        }
        igym.a = linkedHashMap0;
    }

    public List a() {
        return ibps.a;
    }

    @Override  // fsry
    public final fsvb b() {
        ibuk ibuk0 = new ibuk(this.getClass());
        return fssm.k(null, ((Integer)igym.a.get(ibuk0)), null, null, null, null, null, this.a(), 0x7D);
    }

    public igym c(List list0) {
        ibuq.f(list0, "args");
        return this;
    }
}


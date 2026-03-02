import j..util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashMap;
import java.util.function.Supplier;

public final class sbi implements ibth {
    public final sbv a;

    public sbi(sbv sbv0) {
        this.a = sbv0;
    }

    @Override  // ibth
    public final Object a() {
        sbv sbv0 = this.a;
        ryq ryq0 = new ryq(sbv0.a, sbv0.d, sbv0.e);
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(ryq0, 10)), 16));
        for(Object object0: ryq0) {
            ibns ibns0 = new ibns(new ron(((ryr)object0)), new sbj(((ryr)object0)));
            linkedHashMap0.put(ibns0.a, ibns0.b);
        }
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(sbv0.b, 10)), 16));
        for(Object object1: sbv0.b) {
            linkedHashMap1.put(((rve)((Supplier)object1).get()).k().o(), object1);
        }
        return new ConcurrentHashMap(ibpz.n(linkedHashMap1, linkedHashMap0));
    }
}


import j..util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashMap;
import java.util.function.Supplier;

public final class rvu implements ibth {
    public final rxl a;

    public rvu(rxl rxl0) {
        this.a = rxl0;
    }

    @Override  // ibth
    public final Object a() {
        rxl rxl0 = this.a;
        ryq ryq0 = new ryq(rxl0.h, rxl0.d, rxl0.e);
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(ryq0, 10)), 16));
        for(Object object0: ryq0) {
            ibns ibns0 = new ibns(new ron(((ryr)object0)), new rvv(((ryr)object0)));
            linkedHashMap0.put(ibns0.a, ibns0.b);
        }
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(rxl0.b, 10)), 16));
        for(Object object1: rxl0.b) {
            linkedHashMap1.put(((rve)((Supplier)object1).get()).k().o(), object1);
        }
        return new ConcurrentHashMap(ibpz.n(linkedHashMap1, linkedHashMap0));
    }
}


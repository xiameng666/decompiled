import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class bvlh implements Comparator {
    private final Comparator a;
    private final Map b;

    public bvlh(Comparator comparator0) {
        this.a = comparator0;
        hfuo hfuo0 = htvk.a.c().a().b;
        ibuq.e(hfuo0, "getOverridesList(...)");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(hfuo0, 10)), 16));
        for(Object object0: hfuo0) {
            buyi buyi0 = buyi.b(((buyl)object0).b);
            if(buyi0 == null) {
                buyi0 = buyi.o;
            }
            ibuq.e(buyi0, "getCategoryId(...)");
            linkedHashMap0.put(buyi0, Integer.valueOf(((buyl)object0).c));
        }
        this.b = linkedHashMap0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        bvlo bvlo0 = (bvlo)object0;
        bvlo bvlo1 = (bvlo)object1;
        ibuq.f(bvlo0, "a");
        ibuq.f(bvlo1, "b");
        Integer integer0 = (Integer)this.b.get(bvlo0.a);
        Integer integer1 = (Integer)this.b.get(bvlo1.a);
        if(integer0 != null) {
            bvlo0 = bvlo.a(bvlo0, integer0.intValue());
        }
        if(integer1 != null) {
            bvlo1 = bvlo.a(bvlo1, integer1.intValue());
        }
        return this.a.compare(bvlo0, bvlo1);
    }
}


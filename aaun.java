import java.util.Map.Entry;
import java.util.SortedMap;

public final class aaun implements ibth {
    public final aauo a;

    public aaun(aauo aauo0) {
        this.a = aauo0;
    }

    @Override  // ibth
    public final Object a() {
        grvk grvk0 = this.a.b();
        ibqu ibqu0 = new ibqu();
        if(((grvk0.h == null ? grvc.a : grvk0.h).b & 0x20000) != 0) {
            ibqu0.put(Integer.valueOf(1), Boolean.valueOf((grvk0.h == null ? grvc.a : grvk0.h).q));
        }
        if(((grvk0.h == null ? grvc.a : grvk0.h).b & 0x40000) != 0) {
            ibqu0.put(Integer.valueOf(2), Boolean.valueOf((grvk0.h == null ? grvc.a : grvk0.h).r));
        }
        if((grvk0.b & 0x8000) != 0) {
            ibqu0.put(Integer.valueOf(3), Boolean.valueOf(grvk0.q));
        }
        SortedMap sortedMap0 = ibpz.e(ibpz.b(ibqu0));
        ghga ghga0 = ghgz.a.h();
        for(Object object0: sortedMap0.entrySet()) {
            Object object1 = ((Map.Entry)object0).getKey();
            ibuq.e(object1, "component1(...)");
            Object object2 = ((Map.Entry)object0).getValue();
            ibuq.e(object2, "component2(...)");
            ghga0.j(((Integer)object1).intValue());
            ((ghfg)ghga0).e(((byte)((Boolean)object2).booleanValue()));
        }
        return ghga0.s().a();
    }
}


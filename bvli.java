import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class bvli implements Comparator {
    private final Comparator a;
    private final Map b;

    public bvli(Comparator comparator0) {
        this.a = comparator0;
        hfuo hfuo0 = htvk.b().b;
        ibuq.e(hfuo0, "getOverridesList(...)");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(hfuo0, 10)), 16));
        for(Object object0: hfuo0) {
            buyk buyk0 = ((buyn)object0).b;
            if(buyk0 == null) {
                buyk0 = buyk.a;
            }
            awkv awkv0 = awkv.b(buyk0.b) == null ? awkv.a : awkv.b(buyk0.b);
            ibuq.e(awkv0, "getGoogleSettingsItemId(...)");
            linkedHashMap0.put(awkv0, Integer.valueOf(((buyn)object0).c));
        }
        this.b = linkedHashMap0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        ibuq.f(((clob)object0), "a");
        ibuq.f(((clob)object1), "b");
        Integer integer0 = (Integer)this.b.get(((clob)object0).a);
        int v = 0;
        int v1 = integer0 == null ? 0 : ((int)integer0);
        Integer integer1 = (Integer)this.b.get(((clob)object1).a);
        if(integer1 != null) {
            v = (int)integer1;
        }
        return v1 == v ? this.a.compare(((clob)object0), ((clob)object1)) : ibuq.a(v1, v);
    }
}


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class gazw {
    public final Map a;
    private final ibts b;

    public gazw(ibts ibts0) {
        this.b = ibts0;
        this.a = new LinkedHashMap();
    }

    public final void a() {
        Set set0;
        LinkedHashMap linkedHashMap0;
        Map map0 = this.a;
        synchronized(map0) {
            linkedHashMap0 = new LinkedHashMap(ibpz.a(map0.size()));
            for(Object object0: map0.entrySet()) {
                Object object1 = ((Map.Entry)object0).getKey();
                gazi gazi0 = (gazi)((Map.Entry)object0).getValue();
                String s = (String)((Map.Entry)object0).getKey();
                String s1 = null;
                if((gazi0 instanceof gazg)) {
                    long v1 = ((gazg)gazi0).a.getAndSet(0L);
                    Long.valueOf(v1).getClass();
                    if(v1 > 0L) {
                        s1 = s + "=" + v1;
                    }
                    linkedHashMap0.put(object1, s1);
                    continue;
                }
                if(!(gazi0 instanceof gazh)) {
                    throw new ibnq();
                }
                synchronized(((gazh)gazi0).a) {
                    set0 = ((gazh)gazi0).a();
                    ((gazh)gazi0).a.clear();
                }
                if(((long)set0.size()) > 0L) {
                    s1 = s + "=" + ibpo.aK(set0, null, null, null, new gazt(), 0x1F);
                }
                linkedHashMap0.put(object1, s1);
                continue;
            }
        }
        List list0 = ibpo.ao(linkedHashMap0.entrySet(), new gazu());
        ArrayList arrayList0 = new ArrayList();
        for(Object object2: list0) {
            String s2 = (String)((Map.Entry)object2).getValue();
            if(s2 != null) {
                arrayList0.add(s2);
            }
        }
        String s3 = ibpo.aK(arrayList0, "\n\t", "Metrics Report:\n\t", null, null, 60);
        this.b.a(s3);
    }
}


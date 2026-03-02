import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

final class ggur extends ggus {
    private final Map a;

    public ggur(ggub ggub0, ggub ggub1) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        ggur.e(linkedHashMap0, ggub0);
        ggur.e(linkedHashMap0, ggub1);
        for(Object object0: linkedHashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((ggsx)map$Entry0.getKey()).b) {
                map$Entry0.setValue(DesugarCollections.unmodifiableList(((List)map$Entry0.getValue())));
            }
        }
        this.a = DesugarCollections.unmodifiableMap(linkedHashMap0);
    }

    @Override  // ggus
    public final int a() {
        return this.a.size();
    }

    @Override  // ggus
    public final Object b(ggsx ggsx0) {
        ggwv.a(((boolean)(ggsx0.b ^ 1)), "key must be single valued");
        Object object0 = this.a.get(ggsx0);
        return object0 == null ? null : object0;
    }

    @Override  // ggus
    public final Set c() {
        return this.a.keySet();
    }

    @Override  // ggus
    public final void d(ggui ggui0, Object object0) {
        for(Object object1: this.a.entrySet()) {
            ggsx ggsx0 = (ggsx)((Map.Entry)object1).getKey();
            Object object2 = ((Map.Entry)object1).getValue();
            if(ggsx0.b) {
                ggui0.b(ggsx0, ((List)object2).iterator(), object0);
            }
            else {
                ggui0.a(ggsx0, object2, object0);
            }
        }
    }

    private static void e(Map map0, ggub ggub0) {
        for(int v = 0; v < ggub0.b(); ++v) {
            ggsx ggsx0 = ggub0.c(v);
            Object object0 = map0.get(ggsx0);
            if(ggsx0.b) {
                List list0 = (List)object0;
                if(list0 == null) {
                    list0 = new ArrayList();
                    map0.put(ggsx0, list0);
                }
                list0.add(ggsx0.c(ggub0.e(v)));
            }
            else {
                map0.put(ggsx0, ggsx0.c(ggub0.e(v)));
            }
        }
    }
}


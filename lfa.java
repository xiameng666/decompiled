import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class lfa {
    public final let a;
    private final Map b;

    public lfa() {
        throw null;
    }

    public lfa(Map map0, boolean z) {
        this.b = map0;
        this.a = new let(z);
    }

    public lfa(boolean z) {
        this(new LinkedHashMap(), z);
    }

    public final Object a(ley ley0) {
        byte[] arr_b = this.b.get(ley0);
        if((arr_b instanceof byte[])) {
            arr_b = Arrays.copyOf(arr_b, arr_b.length);
            ibuq.e(arr_b, "copyOf(...)");
        }
        return arr_b;
    }

    public final Map b() {
        ibns ibns0;
        Set set0 = this.b.entrySet();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(set0, 10)), 16));
        for(Object object0: set0) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Object object1 = map$Entry0.getValue();
            if((object1 instanceof byte[])) {
                Object object2 = map$Entry0.getKey();
                byte[] arr_b = Arrays.copyOf(((byte[])object1), ((byte[])object1).length);
                ibuq.e(arr_b, "copyOf(...)");
                ibns0 = new ibns(object2, arr_b);
            }
            else {
                ibns0 = new ibns(map$Entry0.getKey(), map$Entry0.getValue());
            }
            linkedHashMap0.put(ibns0.a, ibns0.b);
        }
        Map map0 = DesugarCollections.unmodifiableMap(linkedHashMap0);
        ibuq.e(map0, "unmodifiableMap(...)");
        return map0;
    }

    public final void c() {
        if(!this.a.a.get()) {
            return;
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
    }

    public final void d() {
        this.c();
        this.b.clear();
    }

    public final void e(ley ley0, Object object0) {
        this.c();
        if(object0 == null) {
            this.c();
            this.b.remove(ley0);
            return;
        }
        if((object0 instanceof Set)) {
            Set set0 = DesugarCollections.unmodifiableSet(ibpo.ay(((Set)object0)));
            ibuq.e(set0, "unmodifiableSet(...)");
            this.b.put(ley0, set0);
            return;
        }
        Map map0 = this.b;
        if((object0 instanceof byte[])) {
            byte[] arr_b = Arrays.copyOf(((byte[])object0), ((byte[])object0).length);
            ibuq.e(arr_b, "copyOf(...)");
            map0.put(ley0, arr_b);
            return;
        }
        map0.put(ley0, object0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof lfa)) {
            return false;
        }
        Map map0 = ((lfa)object0).b;
        Map map1 = this.b;
        if(map0 == map1) {
            return true;
        }
        if(map0.size() != map1.size()) {
            return false;
        }
        if(map0.isEmpty()) {
            return true;
        }
        for(Object object1: map0.entrySet()) {
            Object object2 = map1.get(((Map.Entry)object1).getKey());
            if(object2 != null) {
                Object object3 = ((Map.Entry)object1).getValue();
                if((object3 instanceof byte[])) {
                    if((object2 instanceof byte[]) && Arrays.equals(((byte[])object3), ((byte[])object2))) {
                        continue;
                    }
                    return false;
                }
                if(!ibuq.m(object3, object2)) {
                    return false;
                }
                continue;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        for(Object object0: this.b.entrySet()) {
            Object object1 = ((Map.Entry)object0).getValue();
            v += ((object1 instanceof byte[]) ? Arrays.hashCode(((byte[])object1)) : object1.hashCode());
        }
        return v;
    }

    @Override
    public final String toString() {
        return ibpo.aK(this.b.entrySet(), ",\n", "{\n", "\n}", new leu(), 24);
    }
}


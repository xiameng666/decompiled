import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;

public final class aiyq implements gfsi {
    public final ajab a;

    public aiyq(ajab ajab0) {
        this.a = ajab0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((ajbz)object0) == null) {
            ((ggtj)aizo.a.i()).x("No block data on device!");
            return ggna.a;
        }
        Map map0 = DesugarCollections.unmodifiableMap(((ajbz)object0).g);
        Map map1 = DesugarCollections.unmodifiableMap(((ajbz)object0).f);
        HashSet hashSet0 = new HashSet();
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: DesugarCollections.unmodifiableMap(((ajbz)object0).e).values()) {
            for(Object object2: DesugarCollections.unmodifiableMap(((ajbw)object1).c).values()) {
                ajbp ajbp0 = ((ajbr)object2).d;
                if(ajbp0 == null) {
                    ajbp0 = ajbp.a;
                }
                arrayList0.add(ajbp0);
            }
        }
        for(Object object3: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object3;
            ByteString hfsf0 = (ByteString)map1.get(map$Entry0.getKey());
            if(hfsf0 != null && !hfsf0.isEmpty()) {
                arrayList0.add(((ajbp)map$Entry0.getValue()));
            }
        }
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ajbp ajbp1 = (ajbp)arrayList0.get(v1);
            if(!this.a.a || (ajbp1.e == null ? ajbo.a : ajbp1.e).c) {
                hashSet0.add(ajbp1.c);
            }
        }
        return gged_interceptors.i(hashSet0);
    }
}


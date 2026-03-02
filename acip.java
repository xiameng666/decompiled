import android.util.ArrayMap;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class acip {
    public final Set a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final boolean f;
    public final int g;
    private final Set h;
    private final Map i;

    public acip(Set set0, Set set1, Map map0, Map map1, Map map2, Map map3, Map map4, boolean z, int v) {
        this.h = (Set)Objects.requireNonNull(set0);
        this.a = (Set)Objects.requireNonNull(set1);
        this.b = (Map)Objects.requireNonNull(map0);
        this.c = (Map)Objects.requireNonNull(map1);
        this.d = (Map)Objects.requireNonNull(map2);
        this.e = (Map)Objects.requireNonNull(map3);
        this.i = (Map)Objects.requireNonNull(map4);
        this.f = z;
        this.g = v;
    }

    public static ArrayMap a(Map map0) {
        ArrayMap arrayMap0 = new ArrayMap(map0.size());
        for(Object object0: map0.entrySet()) {
            bxf bxf0 = new bxf();
            for(Object object1: ((Set)((Map.Entry)object0).getValue())) {
                bxf0.add(new bxf(((Set)object1)));
            }
            arrayMap0.put(((String)((Map.Entry)object0).getKey()), bxf0);
        }
        return arrayMap0;
    }

    public final Map b() {
        return DesugarCollections.unmodifiableMap(this.i);
    }

    public final Set c() {
        return DesugarCollections.unmodifiableSet(this.h);
    }
}


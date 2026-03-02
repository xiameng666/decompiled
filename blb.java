import android.util.ArrayMap;
import j..util.Objects;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class blb extends blf implements bjt {
    private static final bjs d;

    static {
        blb.d = bjs.d;
    }

    private blb(TreeMap treeMap0) {
        super(treeMap0);
    }

    public static blb a() {
        return new blb(new TreeMap(blb.a));
    }

    public static blb b(bjt bjt0) {
        TreeMap treeMap0 = new TreeMap(blb.a);
        for(Object object0: bjt0.r()) {
            bjr bjr0 = (bjr)object0;
            Set set0 = bjt0.q(bjr0);
            ArrayMap arrayMap0 = new ArrayMap();
            for(Object object1: set0) {
                arrayMap0.put(((bjs)object1), bjt0.n(bjr0, ((bjs)object1)));
            }
            treeMap0.put(bjr0, arrayMap0);
        }
        return new blb(treeMap0);
    }

    public final void c(bjr bjr0, Object object0) {
        this.d(bjr0, blb.d, object0);
    }

    public final void d(bjr bjr0, bjs bjs0, Object object0) {
        TreeMap treeMap0 = this.c;
        Map map0 = (Map)treeMap0.get(bjr0);
        if(map0 == null) {
            ArrayMap arrayMap0 = new ArrayMap();
            treeMap0.put(bjr0, arrayMap0);
            arrayMap0.put(bjs0, object0);
            return;
        }
        bjs bjs1 = (bjs)Collections.min(map0.keySet());
        if(!Objects.equals(map0.get(bjs1), object0) && (bjs1 == bjs.c && bjs0 == bjs.c)) {
            throw new IllegalArgumentException("Option values conflicts: " + bjr0.a + ", existing value (" + bjs1 + ")=" + map0.get(bjs1) + ", conflicting (" + bjs0 + ")=" + object0);
        }
        map0.put(bjs0, object0);
    }

    public final void e(bjr bjr0) {
        this.c.remove(bjr0);
    }
}


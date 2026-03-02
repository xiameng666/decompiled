import android.util.ArrayMap;
import j..util.DesugarCollections;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class blf implements bjt {
    protected static final Comparator a;
    public static final blf b;
    protected final TreeMap c;

    static {
        ble ble0 = new ble();
        blf.a = ble0;
        blf.b = new blf(new TreeMap(ble0));
    }

    public blf(TreeMap treeMap0) {
        this.c = treeMap0;
    }

    public static blf f(bjt bjt0) {
        Class class0 = bjt0.getClass();
        if(blf.class.equals(class0)) {
            return (blf)bjt0;
        }
        TreeMap treeMap0 = new TreeMap(blf.a);
        for(Object object0: bjt0.r()) {
            bjr bjr0 = (bjr)object0;
            Set set0 = bjt0.q(bjr0);
            ArrayMap arrayMap0 = new ArrayMap();
            for(Object object1: set0) {
                arrayMap0.put(((bjs)object1), bjt0.n(bjr0, ((bjs)object1)));
            }
            treeMap0.put(bjr0, arrayMap0);
        }
        return new blf(treeMap0);
    }

    @Override  // bjt
    public final bjs g(bjr bjr0) {
        Map map0 = (Map)this.c.get(bjr0);
        if(map0 != null) {
            return (bjs)Collections.min(map0.keySet());
        }
        Objects.toString(bjr0);
        throw new IllegalArgumentException("Option does not exist: " + bjr0);
    }

    @Override  // bjt
    public final Object l(bjr bjr0) {
        Map map0 = (Map)this.c.get(bjr0);
        if(map0 != null) {
            return map0.get(((bjs)Collections.min(map0.keySet())));
        }
        Objects.toString(bjr0);
        throw new IllegalArgumentException("Option does not exist: " + bjr0);
    }

    @Override  // bjt
    public final Object m(bjr bjr0, Object object0) {
        try {
            return this.l(bjr0);
        }
        catch(IllegalArgumentException unused_ex) {
            return object0;
        }
    }

    @Override  // bjt
    public final Object n(bjr bjr0, bjs bjs0) {
        Map map0 = (Map)this.c.get(bjr0);
        if(map0 != null) {
            if(map0.containsKey(bjs0)) {
                return map0.get(bjs0);
            }
            throw new IllegalArgumentException(a.m(bjs0, bjr0, "Option does not exist: ", " with priority="));
        }
        Objects.toString(bjr0);
        throw new IllegalArgumentException("Option does not exist: " + bjr0);
    }

    @Override  // bjt
    public final Set q(bjr bjr0) {
        Map map0 = (Map)this.c.get(bjr0);
        return map0 == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(map0.keySet());
    }

    @Override  // bjt
    public final Set r() {
        return DesugarCollections.unmodifiableSet(this.c.keySet());
    }

    @Override  // bjt
    public final boolean s(bjr bjr0) {
        return this.c.containsKey(bjr0);
    }

    @Override  // bjt
    public final void v(azg azg0) {
        bjr bjr0 = new bjr("camera2.captureRequest.option.", Void.class, null);
        for(Object object0: this.c.tailMap(bjr0).entrySet()) {
            if(!((bjr)((Map.Entry)object0).getKey()).a.startsWith("camera2.captureRequest.option.")) {
                break;
            }
            bjr bjr1 = (bjr)((Map.Entry)object0).getKey();
            bjs bjs0 = azg0.b.g(bjr1);
            Object object1 = azg0.b.l(bjr1);
            azg0.a.a.d(bjr1, bjs0, object1);
        }
    }
}


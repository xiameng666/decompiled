import j..util.DesugarCollections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class conb implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = new HashSet();
        Map map0 = DesugarCollections.unmodifiableMap(((cogm)object0).c);
        for(Object object2: map0.keySet()) {
            ((Set)object1).addAll(cond.q(((String)object2), map0));
        }
        return object1;
    }
}


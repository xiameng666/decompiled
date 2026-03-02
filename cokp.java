import j..util.DesugarCollections;
import java.util.Set;

public final class cokp implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        for(Object object1: DesugarCollections.unmodifiableMap(((cogm)object0).c).values()) {
            Set set0 = DesugarCollections.unmodifiableMap(((cogp)object1).b).keySet();
            for(Object object2: huzk.a.s().R().b) {
                if(set0.contains(((String)object2))) {
                    return Boolean.valueOf(true);
                }
            }
        }
        return Boolean.valueOf(false);
    }
}


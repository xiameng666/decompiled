import j..util.DesugarCollections;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public final class colu implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = new HashSet();
        for(Object object2: DesugarCollections.unmodifiableMap(((cogm)object0).c).entrySet()) {
            String s = (String)((Map.Entry)object2).getKey();
            if(((cogp)((Map.Entry)object2).getValue()).b.size() > 0) {
                ((Set)object1).add(s);
            }
        }
        if(huzk.x()) {
            ((Set)object1).addAll(DesugarCollections.unmodifiableMap(((cogm)object0).d).keySet());
        }
        return object1;
    }
}


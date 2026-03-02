import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class iyi implements ibtw {
    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Object object2 = new ArrayList(((List)object1).size());
        int v = ((List)object1).size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Collection)object2).add(jah.a(((iwh)((List)object1).get(v1)), jah.c, ((haf)object0)));
        }
        return object2;
    }
}


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class izh implements ibtw {
    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        List list0 = ((jii)object1).b;
        Object object2 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Collection)object2).add(jah.a(((jig)list0.get(v1)), jah.u, ((haf)object0)));
        }
        return object2;
    }
}


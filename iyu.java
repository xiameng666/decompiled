import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class iyu implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.d(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        Object object1 = new ArrayList(((List)object0).size());
        int v = ((List)object0).size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object2 = ((List)object0).get(v1);
            hax hax0 = jah.c;
            Object object3 = null;
            if(!ibuq.m(object2, Boolean.valueOf(false)) && object2 != null) {
                object3 = (iwh)hax0.a(object2);
            }
            ibuq.c(object3);
            ((Collection)object1).add(object3);
        }
        return object1;
    }
}


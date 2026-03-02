import java.util.ArrayList;
import java.util.List;

public final class izi implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.d(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        ArrayList arrayList0 = new ArrayList(((List)object0).size());
        int v = ((List)object0).size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object1 = ((List)object0).get(v1);
            hax hax0 = jah.u;
            Object object2 = null;
            if(!ibuq.m(object1, Boolean.valueOf(false)) && object1 != null) {
                object2 = (jig)hax0.a(object1);
            }
            ibuq.c(object2);
            arrayList0.add(object2);
        }
        return new jii(arrayList0);
    }
}


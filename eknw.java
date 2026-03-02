import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class eknw implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((List)object0));
        Object object1 = new ArrayList(ibpo.q(((List)object0), 10));
        for(Object object2: ((List)object0)) {
            String s = ((eljz)object2).d;
            ibuq.e(s, "getPackageName(...)");
            ((Collection)object1).add(s);
        }
        return object1;
    }
}


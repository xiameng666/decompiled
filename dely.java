import java.util.Collection;
import java.util.Set;

public final class dely implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((hgs)object0), "startEvent");
        Set set0 = hhb.b(((hgs)object0));
        if(!(set0 instanceof Collection) || !set0.isEmpty()) {
            for(Object object1: set0) {
                String s = (String)object1;
                Set set1 = demb.a;
                if(!(set1 instanceof Collection) || !set1.isEmpty()) {
                    for(Object object2: set1) {
                        if(!ibzk.W(s, ((String)object2))) {
                            continue;
                        }
                        return Boolean.valueOf(true);
                    }
                }
            }
        }
        return Boolean.valueOf(false);
    }
}


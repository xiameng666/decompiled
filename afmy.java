import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

public final class afmy implements bxto {
    @Override  // bxto
    public final Object a(Object object0) {
        Object object1;
        Iterable iterable0 = ggch.j(((List)object0)).l(new afnk()).q();
        if((iterable0 instanceof List)) {
            return ((List)iterable0).isEmpty() ? gfqx.a : gfsx.m(((List)iterable0).get(((List)iterable0).size() - 1));
        }
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return gfqx.a;
        }
        if(!(iterable0 instanceof SortedSet)) {
            do {
                object1 = iterator0.next();
            }
            while(iterator0.hasNext());
            return gfsx.m(object1);
        }
        return gfsx.m(((SortedSet)iterable0).last());
    }
}


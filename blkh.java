import java.util.ArrayList;
import java.util.List;

public final class blkh implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = new ArrayList();
        for(Object object2: ((List)object0)) {
            List list0 = (List)object2;
            if(list0 != null) {
                ((ArrayList)object1).addAll(list0);
            }
        }
        return object1;
    }
}


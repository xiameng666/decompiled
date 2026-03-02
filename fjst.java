import java.util.ArrayList;
import java.util.List;

public final class fjst implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = new ArrayList();
        for(Object object2: ((List)object0)) {
            fjxp fjxp0 = (fjxp)object2;
            if(!(fjxp0.b.c == null ? fjbn.a : fjxp0.b.c).h) {
                ((List)object1).add(fjxp0);
            }
        }
        return object1;
    }
}


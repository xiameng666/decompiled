import java.util.Comparator;
import java.util.Map;

public final class kyw implements Comparator {
    public final ibvd a;

    public kyw(ibvd ibvd0) {
        this.a = ibvd0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        Object object2 = ((Map)this.a.a).get(((byte[])object0));
        ibuq.c(object2);
        Object object3 = ((Map)this.a.a).get(((byte[])object1));
        ibuq.c(object3);
        if(((byte[])object0).length > ((byte[])object1).length) {
            return 1;
        }
        if(((byte[])object0).length < ((byte[])object1).length) {
            return -1;
        }
        if(((byte[])object2).length > ((byte[])object3).length) {
            return 1;
        }
        return ((byte[])object2).length < ((byte[])object3).length ? -1 : 0;
    }
}


import java.util.List;

public final class bsdn implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        for(Object object1: ((List)object0)) {
            Object object2 = (Integer)object1;
            if(object2 != null && ((int)(((Integer)object2))) != 0) {
                return object2;
            }
        }
        return (int)0;
    }
}


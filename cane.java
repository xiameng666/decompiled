import java.util.List;

final class cane implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((List)object0) == null) {
            return Boolean.valueOf(false);
        }
        Object object1 = Boolean.valueOf(true);
        for(Object object2: ((List)object0)) {
            object1 = Boolean.valueOf(((boolean)(((Boolean)object1).booleanValue() & ((Boolean)object2).booleanValue())));
        }
        return object1;
    }
}


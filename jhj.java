import java.util.List;

public final class jhj implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        Object object3;
        ibuq.d(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        Object object1 = ((List)object0).get(0);
        hax hax0 = jah.a;
        Boolean boolean0 = Boolean.valueOf(false);
        Object object2 = null;
        if(ibuq.m(object1, boolean0)) {
            object3 = null;
        }
        else if(object1 != null) {
            object3 = (iwj)hax0.a(object1);
        }
        else {
            object3 = null;
        }
        ibuq.c(object3);
        Object object4 = ((List)object0).get(1);
        hax hax1 = jah.p;
        if(!ibuq.m(object4, boolean0) && object4 != null) {
            object2 = (jbk)hax1.a(object4);
        }
        ibuq.c(object2);
        return new jhk(((iwj)object3), object2.b);
    }
}


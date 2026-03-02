import java.util.List;

public final class ixw implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        List list0;
        ibuq.d(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object object1 = ((List)object0).get(1);
        hax hax0 = jah.b;
        String s = null;
        if(ibuq.m(object1, Boolean.valueOf(false))) {
            list0 = null;
        }
        else if(object1 != null) {
            list0 = (List)hax0.a(object1);
        }
        else {
            list0 = null;
        }
        Object object2 = ((List)object0).get(0);
        if(object2 != null) {
            s = (String)object2;
        }
        ibuq.c(s);
        return new iwj(list0, s);
    }
}


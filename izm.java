import java.util.List;

public final class izm implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.d(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object object1 = ((List)object0).get(0);
        String s = object1 == null ? null : ((String)object1);
        ibuq.c(s);
        Object object2 = ((List)object0).get(1);
        hax hax0 = jah.j;
        if(ibuq.m(object2, Boolean.valueOf(false))) {
            return new iwy(s, null, null);
        }
        return object2 == null ? new iwy(s, null, null) : new iwy(s, ((jbf)hax0.a(object2)), null);
    }
}


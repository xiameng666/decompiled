import java.util.List;

public final class iyc implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.d(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        Object object1 = ((List)object0).get(0);
        jag jag0 = jah.A;
        Boolean boolean0 = Boolean.valueOf(false);
        ibuq.m(object1, boolean0);
        jlp jlp0 = null;
        jlp jlp1 = object1 == null ? null : ((jlp)jag0.a(object1));
        ibuq.c(jlp1);
        Object object2 = ((List)object0).get(1);
        ibuq.m(object2, boolean0);
        if(object2 != null) {
            jlp0 = (jlp)jag0.a(object2);
        }
        ibuq.c(jlp0);
        return new jki(jlp1.b, jlp0.b);
    }
}


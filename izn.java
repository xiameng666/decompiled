import java.util.List;

public final class izn implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.d(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        Object object1 = ((List)object0).get(0);
        Boolean boolean0 = Boolean.valueOf(false);
        ibuq.m(object1, boolean0);
        jju jju0 = null;
        jjt jjt0 = object1 == null ? null : ((jjt)jah.D.a(object1));
        ibuq.c(jjt0);
        Object object2 = ((List)object0).get(1);
        ibuq.m(object2, boolean0);
        jjv jjv0 = object2 == null ? null : ((jjv)jah.E.a(object2));
        ibuq.c(jjv0);
        Object object3 = ((List)object0).get(2);
        jag jag0 = jah.F;
        ibuq.m(object3, boolean0);
        if(object3 != null) {
            jju0 = (jju)jag0.a(object3);
        }
        ibuq.c(jju0);
        return new jjw(jjt0.c, jjv0.a, jju0.a);
    }
}


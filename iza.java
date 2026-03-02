import java.util.List;

public final class iza implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        Boolean boolean0 = Boolean.valueOf(false);
        if(ibuq.m(object0, boolean0)) {
            return new jlp(jlp.a);
        }
        ibuq.d(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        Object object1 = ((List)object0).get(0);
        jlr jlr0 = null;
        Float float0 = object1 == null ? null : ((Float)object1);
        ibuq.c(float0);
        float f = float0.floatValue();
        Object object2 = ((List)object0).get(1);
        jag jag0 = jah.B;
        ibuq.m(object2, boolean0);
        if(object2 != null) {
            jlr0 = (jlr)jag0.a(object2);
        }
        ibuq.c(jlr0);
        return new jlp(jlq.f(jlr0.a, f));
    }
}


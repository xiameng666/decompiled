import java.util.List;

public final class ehe implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        Object object1 = ((List)object0).get(1);
        ibuq.d(object1, "null cannot be cast to non-null type kotlin.Boolean");
        Object object2 = ((List)object0).get(0);
        ibuq.d(object2, "null cannot be cast to non-null type kotlin.Float");
        return new ehf((((Boolean)object1).booleanValue() ? dbw.a : dbw.b), ((float)(((Float)object2))));
    }
}


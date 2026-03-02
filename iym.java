import java.util.List;

public final class iym implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.d(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        Object object1 = ((List)object0).get(0);
        Boolean boolean0 = Boolean.valueOf(false);
        ibuq.m(object1, boolean0);
        Float float0 = null;
        hll hll0 = object1 == null ? null : ((hll)jah.w.a(object1));
        ibuq.c(hll0);
        Object object2 = ((List)object0).get(1);
        ibuq.m(object2, boolean0);
        hjz hjz0 = object2 == null ? null : ((hjz)jah.C.a(object2));
        ibuq.c(hjz0);
        Object object3 = ((List)object0).get(2);
        if(object3 != null) {
            float0 = (Float)object3;
        }
        ibuq.c(float0);
        float f = float0.floatValue();
        return new hmt(hll0.j, hjz0.a, f);
    }
}


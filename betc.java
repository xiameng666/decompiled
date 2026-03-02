import java.util.ArrayList;

public final class betc implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gged_interceptors)object0), "<this>");
        ArrayList arrayList0 = new ArrayList(ibpo.q(((gged_interceptors)object0), 10));
        for(Object object1: ((gged_interceptors)object0)) {
            gqls gqls0 = new gqls(((gqlt)object1));
            ibuq.e(((gqlt)object1).b, "getGroupBrandingInfo(...)");
            gqls0.c(beoe.a(((gqlt)object1).b));
            arrayList0.add(gqls0.a());
        }
        return ggdx.a(arrayList0);
    }
}


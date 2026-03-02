import java.util.Set;

final class duro implements ibtx {
    final Set a;
    final ibts b;

    public duro(Set set0, ibts ibts0) {
        this.a = set0;
        this.b = ibts0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dld)object0), "contentPaddings");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dld)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        durr.a(dla.e(dla.c(hfc.e, ((dld)object0)), 24.0f, 16.0f), this.a, this.b, ((goz)object1), 0);
        return ibom.a;
    }
}


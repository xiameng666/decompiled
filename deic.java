import java.util.List;

final class deic implements ibtw {
    final List a;
    final int b;

    public deic(List list0, int v) {
        this.a = list0;
        this.b = v;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        dedg dedg0 = (dedg)ibpo.U(this.a, this.b);
        if(dedg0 != null) {
            hpw hpw0 = deig.l(dedg0, ((goz)object0));
            String s = null;
            decy decy0 = (dedg0 instanceof decy) ? ((decy)dedg0) : null;
            if(decy0 != null) {
                s = decy0.a();
            }
            deig.k(hpw0, s, ((goz)object0));
        }
        return ibom.a;
    }
}


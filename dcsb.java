import java.util.Map.Entry;
import java.util.Map;

final class dcsb extends ibsl implements ibtw {
    final Map a;
    final dcsh b;
    private Object c;

    public dcsb(Map map0, dcsh dcsh0, ibrl ibrl0) {
        this.a = map0;
        this.b = dcsh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcsb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dcsb(this.a, this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        icck icck0 = (icck)this.c;
        for(Object object1: this.a.entrySet()) {
            dcsk dcsk0 = (dcsk)((Map.Entry)object1).getKey();
            dctq dctq0 = (dctq)((Map.Entry)object1).getValue();
            icbb.b(icck0, null, null, new dcsa(dcsk0, this.b, dctq0, null), 3);
        }
        return ibom.a;
    }
}


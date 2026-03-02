import java.util.ArrayList;
import java.util.List;

final class eppj extends ibsl implements ibtw {
    int a;
    final List b;
    final ibts c;
    private Object d;

    public eppj(List list0, ibts ibts0, ibrl ibrl0) {
        this.b = list0;
        this.c = ibts0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eppj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new eppj(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icck icck0 = (icck)this.d;
            ibts ibts0 = this.c;
            ArrayList arrayList0 = new ArrayList(ibpo.q(this.b, 10));
            for(Object object2: this.b) {
                arrayList0.add(icbb.a(icck0, null, null, new eppi(ibts0, ((String)object2), null), 3));
            }
            this.a = 1;
            object0 = icay.a(arrayList0, this);
            if(object0 == object1) {
                return object1;
            }
        }
        return ibpo.at(ibpo.r(((Iterable)object0)));
    }
}


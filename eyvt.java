import java.util.Iterator;
import java.util.List;

final class eyvt extends ibsl implements ibtw {
    Object a;
    int b;
    final eyvx c;

    public eyvt(eyvx eyvx0, ibrl ibrl0) {
        this.c = eyvx0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyvt)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyvt(this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                icht icht0 = new icht(new exxl(exxa.b(this.c.a.a.o()), null));
                this.b = 1;
                object0 = icll.a(icht0, this);
                if(object0 == object1) {
                    return object1;
                }
                object2 = ((List)object0).iterator();
                break;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((List)object0).iterator();
                break;
            }
            default: {
                object2 = this.a;
                ibnx.b(object0);
            }
        }
        while(((Iterator)object2).hasNext()) {
            Object object3 = ((Iterator)object2).next();
            this.a = object2;
            this.b = 2;
            if(this.c.a.i(((exwv)object3), this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


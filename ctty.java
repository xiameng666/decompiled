import java.util.Iterator;

final class ctty extends ibsl implements ibtw {
    Object a;
    int b;
    final cttz c;
    private Object d;

    public ctty(cttz cttz0, ibrl ibrl0) {
        this.c = cttz0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctty)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ctty(this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icih icih0;
        Object object2;
        Object object1 = ibrx.a;
        if(this.b == 0) {
            ibnx.b(object0);
            icih0 = (icih)this.d;
            object2 = this.c.d.values().iterator();
        }
        else {
            object2 = this.a;
            icih0 = (icih)this.d;
            ibnx.b(object0);
        }
        while(((Iterator)object2).hasNext()) {
            Object object3 = ((Iterator)object2).next();
            ctoy ctoy0 = new ctoy(((ctoq)object3));
            this.d = icih0;
            this.a = object2;
            this.b = 1;
            if(icih0.a(ctoy0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


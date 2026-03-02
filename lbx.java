final class lbx extends ibsl implements ibts {
    Object a;
    int b;
    final lcc c;
    final ibrt d;
    final ibtw e;

    public lbx(lcc lcc0, ibrt ibrt0, ibtw ibtw0, ibrl ibrl0) {
        this.c = lcc0;
        this.d = ibrt0;
        this.e = ibtw0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new lbx(this.c, this.d, this.e, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        lah lah0;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                this.b = 1;
                object0 = this.c.i(true, this);
                if(object0 != object1) {
                    goto label_11;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
            label_11:
                lbw lbw0 = new lbw(this.e, ((lah)object0), null);
                this.a = (lah)object0;
                this.b = 2;
                Object object3 = icbd.a(this.d, lbw0, this);
                if(object3 != object1) {
                    lah0 = (lah)object0;
                    object0 = object3;
                    break;
                }
                return object1;
            }
            case 2: {
                lah0 = (lah)this.a;
                ibnx.b(object0);
                break;
            }
            default: {
                Object object2 = this.a;
                ibnx.b(object0);
                return object2;
            }
        }
        Object object4 = lah0.a;
        if((object4 == null ? 0 : object4.hashCode()) != lah0.b) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        if(!ibuq.m(object4, object0)) {
            this.a = object0;
            this.b = 3;
            return this.c.k(object0, true, this) == object1 ? object1 : object0;
        }
        return object0;
    }
}


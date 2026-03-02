final class lcb extends ibsl implements ibtw {
    Object a;
    int b;
    final ibvb c;
    final lcc d;
    final Object e;
    final boolean f;
    private Object g;

    public lcb(ibvb ibvb0, lcc lcc0, Object object0, boolean z, ibrl ibrl0) {
        this.c = ibvb0;
        this.d = lcc0;
        this.e = object0;
        this.f = z;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((lcb)this.c(((lci)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new lcb(this.c, this.d, this.e, this.f, ibrl0);
        ibrl1.g = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        lci lci1;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                lci lci0 = (lci)this.g;
                object2 = this.c;
                lct lct0 = this.d.c();
                this.g = lci0;
                this.a = object2;
                this.b = 1;
                Object object3 = lct0.b(this);
                if(object3 != object1) {
                    lci1 = lci0;
                    object0 = object3;
                    goto label_19;
                }
                break;
            }
            case 1: {
                object2 = this.a;
                lci1 = (lci)this.g;
                ibnx.b(object0);
            label_19:
                ((ibvb)object2).a = ((Number)object0).intValue();
                this.g = null;
                this.a = null;
                this.b = 2;
                lci1.b();
                lcr lcr0 = new lcr(lci1, this.e, null);
                Object object4 = lcq.a(lci1.a, lcr0, this);
                if(object4 != object1) {
                    object4 = ibom.a;
                }
                if(object4 != object1) {
                label_29:
                    if(this.f) {
                        lah lah0 = new lah(this.e, (this.e == null ? 0 : this.e.hashCode()), this.c.a);
                        this.d.d.b(lah0);
                    }
                    return ibom.a;
                }
                break;
            }
            default: {
                ibnx.b(object0);
                goto label_29;
            }
        }
        return object1;
    }
}


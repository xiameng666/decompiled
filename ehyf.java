final class ehyf extends ibsl implements ibtw {
    int a;
    final clj b;
    final chb c;

    public ehyf(clj clj0, chb chb0, ibrl ibrl0) {
        this.b = clj0;
        this.c = chb0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ehyf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ehyf(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0 && eiav.b(((ehwv)this.b.g()))) {
            this.a = 1;
            cjf cjf0 = chm.a(new ehya());
            Object object2 = chb.k(this.c, new Float(1.0f), cjf0, null, this, 12);
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


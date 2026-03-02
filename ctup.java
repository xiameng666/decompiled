final class ctup extends ibsl implements ibtw {
    int a;
    final icmn b;
    final ctuy c;

    public ctup(icmn icmn0, ctuy ctuy0, ibrl ibrl0) {
        this.b = icmn0;
        this.c = ctuy0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctup)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctup(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ctuo ctuo0 = new ctuo(this.c);
            this.a = 1;
            if(icmt.h(((icmt)this.b), ctuo0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}


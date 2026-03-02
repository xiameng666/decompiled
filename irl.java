final class irl extends ibsl implements ibtw {
    int a;
    final icnj b;
    final iqa c;

    public irl(icnj icnj0, iqa iqa0, ibrl ibrl0) {
        this.b = icnj0;
        this.c = iqa0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((irl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new irl(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            irk irk0 = new irk(this.c);
            this.a = 1;
            if(this.b.oR(irk0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}


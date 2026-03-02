final class cbhf extends ibsl implements ibtw {
    int a;
    final cbhk b;

    public cbhf(cbhk cbhk0, ibrl ibrl0) {
        this.b = cbhk0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbhf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbhf(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icnj icnj0 = this.b.ae().e;
            cbhe cbhe0 = new cbhe(this.b);
            this.a = 1;
            if(icnj0.oR(cbhe0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}


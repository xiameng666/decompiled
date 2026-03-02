final class cywv extends ibsl implements ibtw {
    int a;
    final cyww b;

    public cywv(cyww cyww0, ibrl ibrl0) {
        this.b = cyww0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cywv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cywv(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            cywu cywu0 = new cywu(this.b);
            this.a = 1;
            if(this.b.e.oR(cywu0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}


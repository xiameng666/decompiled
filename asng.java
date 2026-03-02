public final class asng extends ibsl implements ibtw {
    int a;
    final icig b;
    final asni c;
    private Object d;

    public asng(icig icig0, ibrl ibrl0, asni asni0) {
        this.b = icig0;
        this.c = asni0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((asng)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new asng(this.b, ibrl0, this.c);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            asnf asnf0 = new asnf(((icih)this.d), this.c);
            this.a = 1;
            if(this.b.oR(asnf0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


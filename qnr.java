final class qnr extends ibsl implements ibtw {
    int a;
    final qoe b;
    final iced c;
    final int d;
    final int e;
    final qnu f;

    public qnr(qoe qoe0, iced iced0, int v, int v1, qnu qnu0, ibrl ibrl0) {
        this.b = qoe0;
        this.c = iced0;
        this.d = v;
        this.e = v1;
        this.f = qnu0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((qnr)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new qnr(this.b, this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        int v1;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            goto label_12;
        }
        do {
            if(this.b.ordinal() == 1) {
                v1 = this.c.y() ? this.d : this.e;
            }
            else {
                v1 = this.d;
            }
            this.a = 1;
            object0 = v1 == 0x7FFFFFFF ? ciq.a(new qnm(this.f), this) : gqv.c(new qnn(this.f, v1), this);
            if(object0 == object1) {
                return object1;
            }
        label_12:
        }
        while(((Boolean)object0).booleanValue());
        return ibom.a;
    }
}


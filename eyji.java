final class eyji extends ibsl implements ibtw {
    int a;
    final iccs b;
    final eyce c;

    public eyji(iccs iccs0, eyce eyce0, ibrl ibrl0) {
        this.b = iccs0;
        this.c = eyce0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyji)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyji(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.n(this);
            if(object0 == object1) {
                return object1;
            }
        }
        eycd eycd0 = (eycd)object0;
        this.c.c();
        return ibom.a;
    }
}


final class errx extends ibsl implements ibtw {
    int a;
    final errz b;

    public errx(errz errz0, ibrl ibrl0) {
        this.b = errz0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((errx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new errx(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.b(this.b.a, this.b.b, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


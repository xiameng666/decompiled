final class iss extends ibsl implements ibtw {
    int a;
    final isx b;
    final Runnable c;

    public iss(isx isx0, Runnable runnable0, ibrl ibrl0) {
        this.b = isx0;
        this.c = runnable0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((iss)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new iss(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.b.c(0.0f, this) == object1) {
                return object1;
            }
        }
        this.b.c.a(false);
        this.c.run();
        return ibom.a;
    }
}


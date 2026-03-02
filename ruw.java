final class ruw extends ibsl implements ibtw {
    int a;
    final ibtw b;
    final rve c;
    private Object d;

    public ruw(ibtw ibtw0, rve rve0, ibrl ibrl0) {
        this.b = ibtw0;
        this.c = rve0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ruw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ruw(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a != 0) {
            try {
                ibnx.b(object0);
                return object0;
            }
            catch(Exception exception0) {
                this.c.e.set(exception0);
                throw new IllegalStateException("Failed async due to exception", exception0);
            }
        }
        ibnx.b(object0);
        icck icck0 = (icck)this.d;
        try {
            this.a = 1;
            Object object2 = this.b.a(icck0, this);
            return object2 == object1 ? object1 : object2;
        }
        catch(Exception exception0) {
            this.c.e.set(exception0);
            throw new IllegalStateException("Failed async due to exception", exception0);
        }
    }
}


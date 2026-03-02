public final class dlor extends ibsl implements ibtw {
    int a;
    final frli b;

    public dlor(frli frli0, ibrl ibrl0) {
        this.b = frli0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dlor)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dlor(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dloq dloq0 = new dloq();
            this.a = 1;
            if(ftqa.b(this.b, dloq0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


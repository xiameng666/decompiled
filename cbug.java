final class cbug extends ibsl implements ibtw {
    int a;
    final cbuo b;

    public cbug(cbuo cbuo0, ibrl ibrl0) {
        this.b = cbuo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbug)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbug(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            cbuf cbuf0 = new cbuf(this.b, null);
            this.a = 1;
            if(lqy.b(this.b, lpf.d, cbuf0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


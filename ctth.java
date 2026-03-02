final class ctth extends ibsl implements ibtw {
    int a;
    final cttl b;

    public ctth(cttl cttl0, ibrl ibrl0) {
        this.b = cttl0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctth)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctth(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            cttg cttg0 = new cttg(this.b);
            this.a = 1;
            if(this.b.g.d.oR(cttg0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


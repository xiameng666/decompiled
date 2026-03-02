final class cbtw extends ibsl implements ibtw {
    int a;
    final cbuo b;
    final gged_interceptors c;

    public cbtw(cbuo cbuo0, gged_interceptors gged0, ibrl ibrl0) {
        this.b = cbuo0;
        this.c = gged0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbtw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbtw(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            cbte cbte0 = this.b.y();
            this.a = 1;
            object0 = cbte0.j(this);
            if(object0 == object1) {
                return object1;
            }
        }
        boolean z = ((Boolean)object0).booleanValue();
        cbir cbir0 = this.b.R();
        if(cbir0 != null) {
            cbtv cbtv0 = new cbtv(this.c, z);
            cbir0.a(gvkq.ds, cbtv0);
        }
        return ibom.a;
    }
}


final class clw extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final cma d;

    public clw(cma cma0, ibrl ibrl0) {
        this.d = cma0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((clw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new clw(this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        if(this.c != 0) {
            object2 = this.b;
            object3 = this.a;
            ibnx.b(object0);
            goto label_16;
        }
        ibnx.b(object0);
        cma cma0 = this.d;
        ((cke)cma0).n();
        icta icta0 = ((cke)cma0).k;
        this.a = icta0;
        this.b = cma0;
        this.c = 1;
        if(icta0.b(this) != object1) {
            object2 = cma0;
            object3 = icta0;
        label_16:
            try {
                ((cke)object2).b = ((cke)object2).b();
                icbi icbi0 = ((cke)object2).e;
                if(icbi0 != null) {
                    icbi0.w(((cke)object2).b());
                }
                ((cke)object2).e = null;
            }
            finally {
                ((icta)object3).d();
            }
            return ibom.a;
        }
        return object1;
    }
}


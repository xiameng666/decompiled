final class csa extends ibsl implements ibtx {
    int a;
    long b;
    final csc c;
    private Object d;

    public csa(csc csc0, ibrl ibrl0) {
        this.c = csc0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        csa csa0 = new csa(this.c, ((ibrl)object2));
        csa0.d = (dbz)object0;
        csa0.b = ((hjz)object1).a;
        return csa0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Object object2 = this.d;
            long v1 = this.b;
            csc csc0 = this.c;
            if(csc0.c) {
                this.a = 1;
                dgg dgg0 = csc0.b;
                if(dgg0 == null) {
                    object3 = ibom.a;
                }
                else {
                    object3 = iccl.a(new cqe(((dbz)object2), v1, dgg0, csc0, null), this);
                    if(object3 != object1) {
                        object3 = ibom.a;
                    }
                }
                if(object3 == object1) {
                    return object1;
                }
            }
        }
        return ibom.a;
    }
}


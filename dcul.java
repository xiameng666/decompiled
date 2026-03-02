final class dcul extends ibsl implements ibtw {
    int a;
    final dcus b;
    final dcsl c;

    public dcul(dcus dcus0, dcsl dcsl0, ibrl ibrl0) {
        this.b = dcus0;
        this.c = dcsl0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcul)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dcul(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dcsl dcsl0 = this.c;
            this.a = 1;
            dcrn dcrn0 = this.b.a.a(dcsl0.a);
            if(dcrn0 == null) {
                object2 = ibom.a;
            }
            else if(((dcrq)dcrn0.c.b()).b.contains(dcsl0)) {
                object2 = dcrn0.b(dcsl0, this);
                if(object2 != object1) {
                    object2 = ibom.a;
                }
            }
            else {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


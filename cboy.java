final class cboy extends ibsl implements ibtw {
    int a;
    final cbpb b;

    public cboy(cbpb cbpb0, ibrl ibrl0) {
        this.b = cbpb0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cboy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cboy(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.a(this);
            if(object0 == object1) {
                return object1;
            }
        }
        cbpg cbpg0 = (cbpg)object0;
        return ibom.a;
    }
}


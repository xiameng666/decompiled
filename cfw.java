final class cfw extends ibsl implements ibtw {
    final cfj a;
    final cfk b;

    public cfw(cfj cfj0, cfk cfk0, ibrl ibrl0) {
        this.a = cfj0;
        this.b = cfk0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cfw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cfw(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        cfj cfj0 = this.a;
        if(cfj0.d.isEmpty()) {
            cfj0.b.f.h(cfj0.a);
        }
        return ibom.a;
    }
}


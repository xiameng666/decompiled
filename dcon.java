final class dcon extends ibsl implements ibtw {
    Object a;
    final dcoa b;
    final dcny c;

    public dcon(dcoa dcoa0, dcny dcny0, ibrl ibrl0) {
        this.b = dcoa0;
        this.c = dcny0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcon)this.c(((dcny)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dcon(this.b, this.c, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        dcny dcny0 = (dcny)this.a;
        return this.b.b().a(this.c, dcny0);
    }
}


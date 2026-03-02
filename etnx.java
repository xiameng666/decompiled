final class etnx extends ibsl implements ibtw {
    final ftgp a;

    public etnx(ftgp ftgp0, ibrl ibrl0) {
        this.a = ftgp0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((etnx)this.c(((ftgp)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new etnx(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return this.a;
    }
}


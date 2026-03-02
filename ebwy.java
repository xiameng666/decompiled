final class ebwy extends ibsl implements ibtw {
    final ebxe a;
    final frli b;

    public ebwy(frli frli0, ebxe ebxe0, ibrl ibrl0) {
        this.b = frli0;
        this.a = ebxe0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ebwy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ebwy(this.b, this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        gmcg gmcg0 = this.a.f();
        ((glyq)dxyx.b(this.b, gmcg0)).u();
        return ibom.a;
    }
}


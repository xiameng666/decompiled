final class jnn extends ibsl implements ibtw {
    int a;
    final jnp b;
    final hka c;

    public jnn(jnp jnp0, hka hka0, ibrl ibrl0) {
        this.b = jnp0;
        this.c = hka0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((jnn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new jnn(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            jnm jnm0 = new jnm(this.c);
            this.a = 1;
            if(ish.a(this.b, jnm0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


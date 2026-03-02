final class rmr extends ibsl implements ibtw {
    Object a;
    final long b;

    public rmr(long v, ibrl ibrl0) {
        this.b = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rmr)this.c(((lfa)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new rmr(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        ((lfa)this.a).e(lfd.b("last_accessed_suw_session_id"), new Long(this.b));
        return ibom.a;
    }
}


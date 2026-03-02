final class dgdr extends ibsl implements ibtw {
    int a;
    final dgdt b;
    final long c;

    public dgdr(dgdt dgdt0, long v, ibrl ibrl0) {
        this.b = dgdt0;
        this.c = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgdr)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgdr(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            long v1 = hvqs.l() * 1000L;
            this.a = 1;
            if(iccv.c(v1, this) == object1) {
                return object1;
            }
        }
        this.b.b.remove(new Long(this.c));
        return ibom.a;
    }
}


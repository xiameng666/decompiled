final class bylu extends ibsl implements ibtw {
    int a;
    final boolean b;
    final ibtw c;
    final ibth d;
    final ijz e;

    public bylu(boolean z, ijz ijz0, ibtw ibtw0, ibth ibth0, ibrl ibrl0) {
        this.b = z;
        this.e = ijz0;
        this.c = ibtw0;
        this.d = ibth0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bylu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bylu(this.b, this.e, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            this.d.a();
        }
        else if(this.b) {
            long v1 = this.e == null ? 4000L : this.e.a(4000L, true, this.c != null);
            this.a = 1;
            if(iccv.c(v1, this) == object1) {
                return object1;
            }
            this.d.a();
            return ibom.a;
        }
        return ibom.a;
    }
}


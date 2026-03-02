final class cjdl extends ibsl implements ibtw {
    int a;
    final cjdi b;
    final ibuz c;

    public cjdl(cjdi cjdi0, ibuz ibuz0, ibrl ibrl0) {
        this.b = cjdi0;
        this.c = ibuz0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cjdl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cjdl(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            boolean z = this.c.a;
            this.a = 1;
            if(this.b.a(z) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


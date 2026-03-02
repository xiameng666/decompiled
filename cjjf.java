final class cjjf extends ibsl implements ibtw {
    int a;
    Object b;
    final cjjp c;

    public cjjf(cjjp cjjp0, ibrl ibrl0) {
        this.c = cjjp0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cjjf)this.c(((fjhg)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cjjf(this.c, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            gmcd gmcd0 = this.c.a.a(((fjhg)this.b));
            ibuq.e(gmcd0, "startDownloading(...)");
            this.a = 1;
            if(icpu.c(gmcd0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


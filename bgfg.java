public final class bgfg extends ibsl implements ibtw {
    int a;
    final bdhv b;
    final beck c;

    public bgfg(beck beck0, bdhv bdhv0, ibrl ibrl0) {
        this.c = beck0;
        this.b = bdhv0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bgfg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bgfg(this.c, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        this.a = 1;
        Object object2 = bgft.a(this.c.a, this.b, this);
        return object2 == object1 ? object1 : object2;
    }
}


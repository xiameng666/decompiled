final class bvyx extends ibsl implements ibtw {
    int a;
    final bvze b;
    final hgmn c;

    public bvyx(bvze bvze0, hgmn hgmn0, ibrl ibrl0) {
        this.b = bvze0;
        this.c = hgmn0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bvyx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bvyx(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            hgmn hgmn0 = this.c;
            hgmm hgmm0 = hgmm.b(hgmn0.b) == null ? hgmm.f : hgmm.b(hgmn0.b);
            icmn icmn0 = (icmn)this.b.a.get(hgmm0);
            if(icmn0 != null) {
                this.a = 1;
                if(icmn0.a(hgmn0, this) == object1) {
                    return object1;
                }
            }
        }
        return ibom.a;
    }
}


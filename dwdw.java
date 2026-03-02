public final class dwdw extends ibsl implements ibtw {
    int a;
    final icig b;
    final dwef c;

    public dwdw(icig icig0, ibrl ibrl0, dwef dwef0) {
        this.b = icig0;
        this.c = dwef0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dwdw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dwdw(this.b, ibrl0, this.c);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dwdv dwdv0 = new dwdv(this.c);
            this.a = 1;
            if(this.b.oR(dwdv0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


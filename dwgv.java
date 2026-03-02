public final class dwgv extends ibsl implements ibtw {
    int a;
    final icig b;
    final dwhd c;

    public dwgv(icig icig0, ibrl ibrl0, dwhd dwhd0) {
        this.b = icig0;
        this.c = dwhd0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dwgv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dwgv(this.b, ibrl0, this.c);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dwgu dwgu0 = new dwgu(this.c);
            this.a = 1;
            if(this.b.oR(dwgu0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


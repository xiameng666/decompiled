final class bwhx extends ibsl implements ibtw {
    int a;
    final icig b;

    public bwhx(icig icig0, ibrl ibrl0) {
        this.b = icig0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bwhx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bwhx(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icig icig0 = this.b;
            if(icig0 == null) {
                return null;
            }
            this.a = 1;
            if(icoa.h(((icoa)icig0), bwhw.a, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


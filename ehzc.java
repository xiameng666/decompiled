final class ehzc extends ibsl implements ibtw {
    int a;
    final float b;
    final gtj c;

    public ehzc(gtj gtj0, float f, ibrl ibrl0) {
        this.c = gtj0;
        this.b = f;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ehzc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ehzc(this.c, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(iccv.d(ehxo.a, this) == object1) {
                return object1;
            }
        }
        this.c.h(Math.min(this.b, 0.8f));
        return ibom.a;
    }
}


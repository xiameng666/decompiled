public final class cjw extends ibsl implements ibts {
    int a;
    final clj b;
    final cke c;
    final Object d;

    public cjw(clj clj0, cke cke0, Object object0, ibrl ibrl0) {
        this.b = clj0;
        this.c = cke0;
        this.d = object0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new cjw(this.b, this.c, this.d, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            cjv cjv0 = new cjv(this.c, this.d, this.b, null);
            this.a = 1;
            if(iccl.a(cjv0, this) == object1) {
                return object1;
            }
        }
        this.b.k();
        return ibom.a;
    }
}


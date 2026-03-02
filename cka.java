final class cka extends ibsl implements ibts {
    int a;
    final Object b;
    final Object c;
    final cke d;
    final clj e;
    final float f;

    public cka(Object object0, Object object1, cke cke0, clj clj0, float f, ibrl ibrl0) {
        this.b = object0;
        this.c = object1;
        this.d = cke0;
        this.e = clj0;
        this.f = f;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new cka(this.b, this.c, this.d, this.e, this.f, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            cjz cjz0 = new cjz(this.b, this.c, this.d, this.e, this.f, null);
            this.a = 1;
            if(iccl.a(cjz0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


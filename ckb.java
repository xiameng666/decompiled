public final class ckb extends ibsl implements ibts {
    int a;
    final cke b;
    final Object c;
    final clj d;

    public ckb(cke cke0, Object object0, clj clj0, ibrl ibrl0) {
        this.b = cke0;
        this.c = object0;
        this.d = clj0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new ckb(this.b, this.c, this.d, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        float f;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            cke cke0 = this.b;
            cke0.l();
            cke.r(cke0);
            cke0.p(0.0f);
            Object object2 = this.c;
            if(ibuq.m(object2, cke0.a())) {
                f = -4.0f;
            }
            else {
                f = ibuq.m(object2, cke0.b()) ? -5.0f : -3.0f;
            }
            this.d.w(object2);
            this.d.q(0L);
            cke0.q(object2);
            cke0.p(0.0f);
            cke0.c(object2);
            this.d.n(f);
            if(f == -3.0f) {
                this.a = 1;
                if(cke0.k(this) == object1) {
                    return object1;
                }
            }
        }
        this.d.k();
        return ibom.a;
    }
}


final class cjz extends ibsl implements ibtw {
    int a;
    final Object b;
    final Object c;
    final cke d;
    final clj e;
    final float f;
    private Object g;

    public cjz(Object object0, Object object1, cke cke0, clj clj0, float f, ibrl ibrl0) {
        this.b = object0;
        this.c = object1;
        this.d = cke0;
        this.e = clj0;
        this.f = f;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cjz)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cjz(this.b, this.c, this.d, this.e, this.f, ibrl0);
        ibrl1.g = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icck icck0 = (icck)this.g;
            Object object2 = this.b;
            Object object3 = this.c;
            if(ibuq.m(object2, object3)) {
                this.d.h = null;
                if(ibuq.m(this.d.a(), object2)) {
                    return ibom.a;
                }
            }
            else {
                this.d.m();
            }
            if(!ibuq.m(object2, object3)) {
                this.e.w(object2);
                this.e.q(0L);
                this.d.q(object2);
                this.e.n(this.f);
            }
            cke cke0 = this.d;
            cke0.p(this.f);
            if(cke0.l.g()) {
                icbb.b(icck0, null, null, new cjy(cke0, null), 3);
            }
            else {
                cke.r(cke0);
            }
            this.a = 1;
            if(cke0.k(this) == object1) {
                return object1;
            }
        }
        this.d.o();
        return ibom.a;
    }
}


final class clh extends ibsl implements ibtw {
    float a;
    int b;
    final clj c;
    private Object d;

    public clh(clj clj0, ibrl ibrl0) {
        this.c = clj0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((clh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new clh(this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icck icck0;
        float f;
        Object object1 = ibrx.a;
        if(this.b == 0) {
            ibnx.b(object0);
            icck0 = (icck)this.d;
            f = cku.a(icck0.c());
        }
        else {
            f = this.a;
            icck0 = (icck)this.d;
            ibnx.b(object0);
        }
        while(iccl.g(icck0)) {
            clg clg0 = new clg(this.c, f);
            this.d = icck0;
            this.a = f;
            this.b = 1;
            if(gqv.c(clg0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


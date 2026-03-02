final class ctju extends ibsl implements ibtw {
    int a;
    final ctho b;
    final icmn c;
    final ibvd d;
    final bboh e;
    final icmn f;

    public ctju(ctho ctho0, icmn icmn0, ibvd ibvd0, bboh bboh0, icmn icmn1, ibrl ibrl0) {
        this.b = ctho0;
        this.c = icmn0;
        this.d = ibvd0;
        this.e = bboh0;
        this.f = icmn1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctju)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctju(this.b, this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icig icig0 = this.b.d(this.c);
            ctjt ctjt0 = new ctjt(this.d, this.f);
            this.a = 1;
            if(icoa.h(((icoa)icig0), ctjt0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


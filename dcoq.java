final class dcoq extends ibsl implements ibtw {
    int a;
    final dcor b;
    final dcoa c;
    final dcny d;
    private Object e;

    public dcoq(dcor dcor0, dcoa dcoa0, dcny dcny0, ibrl ibrl0) {
        this.b = dcor0;
        this.c = dcoa0;
        this.d = dcny0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcoq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dcoq(this.b, this.c, this.d, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icck icck0;
        Object object1 = ibrx.a;
        if(this.a != 0) {
            icck0 = (icck)this.e;
            ibnx.b(object0);
            iccl.i(icck0);
            return ibom.a;
        }
        ibnx.b(object0);
        icck icck1 = (icck)this.e;
        iced iced0 = icbb.b(icck1, null, null, new dcoo(this.b, this.c, this.d, null), 3);
        iced iced1 = icbb.b(icck1, null, null, new dcop(this.c, icck1, this.b, null), 3);
        icsu icsu0 = new icsu(this.u());
        icsu0.h(iced0.D(), new dcol(null));
        icsu0.h(iced1.D(), new dcom(null));
        this.e = icck1;
        this.a = 1;
        if(icsu.c(icsu0, this) != object1) {
            icck0 = icck1;
            iccl.i(icck0);
            return ibom.a;
        }
        return object1;
    }
}


final class ehxn extends ibsl implements ibtw {
    int a;
    final cjh b;
    final gui c;
    final ibth d;
    private Object e;

    public ehxn(cjh cjh0, gui gui0, ibth ibth0, ibrl ibrl0) {
        this.b = cjh0;
        this.c = gui0;
        this.d = ibth0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ehxn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ehxn(this.b, this.c, this.d, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icck icck0;
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            icck0 = (icck)this.e;
        }
        else {
            icck0 = (icck)this.e;
            ibnx.b(object0);
        }
        while(iccl.g(icck0)) {
            Object object2 = this.c.a();
            this.b.d(object2);
            ibuq.f(this.b, "<this>");
            ibzw ibzw0 = ehxo.a(ehzj.a(((ehwv)this.b.a()), ((ehwv)this.b.b())));
            if(ibzw0 == null) {
                this.d.a();
                return ibom.a;
            }
            this.e = icck0;
            this.a = 1;
            if(iccv.d(ibzw0.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


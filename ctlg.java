final class ctlg extends ibsl implements ibtw {
    int a;
    final ctlh b;
    final icig c;
    final String d;
    private Object e;

    public ctlg(ctlh ctlh0, icig icig0, String s, ibrl ibrl0) {
        this.b = ctlh0;
        this.c = icig0;
        this.d = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctlg)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ctlg(this.b, this.c, this.d, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.e;
            ctky ctky0 = new ctky(ichm0);
            ctlf ctlf0 = new ctlf(ichm0, this.b, this.c, this.d, null);
            this.a = 1;
            if(ctnk.a(this.b.b, ctlh.a, ctky0, ctlf0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


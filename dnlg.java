final class dnlg extends ibsl implements ibtw {
    int a;
    final dnlp b;

    public dnlg(dnlp dnlp0, ibrl ibrl0) {
        this.b = dnlp0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dnlg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dnlg(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icnj icnj0 = this.b.z().f;
            dnlf dnlf0 = new dnlf(this.b);
            this.a = 1;
            if(icnj0.oR(dnlf0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}


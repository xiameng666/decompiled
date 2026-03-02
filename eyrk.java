final class eyrk extends ibsl implements ibtw {
    int a;
    final eysa b;

    public eyrk(eysa eysa0, ibrl ibrl0) {
        this.b = eysa0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyrk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyrk(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icht icht0 = new icht(new exxr(exxa.b(this.b.c.a.o()), null));
            eyrj eyrj0 = new eyrj(this.b);
            this.a = 1;
            if(icht0.oR(eyrj0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


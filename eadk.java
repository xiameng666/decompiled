public final class eadk extends ibsl implements ibtw {
    int a;
    final icig b;
    final eadm c;

    public eadk(icig icig0, ibrl ibrl0, eadm eadm0) {
        this.b = icig0;
        this.c = eadm0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eadk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eadk(this.b, ibrl0, this.c);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            eadj eadj0 = new eadj(this.c);
            this.a = 1;
            if(this.b.oR(eadj0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


public final class dneq extends ibsl implements ibtw {
    int a;
    final icig b;
    final dnfc c;

    public dneq(icig icig0, ibrl ibrl0, dnfc dnfc0) {
        this.b = icig0;
        this.c = dnfc0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dneq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dneq(this.b, ibrl0, this.c);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dnep dnep0 = new dnep(this.c);
            this.a = 1;
            if(this.b.oR(dnep0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


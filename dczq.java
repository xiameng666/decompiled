final class dczq extends ibsl implements ibtw {
    int a;
    final ddag b;
    private Object c;

    public dczq(ddag ddag0, ibrl ibrl0) {
        this.b = ddag0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dczq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dczq(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icck icck0 = (icck)this.c;
            iccs[] arr_iccs = {icbb.a(icck0, null, null, new dczo(this.b, null), 3), icbb.a(icck0, null, null, new dczp(this.b, null), 3)};
            this.a = 1;
            if(icay.b(arr_iccs, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


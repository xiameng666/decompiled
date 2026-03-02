final class ehml extends ibsl implements ibtw {
    int a;
    final ehmo b;

    public ehml(ehmo ehmo0, ibrl ibrl0) {
        this.b = ehmo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ehml)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ehml(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ehmo ehmo0 = this.b;
            ehoq ehoq0 = ehmo0.ah;
            if(ehoq0 == null) {
                ibuq.j("viewModel");
                ehoq0 = null;
            }
            ehmk ehmk0 = new ehmk(ehmo0);
            this.a = 1;
            if(ehoq0.d.oR(ehmk0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}


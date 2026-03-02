final class asnq extends ibsl implements ibtw {
    int a;
    final du b;
    final ibtw c;

    public asnq(du du0, ibtw ibtw0, ibrl ibrl0) {
        this.b = du0;
        this.c = ibtw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((asnq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new asnq(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            lps lps0 = this.b.getViewLifecycleOwner();
            ibuq.e(lps0, "getViewLifecycleOwner(...)");
            this.a = 1;
            if(lqy.b(lps0, lpf.d, this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


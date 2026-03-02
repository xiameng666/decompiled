final class tzg extends ibsl implements ibtw {
    int a;
    final tzh b;

    public tzg(tzh tzh0, ibrl ibrl0) {
        this.b = tzh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((tzg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new tzg(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ibuq.f(this.b.a, "<this>");
            ibuq.f(this.b.a, "<this>");
            ichv ichv0 = new ichv(new tzy(this.b.b, this.b.a, this.b.a.a, null));
            tzf tzf0 = new tzf(this.b);
            this.a = 1;
            if(icoa.h(ichv0, tzf0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}


public final class belu extends ibsl implements ibtw {
    int a;
    final belv b;
    final bedc c;

    public belu(belv belv0, bedc bedc0, ibrl ibrl0) {
        this.b = belv0;
        this.c = bedc0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((belu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new belu(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = beih.j(this.b.b, this.c, this);
            if(object0 == object1) {
                return object1;
            }
        }
        this.b.b(((bedv)object0));
        return ibom.a;
    }
}


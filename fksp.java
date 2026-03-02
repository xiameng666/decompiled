final class fksp extends ibsl implements ibtw {
    int a;
    final fksq b;

    public fksp(fksq fksq0, ibrl ibrl0) {
        this.b = fksq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((fksp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new fksp(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            gohb gohb0 = new gohb(new gohe(this.b.a));
            this.a = 1;
            object0 = this.b.b.a(gohb0, this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(((gohd)object0) == null) {
            throw new IllegalArgumentException("No filegroups found for " + this.b.a);
        }
        fkjm fkjm0 = fkjn.a();
        fkjm0.b(((gohd)object0).a.c);
        fkjm0.c("default");
        return fkjm0.a();
    }
}


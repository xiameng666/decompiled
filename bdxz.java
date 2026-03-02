public final class bdxz extends ibsl implements ibtw {
    int a;
    final bdya b;

    public bdxz(bdya bdya0, ibrl ibrl0) {
        this.b = bdya0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bdxz)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bdxz(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = bdxu.a(this.b.a, this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(((Boolean)object0).booleanValue()) {
            this.b.b.e(gqtg.w);
        }
        else {
            this.b.b.e(gqtg.x);
            this.b.f.l(ibom.a);
        }
        this.b.a.a.f();
        this.b.a.b.b();
        return ibom.a;
    }
}

